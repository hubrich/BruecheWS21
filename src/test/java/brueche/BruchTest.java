package brueche;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class BruchTest {
    @Test
    @DisplayName("Ergebnis Teilung 3 durch 2")
    public void teilung2durch3() {
        Bruch bru = new Bruch(3, 2);
        Assertions.assertEquals(1.5,bru.ausrechnen());
    }
}
