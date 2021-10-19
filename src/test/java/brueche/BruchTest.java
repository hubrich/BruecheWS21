package brueche;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BruchTest {

    @Test
    @DisplayName("Einfachen Bruch ausrechnen")
    public void BruchBerechnen() {

        Bruch bru = new Bruch(1, 5);

        Assertions.assertEquals(0.2,bru.ausrechnen());
    }

}
