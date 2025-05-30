package opener;

import gameplay.Pickup;
import openable.Openable;

/**
 * Class defining Opener logic as a subclass of Pickup.
 * @author Filip Jerkovic 20122575
 */
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
