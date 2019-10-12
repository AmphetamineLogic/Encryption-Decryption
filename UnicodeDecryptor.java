package encryptdecrypt;

class UnicodeDecryptor implements CryptoMethod {

    public String process(final Data data) {
        final String result;
        final String message = data.getMessage();
        final int key = data.getKey();

        int newCode;
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            newCode = (int) chars[i] - key;
            chars[i] = (char) newCode;
        }

        return new String(chars);
    }
}