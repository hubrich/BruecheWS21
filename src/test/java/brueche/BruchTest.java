package brueche;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BruchTest {

    @Test
    @DisplayName("dies ist der erste Test, mir fällt jetzt keine sinnvolle Beschreibung ein")
    void testAusrechnen(){

        Bruch bruch = new Bruch(5, 2);

        var actual = bruch.ausrechnen() ;
        var expected = 2.5;

        assertEquals(expected, actual);

    }


}
