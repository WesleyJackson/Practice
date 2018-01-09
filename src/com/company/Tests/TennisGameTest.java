import com.company.Katas.TennisGame;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TennisGameTest {
    TennisGame game;

    @Before
    public void init(){
        game = new TennisGame();

        Pair jim = new Pair("Jim", 0);
        Pair bob = new Pair("Bob", 1);
        Pair tami = new Pair("Tami", 2);
        Pair alice = new Pair("Alice", 3);

        game.addPlayer(jim);
        game.addPlayer(bob);
        game.addPlayer(tami);
        game.addPlayer(alice);
    }

    @Test
    public void getScore() {
        Assert.assertEquals("love", game.getScoreName("Jim"));
        Assert.assertEquals("fifteen", game.getScoreName("Bob"));
        Assert.assertEquals("thirty", game.getScoreName("Tami"));
        Assert.assertEquals("forty", game.getScoreName("Alice"));
    }

    @Test
    public void getScoreShouldReturnAdvantageForPlayerInLeadWhenScoresAtLeastThree() {
    }

    @Test
    public void getScoreShouldReturnDueceIfScoreTiedAtAtLeastThree() {
    }

    @Test
    public void getWinnerShouldReturnNoneIfThereIsNoWinner() {
    }

    @Test
    public void getWinnderShouldReturnWinnerIfScoreAtLeastFourAndUpByTwo() {
    }
}
