import java.util.ArrayList;

public class SolarSystem {
    private String name;
    private ArrayList<Planet> planets;
    private Sun sun;

    public SolarSystem(String name) {
        this.name = name;
        planets = new ArrayList<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public void addSun(Sun sun) {
        this.sun = sun;
    }

    public void showPlanets() {
        for (Planet i: planets) {
            System.out.println(i.toString());
        }
    }

    public void movePlanet() {
        double gravity = 0.1;
        double time = 0.001;

        double[] location = new double[]{0.0,0.0};
        for (Planet i : planets) {
            double xCoor = i.getLocation()[0];
            double yCoor = i.getLocation()[1];
            double[] newLocation = {xCoor + time * (xCoor),yCoor + time * (yCoor)};
            i.setLocation(newLocation);
            double rx = sun.getLocation()[0];
            double ry = sun.getLocation()[1];
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = gravity * sun.getMass() * rx / Math.pow(r,3);
            double accY = gravity * sun.getMass() * ry / Math.pow(r,3);

            i.setVelocity(new double[]{(i.getVelocity()[0] + time * accX), (i.getVelocity()[1] + time * accY)});

        }
        }
    }



