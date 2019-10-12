package encryptdecrypt;

class UnicodeEncryptor implements CryptoMethod {

    public String process(final Data data) {
        final String result;
        final String message = data.getMessage();
        final int key = data.getKey();

        int newCode;
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            newCode = key + (int) chars[i];
            chars[i] = (char) newCode;
        }

        result = new String(chars);
        return result;
    }
}
