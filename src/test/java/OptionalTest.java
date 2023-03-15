import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static java.time.Month.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OptionalTest {

    private static OptionalTutorial o = new OptionalTutorial();

    @Test
    void nameKati() {
        assertEquals(Optional.of(new User("Kati")), o.searchUser("Kati"));
    }

    @Test
    void nameNotFound() {
        assertEquals(Optional.empty(), o.searchUser("Tõnu"));
    }

    @Test
    void nameEmpty() {
        assertEquals(Optional.empty(), o.searchUser(""));
    }

    @Test
    void namePartialSearch() {
        assertEquals(List.of(new User("Mati"), new User("Mari")), o.partialSearchUser("Ma"));
    }

    @Test
    void namePartialSearchOneLetter() {
        assertEquals(List.of(new User("Kati"), new User("Mati"), new User("Mari"), new User("Jüri"), new User("Tiina")), o.partialSearchUser("i"));
    }

    @Test
    void findExistingBirthday() {
        assertEquals(Optional.of(LocalDate.of(2000, 4, 25)), o.findBirthDay("Kati"));
    }

    @Test
    void findNonExistingBirthday() {
        assertEquals(Optional.empty(), o.findBirthDay("Mari"));
    }

    @Test
    void findTodayBdayKid() {
        assertEquals(List.of(new User("Jüri"), new User("Tiina")), o.findTodayBdayKid());
    }

    @Test
    void usersByNameTest() {
        Map<String, List<LocalDate>> map = new HashMap<>();
        map.put("Kati", Collections.singletonList(LocalDate.of(2000, APRIL, 25)));
        map.put("Mati", Collections.singletonList(LocalDate.of(1996, JANUARY, 8)));
        map.put("Jüri", Collections.singletonList(LocalDate.now()));
        map.put("Tiina", Collections.singletonList(LocalDate.now()));
        map.put("Kalev", List.of(LocalDate.of(2010, MARCH, 25), LocalDate.of(2001, APRIL, 14), LocalDate.of(2005, JANUARY, 6)));
        assertEquals(map.toString(), o.usersByName().toString());
    }



}