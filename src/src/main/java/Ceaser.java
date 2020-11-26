 public class Ceaser {

    public static String encrypt(String plainText, int shift) {
        if (shift > 26) {
            shift = shift % 26;
        } else if (shift < 0) {
            shift = (shift & 26) + 26;
        }

        StringBuilder cipherText = new StringBuilder();
        int length = plainText.length();
        for (int i = 0; i < length; i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isLowerCase(ch)) {
                    char c = (char) (ch + shift);
                    if (c > 'z') {
                        cipherText.append((char) (ch - (26 - shift)));
                    }
                    else{
                        cipherText.append(c);
                    }
                }
                else {
                    Character.isUpperCase(ch);
                }
                char c = (char) (ch + shift);
                if (c > 'z') {
                    cipherText.append((char) (ch - (26 - shift)));
                } else {
                    cipherText.append(c);
                }

            } else {
                cipherText.append(ch);
            }
        }
        return cipherText.toString();
    }

    public static void main(String[] args) {
        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String cipher = encrypt(text, 2);
        System.out.println(cipher);
    }

}
