package provaNivell;

public class Aerial extends Robot {
    private int maximumAltitude;
    private String flightDuration;

    public Aerial(String name, String manufacturer, int yearManufacture, String competitionRegistrationDate) {
        super(name, manufacturer, yearManufacture, competitionRegistrationDate);
        this.maximumAltitude = maximumAltitude;
        this.flightDuration = flightDuration;

    }
    @Override
    public String getTechnicalDescription() {
        return name + " manufactured by ";
    }
}
