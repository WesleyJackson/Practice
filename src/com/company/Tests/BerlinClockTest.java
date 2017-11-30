import com.company.Katas.BerlinClock;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Time;

public class BerlinClockTest {

//    NOT FINISHED. POINTLESS TO FINISH
//    hh:mm:ss
//    Lights shine left to right
//    One light on top that blinks on and off yellow every two seconds
//    Two rows of red on top. Top row of 4 are 5 hours each. Bottom row of 4 are 1 hour each.
//    Two rows on bottom. Top row of 11 are red and 5 min each. Bottom row of 4 are 1 are yellow and 1 min each.
//    R  = Red
//    Y = Yellow
//    O = Off

//    Kata uses berlinClock as an instance class but there is no need to store
//    any data the way that it's implemented. It can be entirely static.
    BerlinClock berlinClock = new BerlinClock();

    @Test
    public void flashingLightShouldReturnOffOnEveryOddSecond() {
        Assert.assertEquals("O", berlinClock.getSecondsLight(1));
        Assert.assertEquals("O", berlinClock.getSecondsLight(3));
    }

    @Test
    public void flashingLightShouldReturnYellowOnEveryEvenSecond() {
        Assert.assertEquals("Y", berlinClock.getSecondsLight(2));
        Assert.assertEquals("Y", berlinClock.getSecondsLight(0));
    }

    @Test
    public void topHourRowShouldReturnRedLightsWhenHoursInMultiplesOf5() {
        Assert.assertEquals("ROOO", berlinClock.getHourTopLights(new Time(7, 13, 5)));
        Assert.assertEquals("RROO", berlinClock.getHourTopLights(new Time(12, 13, 5)));
        Assert.assertEquals("RRRO", berlinClock.getHourTopLights(new Time(17, 13, 5)));
        Assert.assertEquals("RRRR", berlinClock.getHourTopLights(new Time(22, 13, 5)));
    }

    @Test
    public void bottomHourRowShouldReturnRedLightsWhenHoursNotDividableBy5() {
        Assert.assertEquals("ROOO", berlinClock.getHourBottomLights(new Time(6, 13, 5)));
        Assert.assertEquals("RROO", berlinClock.getHourBottomLights(new Time(12, 13, 5)));
        Assert.assertEquals("RRRO", berlinClock.getHourBottomLights(new Time(18, 13, 5)));
        Assert.assertEquals("RRRR", berlinClock.getHourBottomLights(new Time(19, 13, 5)));
    }
}
