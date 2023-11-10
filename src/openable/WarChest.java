package openable;

import opener.Opener;

/**
 * Class defining War Chest.
 * @author Filip Jerkovic 20122575
 */
public class WarChest extends Openable {
    public WarChest(boolean locked) {
        super("War Chest", locked);
    }

    @Override
    public void unlockWith(Opener pickup) {
        if(!this.isLocked())
            return;

        this.unlock();
    }
}
