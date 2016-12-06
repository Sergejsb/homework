package FlowerIsWateredTest;

/**
 * Created by Serjoga on 06/12/2016.
 */

public class Human {
	/* public void water(Flower flower) {
	}

	public void setWateringCan(WateringCan wateringCan) {

	} */

    private WateringCan wateringCan;

    public void setWateringCan(WateringCan wateringCan) {
        this.wateringCan = wateringCan;
    }

    public void water(Flower flower) {
        if (wateringCan != null) {
            flower.setWatered(true);
        }
    }
}

