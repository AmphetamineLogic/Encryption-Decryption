package encryptdecrypt;

public class UnicodeDecryptor implements CryptoMethod{

    public String process(Data data) {
        String result = "";
        String message = data.getMessage();
        int key = data.getKey();

        int newCode = 0;
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            newCode = (int) chars[i] - key;
            chars[i] = (char) newCode;
        }

        result = new String(chars);
        return result;
    }
}