package decorator_pattern_flightticket;

public abstract class FlightDecorator extends FlightTicket{

   final FlightTicket f;

    public FlightDecorator(FlightTicket f) {
        this.f = f;
    }
}
