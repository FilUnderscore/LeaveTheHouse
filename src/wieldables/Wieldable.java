package wieldables;

import gameplay.Pickup;

/**
 * Class defining Wieldable/Weapon logic (durability, low/high dps) as a subclass of Pickup.
 * @author Filip Jerkovic 20122575
 */
public abstract class Wieldable extends Pickup<Wieldable>
{
    private final int low, high;
    private int durability;

    public Wieldable(String description, int low, int high, int durability) {
        super(description);

        this.low = low;
        this.high = high;
        this.durability = durability;
    }

    protected Wieldable(String id, String description, int low, int high, int durability) {
        super(id, description);

        this.low = low;
        this.high = high;
        this.durability = durability;
    }

    public final int hit() {
        this.durability--;
        return this.randInt(this.low, this.high);
    }

    public boolean broken() {
        return this.durability <= 0;
    }

    public void repair(int points) {
        this.durability += points;
    }

    @Override
    protected Wieldable createCombination(Wieldable other, String id, String name) {
        return new Wieldable(id, name, this.low + other.low, this.high + other.high, this.durability + other.durability) {};
    }
}
