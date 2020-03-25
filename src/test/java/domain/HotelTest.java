package domain;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {
  @Test
  void adds_a_room() {
    String id = UUID.randomUUID().toString();
    String name = "Alexis' hotel";
    Hotel hotel = new Hotel(id, name);

    String roomNumber = UUID.randomUUID().toString();

    String roomType = "master suite";
    hotel.addRoom(roomNumber, roomType);

    assertEquals(1, hotel.getRooms().size());
    assertEquals(roomNumber, hotel.getRooms().get(0).number);
    assertEquals(roomType, hotel.getRooms().get(0).type);
  }
}