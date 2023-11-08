package consumable;

public abstract class Food extends Consumable
{
    private final int hp;

    public Food(String description, int hp) {
        super(description);

        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }
}
