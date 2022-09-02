package exercise.tdd.simple.member;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class DataValidator {

    protected final RegexChecker rgxChecker = new RegexChecker();

    protected abstract void validate();

    protected final RegexChecker getRgxChecker(){
        return this.rgxChecker;
    }

    protected static final class RegexChecker {
        void check(String regex, String data){
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(data);

            if(!m.find())
                throw RegexException.newEx("The data does not match the regular expression.");
        }
    }

}
