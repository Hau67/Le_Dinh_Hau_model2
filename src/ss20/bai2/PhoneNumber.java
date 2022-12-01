package ss20.bai2;

import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PATHNAME="^[(]\\d{2}[)]-[(][0]\\d{9}[)]$";

    public boolean phone(String regex) {
        return Pattern.matches(PATHNAME,regex);
    }
}
