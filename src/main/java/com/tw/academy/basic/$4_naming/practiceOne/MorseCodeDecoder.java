package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {

    public static final String MORSE_CODE_REGEX = "\\s{2,}";
    public static final String BLANK = " ";
    public static final String NULL = "null";

    public static String decode(String morseCode) {
        String[] morseCodeStrings = morseCode.split(MORSE_CODE_REGEX);
        StringBuilder decodedMorseCode = new StringBuilder();
        for (String morseCodeStr : morseCodeStrings) {
            String [] morseCodeChars = morseCodeStr.split(BLANK);
            for (String morseCodeChar: morseCodeChars) {
                decodedMorseCode.append(MorseCode.getMorseCodeByChar(morseCodeChar));
            }
            decodedMorseCode.append(BLANK);
        }
        return decodedMorseCode.toString().replaceAll(NULL, "").trim();
    }
}
