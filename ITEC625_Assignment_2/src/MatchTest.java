import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatchTest {
    Date d;
    Match m1, m2, m3;

    @BeforeEach
    public void run() {
        d = new Date(1, 1, 2015);
        m1 = new Match(d, "Chelsea", "Liverpool", 2, 1);
        m2 = new Match(d, "Leicester", "Man City", -10, 3);
        m3 = new Match(d, "Arsenal", "Tottenham", -4, -4);
    }

    @Test
    void testSetHomeGoals() {
        assertEquals(2, m1.getHomeGoals());
        assertEquals(0, m2.getHomeGoals());
    }

    @Test
    void testSetAwayGoals() {
        assertEquals(3, m2.getAwayGoals());
        assertEquals(0, m3.getAwayGoals());
    }

    @Test
    void testWinner() {
        assertEquals(1, m1.winner()); //home team
        assertEquals(-1, m2.winner()); //away team
        assertEquals(0, m3.winner()); //draw
    }

}
