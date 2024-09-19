import domain.Guest;
import enums.COUNTRY;

import java.time.LocalDate;
import java.util.List;
import java.time.Period;

public class EventManager {
    public static void main(String[] args) {
        List<Guest> guestList = Guest.populateGuests();

        guestList.stream()
                .filter( guest -> COUNTRY.USA.name().equalsIgnoreCase(guest.getCountry()))
                .forEach(guest -> System.out.println(guest.getName() + " " + guest.getCountry()));

        guestList.stream()
                .filter( guest -> (Period.between(guest.getDateOfBirth(), LocalDate.now()).getYears()) > 70)
                .forEach(guest -> System.out.println(guest.getName() + " " + guest.getDateOfBirth()));


    }
}