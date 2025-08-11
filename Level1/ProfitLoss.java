public class ProfitLoss {
    public static void main(String[] args) {
        int CP = 129;
        int SP = 191;
        int Profit = SP-CP;
        int ProfitPercentage= (Profit/CP)*100;
        System.out.println("The Cost Price is INR "+CP +" and Selling Price is INR "+SP);
        System.out.println("The Profit is INR "+Profit+ "and the Profit Percentage is "+ProfitPercentage);
    }

}
