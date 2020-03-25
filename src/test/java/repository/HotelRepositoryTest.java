package repository;

import static org.junit.jupiter.api.Assertions.*;

import domain.Hotel;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

class HotelRepositoryTest {

  @Test
  void save_hotel_to_in_memory() {
    HotelRepository repo = new HotelRepository();

    String hotelId = UUID.randomUUID().toString();

    Hotel hotel = new Hotel(hotelId, "Sebs'hotel");
    repo.save(hotel);

    assertEquals(hotel, repo.findHotelBy(hotelId));
  }

}