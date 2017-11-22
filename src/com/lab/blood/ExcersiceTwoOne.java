package com.lab.blood;

/**
 * Created by User on 022 22.11.17.
 */
public class ExcersiceTwoOne {
    public static void main(String[] args) {
        String text = "Мама мыла раму и  ало запачкала платье.";
        int i = 4;
        char symbolForReplace = '_';
        System.out.printf("Строка: %s%s%sРезультат: %s", text, System.lineSeparator(), replaceSymbol(text, i, symbolForReplace));
    }

    public static String replaceSymbol(String offer, int index, char symbol) {
        StringBuilder sb = new StringBuilder();
        if (offer != null && offer.length() > 0 && index > 0) {
            for (String word : offer.split(" ")) {
                if (word.length() >= index) {
                    sb.append(word.substring(0, index - 1)).append(symbol).append(word.substring(index, word.length()));
                } else {
                    sb.append(word);
                }
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}