package gameplay;

/**
 * Class defining Character logic (hp) as a subclass of Entity.
 * @author Filip Jerkovic 20122575
 */
public abstract class Character extends Entity {
    private int hp;

    public Character(String description, int hp) {
        super(description);

        this.hp = hp;
    }

    protected void setHp(int hp) {
        this.hp = Math.min(Math.max(0, hp), 100);
    }

    public int getHp() {
        return this.hp;
    }

    public abstract int dealAttackDamage();
    public abstract int defendAttack(Character enemy);
}