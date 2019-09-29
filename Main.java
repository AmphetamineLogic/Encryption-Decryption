package encryptdecrypt;

public class Main {
    public static void main(String[] args) {

        MainContext mainContext = new MainContext();
        mainContext.setArgs(args);

        int decMode = arraySearch(args, "dec");
        int shiftAlg = arraySearch(args, "shift");
        int consoleData = arraySearch(args, "-data");
        int fileOutput = arraySearch(args, "-out");

        if (decMode == -1 && shiftAlg == -1) {
            mainContext.setCryptoMethod(new UnicodeEncryptor());
        }
        if (decMode == -1 && shiftAlg > -1) {
            mainContext.setCryptoMethod(new ShiftEncryptor());
        }
        if (decMode > -1 && shiftAlg == -1) {
            mainContext.setCryptoMethod(new UnicodeDecryptor());
        }
        if (decMode > -1 && shiftAlg > -1) {
            mainContext.setCryptoMethod(new ShiftDecryptor());
        }

        if (consoleData == -1) {
            mainContext.setDataReader(new FileReader());
        }
        else {
            mainContext.setDataReader(new ConsoleReader());
        }

        if (fileOutput == -1) {
            mainContext.setDataWriter(new ConsoleWriter());
        }
        else {
            mainContext.setDataWriter(new FileWriter());
        }
        mainContext.process();
    }

    static int arraySearch(String[] args, String value) {
        int index = -1;
        for (int i = 0; i < args.length; i++) {
            if (value.equals(args[i])) {
                index = i;
            }
        }
        return index;
    }
}