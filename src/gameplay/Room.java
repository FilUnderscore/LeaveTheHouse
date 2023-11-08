package gameplay;

import java.util.ArrayList;
import java.util.List;

public class Room extends Entity{
    private boolean finalRoom;

    private final Inventory pickupsInRoom;
    private Room[] connectingRooms;

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
}