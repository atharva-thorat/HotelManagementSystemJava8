package domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guest {

    private String name;
    private LocalDate dateOfBirth;
    private String country;
    private String language;
    private String hobby;

    public static List<Guest> populateGuests() {
        List<Guest> guestList = new ArrayList<>();
        guestList.add(Guest.builder()
                .name("Madhav")
                .dateOfBirth(LocalDate.of(1999,10,22))
                .country("USA")
                .language("English").hobby("Eat")
                .build());

        guestList.add(Guest.builder()
                .name("Gopal")
                .dateOfBirth(LocalDate.of(1947,8,15))
                .country("China")
                .language("Chinese").hobby("Read")
                .build());

        guestList.add(Guest.builder()
                .name("Lakshman")
                .dateOfBirth(LocalDate.of(1952,9,1))
                .country("Spain")
                .language("Spanish").hobby("Eat")
                .build());

        guestList.add(Guest.builder()
                .name("Lucky")
                .dateOfBirth(LocalDate.of(1990,2,5))
                .country("France")
                .language("French").hobby("Sports")
                .build());

        guestList.add(Guest.builder()
                .name("Jack")
                .dateOfBirth(LocalDate.of(1966,5,29))
                .country("Germany")
                .language("German").hobby("Eat")
                .build());

        return guestList;
    }
}
