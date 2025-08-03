package Methods.Level3;

public class Q8CompareTwoString {
    public static void compareStrings(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());

        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    System.out.println(str1 + " comes before " + str2);
                } else {
                    System.out.println(str2 + " comes before " + str1);
                }
                return;
            }
        }

        if (str1.length() == str2.length()) {
            System.out.println("Both strings are equal");
        } else if (str1.length() < str2.length()) {
            System.out.println(str1 + " comes before " + str2);
        } else {
            System.out.println(str2 + " comes before " + str1);
        }
    }
}
