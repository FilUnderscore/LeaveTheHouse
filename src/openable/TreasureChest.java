package openable;

import opener.Opener;

/**
 * Class defining Treasure Chest.
 * @author Filip Jerkovic 20122575
 */
public class TreasureChest extends Openable {
    public TreasureChest(boolean locked) {
        super("Treasure Chest", locked);
    }

    @Override
    public void unlockWith(Opener pickup) {
        if(this.isLocked())
            return;

        this.unlock();
    }
}
