public class PenDistribution {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int distributedPens = pens/students;
        int nonDistributedPens = pens%students;
        System.out.println("The Pen per Students is "+distributedPens+ " and the remaining pen not distributed is "+nonDistributedPens);
    }

}
