import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MommifierTest {

    CalculationVowels calculationVowels;

    @BeforeAll
    public void init() {
        calculationVowels = new CalculationVowels();
    }


    @Test
    public void should_replace_vowel_by_mommy() {
        String inputString = "aeipy";
        String outputString = "mommypy";

        String replaceString = calculationVowels.replaceVowel(inputString);

        Assertions.assertEquals(outputString, replaceString);
    }

    @Test
    public void should_not_replace_vowel_by_mommy() {
        String inputString = "apyh";
        String outputString = "apyh";

        String replaceString = calculationVowels.replaceVowel(inputString);

        Assertions.assertEquals(outputString, replaceString);
    }

    @Test
    public void should_replace_vowels_by_mommy() {
        String inputString = "aeipyaei";
        String outputString = "mommypymommy";

        String replaceString = calculationVowels.replaceVowel(inputString);

        Assertions.assertEquals(outputString, replaceString);
    }


}
