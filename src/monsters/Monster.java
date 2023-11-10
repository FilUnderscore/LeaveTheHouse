package monsters;

import gameplay.Character;

/**
 * Class defining Monster logic (probability, dmg, etc.) as a subclass of Character.
 * @author Filip Jerkovic 20122575
 */
public abstract class Monster extends Character {
    private int probability, dmg;

    public Monster(String description, int hp, int dmg, int probability) {
        super(description, hp);
        this.dmg = dmg;
        this.probability = probability;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        this.setHp(this.getHp() - d);

        return d;
    }

    @Override
    public int dealAttackDamage() {
        return this.dmg + randInt(1, 10);
    }

    public boolean appear() {
        if(this.getHp() <= 0)
            return false;

        int x = randInt(0, 101);
        return x <= this.probability;
    }
}
