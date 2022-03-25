package decorator_pattern_carpacket;

public class SportCar extends Car{

    final String defaultFeatures = "-> 4 Door \n" +
                            "-> 250 HP Engine\n"+
                            "-> CO2 emission 80-89 gr/km\n";


    @Override
    String carDescription() {
        return "\n<<<<--- SPORT CAR PACKET CREATED --->>>>\n" + defaultFeatures;
    }

    @Override
    double cost() {
        return 120000;
    }
}
