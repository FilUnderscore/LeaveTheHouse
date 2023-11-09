package consumable;

import gameplay.Pickup;

public abstract class Consumable<T> extends Pickup<T>
{
    private boolean consumed = false;

    public Consumable(String description) {
        super(description);
    }

    protected Consumable(String id, String description) {
        super(id, description);
    }

    public void consume() {
        this.consumed = true;
    }

    public boolean isConsumed() {
        return this.consumed;
    }
}