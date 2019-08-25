import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SeasonTest {
    Season s11, s14, s15, s16, s18;

    /**
     * A method with annotation @BeforeEach runs before each of
     * the methods with annotation @Test.
     * In our case, we are instantiating the Season objects we'll
     * use. This saves us from the trouble of having to do so inside
     * every test method.
     * @throws FileNotFoundException
     */
    @BeforeEach
    public void run() throws FileNotFoundException {
        s11 = new Season("1112.csv");
        s14 = new Season("1415.csv");
        s15 = new Season("1516.csv");
        s16 = new Season("1617.csv");
        s18 = new Season("1819.csv");
    }

    @Test
    void testGetHomeTeamInt() {
        assertNotNull(s15.getHomeTeam(0));
        assertEquals("Bournemouth",s15.getHomeTeam(0));
        assertNotNull(s14.getHomeTeam(25));
        assertEquals("Swansea",s14.getHomeTeam(25));
        assertNotNull(s14.getHomeTeam(379));
        assertEquals("Man United",s15.getHomeTeam(379));
    }

    @Test
    void testGetAwayTeamInt() {
        assertNotNull(s15.getAwayTeam(0));
        assertEquals("Aston Villa",s15.getAwayTeam(0));
        assertNotNull(s14.getAwayTeam(25));
        assertEquals("West Brom",s14.getAwayTeam(25));
        assertNotNull(s15.getAwayTeam(379));
        assertEquals("Bournemouth",s15.getAwayTeam(379));
    }

    @Test
    void testGetMatchWinnerInt() {
        assertNotNull(s15.getMatchWinner(0));
        assertEquals("Aston Villa", s15.getMatchWinner(0));
        assertNotNull(s15.getMatchWinner(1));
        assertEquals("We're all winners!", s15.getMatchWinner(1)); //chelsea drew against swansea
        assertNotNull(s15.getMatchWinner(18));
        assertEquals("Man City", s15.getMatchWinner(18));
        assertNotNull(s15.getMatchWinner(s15.size()-1));
        assertEquals("Man United", s15.getMatchWinner(s15.size()-1));
    }

    @Test
    void testGetHomeWinCount() {
        assertEquals(5, s15.getHomeWinCount("Chelsea"));
        assertEquals(12, s15.getHomeWinCount("Man City"));
    }

    @Test
    void testGetAwayGameCount() {
        assertEquals(19, s15.getAwayGameCount("Chelsea"));
        assertEquals(19, s15.getAwayGameCount("Man City"));
        assertEquals(16, s18.getAwayGameCount("Arsenal"));
        assertEquals(17, s18.getAwayGameCount("Chelsea"));
    }

    @Test
    void testGetAwayWinCount() {
        assertEquals(7, s15.getAwayWinCount("Chelsea"));
        assertEquals(7, s15.getAwayWinCount("Man City"));
    }

    @Test
    void testGetMatchesDrawn() {
        ArrayList<Match> drawnMatches = s15.getMatchesDrawn();
        assertNotNull(drawnMatches);
        assertEquals(107, drawnMatches.size());
        assertNotNull(drawnMatches.get(0));
        assertEquals("8/8/2015: Chelsea 2 : 2 Swansea", drawnMatches.get(0).toString());
        assertNotNull(drawnMatches.get(drawnMatches.size()-1));
        assertEquals("15/5/2016: West Brom 1 : 1 Liverpool", drawnMatches.get(drawnMatches.size()-1).toString());
        assertEquals("[8/8/2015: Chelsea 2 : 2 Swansea, 8/8/2015: Everton 2 : 2 Watford, 9/8/2015: Newcastle 2 : 2 Southampton, 15/8/2015: Tottenham 2 : 2 Stoke, 15/8/2015: Watford 0 : 0 West Brom, 22/8/2015: Leicester 1 : 1 Tottenham, 22/8/2015: Man United 0 : 0 Newcastle, 22/8/2015: Norwich 1 : 1 Stoke, 22/8/2015: Sunderland 1 : 1 Swansea, 23/8/2015: Watford 0 : 0 Southampton, 24/8/2015: Arsenal 0 : 0 Liverpool, 29/8/2015: Aston Villa 2 : 2 Sunderland, 29/8/2015: Bournemouth 1 : 1 Leicester, 29/8/2015: Tottenham 0 : 0 Everton, 12/9/2015: West Brom 0 : 0 Southampton, 19/9/2015: Stoke 2 : 2 Leicester, 19/9/2015: Swansea 0 : 0 Everton, 20/9/2015: Liverpool 1 : 1 Norwich, 26/9/2015: Newcastle 2 : 2 Chelsea, 26/9/2015: West Ham 2 : 2 Norwich, 3/10/2015: Bournemouth 1 : 1 Watford, 3/10/2015: Sunderland 2 : 2 West Ham, 4/10/2015: Everton 1 : 1 Liverpool, 4/10/2015: Swansea 2 : 2 Tottenham, 17/10/2015: Southampton 2 : 2 Leicester, 17/10/2015: Tottenham 0 : 0 Liverpool, 25/10/2015: Liverpool 1 : 1 Southampton, 25/10/2015: Man United 0 : 0 Man City, 31/10/2015: Crystal Palace 0 : 0 Man United, 31/10/2015: Newcastle 0 : 0 Stoke, 7/11/2015: West Ham 1 : 1 Everton, 8/11/2015: Arsenal 1 : 1 Tottenham, 8/11/2015: Aston Villa 0 : 0 Man City, 21/11/2015: Swansea 2 : 2 Bournemouth, 28/11/2015: Bournemouth 3 : 3 Everton, 28/11/2015: Leicester 1 : 1 Man United, 29/11/2015: Norwich 1 : 1 Arsenal, 29/11/2015: Tottenham 0 : 0 Chelsea, 29/11/2015: West Ham 1 : 1 West Brom, 5/12/2015: Man United 0 : 0 West Ham, 5/12/2015: Southampton 1 : 1 Aston Villa, 5/12/2015: West Brom 1 : 1 Tottenham, 7/12/2015: Everton 1 : 1 Crystal Palace, 12/12/2015: Norwich 1 : 1 Everton, 12/12/2015: West Ham 0 : 0 Stoke, 13/12/2015: Liverpool 2 : 2 West Brom, 19/12/2015: Newcastle 1 : 1 Aston Villa, 20/12/2015: Swansea 0 : 0 West Ham, 26/12/2015: Aston Villa 1 : 1 West Ham, 26/12/2015: Bournemouth 0 : 0 Crystal Palace, 26/12/2015: Chelsea 2 : 2 Watford, 28/12/2015: Crystal Palace 0 : 0 Swansea, 28/12/2015: Man United 0 : 0 Chelsea, 29/12/2015: Leicester 0 : 0 Man City, 2/1/2016: Leicester 0 : 0 Bournemouth, 3/1/2016: Everton 1 : 1 Tottenham, 12/1/2016: Newcastle 3 : 3 Man United, 13/1/2016: Chelsea 2 : 2 West Brom, 13/1/2016: Liverpool 3 : 3 Arsenal, 13/1/2016: Man City 0 : 0 Everton, 16/1/2016: Aston Villa 1 : 1 Leicester, 16/1/2016: Chelsea 3 : 3 Everton, 17/1/2016: Stoke 0 : 0 Arsenal, 23/1/2016: Sunderland 1 : 1 Bournemouth, 23/1/2016: West Brom 0 : 0 Aston Villa, 23/1/2016: West Ham 2 : 2 Man City, 2/2/2016: Arsenal 0 : 0 Southampton, 2/2/2016: West Brom 1 : 1 Swansea, 3/2/2016: Watford 0 : 0 Chelsea, 6/2/2016: Liverpool 2 : 2 Sunderland, 6/2/2016: Swansea 1 : 1 Crystal Palace, 7/2/2016: Chelsea 1 : 1 Man United, 13/2/2016: Norwich 2 : 2 West Ham, 27/2/2016: Watford 0 : 0 Bournemouth, 1/3/2016: Leicester 2 : 2 West Brom, 1/3/2016: Sunderland 2 : 2 Crystal Palace, 5/3/2016: Chelsea 1 : 1 Stoke, 5/3/2016: Southampton 1 : 1 Sunderland, 5/3/2016: Tottenham 2 : 2 Arsenal, 12/3/2016: Norwich 0 : 0 Man City, 19/3/2016: Chelsea 2 : 2 West Ham, 20/3/2016: Newcastle 1 : 1 Sunderland, 2/4/2016: Liverpool 1 : 1 Tottenham, 2/4/2016: Stoke 2 : 2 Swansea, 2/4/2016: Sunderland 0 : 0 West Brom, 2/4/2016: West Ham 2 : 2 Crystal Palace, 9/4/2016: Watford 1 : 1 Everton, 9/4/2016: West Ham 3 : 3 Arsenal, 13/4/2016: Crystal Palace 0 : 0 Everton, 16/4/2016: Everton 1 : 1 Southampton, 17/4/2016: Arsenal 1 : 1 Crystal Palace, 17/4/2016: Leicester 2 : 2 West Ham, 19/4/2016: Newcastle 1 : 1 Man City, 23/4/2016: Liverpool 2 : 2 Newcastle, 24/4/2016: Sunderland 0 : 0 Arsenal, 25/4/2016: Tottenham 1 : 1 West Brom, 30/4/2016: Stoke 1 : 1 Sunderland, 1/5/2016: Man United 1 : 1 Leicester, 2/5/2016: Chelsea 2 : 2 Tottenham, 7/5/2016: Aston Villa 0 : 0 Newcastle, 7/5/2016: Bournemouth 1 : 1 West Brom, 8/5/2016: Man City 2 : 2 Arsenal, 11/5/2016: Liverpool 1 : 1 Chelsea, 15/5/2016: Chelsea 1 : 1 Leicester, 15/5/2016: Swansea 1 : 1 Man City, 15/5/2016: Watford 2 : 2 Sunderland, 15/5/2016: West Brom 1 : 1 Liverpool]", drawnMatches.toString());
    }

    @Test
    void testGetHomeDrawCountString() {
        assertEquals(2, s16.getHomeDrawCount("Tottenham"));
        assertEquals(4, s18.getHomeDrawCount("Wolves"));
    }

    @Test
    void testGetAwayDrawCountString() {
        assertEquals(6, s16.getAwayDrawCount("Tottenham"));
        assertEquals(5, s18.getAwayDrawCount("Wolves"));
    }

    @Test
    void testGetGoalDifferenceString() {
        assertEquals(25, s14.getGoalDifference("Man United"));
        assertEquals(14, s15.getGoalDifference("Man United"));
        assertEquals(25, s16.getGoalDifference("Man United"));
        assertEquals(15, s18.getGoalDifference("Man United"));

        assertEquals(-4, s14.getGoalDifference("Crystal Palace"));
        assertEquals(-12, s15.getGoalDifference("Crystal Palace"));
        assertEquals(-13, s16.getGoalDifference("Crystal Palace"));
        assertEquals(-5, s18.getGoalDifference("Crystal Palace"));

        assertEquals(45, s14.getGoalDifference("Man City"));
        assertEquals(30, s15.getGoalDifference("Man City"));
        assertEquals(41, s16.getGoalDifference("Man City"));
        assertEquals(65, s18.getGoalDifference("Man City"));
    }

    @Test
    void testGetTeams() {
        assertNotNull(s11.getTeams());
        assertEquals("[Blackburn, Wolves, Fulham, Aston Villa, Liverpool, Sunderland, Newcastle, Arsenal, QPR, Bolton, Wigan, Norwich, Stoke, Chelsea, West Brom, Man United, Man City, Swansea, Everton, Tottenham]", s11.getTeams().toString());
        assertNotNull(s11.getTeams());
        assertEquals("[Arsenal, Crystal Palace, Leicester, Everton, Man United, Swansea, QPR, Hull, Stoke, Aston Villa, West Brom, Sunderland, West Ham, Tottenham, Liverpool, Southampton, Newcastle, Man City, Burnley, Chelsea]", s14.getTeams().toString());
        assertNotNull(s11.getTeams());
        assertEquals("[Bournemouth, Aston Villa, Chelsea, Swansea, Everton, Watford, Leicester, Sunderland, Man United, Tottenham, Norwich, Crystal Palace, Arsenal, West Ham, Newcastle, Southampton, Stoke, Liverpool, West Brom, Man City]", s15.getTeams().toString());
        assertNotNull(s11.getTeams());
        assertEquals("[Burnley, Swansea, Crystal Palace, West Brom, Everton, Tottenham, Hull, Leicester, Man City, Sunderland, Middlesbrough, Stoke, Southampton, Watford, Arsenal, Liverpool, Bournemouth, Man United, Chelsea, West Ham]", s16.getTeams().toString());
        assertNotNull(s11.getTeams());
        assertEquals("[Man United, Leicester, Bournemouth, Cardiff, Fulham, Crystal Palace, Huddersfield, Chelsea, Newcastle, Tottenham, Watford, Brighton, Wolves, Everton, Arsenal, Man City, Liverpool, West Ham, Southampton, Burnley]", s18.getTeams().toString());
    }

    @Test
    void testGetLeagueWinner() {
        assertNotNull(s11.getLeagueWinner());
        assertEquals("Man City", s11.getLeagueWinner());
        assertNotNull(s14.getLeagueWinner());
        assertEquals("Chelsea", s14.getLeagueWinner());
        assertNotNull(s15.getLeagueWinner());
        assertEquals("Leicester", s15.getLeagueWinner());
        assertNotNull(s16.getLeagueWinner());
        assertEquals("Chelsea", s16.getLeagueWinner());
    }

    @Test
    void testGetTeamsBetterAway() {
        assertNotNull(s11.getTeamsBetterAway());
        assertEquals("[Wolves, Bolton, West Brom]", s11.getTeamsBetterAway().toString());
        assertNotNull(s11.getTeamsBetterAway());
        assertEquals("[Crystal Palace]", s14.getTeamsBetterAway().toString());
        assertNotNull(s11.getTeamsBetterAway());
        assertEquals("[Bournemouth, Chelsea, Everton]", s15.getTeamsBetterAway().toString());
        assertNotNull(s11.getTeamsBetterAway());
        assertEquals("[Crystal Palace, Man United]", s16.getTeamsBetterAway().toString());
        assertNotNull(s11.getTeamsBetterAway());
        assertEquals("[Leicester, Crystal Palace]", s18.getTeamsBetterAway().toString());
    }

    @Test
    void testGetPointsByMonth() {
        assertEquals(6, s11.getPointsByMonth("Chelsea", 9));
        assertEquals(9, s15.getPointsByMonth("Leicester", 2));
        assertEquals(9, s15.getPointsByMonth("Crystal Palace", 12));
        assertEquals(12, s11.getPointsByMonth("Newcastle", 4));
    }

    @Test
    void testGetWinnerByMonth() {
        assertNotNull(s11.getWinnerByMonth(4));
        assertEquals("Newcastle", s11.getWinnerByMonth(4));
        assertNotNull(s14.getWinnerByMonth(11));
        assertEquals("Man City", s14.getWinnerByMonth(11));
        assertNotNull(s15.getWinnerByMonth(3));
        assertEquals("Leicester", s15.getWinnerByMonth(3));
        assertNotNull(s16.getWinnerByMonth(2));
        assertEquals("Man City", s16.getWinnerByMonth(2));
    }

    @Test
    void testGetMonthlyWinners() {
        assertNotNull(s11.getMonthlyWinners());
        assertEquals("[Man United, Tottenham, Man City, Tottenham, Man United, Tottenham, Arsenal, Arsenal, Newcastle, Tottenham]", s11.getMonthlyWinners().toString());
        assertNotNull(s14.getMonthlyWinners());
        assertEquals("[Swansea, Southampton, West Ham, Man City, Man City, Liverpool, Swansea, Arsenal, Chelsea, Man City]", s14.getMonthlyWinners().toString());
        assertNotNull(s15.getMonthlyWinners());
        assertEquals("[Man City, Man United, Arsenal, Everton, Arsenal, Southampton, Tottenham, Leicester, Man City, Southampton]", s15.getMonthlyWinners().toString());
        assertNotNull(s16.getMonthlyWinners());
        assertEquals("[Man City, Crystal Palace, Chelsea, Chelsea, Chelsea, Tottenham, Man City, Liverpool, Tottenham, Arsenal]", s16.getMonthlyWinners().toString());
    }

    @Test
    void testGetBiggestSwing() {
        ArrayList<Match> swings11 = s11.getBiggestSwing();
        assertNotNull(swings11);
        assertEquals(4, swings11.size());
        assertNotNull(swings11.get(0));
        assertEquals("21/8/2011: Wolves 2 : 0 Fulham", swings11.get(0).toString());
        assertNotNull(swings11.get(1));
        assertEquals("4/3/2012: Fulham 5 : 0 Wolves", swings11.get(1).toString());
        assertNotNull(swings11.get(2));
        assertEquals("17/9/2011: Blackburn 4 : 3 Arsenal", swings11.get(2).toString());
        assertNotNull(swings11.get(3));
        assertEquals("4/2/2012: Arsenal 7 : 1 Blackburn", swings11.get(3).toString());

        ArrayList<Match> swings15 = s15.getBiggestSwing();
        assertNotNull(swings15);
        assertEquals(2, swings15.size());
        assertNotNull(swings15.get(0));
        assertEquals("1/11/2015: Everton 6 : 2 Sunderland", swings15.get(0).toString());
        assertNotNull(swings15.get(1));
        assertEquals("11/5/2016: Sunderland 3 : 0 Everton", swings15.get(1).toString());

        /*
         *
         */
        ArrayList<Match> swings14 = s14.getBiggestSwing();
        assertNotNull(swings14);
        assertEquals(2, swings14.size());
        assertNotNull(swings14.get(0));
        assertEquals("18/10/2014: Southampton 8 : 0 Sunderland", swings14.get(0).toString());
        assertNotNull(swings14.get(1));
        assertEquals("2/5/2015: Sunderland 2 : 1 Southampton", swings14.get(1).toString());
    }
}