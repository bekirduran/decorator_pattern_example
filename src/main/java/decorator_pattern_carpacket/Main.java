package decorator_pattern_carpacket;

public class Main {


    public static void main(String[] args) {
        Car sCar00001 = new SportCar();
        sCar00001 = new ExtraArmor(new AIHelper(new ExtraBattery(sCar00001,13)));
        System.out.println(sCar00001.carDescription() + "->>> Total Price: "+ sCar00001.cost());

        Car cCar00001 = new ClassicCar();
        cCar00001 = new ExtraBattery(cCar00001,5);
        cCar00001 = new SpecialColor(cCar00001,"Sharpen Rain Blue Color");
        System.out.println(cCar00001.carDescription() + "->>> Total Price: "+ cCar00001.cost());
    }
}
