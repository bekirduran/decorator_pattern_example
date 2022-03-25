package decorator_pattern_carpacket;

public class AIHelper extends CarDecorator{


    public AIHelper(Car car) {
        super(car);
    }

    @Override
    String carDescription() {
        return car.carDescription() + "->Including the AI Helper\n";
    }

    @Override
    double cost() {
        double currentPrice = 8.400;
        return car.cost() + currentPrice;
    }
}
