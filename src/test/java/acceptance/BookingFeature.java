package acceptance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import domain.Booking;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import repository.HotelRepository;
import service.BookingService;
import service.HotelService;

public class BookingFeature {

  @Test
  public void book_a_room() {
    String employeeId = UUID.randomUUID().toString();
    String hotelId = UUID.randomUUID().toString();
    String dateCheckIn = "10/10/2020";
    String dateCheckOut = "10/10/2020";
    String roomType = "single";

    HotelService hotelService = new HotelService(new HotelRepository());
    String hotelName = "Ewans'hotel";
    String roomNumber = UUID.randomUUID().toString();
    hotelService.addHotel(hotelId, hotelName);
    hotelService.setRoom(hotelId, roomNumber,roomType);

    BookingService bookingService = new BookingService(hotelService);

    Booking booking = bookingService.book(employeeId, hotelId, roomType, dateCheckIn, dateCheckOut);

    assertEquals(hotelId, booking.hotelName);
    assertEquals(roomType, booking.roomType);
    assertEquals(roomType, booking.roomNumber);
    assertEquals(dateCheckIn, booking.dateCheckIn);
    assertEquals(dateCheckOut, booking.dateCheckOut);
  }

}
