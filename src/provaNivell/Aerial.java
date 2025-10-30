package provaNivell;

public class Aerial extends Robot implements ResistanceEvaluable {
    private double maximumAltitude;
    private int flightRange;

    public Aerial(String name, String manufacturer, int yearManufacture, String registrationDate,
                  double maximumAltitude, int flightRange) {
        super(name, manufacturer, yearManufacture, registrationDate);
        this.maximumAltitude = maximumAltitude;
        this.flightRange = flightRange;
    }

    public double getMaximumAltitude() { return maximumAltitude; }
    public int getFlightRange() { return flightRange; }

@Override
    public String getTechnicalDescription() {
        return "Robot " + getName() + " manufactured by " + getManufacturer() + " in the year " + getYearManufacture() +
                " with a maximum altitude of " + getMaximumAltitude() + " and has a flight range of " + getFlightRange();
    }

    @Override
    public String getResistanceReport() {
        if (flightRange >= 60)
            return getName() + "." + " " + getFlightRange() + " minutes. Valid for the competition.";
        else
            return getName() + "." + " " + getFlightRange() + " minutes. No valid for the competition.";
    }

    public boolean extremeCompetitorsOk() {
        return true;
    }
}
