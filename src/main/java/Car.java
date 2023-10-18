import java.util.ArrayList;

public class Car {
    private Producent producent;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private ArrayList<Dimension> dimensions;

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public static void printEveryBawaraWithAutomaticGear(ArrayList<Car> allCars){
        for (Car car : allCars) {
            if (car.getProducent().getModel().equals("BMW")){
                if (car.isAutomaticGear){
                    if (car.getDimensions().get(0).getTrunkCapacity() > 300){
                        System.out.println(car);
                    }
                }
            }
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "producent=" + producent +
                ", isAutomaticGear=" + isAutomaticGear +
                ", market=" + market +
                ", segment='" + segment + '\'' +
                ", dimensions=" + dimensions +
                '}';
    }

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public void setAutomaticGear(boolean automaticGear) {
        isAutomaticGear = automaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(ArrayList<Dimension> dimensions) {
        this.dimensions = dimensions;
    }
}
