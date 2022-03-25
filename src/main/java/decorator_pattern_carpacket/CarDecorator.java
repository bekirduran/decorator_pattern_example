package decorator_pattern_carpacket;

public abstract class CarDecorator extends Car{
    Car car;
    public CarDecorator(Car car) {
        this.car = car;
    }
}
