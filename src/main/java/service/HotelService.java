package service;

import domain.Hotel;
import repository.HotelRepository;

public class HotelService {

  private HotelRepository repository;

  public HotelService(HotelRepository repo) {
    this.repository = repo;
  }

  public void addHotel(String hotelId, String hotelName) {
    repository.save(new Hotel(hotelId,hotelName));
  }

  public void setRoom(String hotelId, String roomNumber, String roomType) {
    throw new UnsupportedOperationException();
  }

}
