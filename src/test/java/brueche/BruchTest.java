package brueche;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BruchTest {

    @Test
    @DisplayName("hier wird getested, ob Gleitkommazahlen berechnet werden können")
    void testAusrechnen(){

        Bruch bruch = new Bruch(5, 2);
        double actual = bruch.ausrechnen() ;
        var expected = 2.5;

        assertEquals(expected, actual);

    }


}
