package wieldables;

import gameplay.Pickup;

public abstract class Wieldable extends Pickup<Wieldable>
{
    private final int low, high;

    public Wieldable(String description, int low, int high) {
        super(description);

        this.low = low;
        this.high = high;
    }

    protected Wieldable(String id, String description, int low, int high) {
        super(id, description);

        this.low = low;
        this.high = high;
    }

    public final int hit() {
        return this.randInt(this.low, this.high);
    }

    @Override
    protected Wieldable createCombination(Wieldable other, String id, String name) {
        return new Wieldable(id, name, this.low + other.low, this.high + other.high) {};
    }
}
