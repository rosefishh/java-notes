package day6;

public class enums {
    public static void main(String[] args) {
        season s = season.WINTER;
        System.out.println("weather: "+ s.getweather());

        planet e = planet.EARTH;
        System.out.printf("earth's gravity: %.2f m/s %n",e.calcgrav());
    }
}
enum season{
    SPRING, SUMMER, FALL, WINTER;

    public String getweather(){
        switch(this){
            case SPRING:
                return "mild and rainy!";
            case SUMMER:
                return "hot and sunny!";
            case FALL:
                return "cool and windy!";
            case WINTER:
                return "cold anad snowy!";
            default:
                return "unknown weather";
        }
    }
}

enum planet {
    EARTH(5.97e24,6371),
    MARS(6.4e23,3389),
    JUPITER(1.90e27,6991);

    private final double mass;
    private final double radius;
    private static final double G = 6.67e-11;

    planet(double mass,double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double getmass(){
        return mass;
    }

    public double getradius(){
        return radius;
    }

    public double calcgrav(){
        double radiusinmeters = radius * 1000;
        return G*mass/ (radiusinmeters*radiusinmeters);
    }
}