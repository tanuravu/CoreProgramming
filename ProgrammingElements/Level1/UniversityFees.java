public class UniversityFees {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        int discountedAmount = fee*discountPercent/100;
        int discountedPrice = fee - discountedAmount;
        System.out.println("The discount amount is INR "+ discountedAmount+ " and final discounted Fee is INR "+discountedPrice);

    }

}
