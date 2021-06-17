package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {


    public static final String DOT = ".";
    public static final String COMMA = ",";
    public static final String STRIKE_THROUGH = "-";
    public static final String COLON = ":";
    public static final String SEMICOLON = ";";
    public static final String EXCLAMATION_POINT = "!";
    public static final String QUESTION_MARK = "?";
    public static final String[] PIG_LATIN_PUNCTUATION = new String[]{DOT, COMMA, STRIKE_THROUGH, COLON, SEMICOLON, EXCLAMATION_POINT, QUESTION_MARK};
    public static final String PIG_LATIN_SUFFIX = "ay";
    public static final String BLANK = " ";

    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String str) {
        String[] words = str.split(BLANK);
        char firstChar;
        boolean hasNoPunctuation = true;

        for (int i = 0; i < words.length; i++){
            for (String punctuation : PIG_LATIN_PUNCTUATION) {
                if (words[i].contains(punctuation)) {
                    hasNoPunctuation = false;
                    break;
                }
            }

            if (hasNoPunctuation){
                firstChar = words[i].charAt(0);
                words[i] = words[i].substring(1);
                words[i] = words[i].replace(words[i], words[i] + firstChar + PIG_LATIN_SUFFIX);
            }
            hasNoPunctuation = true;
        }

        return String.join(BLANK, words);
    }
}
