package service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import domain.Hotel;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import repository.HotelRepository;

@ExtendWith(MockitoExtension.class)
class HotelServiceTest {

  @Mock
  private HotelRepository repo;

  @Test
  public void add_hotel_to_repository() {
    HotelService service = new HotelService(repo);

    String hotelId = UUID.randomUUID().toString();

    ArgumentCaptor<Hotel> hotelArg = ArgumentCaptor.forClass(Hotel.class);
    service.addHotel(hotelId, "Tom's hotel");

    verify(repo).save(hotelArg.capture());

    assertEquals("Tom's hotel", hotelArg.getValue().name);
    assertEquals(hotelId, hotelArg.getValue().id);
  }

}