/*
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * The Original Code is "Simplenlg".
 *
 * The Initial Developer of the Original Code is Ehud Reiter, Albert Gatt and Dave Westwater.
 * Portions created by Ehud Reiter, Albert Gatt and Dave Westwater are Copyright (C) 2010-11 The University of Aberdeen. All Rights Reserved.
 *
 * Contributor(s): Ehud Reiter, Albert Gatt, Dave Wewstwater, Roman Kutlak, Margaret Mitchell, Pierre-Luc Vaudry, Julio Janeiro, Alejandro Ramos, Alberto Bugarín.
 */
package simplenlg.realiser.english;

import simplenlg.format.english.TextFormatter;
import simplenlg.lexicon.Lexicon;
import simplenlg.morphology.english.MorphologyProcessor;
import simplenlg.orthography.english.OrthographyProcessor;
import simplenlg.syntax.english.SyntaxProcessor;

/**
 * @author D. Westwater, Data2Text Ltd
 */
public class Realiser extends simplenlg.realiser.Realiser {

    /**
     * create a realiser (no lexicon)
     */
    public Realiser() {
        super();
        initialise();
    }

    /**
     * Create a realiser with a lexicon (should match lexicon used for
     * NLGFactory)
     *
     * @param lexicon
     */
    public Realiser(Lexicon lexicon) {
        this();
        setLexicon(lexicon);
    }

    @Override
    public void initialise() {
        this.morphology = new MorphologyProcessor();
        this.morphology.initialise();
        this.orthography = new OrthographyProcessor();
        this.orthography.initialise();
        this.syntax = new SyntaxProcessor();
        this.syntax.initialise();
        this.formatter = new TextFormatter();
        // AG: added call to initialise for formatter
        this.formatter.initialise();
    }
}
