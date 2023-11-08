package gameplay;

public abstract class Wieldable extends Pickup
{
    private final int low, high;

    public Wieldable(String description, int low, int high) {
        super(description);

        this.low = low;
        this.high = high;
    }

    public int getLow() {
        return this.low;
    }

    public int getHigh() {
        return this.high;
    }

    public int hit() {
        return this.randInt(this.low, this.high);
    }
}
