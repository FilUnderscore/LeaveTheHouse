package consumable;

/**
 * Class defining Repair Kit that is a subclass of Consumable.
 * @author Filip Jerkovic 20122575
 */
public class RepairKit extends Consumable<RepairKit> {
    public RepairKit() {
        super("Repair Kit");
    }

    @Override
    protected RepairKit createCombination(RepairKit other, String id, String name) {
        return null;
    }
}
