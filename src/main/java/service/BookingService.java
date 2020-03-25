package service;

import domain.Booking;

public class BookingService {

  private HotelService hotelService;

  public BookingService(HotelService hotelService) {
    this.hotelService = hotelService;
  }

  public Booking book(String employeeId, String hotelId, String roomType, String dateCheckIn,
      String dateCheckOut) {
    throw new UnsupportedOperationException();
  }
}
