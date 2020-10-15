package helloWorldPackage;

public class ReverseStrings {

    public static String reverse(String s) {
        char[] letters = new char[s.length()];
        int letterIndex = 0;
        String reveresedString = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            letters[letterIndex] = s.charAt(i);
            letterIndex++;

        }


        for (int i = 0; i < s.length(); i++) {

            reveresedString = reveresedString + letters[i];

        }
        return reveresedString;
    }
}
