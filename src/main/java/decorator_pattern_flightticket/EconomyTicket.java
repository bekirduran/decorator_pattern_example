package decorator_pattern_flightticket;

public class EconomyTicket extends FlightTicket{
    @Override
    public String getDescription() {
        return "\n\n<::Economy Ticket::>\n";
    }

    @Override
    public double cost() {
        return 1150.0;
    }
}
