package domain;

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
    private String country;
    private String language;
    private String hobby;

    public static List<Guest> populateGuests() {
        List<Guest> guestList = new ArrayList<>();
        guestList.add(Guest.builder()
                .name("Madhav")
                .dateOfBirth("1998/11/25")
                .country("USA")
                .language("English").hobby("Eat")
                .build());

        guestList.add(Guest.builder()
                .name("Gopal")
                .dateOfBirth("1998/11/25")
                .country("China")
                .language("Chinese").hobby("Read")
                .build());

        guestList.add(Guest.builder()
                .name("Lakshman")
                .dateOfBirth("1998/11/25")
                .country("Spain")
                .language("Spanish").hobby("Eat")
                .build());

        guestList.add(Guest.builder()
                .name("Lucky")
                .dateOfBirth("1998/11/25")
                .country("France")
                .language("French").hobby("Sports")
                .build());

        guestList.add(Guest.builder()
                .name("Jack")
                .dateOfBirth("1998/11/25")
                .country("Germany")
                .language("German").hobby("Eat")
                .build());

        return guestList;
    }
}
