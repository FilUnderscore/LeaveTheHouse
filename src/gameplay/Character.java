package gameplay;

public abstract class Character extends Entity {
    private int hp;

    public Character(String description, int hp) {
        super(description);

        this.hp = hp;
    }

    protected void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    protected abstract int dealAttackDamage();
    public abstract int defendAttack(Character enemy);
}