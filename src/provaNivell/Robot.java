package provaNivell;

public abstract class Robot {
    String name;
    private String manufacturer;
    private int yearManufacture;
    private String competitionRegistrationDate;

    public Robot(String name, String manufacturer, int yearManufacture, String competitionRegistrationDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearManufacture = yearManufacture;
        this.competitionRegistrationDate = competitionRegistrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public void setYearManufacture(int yearManufacture) {
        this.yearManufacture = yearManufacture;
    }

    public String getCompetitionRegistrationDate() {
        return competitionRegistrationDate;
    }

    public void setCompetitionRegistrationDate(String competitionRegistrationDate) {
        this.competitionRegistrationDate = competitionRegistrationDate;
    }
}
