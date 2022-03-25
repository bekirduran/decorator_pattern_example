package decorator_pattern_carpacket;

public class ExtraBattery extends CarDecorator {

    private final int battery;

    public ExtraBattery(Car car, int count) {
        super(car);
        this.battery = count;
    }


    @Override
    String carDescription() {
        return car.carDescription() +"-> Extra " +battery+ " battery added\n";
    }

    @Override
    double cost() {
        double currentBatteryPrice = 1525;
        return car.cost() + battery * currentBatteryPrice;
    }
}
