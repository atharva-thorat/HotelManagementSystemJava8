package domain;

import enums.COUNTRY;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guest {

    private String name;
    private String dateOfBirth;
    private COUNTRY country;
    private String language;
    private String hobby;

    private static List<Guest> populateGuests() {
        List<Guest> guestList = new ArrayList<>();
        guestList.add(Guest.builder()
                .name("Madhav")
                .dateOfBirth("1998/11/25")
                .country(COUNTRY.USA)
                .language("English").hobby("Eat")
                .build());

        guestList.add(Guest.builder()
                .name("Gopal")
                .dateOfBirth("1998/11/25")
                .country(COUNTRY.CHINA)
                .language("English").hobby("Eat")
                .build());

        guestList.add(Guest.builder()
                .name("Lakshman")
                .dateOfBirth("1998/11/25")
                .country(COUNTRY.SPAIN)
                .language("English").hobby("Eat")
                .build());

        guestList.add(Guest.builder()
                .name("Lucky")
                .dateOfBirth("1998/11/25")
                .country(COUNTRY.FRANCE)
                .language("English").hobby("Eat")
                .build());

        guestList.add(Guest.builder()
                .name("Jack")
                .dateOfBirth("1998/11/25")
                .country(COUNTRY.GERMANY)
                .language("English").hobby("Eat")
                .build());

        return guestList;
    }
}
