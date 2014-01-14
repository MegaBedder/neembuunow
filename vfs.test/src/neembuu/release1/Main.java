/*
 * GPL v3 with classpath exception
 */

package neembuu.release1;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import jpfm.fs.FSUtils;
import neembuu.diskmanager.DiskManager;
import neembuu.diskmanager.DiskManagerParams;
import neembuu.diskmanager.DiskManagers;
import neembuu.release1.api.LinkHandlerProviders;
import neembuu.release1.defaultImpl.YoutubeLinkHandlerProvider;
import neembuu.release1.defaultImpl.DirectLinkHandlerProvider;
import neembuu.release1.ui.NeembuuUI;
import neembuu.vfs.file.TroubleHandler;

/**
 *
 * @author Shashank Tulsyan
 */
public final class Main {

    private final NeembuuUI nui;
    private final Logger logger = initLogger();
    private final TroubleHandler troubleHandler;
    private final MountManager mountManager;
    private final DiskManager diskManager;
    
    public Main() {
        this.nui = new NeembuuUI();
        troubleHandler = new UnprofessionalTroubleHandler(nui);

        mountManager = new MountManager();
        
        String basePath = null;
        try{
            basePath = System.getProperty("java.io.tmpdir")+File.separator+"neembuu-release1";
            System.err.println("BasePath="+basePath);
            Files.createDirectory(Paths.get(basePath));
        }catch(FileAlreadyExistsException faee){
            logger.log(Level.INFO,"Temp location already exists");
        }catch(IOException a){
            throw new RuntimeException(a);
        }
        
        diskManager = DiskManagers.getDefaultManager(new DiskManagerParams.Builder()
            .setBaseStoragePath(basePath)
            .build()
        );
    }
    
    private void initialize(){
        nui.initialize(this);
        mountManager.initialize(this);
        
        LinkHandlerProviders.registerProvider(new YoutubeLinkHandlerProvider());
        
        //DefaultLinkHandler is the default handler
        LinkHandlerProviders.registerDefaultProvider(new DirectLinkHandlerProvider());
    }

    public TroubleHandler getTroubleHandler() {
        return troubleHandler;
    }

    public DiskManager getDiskManager() {
        return diskManager;
    }
    
    public NeembuuUI getNui() {
        return nui;
    }

    public static Logger getLOGGER() {
        return get().logger;
    }
    

    public MountManager getMountManager() {
        return mountManager;
    }
    
    private Logger initLogger(){
        //return neembuu.release1.log.LoggerUtil.getLogger("Main");
        return neembuu.util.logging.LoggerUtil.getLogger();
    }
    
    static Main get() {
        return InstHolder.m;
    }
    
    public static void printPendingRequests(){
        FSUtils.printIncompleteOperationsBasic(get().mountManager.getFileSystem());
    }
    
    private static class InstHolder {
        private static Main m = new Main();
    }
    
    public static void main(String[] args) {
        NeembuuUI.initLookAndFeel();
        get().initialize();
    }

}
