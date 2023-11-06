package gameplay;

public class Room extends Entity{
    private String description;
    private Room[] connectingRooms;

    public Room(String description, Room[] connectingRooms) {
        super(description);

        this.connectingRooms = connectingRooms;
    }

    public Room() {
        this(null, null);
    }
}