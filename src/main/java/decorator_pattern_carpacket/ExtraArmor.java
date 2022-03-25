package decorator_pattern_carpacket;

public class ExtraArmor extends CarDecorator{

    public ExtraArmor(Car car) {
        super(car);
    }


    @Override
    String carDescription() {
        return car.carDescription() + "-> Extra Armor added\n";
    }

    @Override
    double cost() {
        double currentPrice = 4750;
        return car.cost() +  currentPrice;
    }
}
