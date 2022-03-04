package mutable_immutable;

public class TestImmutable {
    public static void main(String[] args) {
        ImmutableClass Imc = new ImmutableClass(1.33f, 2.2f);
        System.out.println(Imc.add());
    }
}
