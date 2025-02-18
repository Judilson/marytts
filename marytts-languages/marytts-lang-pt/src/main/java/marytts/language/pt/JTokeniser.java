/**
 * Copyright 2000-2006 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * This file is part of MARY TTS.
 *
 * MARY TTS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package marytts.language.pt;

import marytts.datatypes.MaryData;
import marytts.datatypes.MaryDataType;

import java.util.Locale;

/**
 * 
 * @author Marc Schr&ouml;der
 */
public class JTokeniser extends marytts.modules.JTokeniser {

	public JTokeniser() {
		super(MaryDataType.RAWMARYXML, MaryDataType.TOKENS, new Locale("pt"));
	}

	public MaryData process(MaryData d) throws Exception {
		MaryData result = super.process(d);
		return result;
	}
}