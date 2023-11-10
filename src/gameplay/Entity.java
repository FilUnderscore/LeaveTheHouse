package gameplay;

import java.util.Random;

/**
 * Class defining Entity logic.
 * @author Filip Jerkovic 20122575
 */
public abstract class Entity {
    private final String id, description;

    public Entity(String description) {
        this.id = this.getClass().getSimpleName();
        this.description = description;
    }

    // Required for customization.
    protected Entity(String id, String description) {
        this.id = id;
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
