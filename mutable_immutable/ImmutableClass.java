package mutable_immutable;

public final class ImmutableClass {
    private final float first;
    private final float second;

    public ImmutableClass(float first, float second) {
        this.first = first;
        this.second = second;

    }

    public float getFirst(float first) {
        return this.first;

    }

    public float getSecond(float second) {
        return this.second;

    }

    public float add() {
        return this.first + this.second;
    }

}
