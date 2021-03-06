/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package neembuu.release1.defaultImpl.linkgroup;

import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.file.StandardOpenOption;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import neembuu.diskmanager.MakeSession;
import neembuu.diskmanager.Session;
import neembuu.release1.api.file.NeembuuFile;
import neembuu.release1.api.linkgroup.LinkGroup;
import neembuu.release1.api.ui.actions.ReAddAction;

/**
 *
 * @author Shashank Tulsyan
 */
public final class Utils {
    
    static Session make(final MakeSession ms,final boolean acceptAlreadyExisiting)throws Exception{
        final AtomicReference<Session> ar = new AtomicReference<>(null);
        final AtomicReference<Exception> ex = new AtomicReference<>(null);
        final AtomicBoolean exists = new AtomicBoolean(false);
        
        ms.createNew(new MakeSession.CreatNewCallback() {
            @Override public void alreadyExists(Session s) {
                ar.set(s); exists.set(true);
            }@Override public void done(Session s) {
                ar.set(s);
            }@Override public void failed(Exception a) {
                ex.set(a);
            }});
        if(exists.get()){
            ms.cancel();
            if(!acceptAlreadyExisiting){throw new Exception("Link already exists."); }
        }if(ex.get()!=null){
            ms.cancel(); throw ex.get();
        }if(ar.get()==null){
            ms.cancel(); throw new NullPointerException("Could not obtain session, reason unknown");
        }
        return ar.get();
    }
    
    static String restoreDisplayName(Session s){
        try{
            SeekableByteChannel dp = s.getOrCreateResource(LinkGroup.displayName_resourceName, StandardOpenOption.READ);
            ByteBuffer bb=ByteBuffer.allocate(Math.min((int)dp.size(),4*1024));
            dp.read(bb);
            String t = new String(bb.array(),Charset.forName("UTF-8"));
            try{dp.close();}catch(Exception a){a.printStackTrace();}
            return t;
        }catch(Exception a){
            a.printStackTrace();
        }
        return null;
    }
    
    public static ReAddAction.CallBack newDisplayNameSaver(){
        return new DisplayNameSaver();
    }
    
    //private static final String DisplayName_FileName = "displayName";
    
    private static final class DisplayNameSaver implements ReAddAction.CallBack {
        @Override
        public void doneCreation(NeembuuFile neembuuFile) {
            try{
                Session s = neembuuFile.getSession();
                String displayName = neembuuFile.getMinimumFileInfo().getName();            
                saveDisplayName(s, displayName);
            }catch(Exception a){
                a.printStackTrace();
            }
        }
    }
    
    public static void saveDisplayName(Session s, String displayName)throws Exception{
        SeekableByteChannel dp = s.getOrCreateResource(
                        LinkGroup.displayName_resourceName, 
                        StandardOpenOption.WRITE,StandardOpenOption.CREATE,
                        StandardOpenOption.TRUNCATE_EXISTING);
        ByteBuffer bb=ByteBuffer.wrap(displayName.getBytes(Charset.forName("UTF-8")));
        dp.write(bb);
        try{dp.close();}catch(Exception a){a.printStackTrace();}
    }
}
