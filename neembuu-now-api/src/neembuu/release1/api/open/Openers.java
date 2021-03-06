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

package neembuu.release1.api.open;

/**
 *
 * @author Shashank Tulsyan
 */
public final class Openers {
    private static Opener opener;

    public static void setOpener(Opener opener) {
        if(Openers.opener !=null){
            throw new IllegalStateException("Already initialized");
        }
        Openers.opener = opener;
    }

    /**
     * @return an instance of the default implementation of opener service
     */
    public static Opener I() {
        return opener;
    }

}
