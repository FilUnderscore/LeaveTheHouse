package gameplay;

import monsters.Monster;

import java.util.ArrayList;
import java.util.List;

/**
 * Class defining Room logic (pickups, monsters, doors, etc.) as a subclass of Entity.
 * @author Filip Jerkovic 20122575
 */
public class Room extends Entity{
    private boolean finalRoom;

    private final Inventory pickupsInRoom;
    private Room[] connectingRooms;
    private Monster[] monsters;

    public Room(String description, Inventory pickupsInRoom, Room[] connectingRooms) {
        super(description);

        this.pickupsInRoom = pickupsInRoom;
        this.connectingRooms = connectingRooms;
    }

    public Room() {
        this(null, null, null);
    }

    public void setConnectingRooms(Room[] rooms) {
        this.connectingRooms = rooms;
    }

    public Room[] getConnectingRooms() {
        return this.connectingRooms;
    }

    public Inventory getPickupsInRoom() {
        return this.pickupsInRoom;
    }

    public Room getConnectingRoom(String roomName) {
        for(Room room : this.connectingRooms) {
            if(room.getDescription().equals(roomName)) {
                return room;
            }
        }

        return null;
    }

    public void setFinalRoom(boolean finalRoom) {
        this.finalRoom = finalRoom;
    }

    public boolean isFinalRoom() {
        return this.finalRoom;
    }

    public void setMonsters(Monster[] monsters) {
        this.monsters = monsters;
    }

    public Monster[] getMonsters() {
        return monsters;
    }
}