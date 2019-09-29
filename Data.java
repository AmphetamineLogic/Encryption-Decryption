package encryptdecrypt;

public class Data {
    String message;
    int key;

    public Data(String message, int key) {
        this.message = message;
        this.key = key;
    }

    public String getMessage() {
        return message;
    }

    public int getKey() {
        return key;
    }
}
