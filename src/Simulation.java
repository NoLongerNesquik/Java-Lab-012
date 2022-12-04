import java.util.Date;
import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ticks = 12;
        System.out.println("What is the name of the Solar-System?");
        SolarSystem ss1 = new SolarSystem(in.nextLine());
        System.out.println("Sun's name:");
        String sunName = in.nextLine();
        System.out.println("Sun's radius:");
        double sunRadius = in.nextDouble();
        System.out.println("Sun's mass:");
        double sunMass = in.nextDouble();
        ss1.addSun(new Sun(sunName,sunRadius,sunMass));
        System.out.println("How many planets are there?");
        Planet[] planets = createPlanet(in.nextInt());
        for (Planet i:planets){
            ss1.addPlanet(i);
        }
        for(int i = 0; i<= ticks; i++) {
            ss1.showPlanets();
            ss1.movePlanet();
        }
    }
    public static Planet[] createPlanet(int count) {
        Scanner in = new Scanner(System.in);
        Planet[] planets = new Planet[count];
        for (int i = 0; i < count; i++) {
            String planetName;
            double planetRadius;
            double planetMass;
            double[] planetLocation = new double[2];
            double[] planetVelocity = new double[2];
            System.out.printf("Planet %d's name?\n",i+1);
            planetName = in.nextLine();
            System.out.printf("Planet %d's radius?\n",i+1);
            planetRadius = in.nextDouble();
            System.out.printf("Planet %d's mass?\n",i+1);
            planetMass = in.nextDouble();
            System.out.printf("Planet %d's x-coordinate?\n",i+1);
            planetLocation[0] = in.nextDouble();
            System.out.printf("Planet %d's y-coordinate?\n",i+1);
            planetLocation[1] = in.nextDouble();
            System.out.printf("Planet %d's x-velocity?\n",i+1);
            planetVelocity[0] = in.nextDouble();
            System.out.printf("Planet %d's y-velocity?\n",i+1);
            planetVelocity[1] = in.nextDouble();
            planets[i] = new Planet(planetName,planetRadius,planetMass,planetLocation,planetVelocity);
            in.nextLine();
        }
        return planets;
    }

}