public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        double ratePerHour;

        if (speed >= 1 && speed <= 4) {
            ratePerHour = speed * 221 * 1.0;
        } else if (speed >= 5 && speed <=8) {
            ratePerHour = speed * 221 * 0.9;
        } else if (speed == 9) {
            ratePerHour = speed * 221 * 0.8;
        } else if (speed == 10) {
            ratePerHour = speed * 221 * 0.77;
        } else {
            ratePerHour = 0.0;
        }
        return ratePerHour;
    }

    public int workingItemsPerMinute(int speed) {
        int workingItems = ((int)productionRatePerHour(speed)) / 60;
        return workingItems;
    }
}
