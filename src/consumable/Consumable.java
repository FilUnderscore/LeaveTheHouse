package consumable;

import gameplay.Pickup;

public abstract class Consumable extends Pickup
{
    private boolean consumed = false;

    public Consumable(String description) {
        super(description);
    }

    public void consume() {
        this.consumed = true;
    }

    public boolean isConsumed() {
        return this.consumed;
    }
}