package encryptdecrypt;

class Data {
    private final String message;
    private final int key;

    public Data(String message, int key) {
        this.message = message;
        this.key = key;
    }

    final String getMessage() {
        return message;
    }

    final int getKey() {
        return key;
    }
}
