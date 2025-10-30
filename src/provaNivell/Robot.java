package provaNivell;

public abstract class Robot {
    protected String name;
    protected String manufacturer;
    protected int yearManufacture;
    protected String registrationDate;

    public Robot(String name, String manufacturer, int yearManufacture, String registrationDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearManufacture = yearManufacture;
        this.registrationDate = registrationDate;
    }

    public String getName() { return name; }
    public String getManufacturer() { return manufacturer; }
    public int getYearManufacture() { return yearManufacture; }
    public String getRegistrationDate() { return registrationDate; }

    public abstract String getTechnicalDescription();
}
