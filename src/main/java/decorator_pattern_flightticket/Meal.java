package decorator_pattern_flightticket;

public class Meal extends FlightDecorator{

    public Meal(FlightTicket f) {
        super(f);
    }

    @Override
    public String getDescription() {
        return f.getDescription() + " >> Ticket including the meal\n";
    }

    @Override
    public double cost() {
        return f.cost() + 250.5;
    }
}
