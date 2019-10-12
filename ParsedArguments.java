package encryptdecrypt;

import java.util.HashMap;

class ParsedArguments {
    private HashMap<String, Integer> argumentsMap;

    ParsedArguments(final String[] args) {
        argumentsMap = new HashMap<>();
        String[] availableArguments = {"-mode", "-alg", "-key", "-data", "-in", "-out", "dec", "shift"};
        for (String argument : availableArguments
        ) {
            argumentsMap.put(argument, arraySearch(args, argument));
        }
    }

    int getArgumentPosition(final String argument) {
        return argumentsMap.get(argument);
    }

    private int arraySearch(final String[] args, final String value) {
        int index = -1;
        for (int i = 0; i < args.length; i++) {
            if (value.equals(args[i])) {
                index = i;
            }
        }
        return index;
    }
}
