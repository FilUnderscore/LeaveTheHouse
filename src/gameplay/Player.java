package gameplay;

import consumable.Food;

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
    protected int dealAttackDamage() {
        int h = this.weapon.hit();
        int c = this.confidence;

        return h + (h * c) / 100;
    }

    @Override
    public int defendAttack(Character enemy) {
        int d = enemy.dealAttackDamage();
        this.setHp(Math.max(this.getHp() - d, 0));
        this.confidence = Math.max(this.confidence - d / 2, 0);

        return d;
    }

    public boolean equip(String weapon) {
        Pickup pickup = this.inventory.select(weapon);

        if(pickup instanceof Wieldable) {
            this.weapon = (Wieldable) pickup;
            return true;
        } else {
            return false;
        }
    }

    public boolean consume(Food food) {
        if(food.isConsumed())
            return false;

        this.setHp(Math.min(this.getHp() + food.getHp(), 100));
        food.consume();

        this.inventory.remove(food);

        return true;
    }

    public Inventory getInventory() {
        return this.inventory;
    }
}
