import org.junit.Assert;
import org.junit.Test;
import com.company.PasswordGenerator.PasswordGenerator;

public class PasswordGeneratorTest {

    @Test
    public void makePasswordShouldReturnStringLengthOfInput() {
        Assert.assertEquals(32, PasswordGenerator.makePassword(32).length());
    }
}
