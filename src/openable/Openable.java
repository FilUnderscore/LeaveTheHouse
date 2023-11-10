package openable;

import gameplay.Inventory;
import gameplay.Pickup;
import opener.Opener;

/**
 * Class defining Openable logic (locked, inventory, etc.) as a subclass of Pickup.
 * @author Filip Jerkovic 20122575
 */
public abstract class Openable extends Pickup<Openable>
{
    private boolean locked;
    private Inventory contents;

    public Openable(String description, boolean locked) {
        super(description);

        this.locked = locked;
        this.contents = new Inventory();
    }

    protected void unlock() {
        this.locked = false;
    }

    public boolean isLocked() {
        return this.locked;
    }

    public abstract void unlockWith(Opener pickup);

    public Inventory getContents() {
        return this.contents;
    }

    @Override
    protected Openable createCombination(Openable other, String id, String name) {
        return null;
    }
}