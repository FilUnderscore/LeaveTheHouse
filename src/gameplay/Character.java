package gameplay;

public abstract class Character extends Entity {
    private int hp;

    public Character(String description, int hp) {
        super(description);

        this.hp = hp;
    }

    protected abstract int dealAttackDamage();
    public abstract int defendAttack(Character enemy);
}