package Methods.Level3;

public class Q7Toggle {
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) toggled.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) toggled.append(Character.toUpperCase(ch));
            else toggled.append(ch); // keep other characters as is
        }

        return toggled.toString();
    }

}
