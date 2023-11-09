package openable;

import opener.Opener;

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
