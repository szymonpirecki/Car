import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Country poland = new Country("Poland",'P');
        Country germany = new Country("Germany",'G');
        Country sweden = new Country("Sweden",'S');
        Country japan = new Country("Japan",'J');
        Country france = new Country("France",'F');

        List<Country> europe = List.of(poland, germany, sweden, france);
        List<Country> asia = List.of(japan);
        List<Country> euroAsia = List.of(poland, germany, sweden, france, japan);

        Market businessMarket = new Market("business", euroAsia);
        Market cargoMarket = new Market("cargo", europe);
        Market transportMarket = new Market("transport", asia);
        Market taxiMarket = new Market("taxi", euroAsia);
        Market busMarket = new Market("bus", asia);

        Dimension smallCarWithNoTrunk = new Dimension(150, 150, 0);
        Dimension smallCarWithSmallTrunk = new Dimension(150, 150, 100);
        Dimension smallCarWithMediumTrunk = new Dimension(150, 150, 200);
        Dimension smallCarWithLargeTrunk = new Dimension(150, 150, 300);
        Dimension mediumCarWithSmallTrunk = new Dimension(160, 200, 150);
        Dimension mediumCarWithMediumTrunk = new Dimension(160, 200, 250);
        Dimension mediumCarWithLargeTrunk = new Dimension(160, 200, 350);
        Dimension bigCarWithSmallTrunk = new Dimension(170, 250, 200);
        Dimension bigCarWithMediumTrunk = new Dimension(170, 250, 350);
        Dimension bigCarWithLargeTrunk = new Dimension(170, 250, 450);

        Producent bmw1 = new Producent("BMW", "x1");
        Producent bmw3 = new Producent("BMW", "x3");
        Producent bmw5 = new Producent("BMW", "x5");
        Producent audiA3 = new Producent("Audi", "a3");
        Producent audiA4 = new Producent("Audi", "a4");
        Producent audiA6 = new Producent("Audi", "a6");
        Producent vwPassat = new Producent("Volkswagen", "passat");
        Producent vwGolf = new Producent("Volkswagen", "golf");
        Producent vwPolo = new Producent("Volkswagen", "polo");
        Producent volvoS40 = new Producent("Volvo", "s40");

        String premiumSegment = "business";
        String standardSegment = "standard";
        String mediumSegment = "medium";

        Car car1 = new Car(bmw1,true, businessMarket, "premium", new ArrayList<>(List.of(smallCarWithNoTrunk)));
        Car car2 = new Car(bmw3,false, cargoMarket, "standard", new ArrayList<>(List.of(smallCarWithSmallTrunk)));
        Car car3 = new Car(audiA3,true, transportMarket, "medium", new ArrayList<>(List.of(smallCarWithMediumTrunk)));
        Car car4 = new Car(audiA4,false, businessMarket, "premium", new ArrayList<>(List.of(smallCarWithLargeTrunk)));
        Car car5 = new Car(audiA6,true, cargoMarket, "standard", new ArrayList<>(List.of(mediumCarWithSmallTrunk)));
        Car car6 = new Car(vwPassat,false, transportMarket, "medium", new ArrayList<>(List.of(mediumCarWithMediumTrunk)));
        Car car7 = new Car(vwGolf,true, businessMarket, "premium", new ArrayList<>(List.of(mediumCarWithLargeTrunk)));
        Car car8 = new Car(bmw5,true, cargoMarket, "standard", new ArrayList<>(List.of(mediumCarWithLargeTrunk)));
        Car car9 = new Car(bmw1,true, transportMarket, "medium", new ArrayList<>(List.of(bigCarWithLargeTrunk)));
        Car car10 = new Car(bmw1,true, businessMarket, "premium", new ArrayList<>(List.of(bigCarWithMediumTrunk)));
        Car car11 = new Car(volvoS40,true, cargoMarket, "standard", new ArrayList<>(List.of(bigCarWithSmallTrunk)));
        Car car12 = new Car(bmw5,false, busMarket, "medium", new ArrayList<>(List.of(bigCarWithSmallTrunk)));
        Car car13 = new Car(audiA3,true, businessMarket, "premium", new ArrayList<>(List.of(bigCarWithMediumTrunk)));
        Car car14 = new Car(vwGolf,false, taxiMarket, "standard", new ArrayList<>(List.of(mediumCarWithMediumTrunk)));
        Car car15 = new Car(vwPolo,true, taxiMarket, "medium", new ArrayList<>(List.of(mediumCarWithMediumTrunk)));

        ArrayList<Car> allCars = new ArrayList<>(List.of(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12, car13, car14, car15));

        Car.printEveryBawaraWithAutomaticGear(allCars);
    }
}
