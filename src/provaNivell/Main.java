package provaNivell;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aerial skyX = new Aerial("SkyX-1", "AeroDynamics", 2024, "2025-03-01", 2500, 75);
        Aerial flyBot = new Aerial("FlyBot-3", "RoboFly", 2023, "2025-03-02", 1800, 45);
        Ground t1000 = new Ground("T-1000", "Cyberdyne", 2022, "2025-03-03", 50, Ground.TypeOfTraction.CATERPILLAR);

        List<ResistanceEvaluable> evaluables = List.of(skyX, flyBot, t1000);

        ResistanceReportPrinter printer = new ResistanceReportPrinter();
        printer.printReport(evaluables);
    }
}
