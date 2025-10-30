package provaNivell;

public class Aquatic extends Robot {
    private double maximumDept;

    public enum PropulsionSystem {PROPELLER, JET}

    public Aquatic(String name, String manufacturer, int yearManufacture, String registrationDate,
                   double maximumDept, PropulsionSystem propulsion) {
        super(name, manufacturer, yearManufacture, registrationDate);
        this.maximumDept = maximumDept;
        this.propulsion();
    }

    @Override
    public String getTechnicalDescription() {
        return "Robot " + getName() + " manufactured by " + getManufacturer() + " in the year " + getYearManufacture() +
                " with a maximum depth of " + maximumDept + " and has a propulsion of " + propulsion();
    }

    private String propulsion() {
        return "Jet";
    }
        }



