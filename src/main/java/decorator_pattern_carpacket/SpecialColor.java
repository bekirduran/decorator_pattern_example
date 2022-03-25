package decorator_pattern_carpacket;

public class SpecialColor extends CarDecorator{
    private final String color;

    public SpecialColor(Car car, String color) {
        super(car);
        this.color = color;

    }

    @Override
    String carDescription() {
        return car.carDescription() + "-> Special Color added: "+color +"\n";
    }

    @Override
    double cost() {
        double currentPrice = 1450;
        return car.cost() + currentPrice;
    }
}
