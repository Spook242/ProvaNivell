package provaNivell;

public class Aquatic extends Robot {
    private int maximumDepth;
    private String propulsionSystem;

    public Aquatic(String name, String manufacturer, int yearManufacture, String competitionRegistrationDate) {
        super(name, manufacturer, yearManufacture, competitionRegistrationDate);
        this.maximumDepth = maximumDepth;
        this.propulsionSystem = propulsionSystem;

    }
}