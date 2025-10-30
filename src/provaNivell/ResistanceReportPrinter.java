package provaNivell;

import java.util.List;

public class ResistanceReportPrinter {
    public void printReport(List<ResistanceEvaluable> robots) {
        System.out.println("=== Resilience Test Reports ===");
        for (ResistanceEvaluable robot : robots) {
            System.out.println();
            System.out.println(robot.getResistanceReport());
        }
    }
}

