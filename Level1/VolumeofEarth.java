public class VolumeofEarth {
    public static void main(String[] args) {
        int radius = 6378;
        double volume_inkilo = (4/3)*(22/7)*radius*radius*radius;
        double radius_inmiles = radius*1.6;
        double volume_inMiles = (4/3)*(22/7)*radius_inmiles*radius_inmiles*radius_inmiles;
        System.out.println("The volume of earth in cubic kilometers is "+volume_inkilo+" and cubic miles is "+volume_inMiles);
    }
}
