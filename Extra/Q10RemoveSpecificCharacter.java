package Methods.Level3;

public class Q10RemoveSpecificCharacter {
    public static String removeCharacter(String str, char target) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != target) result.append(ch);
        }
        return result.toString();
    }

}
