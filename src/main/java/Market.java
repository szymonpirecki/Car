import java.util.List;

public class Market {
    private String name;
    private List<Country> countries;

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
