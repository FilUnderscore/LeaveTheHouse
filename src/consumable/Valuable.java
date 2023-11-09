package consumable;

public abstract class Valuable extends Consumable<Valuable>
{
    private final int value;

    public Valuable(String description, int value) {
        super(description);
        this.value = value;
    }

    protected Valuable(String id, String description, int value) {
        super(id, description);
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    protected Valuable createCombination(Valuable other, String id, String name) {
        return new Valuable(id, name, this.value + other.value) {};
    }
}
