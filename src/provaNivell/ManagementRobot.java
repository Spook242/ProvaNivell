package provaNivell;


import java.util.*;
import java.util.stream.Collectors;

    public class ManagementRobot {
        private List<Robot> robots = new ArrayList<>();

        public void registerRobot(Robot robot) {
            robots.add(robot);
        }

        // 1️⃣ Listar todos con descripción técnica
        public void listAll() {
            robots.forEach(robot -> System.out.println(robot.getTechnicalDescription()));
        }

        // 2️⃣ Filtrar terrestres con velocidad > X
        public List<Ground> filterSpeed(double minSpeed) {
            return robots.stream()
                    .filter(robot -> robot instanceof Ground)
                    .map(r -> (Ground) r)
                    .filter(t -> t.getMaximumSpeed() > minSpeed)
                    .collect(Collectors.toList());
        }

        // 3️⃣ Buscar por fabricante
        public List<Robot> searchManufacturer(String manufacturer) {
            return robots.stream()
                    .filter(robot -> robot.getManufacturer().equalsIgnoreCase(manufacturer))
                    .collect(Collectors.toList());
        }

        // 4️⃣ Informe de robots que pueden competir en condiciones extremas
        public List<Robot> extremeCompetitors() {
            return robots.stream()
                    .filter(robot -> (robot instanceof Ground && ((Ground) robot).extremeCompetitorsOk())
                            || (robot instanceof Aerial && ((Aerial) robot).extremeCompetitorsOk()))
                    .collect(Collectors.toList());
        }
    }

