package gameplay;

import consumable.food.Bread;
import consumable.food.Mead;
import consumable.food.RoastBoar;
import consumable.valuable.Chalice;
import consumable.valuable.HoneyBag;
import consumable.valuable.Jewel;
import consumable.valuable.Ring;
import wieldables.Axe;
import wieldables.Katana;
import wieldables.Stick;
import wieldables.Sword;

import java.util.ArrayList;
import java.util.List;

/**
 * Class defining Pickup logic (combining) as a subclass of Entity.
 * @author Filip Jerkovic 20122575
 */
public abstract class Pickup<T> extends Entity
{
    private static final class Combination {
        private final Class<? extends Pickup<?>> lhs, rhs;
        private final String id, name;

        public Combination(Class<? extends Pickup<?>> lhs, Class<? extends Pickup<?>> rhs, String id, String name) {
            this.lhs = lhs;
            this.rhs = rhs;
            this.id = id;
            this.name = name;
        }
    }

    // List of combinations.
    private static final List<Combination> COMBINATIONS = new ArrayList<>() {{
        // Weapons
        add(new Combination(Axe.class, Sword.class, "longhandledaxe", "Long-Handled Axe"));
        add(new Combination(Katana.class, Sword.class, "doublebladedkatana", "Double-bladed Katana"));
        add(new Combination(Stick.class, Sword.class, "longsword", "Longsword"));
        add(new Combination(Stick.class, Katana.class, "longkatana", "Long-Katana"));

        // Valuables
        add(new Combination(HoneyBag.class, Chalice.class, "honeycoatedchalice", "Honey-coated Chalice"));
        add(new Combination(Ring.class, Jewel.class, "jewelledring", "Jewelled Ring"));

        // Meals
        add(new Combination(Bread.class, RoastBoar.class, "poormansfeast", "Poor Man's Feast"));
        add(new Combination(Bread.class, Mead.class, "breadandwine", "Bread and Wine"));
        add(new Combination(Mead.class, RoastBoar.class, "mealoftherich", "Meal of the Rich"));
    }};

    public Pickup(String description) {
        super(description);
    }

    protected Pickup(String id, String description) { super(id, description); }

    public final Pickup combine(Pickup other) {
        Combination foundCombination = null;

        for(Combination combination : COMBINATIONS) {
            if((combination.lhs == this.getClass() || combination.rhs == this.getClass()) &&
                    (combination.lhs == other.getClass() || combination.rhs == other.getClass()))
            {
                foundCombination = combination;
                break;
            }
        }

        if(foundCombination == null)
            return null;

        return (Pickup) createCombination((T)other, foundCombination.id, foundCombination.name);
    }

    protected abstract T createCombination(T other, String id, String name);
}
