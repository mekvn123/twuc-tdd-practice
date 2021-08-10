import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {


    @Test
    public void should_replace_vowel_by_mommy() {
        String inputString = "aeipy";
        String outputString = "mommypy";
        CaculateVowels caculateVowels = new CaculateVowels();

        String replaceString = caculateVowels.replaceVowel(inputString);

        Assertions.assertEquals(outputString, replaceString);
    }

    @Test
    public void should_not_replace_vowel_by_mommy() {
        String inputString = "apyh";
        String outputString = "apyh";
        CaculateVowels caculateVowels = new CaculateVowels();

        String replaceString = caculateVowels.replaceVowel(inputString);

        Assertions.assertEquals(outputString, replaceString);
    }

    @Test
    public void should_replace_vowels_by_mommy() {
        String inputString = "aeipyaei";
        String outputString = "mommypymommy";
        CaculateVowels caculateVowels = new CaculateVowels();

        String replaceString = caculateVowels.replaceVowel(inputString);

        Assertions.assertEquals(outputString, replaceString);
    }


}
