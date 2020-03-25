package repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import domain.Hotel;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.FieldSetter;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HotelRepositoryTest {




  @Test
  void save_hotel_to_in_memory() {
    HotelRepository repo = new HotelRepository();

    String hotelId = UUID.randomUUID().toString();

    Hotel hotel = new Hotel(hotelId, "Sebs'hotel");
    repo.save(hotel);

    assertEquals(hotel, repo.findHotelBy(hotelId));
  }

  @Test
  void set_room_for_hotel() {
    HotelRepository repo = new HotelRepository();

    String roomType = "single";
    String roomNumber = UUID.randomUUID().toString();
    String hotelId = UUID.randomUUID().toString();
    TestableHotel hotel = new TestableHotel(hotelId,"Sebs'hotel");

    repo.save(hotel);
    repo.setRoom(hotelId, roomNumber, roomType);

    assertTrue(hotel.verifyAddRoomCalled(roomNumber,roomType));
  }

  private class TestableHotel extends Hotel{

    private boolean addRoomCalled;
    public String roomNumber;
    public String roomType;

    public TestableHotel(String id, String name) {
      super(id, name);
    }

    public void addRoom(String roomNumber, String roomType) {
      this.roomNumber = roomNumber;
      this.roomType = roomType;
      addRoomCalled = true;
    }

    public boolean verifyAddRoomCalled(String roomNumber, String roomType){
      return addRoomCalled && roomNumber.equals(this.roomNumber)
          && roomType.equals(this.roomType);
    }

  }
}