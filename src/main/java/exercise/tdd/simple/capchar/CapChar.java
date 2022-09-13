package exercise.tdd.simple.capchar;

public class CapChar {
    private final int CHARS_LENGTH = 10;
    private final String chrs;

    public CapChar() {
        this.chrs = generate();
    }

    private String generate() {
        char[] chs = new char[CHARS_LENGTH];

        // A -> 65, a -> 97, 0 -> 48
        for(int i=0; i<CHARS_LENGTH; i++)
            chs[i] = ASCII.getRandom();

        return new String(chs);
    }

    @Override
    public boolean equals(Object o){
        String s = (String) o;
        return this.chrs.equals(s);
    }


    public String get() {
        return chrs;
    }
}
