package repository;

import domain.Hotel;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HotelRepository {

  private List<Hotel> hotels;

  public HotelRepository() {
    hotels = new ArrayList<>();
  }

  public void save(Hotel hotel) {
    hotels.add(hotel);
  }

  public Hotel findHotelBy(String hotelId) {
    return hotels.stream().filter(h -> h.id.equals(hotelId)).findAny().get();
  }

}
