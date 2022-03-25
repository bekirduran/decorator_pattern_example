package decorator_pattern_flightticket;

public class Main {

    public static void main(String[] args) {

        FlightTicket PNR00001 = new EconomyTicket();
        PNR00001 = new Meal(PNR00001);
        PNR00001 = new ExtraLugWeight(PNR00001);
        System.out.println(PNR00001.getDescription() +"Total Cost:---> "+ PNR00001.cost());


        FlightTicket PNR00002 = new BusinessTicket();
        PNR00002 = new Meal(PNR00002);
        PNR00002 = new ExtraLugWeight(PNR00002);
        System.out.println(PNR00002.getDescription() +"Total Cost:---> "+ PNR00002.cost());
    }
}
