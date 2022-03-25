package decorator_pattern_flightticket;

public class BusinessTicket extends FlightTicket{

    @Override
    public String getDescription() {
        return "\n\n<:::< Business Ticket >:::>\n";
    }

    @Override
    public double cost() {
        return 2500.0;
    }
}
