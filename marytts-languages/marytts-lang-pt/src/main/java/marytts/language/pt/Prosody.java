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

import marytts.datatypes.MaryDataType;
import marytts.modules.ProsodyGeneric;
import marytts.server.MaryProperties;

import java.util.Locale;

public class Prosody extends ProsodyGeneric {
	public Prosody() {
		super(MaryDataType.PHONEMES, MaryDataType.INTONATION, new Locale("pt"), MaryProperties.localePrefix(new Locale("pt"))
				+ ".prosody.tobipredparams", MaryProperties.localePrefix(new Locale("pt")) + ".prosody.accentPriorities",
				MaryProperties.localePrefix(new Locale("pt")) + ".prosody.syllableaccents", MaryProperties
						.localePrefix(new Locale("pt")) + ".prosody.paragraphdeclination");
	}
}
