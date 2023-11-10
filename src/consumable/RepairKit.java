package consumable;

public class RepairKit extends Consumable<RepairKit> {
    public RepairKit() {
        super("Repair Kit");
    }

    @Override
    protected RepairKit createCombination(RepairKit other, String id, String name) {
        return null;
    }
}
