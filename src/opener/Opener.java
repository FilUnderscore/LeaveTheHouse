package opener;

import gameplay.Pickup;
import openable.Openable;

public abstract class Opener extends Pickup<Opener>
{
    public Opener(String description) {
        super(description);
    }

    @Override
    protected Opener createCombination(Opener other, String id, String name) {
        return null;
    }
}
