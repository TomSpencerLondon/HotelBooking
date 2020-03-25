package domain;

public class Hotel {

  public final String name;
  public final String id;

  public Hotel(String id, String name) {
    this.name = name;
    this.id = id;
  }

  public void addRoom(String roomNumber, String roomType) {
    throw new UnsupportedOperationException();
  }
}
