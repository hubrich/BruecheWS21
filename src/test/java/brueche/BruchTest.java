package brueche;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BruchTest {

    @Test
    @DisplayName("Bruch ausrechnen testen")
    public void testAusrechnen() {
        Bruch bruch = new Bruch(1, 2);

        double expected = 0.5;
        double actual = bruch.ausrechnen();
        Assertions.assertEquals(expected, actual);

    }


}
