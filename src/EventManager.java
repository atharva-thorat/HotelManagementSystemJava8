import domain.Guest;
import enums.COUNTRY;

import java.util.List;

public class EventManager {
    public static void main(String[] args) {
        List<Guest> guestList = Guest.populateGuests();

        guestList.stream()
                .filter( guest -> COUNTRY.USA.name().equalsIgnoreCase(guest.getCountry()))
                .forEach(guest -> System.out.println(guest.getName() + " " + guest.getCountry()));
    }
}