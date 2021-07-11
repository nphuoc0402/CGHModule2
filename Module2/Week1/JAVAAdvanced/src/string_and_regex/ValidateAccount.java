package string_and_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static final String ACCOUNT_REGEX = "^[_a-zA-Z0-9]{6,}$";

    public ValidateAccount(){

    }

    public boolean valid(String str){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }


}
