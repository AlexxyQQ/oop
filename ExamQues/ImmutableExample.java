package ExamQues;


public class ImmutableExample {
    private final String s;

    ImmutableExample(final String s) {
        this.s = s;
    }

    public final String getName() {
        return s;
    }

    public static void main(String[] args) {
        ImmutableExample obj = new ImmutableExample("Im immutable bruh.");
        System.out.println(obj.getName());
    }
}