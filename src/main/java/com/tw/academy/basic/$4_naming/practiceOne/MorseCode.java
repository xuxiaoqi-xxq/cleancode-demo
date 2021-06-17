package com.tw.academy.basic.$4_naming.practiceOne;

import java.util.HashMap;

public class MorseCode {

    private static final HashMap<String, String> CHAR_MORSE_CODE_MAPPING = new HashMap<>();
    private static final HashMap<String, String> MORSE_CODE_CHAR_MAPPING = new HashMap<>();
    private static final String MORSE_CODE_DEFAULT_VALUE = null;
    static {
        CHAR_MORSE_CODE_MAPPING.put("A", ".-");
        CHAR_MORSE_CODE_MAPPING.put("B", "-...");
        CHAR_MORSE_CODE_MAPPING.put("C", "-.-.");
        CHAR_MORSE_CODE_MAPPING.put("D", "-..");
        CHAR_MORSE_CODE_MAPPING.put("E", ".");
        CHAR_MORSE_CODE_MAPPING.put("F", "..-.");
        CHAR_MORSE_CODE_MAPPING.put("G", "--.");
        CHAR_MORSE_CODE_MAPPING.put("H", "....");
        CHAR_MORSE_CODE_MAPPING.put("I", "..");
        CHAR_MORSE_CODE_MAPPING.put("J", ".---");
        CHAR_MORSE_CODE_MAPPING.put("K", "-.-");
        CHAR_MORSE_CODE_MAPPING.put("L", ".-..");
        CHAR_MORSE_CODE_MAPPING.put("M", "--");
        CHAR_MORSE_CODE_MAPPING.put("N", "-.");
        CHAR_MORSE_CODE_MAPPING.put("O", "---");
        CHAR_MORSE_CODE_MAPPING.put("P", ".--.");
        CHAR_MORSE_CODE_MAPPING.put("Q", "--.-");
        CHAR_MORSE_CODE_MAPPING.put("R", ".-.");
        CHAR_MORSE_CODE_MAPPING.put("S", "...");
        CHAR_MORSE_CODE_MAPPING.put("T", "-");
        CHAR_MORSE_CODE_MAPPING.put("U", "..-");
        CHAR_MORSE_CODE_MAPPING.put("V", "...-");
        CHAR_MORSE_CODE_MAPPING.put("W", ".--");
        CHAR_MORSE_CODE_MAPPING.put("X", "-..-");
        CHAR_MORSE_CODE_MAPPING.put("Y", "-.--");
        CHAR_MORSE_CODE_MAPPING.put("Z", "--..");

        CHAR_MORSE_CODE_MAPPING.put("0", "-----");
        CHAR_MORSE_CODE_MAPPING.put("1", ".----");
        CHAR_MORSE_CODE_MAPPING.put("2", "..---");
        CHAR_MORSE_CODE_MAPPING.put("3", "...--");
        CHAR_MORSE_CODE_MAPPING.put("4", "....-");
        CHAR_MORSE_CODE_MAPPING.put("5", ".....");
        CHAR_MORSE_CODE_MAPPING.put("6", "-....");
        CHAR_MORSE_CODE_MAPPING.put("7", "--...");
        CHAR_MORSE_CODE_MAPPING.put("8", "---..");
        CHAR_MORSE_CODE_MAPPING.put("9", "----.");

        CHAR_MORSE_CODE_MAPPING.put(".", ".-.-.-");
        CHAR_MORSE_CODE_MAPPING.put(",", "--..--");
        CHAR_MORSE_CODE_MAPPING.put("?", "..--..");
        CHAR_MORSE_CODE_MAPPING.put(":", "---...");
        CHAR_MORSE_CODE_MAPPING.put("-", "-....-");
        CHAR_MORSE_CODE_MAPPING.put("@", ".--.-.");
        CHAR_MORSE_CODE_MAPPING.put("!", "-.-.--");

        CHAR_MORSE_CODE_MAPPING.forEach((k, v) -> MORSE_CODE_CHAR_MAPPING.put(v, k));
    }

    public static String getMorseCodeByChar(String code) {
       return MORSE_CODE_CHAR_MAPPING.getOrDefault(code, MORSE_CODE_DEFAULT_VALUE);
    }

}
