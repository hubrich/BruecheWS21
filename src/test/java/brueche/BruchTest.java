package brueche;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BruchTest {

    @Test
    @DisplayName("Bruch ausrechnen")
    public void ausrechnen()
    {
        double ergebniss;
        Bruch b = new Bruch(2, 4);
        ergebniss =  b.ausrechnen();

        Assertions.assertEquals(0.5, ergebniss);
    }




}
