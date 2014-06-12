/*
 *  Copyright (C) 2014 Shashank Tulsyan
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package neembuu.release1.defaultImpl.external;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author Shashank Tulsyan
 */
@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
public @interface ExternalLinkHandlerProviderAnnotation {
    /**
     * @return If url.matches(checkingRegex())==true implies that
     * this link handler can handle the given url.
     */
    String checkingRegex();
    /**
     * @return if more than simple regex checking is required
     * to know if the link can be handled or not.
     */
    String checkingJavaCode() default "";
    /**
     * @return The minimum version of NeembuuNow required for this plugin
     * to function properly. Refer {@link neembuu.release1.app.Application#releaseTime(long time) } 
     */
    long minimumReleaseVerReq() default 1398604095683L;
}