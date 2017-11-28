import com.company.Katas.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void getanswerShouldReturnFizzIfTheNumberIsDividableBy3() {
        Assert.assertEquals("fizz", FizzBuzz.getAnswer(3));
    }

    @Test
    public void getanswerShouldReturnFizzIfTheNumberIsDividableBy5() {
        Assert.assertEquals("buzz", FizzBuzz.getAnswer(5));
    }

    @Test
    public void getanswerShouldReturnFizzBuzzIfDividableBy15() {
        Assert.assertEquals("fizzbuzz", FizzBuzz.getAnswer(15));
    }

    @Test
    public void getAnswerShouldReturnInputWhenRequirementNotMet() {
        Assert.assertEquals("4", FizzBuzz.getAnswer(4));
        Assert.assertEquals("7", FizzBuzz.getAnswer(7));
    }
}
