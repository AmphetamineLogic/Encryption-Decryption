package encryptdecrypt;

public class ShiftEncryptor implements CryptoMethod {

    public String process(Data data) {
        String message = data.getMessage();
        int key = data.getKey();
        String result = "";
        int newCode = 0;
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                newCode = chars[i] + key;
                if (newCode > 90) {
                    newCode = newCode - 26;
                }
            }
            else if (chars[i] >= 97 && chars[i] <= 122) {
                newCode = chars[i] + key;
                if (newCode > 122) {
                    newCode = newCode - 26;
                }
            }
            else {
                newCode = chars[i];
            }
            chars[i] = (char) newCode;
        }

        result = new String(chars);
        return result;
    }
}
