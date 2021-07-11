package string_and_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static final String CLASS_REGEX = "^[CAP]\\d{4,}[GHIKLM]$";

    public ValidateClass(){

    }

    public boolean validate(String str){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
