package decorator_pattern_carpacket;

public class AIHelper extends CarDecorator{
    final double currentPrice = 8.400;

    public AIHelper(Car car) {
        super(car);
    }

    @Override
    String carDescription() {
        return car.carDescription() + "->Including the AI Helper\n";
    }

    @Override
    double cost() {
        return car.cost() + currentPrice;
    }
}
