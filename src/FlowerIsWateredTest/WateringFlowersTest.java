package FlowerIsWateredTest;

/**
 * Created by Serjoga on 06/12/2016.
 */

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class WateringFlowersTest {
    @Test
    public void newFlowerIsntWatered() {
        Flower flower = new Flower();
        Assert.assertFalse(flower.isWatered());
    }

    @Test
    public void humanCantWaterFlowerWithoutCan() {
        Flower flower = new Flower();
        Human human = new Human();
        human.water(flower);
        assertFalse(flower.isWatered());
    }

    @Test
    public void humanWatersAFlowerWithCan() {
        Flower flower = new Flower();
        Human human = new Human();
        WateringCan wateringCan = new WateringCan();
        human.setWateringCan(wateringCan);
        human.water(flower);
        assertTrue(flower.isWatered());
    }

}
