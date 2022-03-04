package mutable_immutable;

public class ESI {
    private float principal;
    private float rate;
    private float time;

    public ESI(float principal, float rate, float time) {

        this.principal = principal;
        this.rate = rate;
        this.time = time;

    }

    public ESI() {
    };

    public void setPrincipal(Float principal) {
        if (principal <= 0)
            throw new IllegalArgumentException("Principal can't be less than 0.");

        this.principal = principal;
    }

    public void setRate(Float rate) {
        if (rate <= 0)
            throw new IllegalArgumentException("Rate can't be less than 0.");
        this.rate = rate;
    }

    public void setTime(Float time) {
        if (rate <= 0)
            throw new IllegalArgumentException("Time can't be less than 0.");
        this.time = time;
    }

}
