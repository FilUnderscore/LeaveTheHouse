package gameplay;

import java.util.Random;

public abstract class Entity {
    private String id;
    private String description;

    public Entity(String description) {
        this.id = this.getClass().getSimpleName();
        this.description = description;
    }

    protected int randInt(int x, int y) {
        return new Random().nextInt(y - x) + x;
    }

    public int compareID(String string) {
        return this.id.toLowerCase().compareTo(string.toLowerCase());
    }
}
