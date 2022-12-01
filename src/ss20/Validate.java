package ss20;

import java.lang.reflect.Parameter;
import java.util.regex.Pattern;

public class Validate {
    private static final String PATH_NAME = "^(C|A|P)[A-Za-z0-9]*[0-9]{4}(G|H|I|K|L|M)$";

    public boolean ValidateName(String regex) {
        return Pattern.matches(PATH_NAME,regex);
    }
}
