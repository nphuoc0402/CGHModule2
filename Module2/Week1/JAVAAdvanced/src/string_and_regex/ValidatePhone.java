package string_and_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static final String PHONE_REGEX = "\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public ValidatePhone(){

    }

    public boolean validate(String str){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
