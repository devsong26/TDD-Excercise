package exercise.tdd.simple.member;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Member extends DataValidator{

    @Data(regex = "^\\S+@\\S+\\.\\S+$")
    private final String username;

    @Data(regex = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()])[a-zA-Z\\d!@#$%^&*()]{10,}")
    private final String password;

    public Member(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void validate() {
//        String[] data = new String[]{username, password};
//        String[] regex = new String[]{
//                "^\\S+@\\S+\\.\\S+$",
//                "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()])[a-zA-Z\\d!@#$%^&*()]{10,}"
//        };
        List<RegexData> data = extractRegexData();

        for(int i=0; i<data.size(); i++){
            RegexData rd = data.get(i);
            verifyRegex(rd.getData(), rd.getRegex());
        }
    }

    private void verifyRegex(String data, String regex){
        Objects.requireNonNull(data);
        super.getRgxChecker().check(regex, data);
    }

    private List<RegexData> extractRegexData(){
        List<RegexData> list = new ArrayList<>();

        Field[] fields = this.getClass().getDeclaredFields();
        for(Field f : fields){
            
            //TODO 여기 어노테이션에서 밸류 읽는게 안됨, 찾아서 해결해야함
            System.out.println(f.getAnnotatedType());
            System.out.println(f.getAnnotations());
            if(f.getAnnotatedType().equals(Data.class)){
                f.setAccessible(true);

                try {
                    list.add(RegexData.of(
                            (String) f.get(this),
                            f.getAnnotation(Data.class).regex()));
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return list;
    }

}
