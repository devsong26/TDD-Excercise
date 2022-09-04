package exercise.tdd.simple.member;

public class RegexData {

    private final String data;
    private final String regex;

    private RegexData(String data, String regex) {
        this.data = data;
        this.regex = regex;
    }

    public static RegexData of(String data, String regex){
        return new RegexData(data, regex);
    }


    public String getData() {
        return data;
    }

    public String getRegex() {
        return regex;
    }
}
