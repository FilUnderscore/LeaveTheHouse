package consumable;

/**
 * Class containing Food logic (hp value) that is a subclass of Consumable.
 * @author Filip Jerkovic 20122575
 */
public abstract class Food extends Consumable<Food>
{
    private final int hp;

    public Food(String description, int hp) {
        super(description);

        this.hp = hp;
    }

    protected Food(String id, String description, int hp) {
        super(id, description);

        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    @Override
    protected Food createCombination(Food other, String id, String name) {
        return new Food(id, name, this.hp + other.hp) {};
    }
}
