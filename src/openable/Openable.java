package openable;

import gameplay.Pickup;
import opener.Opener;

public abstract class Openable extends Pickup
{
    private boolean locked;
    private Pickup contents;

    public Openable(String description) {
        super(description);
    }

    public abstract void unlockWith(Opener pickup);
}