package decorator_pattern_flightticket;

public class ExtraLugWeight extends FlightDecorator{

    public ExtraLugWeight(FlightTicket f) {
        super(f);
    }

    @Override
    public String getDescription() {
        return f.getDescription() + " >> Ticket including the Extra 20 kg Luggage\n";
    }

    @Override
    public double cost() {
        return f.cost() + 355.0;
    }
}
