package JavaMethods.Level3;
import java.util.Arrays;

public class Q7OTPGenerator {
    public static void main(String[] args) {
        final int OTP_COUNT = 10;
        int[] otpArray = generateOTPArray(OTP_COUNT);
        displayOTPs(otpArray);
        boolean unique = areOTPsUnique(otpArray);
        System.out.println("Are all OTPs unique? " + (unique ? "Yes" : "No"));
    }
    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }
    public static int[] generateOTPArray(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void displayOTPs(int[] otps) {
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
    }
    
}
