package exercise.tdd.simple.capchar;

public class CapChar {
    private final int CHARS_LENGTH = 10;

    public String generate() {
        char[] chs = new char[CHARS_LENGTH];

        // A -> 65, a -> 97, 0 -> 48
        for(int i=0; i<CHARS_LENGTH; i++)
            chs[i] = ASCII.getRandom();

        return new String(chs);
    }

}
