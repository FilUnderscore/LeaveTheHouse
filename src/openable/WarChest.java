package openable;

import opener.Opener;

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
