package gameplay;

import java.util.Random;

public abstract class Entity {
    private String id;
    private String description;

    public Entity(String description) {
        this.id = this.getClass().getSimpleName();
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.id;
    }

    protected int randInt(int x, int y) {
        return new Random().nextInt(y - x) + x;
    }

    public boolean compareID(String string) {
        return this.id.equalsIgnoreCase(string);
    }
}
