package ohm.softa.a05.tests.models;

import ohm.softa.a05.model.Flower;
import ohm.softa.a05.model.PlantColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FlowerTests {
    @Test
    void testThrowExceptionIdFlowerIsGreen() throws Exception {

        Flower flower = new Flower(1, "Rose", "Rosalie", PlantColor.GREEN);
       // assertThrows(Exception.class, () -> );
    }
}
