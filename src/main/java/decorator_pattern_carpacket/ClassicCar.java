package decorator_pattern_carpacket;

public class ClassicCar extends Car{
    final String defaultFeatures = "-> 4 Door \n" +
            "-> 175 HP Engine\n"+
            "-> CO2 emission 74-82 gr/km\n";


    @Override
    String carDescription() {
        return "\n<<<<--- CLASSIC CAR PACKET CREATED --->>>>\n" + defaultFeatures;
    }

    @Override
    double cost() {
        return 98000;
    }
}
