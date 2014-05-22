/*
 * Copyright (C) 2014 Shashank Tulsyan
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package neembuu.release1.app;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;
import java.util.Collections;
import neembuu.release1.ui.mc.NonUIMainComponent;
import org.json.JSONObject;

/**
 *
 * @author Shashank Tulsyan
 */
public class FlashGotMain {

    public static void main(String[] args) throws IOException {
        String[] argsNoNull = new String[12];
        for (int i = 0; i < argsNoNull.length; i++) {
            argsNoNull[i] = "";
        }
        System.arraycopy(args, 0, argsNoNull, 0, args.length);

        FlashGotTemplate fgt = new FlashGotTemplate(argsNoNull);

        JSONObject jsonFgt = new JSONObject(fgt);

        Application.setMainComponent(new NonUIMainComponent());

        String fileName = System.currentTimeMillis() + ".flashgotjson";
        Path commandsFolder = Application.getResource("commands");
        Files.createDirectories(commandsFolder);
        Files.write(commandsFolder.resolve(fileName), Collections.singletonList(jsonFgt.toString()),
                Charset.defaultCharset(), CREATE, TRUNCATE_EXISTING);

        final EnsureSingleInstance esi = new EnsureSingleInstance();
        esi.setCallback(new FlashSICC(esi));
        esi.startService();
    }

    private static final class FlashSICC implements SingleInstanceCheckCallback {

        private final EnsureSingleInstance esi;

        public FlashSICC(EnsureSingleInstance esi) {  this.esi = esi; }

        @Override public void alreadyRunning(long timeSince) {
            System.exit(0);
        }

        @Override public void attemptedToRun(long time) { }

        @Override public boolean solelyRunning(long time) {
            esi.stopService();
            new Thread("StartNewMain"){
                @Override public void run() {
                    SystemTrayMain.main(new String[]{});
                }
            }.start();
            return false;
        }
    }
}