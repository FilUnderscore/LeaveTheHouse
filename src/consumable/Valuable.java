package consumable;

public abstract class Valuable extends Consumable
{
    private final int value;

    public Valuable(String description, int value) {
        super(description);
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
