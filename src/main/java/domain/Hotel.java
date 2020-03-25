package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Hotel {

  public final String name;
  public final String id;
  private List<Room> rooms;

  public Hotel(String id, String name) {
    this.name = name;
    this.id = id;
    rooms = new ArrayList<>();
  }

  public void addRoom(String roomNumber, String roomType) {
    rooms.add(new Room(roomNumber, roomType));
  }

  public List<Room> getRooms() {
    return rooms;
  }
}
