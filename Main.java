package encryptdecrypt;

public class Main {
    static ParsedArguments parsedArguments;

    public static void main(String[] args) {

        parsedArguments = new ParsedArguments(args);
        boolean decMode = parsedArguments.getArgumentPosition("dec") > -1;
        boolean shiftAlg = parsedArguments.getArgumentPosition("shift") > -1;
        boolean consoleData = parsedArguments.getArgumentPosition("-data") > -1;
        boolean fileOutput = parsedArguments.getArgumentPosition("-out") > -1;

        CryptoMethod cryptoMethod = null;
        DataReader dataReader;
        DataWriter dataWriter;

        if (!decMode && !shiftAlg) {
            cryptoMethod = new UnicodeEncryptor();
        } else if (!decMode && shiftAlg) {
            cryptoMethod = new ShiftEncryptor();
        } else if (decMode && !shiftAlg) {
            cryptoMethod = new UnicodeDecryptor();
        } else if (decMode && shiftAlg) {
            cryptoMethod = new ShiftDecryptor();
        }

        if (!consoleData) {
            dataReader = new FileReader();
        } else {
            dataReader = new ConsoleReader();
        }

        if (!fileOutput) {
            dataWriter = new ConsoleWriter();
        } else {
            dataWriter = new FileWriter();
        }

        final MainContext mainContext = new MainContext(args, cryptoMethod, dataReader, dataWriter);
        mainContext.process();
    }
}