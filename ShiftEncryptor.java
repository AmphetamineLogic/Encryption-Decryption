package encryptdecrypt;

class ShiftEncryptor implements CryptoMethod {

    public String process(final Data data) {
        final String message = data.getMessage();
        final int key = data.getKey();
        final int alphabetLength = 26;
        final String result;
        int newCode;
        char[] chars = message.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                newCode = chars[i] + key;
                if (newCode > 'Z') {
                    newCode = newCode - alphabetLength;
                }
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                newCode = chars[i] + key;
                if (newCode > 'z') {
                    newCode = newCode - alphabetLength;
                }
            } else {
                newCode = chars[i];
            }
            chars[i] = (char) newCode;
        }

        result = new String(chars);
        return result;
    }
}
