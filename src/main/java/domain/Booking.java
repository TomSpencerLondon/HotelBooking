package domain;

public class Booking {

  public String hotelName;
  public String roomNumber;
  public final String roomType;
  public final String dateCheckIn;
  public final String dateCheckOut;

  public Booking(String dateCheckIn, String roomType, String dateCheckOut, String hotelName,
      String roomNumber) {
    this.dateCheckIn = dateCheckIn;
    this.roomType = roomType;
    this.dateCheckOut = dateCheckOut;
    this.hotelName = hotelName;
    this.roomNumber = roomNumber;
  }
}
