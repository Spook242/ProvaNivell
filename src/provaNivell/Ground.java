package provaNivell;

public class Ground extends Robot implements ResistanceEvaluable {
    private double maximumSpeed;
    private TypeOfTraction traction;

    public boolean extremeCompetitorsOk() {
        return true;
    }


    public enum TypeOfTraction { CATERPILLAR, WHEELS}

    public Ground(String name, String manufacturer, int yearManufacture, String registrationDate,
                  double maximumSpeed, TypeOfTraction traction) {
        super(name, manufacturer, yearManufacture, registrationDate);
        this.maximumSpeed = maximumSpeed;
        this.traction = traction;
    }

    public double getMaximumSpeed() {
        return maximumSpeed; }
    public TypeOfTraction getTraction() {
        return traction; }

@Override
    public String getTechnicalDescription() {
        return "Robot " + getName() + " manufactured by " + getManufacturer() + " in the year " + getYearManufacture() +
                " uses " + traction + " and has a maximum speed of " + maximumSpeed;
    }

    @Override
    public String getResistanceReport() {
        if (traction == TypeOfTraction.CATERPILLAR)
            return getName() + "." + " Caterpillar traction. Valid for the competition.";
        else
            return getName() + "Wheels traction. No Valid for the competition.";
    }
}

