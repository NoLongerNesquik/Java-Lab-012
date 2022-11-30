import java.util.Date;
import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ticks = 12;
        System.out.println("What is the name of the Solar-System?");
        String solarName = in.nextLine();
        SolarSystem ss1 = new SolarSystem(solarName);
        System.out.println("Sun's name:");
        String sunName = in.nextLine();
        System.out.println("Sun's radius:");
        Double sunRadius = in.nextDouble();
        System.out.println("Sun's mass:");
        Double sunMass = in.nextDouble();
        Sun sun1 = new Sun(sunName,sunRadius,sunMass);
        System.out.println("How many planets are there?");
        Planet[] planets = createPlanet(in.nextInt());
        ss1.addSun(sun1);
        for (Planet i:planets){
            ss1.addPlanet(i);
        }
        for(int i = 0; i<= ticks; i++) {
            ss1.movePlanet();
            ss1.showPlanets();
        }
    }
    public static Planet[] createPlanet(int count) {
        Scanner in = new Scanner(System.in);
        Planet[] planets = new Planet[count];
        String planetName;
        double planetRadius;
        double planetMass;
        double[] planetLocation = new double[2];
        double[] planetVelocity = new double[2];
        for (int i = 1; i <= count; i++) {
            System.out.printf("Planet %d's name;",i);
            planetName = in.nextLine();
            System.out.printf("Planet %d's radius;",i);
            planetRadius = in.nextDouble();
            System.out.printf("Planet %d's mass;",i);
            planetMass = in.nextDouble();
            System.out.printf("Planet %d's x-coordinate;",i);
            planetLocation[0] = in.nextDouble();
            System.out.printf("Planet %d's y-coordinate;",i);
            planetLocation[1] = in.nextDouble();
            System.out.printf("Planet %d's x-velocity;",i);
            planetVelocity[0] = in.nextDouble();
            System.out.printf("Planet %d's y-velocity;",i);
            planetVelocity[0] = in.nextDouble();
            planets[count] = new Planet(planetName,planetRadius,planetMass,planetLocation,planetVelocity);
        }
        return planets;
    }

}