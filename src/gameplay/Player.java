package gameplay;

import consumable.Food;
import consumable.Valuable;
import wieldables.FistsOfFury;
import wieldables.Wieldable;

/**
 * Class defining Player logic (confidence, weapon, attacking, inventory, eating, admiring) as a subclass of Character.
 * @author Filip Jerkovic 20122575
 */
public class Player extends Character
{
    private Inventory inventory;
    private Wieldable weapon;
    private int confidence;

    public Player(String name,int health,int confidence)
    {
        super(name, health);
        this.confidence = confidence;
        this.inventory = new Inventory();
    }

    public int getConfidence() {
        return this.confidence;
    }

    @Override
    public int dealAttackDamage() {
        int h = this.weapon.hit();
        int c = this.confidence;

        return h + (h * c) / 100;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        this.setHp(this.getHp() - d);
        this.confidence = Math.max(this.confidence - d / 2, 0);

        return d;
    }

    public boolean equip(String weapon) {
        Pickup pickup = this.inventory.select(weapon);

        if(pickup instanceof Wieldable) {
            this.weapon = (Wieldable) pickup;
            return true;
        } else if(pickup == null) {
            if(weapon.equalsIgnoreCase("fistsoffury"))
            {
                this.weapon = new FistsOfFury();
                return true;
            }

            return false;
        } else {
            return false;
        }
    }

    public void unequip() {
        this.weapon = null;
    }

    public boolean consume(Food food) {
        if(food.isConsumed())
            return false;

        this.setHp(this.getHp() + food.getHp());
        food.consume();

        this.inventory.remove(food);

        return true;
    }

    public boolean admire(Valuable valuable) {
        if(valuable.isConsumed())
            return false;

        this.setConfidence(this.getConfidence() + valuable.getValue());
        valuable.consume();

        return true;
    }

    private void setConfidence(int confidence) {
        this.confidence = Math.min(Math.max(confidence, 0), 100);
    }

    public Wieldable getWeapon() {
        return this.weapon;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
}
