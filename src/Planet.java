import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Planet {
    double mass;
    double radius;
    double[] location;
    double[] velocity;
    String name;
    public Planet(String name, double radius, double mass, double[] location, double[] velocity) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.location = location;
        this.velocity = velocity;
    }
    public String getPlanet() {
        return name;
    }
    public double[] getVelocity() {
        return velocity;
    }
    public double[] getLocation() {
        return location;
    }
    public double getMass() {
        return mass;
    }
    public void setVelocity(double[] velocity){
        this.velocity = velocity;
    }
    public void setLocation(double[] location) {
        this.location = location;
    }
    public double getDistance() {
        return sqrt(Math.pow(abs(location[0]),2) + Math.pow((abs(location[1])),2));
    }

    @Override
    public String toString() {
        return String.format("%s: x:%f, y:%f",name, location[0], location[1]);
    }
}
