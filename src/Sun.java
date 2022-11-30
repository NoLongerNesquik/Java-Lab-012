public class Sun {
    double mass;
    double radius;
    String name;
    double[] location = {0.0, 0.0};

    public Sun(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
}
    public double[] getLocation() {
        return location;
    }
    public double getMass() {
        return mass;
    }
}
