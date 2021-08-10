import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CalculationVowels {

    private final double proportion = 0.3;

    public String replaceVowel(String inputString) {
        double vCount = 0, cCount = inputString.length();
        String outputString = inputString;
        Collection<Character> vowelCollection = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        inputString = inputString.toLowerCase();

        for (char ch : inputString.toCharArray()) {
            if (vowelCollection.contains(ch))
                vCount++;
        }

        if (vCount / cCount >= proportion) {
            String regex = "[aeiou]+";
            outputString = inputString.replaceAll(regex, "mommy");
        }
        return outputString;
    }
}
