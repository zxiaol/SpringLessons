package com.xiaomingyk.lessonTwo;

/**
 * Created by My on 12/24/2016.
 */
public class TextEditor {

    private SpellChecker spellChecker;

    public void setSpellChecker(SpellChecker spellChecker){

        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker(){

        System.out.println("get spell checker");

        return spellChecker;
    }

    public void spellCheck(){

        spellChecker.spellCheck();
    }

    public void init(){

        System.out.println("Entering TextEditor");
    }

    public void destroy(){

        System.out.println("Exit TextEditor");
    }
}
