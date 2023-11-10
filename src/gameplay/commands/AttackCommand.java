package gameplay.commands;

import gameplay.*;
import monsters.Monster;
import wieldables.Wieldable;

/**
 * Class defining Attack Command.
 * @author Filip Jerkovic 20122575
 */
public class AttackCommand implements PlayerCommand {
    @Override
    public CommandResult execute(Player player, World world) {
        Wieldable weapon = player.getWeapon();

        if(weapon == null)
            return new CommandResult("You punch the air as you realize you have no weapon equipped.");

        if(world.getCurrentRoom().getMonsters() == null || world.getCurrentRoom().getMonsters().length == 0)
            return new CommandResult("You try to wave your %s around, but realize there is nothing to hit in the room.", weapon.getDescription());

        world.out("You wave your %s around, damaging whatever is in the room", weapon.getDescription());

        boolean notDead = false;
        for(Monster monster : world.getCurrentRoom().getMonsters()) {
            monster.defendAttack(player);
            world.out("You damage the %s.", monster.getDescription());

            if(monster.getHp() <= 0) {
                world.out("You kill the %s, feeling the adrenaline pump through your veins.", monster.getDescription());
            } else {
                notDead = true;
                player.defendAttack(monster);
                world.out("The %s damages you, bringing your health down to %d.", monster.getDescription(), player.getHp());
            }
        }

        if(player.getWeapon().broken()) {
            world.out("Your %s broke, leaving you with one weapon less.", player.getWeapon().getDescription());

            player.getInventory().remove(player.getWeapon());
            player.unequip();
        }

        boolean finalNotDead = notDead;
        return new CommandResult(() -> {
            if(!finalNotDead)
                world.notifyMonstersKilled();
        }, "");
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.BATTLE;
    }
}
