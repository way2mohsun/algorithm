
public class LongestPalindromicSubstr {

    static String output;
    static String input = "babad";

    public static void main(String[] args) {
        for (int i = 0; i < input.length() - 1; i++) {
            output = null;
            seek(input.substring(i, input.length()));
            if (output != null) {
                System.out.println(i + ":" + output);
            }
        }
    }

    static void seek(String in) {
        if (in.length() <= 1) {
            return;
        }
        if (in.substring(0, 1).equals(in.substring(in.length() - 1, in.length()))) {
            seek(in.substring(1, in.length() - 1));
            output = in;
        } else {
            seek(in.substring(0, in.length() - 1));
        }
    }
}
