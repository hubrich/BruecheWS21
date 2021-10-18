package brueche;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BruchTest {

    @Test
    @DisplayName("should display a double result after splitting two integer numbers")
    public void ausrechnen() {
        Bruch bruch = new Bruch(30, 8);
        double actual = bruch.ausrechnen();
        double expected = 3.75;

        assertEquals(expected, actual);
    }
}