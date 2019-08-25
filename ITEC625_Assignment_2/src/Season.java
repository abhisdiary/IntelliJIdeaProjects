

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Season {
    private ArrayList<Match> matches;
    private int year;

    /**
     * DO NOT MODIFY
     * reads the data for a soccer season from the filename provided.
     *
     * @param filename
     * @throws FileNotFoundException
     */
    public Season(String filename) throws FileNotFoundException {
        year = Integer.parseInt(filename.substring(0, 2));
        matches = new ArrayList<Match>();
        File source = new File("data/" + filename);
        Scanner scanner = new Scanner(source);
        scanner.nextLine(); //ignore header
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            String[] dateTokens = tokens[0].split("-");
            Date d = new Date(Integer.parseInt(dateTokens[2]), Integer.parseInt(dateTokens[1]), Integer.parseInt(dateTokens[0]));
            Match m = new Match(d, tokens[1], tokens[2], Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]));
            matches.add(m);
        }
        scanner.close();
    }

    /**
     * DO NOT MODIFY
     *
     * @return
     */
    public int size() {
        return matches.size();
    }

    /**
     * @param idx
     * @return the match at given index (null if index invalid)
     */
    public Match getMatch(int idx) {
        if (idx < 0)
            return null;
        if (idx >= size())
            return null;
        return matches.get(idx);
    }

    /**
     * @param idx
     * @return the home team for the match at given index (null if index invalid)
     */
    public String getHomeTeam(int idx) {
        //to be completed
        if (idx < 0 || idx >= size()) {
            return null;
        } else {
            String string = matches.get(idx).toString();
            String[] parts = string.split(":");
            String[] sub_parts = parts[1].split(" ");
            if (sub_parts.length > 2) {
                String homeTeam = "";
                for (int i = 1; i < sub_parts.length - 1; i++) {
                    homeTeam += sub_parts[i] + " ";
                }
                return homeTeam.substring(0, homeTeam.length() - 1);
            } else {
                return sub_parts[1];
            }
        }

        /*
        // Another way
        if (getMatch(idx) != null) {
            return matches.get(idx).getHomeTeam();
        } else
            return getMatch(idx);
         */
    }

    /**
     * @param idx
     * @return the away team for the match at given index (null if index invalid)
     */
    public String getAwayTeam(int idx) {
        //to be completed
        if (idx < 0 || idx >= size()) {
            return null;
        } else {
            String string = matches.get(idx).toString();
            String[] parts = string.split(":");
            String[] sub_parts = parts[2].split(" ");
            if (sub_parts.length > 2) {
                String awayTeam = "";
                for (int i = 2; i < sub_parts.length; i++) {
                    awayTeam += sub_parts[i] + " ";
                }
                return awayTeam.substring(0, awayTeam.length() - 1);
            } else {
                return sub_parts[1];
            }
        }
    }

    /**
     * @param idx
     * @return name of the winner of the match at passed index
     * return "We're all winners!" if the match at passed index ended in a  draw.
     * return null if index is invalid
     */
    public String getMatchWinner(int idx) {
        //to be completed
        if (idx < 0 || idx >= size()) {
            return null;
        } else {
            String string = matches.get(idx).toString();
            String[] parts = string.split(":");
            String[] team_1_sub_parts = parts[1].split(" ");
            String[] team_2_sub_parts = parts[2].split(" ");
            int team_1_score = Integer.parseInt(team_1_sub_parts[team_1_sub_parts.length - 1]);
            int team_2_score = Integer.parseInt(team_2_sub_parts[1]);
            if (team_1_score == team_2_score) {
                return "We're all winners!";
            } else if (team_1_score > team_2_score) {
                return getHomeTeam(idx);
            } else {
                return getAwayTeam(idx);
            }
        }
    }

    /**
     * @param team
     * @return number of games played at home by the team passed
     */
    public int getHomeGameCount(String team) {
        int count = 0;
        for (Match m : matches) {
            if (m.getHomeTeam().equals(team)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param team
     * @return number of games won at home by the team passed
     */
    public int getHomeWinCount(String team) {
        //to be completed
        int count = 0;
        for (int i = 0; i < matches.size(); i++) {
            if (matches.get(i).getHomeTeam().equals(team)) {
                if (getMatchWinner(i).equals(team)) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * @param team
     * @return number of away games played by the team passed
     */
    public int getAwayGameCount(String team) {
        //to be completed
        int count = 0;
        for (Match m : matches) {
            if (m.getAwayTeam().equals(team)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param team
     * @return number of away games won by the team passed
     */
    public int getAwayWinCount(String team) {
        //to be completed
        int count = 0;
        for (int i = 0; i < matches.size(); i++) {
            if (matches.get(i).getAwayTeam().equals(team)) {
                if (getMatchWinner(i).equals(team)) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * DO NOT MODIFY
     *
     * @param team
     * @return total games won by team passed
     */
    public int getWinCount(String team) {
        return getHomeWinCount(team) + getAwayWinCount(team);
    }

    /**
     * @return a list of all the matches that resulted in a draw
     */
    public ArrayList<Match> getMatchesDrawn() {
        //to be completed
        ArrayList<Match> str_arr = new ArrayList<>();
        for (int i = 0; i < matches.size(); i++) {
            if (getMatchWinner(i).equals("We're all winners!")) {
                str_arr.add(matches.get(i));
            }
        }
        return str_arr;
    }

    /**
     * @param team
     * @return number of away games drawn by the team passed
     */
    public int getAwayDrawCount(String team) {
        //to be completed
        int count = 0;
        for (int i = 0; i < getMatchesDrawn().size(); i++) {
            if (getMatchesDrawn().get(i).getAwayTeam().equals(team)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param team
     * @return number of home games drawn by the team passed
     */
    public int getHomeDrawCount(String team) {
        //to be completed
        int count = 0;
        for (int i = 0; i < getMatchesDrawn().size(); i++) {
            if (getMatchesDrawn().get(i).getHomeTeam().equals(team)) {
                count++;
            }
        }
        return count;
    }

    /**
     * DO NOT MODIFY
     *
     * @param team
     * @return number of total games drawn by the team passed
     */
    public int getDrawCount(String team) {
        return getHomeDrawCount(team) + getAwayDrawCount(team);
    }

    /**
     * DO NOT MODIFY
     *
     * @param team
     * @return points at home for given team.
     * you get 3 points for a win and 1 point for a draw
     */
    public int getHomePoints(String team) {
        return 3 * getHomeWinCount(team) + getHomeDrawCount(team);
    }

    /**
     * DO NOT MODIFY
     *
     * @param team
     * @return points while playing away for given team.
     * you get 3 points for a win and 1 point for a draw
     */
    public int getAwayPoints(String team) {
        return 3 * getAwayWinCount(team) + getAwayDrawCount(team);
    }

    /**
     * DO NOT MODIFY
     *
     * @param team
     * @return points for given team.
     * you get 3 points for a win and 1 point for a draw
     */
    public int getPoints(String team) {
        return getHomePoints(team) + getAwayPoints(team);
    }

    /**
     * @param team
     * @return the overall goal difference for given team.
     * If the team scores more goals than it concedes, it will be more than 0.
     * If the team scores fewer goals than it concedes, it will be less than 0.
     * If the team scores the same number of goals than it concedes, it will be 0.
     */
    public int getGoalDifference(String team) {
        //to be completed
        int goal_diff_while_home = 0;
        int goal_diff_while_away = 0;
        ArrayList<Match> arr_list_home = new ArrayList<>();
        ArrayList<Match> arr_list_away = new ArrayList<>();
        for (int i = 0; i < matches.size(); i++) {
            if (getHomeTeam(i).equals(team)) {
                arr_list_home.add(matches.get(i));
            }
            if (getAwayTeam(i).equals(team)) {
                arr_list_away.add(matches.get(i));
            }
        }
        for (Match m : arr_list_home) {
            goal_diff_while_home += m.goalDifference();
        }
        for (Match m : arr_list_away) {
            goal_diff_while_away += m.goalDifference();
        }
        return goal_diff_while_home - goal_diff_while_away;
    }

    /**
     * @return a list of teams that played that season,
     * (IMPORTANT) in order of appearance in the input file.
     * For a given match, the home team should be added before the away team.
     */
    public ArrayList<String> getTeams() {
        //to be completed
        ArrayList<String> arr_list = new ArrayList<>();
        for (Match m : matches) {
            if (!arr_list.contains(m.getHomeTeam())) {
                arr_list.add(m.getHomeTeam());
            }
            if (!arr_list.contains(m.getAwayTeam())) {
                arr_list.add(m.getAwayTeam());
            }
        }
        return arr_list;
    }

    /**
     * @return name of the winner team
     * the team with highest points wins.
     * if two or more teams have an equal highest points,
     * the team with the highest goal difference wins.
     * We have not included the scenario when multiple
     * teams have an equal highest points and the same goal difference.
     * In that case, the first of such teams is the winner for us.
     * <p>
     * In reality, following occurs,
     * La Liga rules stipulate that if two teams finish with the
     * same number of points, the sides' direct head-to-head record
     * during the league campaign is used as a tie-breaker.
     * If that also ends in a draw then goal difference is used
     * as a criteria to declare the winner.
     * <p>
     * Where as in EPL , if two teams finished with same points
     * the winner is decided by considering goal difference.
     * And if the goal difference is also same then the team
     * that scores more goals is the winner.
     * If this is also same then two teams play against each other
     * in a neutral ground and then the winner is decided.
     */
    public String getLeagueWinner() {
        //to be completed
        ArrayList<String> arr_list = getTeams();
        for (int i = 0; i < arr_list.size(); i++) {
            for (int j = 0; j < arr_list.size() - i - 1; j++) {
                if (getPoints(arr_list.get(j)) > getPoints(arr_list.get(j + 1))) {
                    arr_list.remove(j + 1);
                    j--;
                } else if (getPoints(arr_list.get(j + 1)) > getPoints(arr_list.get(j))) {
                    arr_list.remove(j);
                    j--;
                }
            }
        }

        if (arr_list.size() > 1) {
            for (int i = 0; i < arr_list.size(); i++) {
                for (int j = 0; j < arr_list.size() - i - 1; j++) {
                    if (getGoalDifference(arr_list.get(j)) > getGoalDifference(arr_list.get(j + 1))) {
                        arr_list.remove(j + 1);
                        j--;
                    } else if (getGoalDifference(arr_list.get(j + 1)) > getGoalDifference(arr_list.get(j))) {
                        arr_list.remove(j);
                        j--;
                    }
                }
            }
        }
        return arr_list.get(0);
    }

    /**
     * @param team
     * @param month (assume month is between 1 and 12)
     * @return points accumulated by given team in the given month
     */
    public int getPointsByMonth(String team, int month) {
        //to be completed
        int idx_count = 0;
        int total_points = 0;
        for (Match m : matches) {
            Date date = new Date(m.getDate());
            if ((date.getMonth() == month)) {
                if ((m.getHomeTeam().equals(team) || m.getAwayTeam().equals(team))) {
                    if (getMatchWinner(idx_count).equals(team)) {
                        total_points += 3;
                    } else if (getMatchWinner(idx_count).equals("We're all winners!")) {
                        total_points++;
                    }
                }
            }
            idx_count++;
        }
        return total_points;
    }


    /**
     * @param month (assume month is between 1 and 12)
     * @return the team that gets the most points in a given month
     */
    public String getWinnerByMonth(int month) {
        //to be completed
        ArrayList<String> valid_Months = new ArrayList<>();
        for (Match match : matches) {
            String string = match.getDate().toString();
            String[] parts = string.split("/");
            if (!valid_Months.contains(parts[1])) {
                valid_Months.add(parts[1]);
            }
        }
        String team = "";
        if (month > 0 && month < 13 && (valid_Months.contains(Integer.toString(month)))) {
            ArrayList<String> all_Teams = getTeams();
            for (int i = 0; i < all_Teams.size(); i++) {
                for (int j = 1; j < (all_Teams.size() - i); j++) {
                    if (getPointsByMonth(all_Teams.get(j - 1), month) < getPointsByMonth(all_Teams.get(j), month)) {
                        String temp = "";
                        temp = all_Teams.get(j - 1);
                        all_Teams.set(j - 1, all_Teams.get(j));
                        all_Teams.set(j, temp);
                    }
                }
            }
            team = all_Teams.get(0);
        }
        return team;
    }

    /**
     * @return the list of monthly winners from
     */
    public ArrayList<String> getMonthlyWinners() {
        //to be completed
        ArrayList<String> all_Months = new ArrayList<>();
        for (Match match : matches) {
            String string = match.getDate().toString();
            String[] parts = string.split("/");
            if (!all_Months.contains(parts[1])) {
                all_Months.add(parts[1]);
            }
        }
        ArrayList<String> monthly_winner = new ArrayList<>();
        for (int i = 0; i < all_Months.size(); i++) {
            if (!getWinnerByMonth(Integer.parseInt(all_Months.get(i))).equals("")) {
                monthly_winner.add(getWinnerByMonth(Integer.parseInt(all_Months.get(i))));
            }
        }
        return monthly_winner;
    }

    /**
     * @return a list of teams that played better than they played at home.
     * "playing better" is defined as having a higher points per game.
     */
    public ArrayList<String> getTeamsBetterAway() {
        //to be completed
        ArrayList<String> all_teams = getTeams();
        ArrayList<String> away_wins = new ArrayList<>();
        for (int i = 0; i < all_teams.size(); i++) {
            if (getAwayPoints(all_teams.get(i)) > getHomePoints(all_teams.get(i))) {
                away_wins.add(all_teams.get(i));
            }
        }
        return away_wins;
    }

    /**
     * HD question
     *
     * @return an arraylist containing the home and away matches
     * for each pair of opponents (say the names X and Y are used to
     * iterate over the teams)
     * that had the biggest discrepancies between playing at
     * X's home and then at Y's home
     * <p>
     * EXPLANATION:
     * <p>
     * Every team plays every other team twice -
     * once at home and once away (at the other team's home).
     * <p>
     * We would like to see which pair of teams performed extremely differently
     * when at home and when away.
     * <p>
     * It is possible a team does BRILLIANTLY at home again a particular opponent
     * and ATROCIOUSLY when away (at that opponent's home).
     * <p>
     * It is also possible, although statistically unlikely (no cases in the last decade)
     * that a team does ATROCIOUSLY at home again a particular opponent
     * and BRILLIANTLY when away (at that opponent's home).
     * <p>
     * We would like to return an arraylist containing these matches that have
     * the biggest discrepancy while playing at home and while playing away for
     * each pair of opponents.
     * <p>
     * Consider the following hypothetical match schedule:
     * <p>
     * sunderland (h) 0 - 1 man city (a)
     * chelsea (h) 1 - 4 arsenal (a)
     * stoke (h) 2 - 2 crystal palace (a)
     * man united (h) 4 - 0 burnley (a)
     * man city (h) 3 - 1 sunderland (a)
     * crystal palace (h) 4 - 1 stoke (a)
     * burnley (h) 4 - 0 man united (a)
     * arsenal (h) 0 - 5 chelsea (a)
     * <p>
     * If you highlight the games between chelsea and arsenal,
     * you'll see that arsenal got 3 more goals over chelsea when arsenal was playing away
     * and chelsea score 5 more goals over arsenal when chelsea was playing away.
     * This is a swing of 8 goals in chelsea's favour.
     * <p>
     * Similarly, there is an 8-goal swing in burnley's favour against man united.
     * <p>
     * The order of items in the list MUST be:
     * [item 0: 1st match that has biggest swing on the return fixture,
     * item 1: return fixture for item 1,
     * item 2: 2nd match that has biggest swing on the return fixture
     * (equaling swing between items 0 and 1),
     * item 3: return fixture for item 2,
     * ...]
     * <p>
     * So, in this case, the list that should be returned is:
     * [chelsea 1 - 4 arsenal,
     * arsenal 0 - 5 chelsea,
     * man united 4 - 0 burnley,
     * burnley 4 - 0 man united]
     */
    public ArrayList<Match> getBiggestSwing() {
        //to be completed
        ArrayList<String> checked_home_away_teams = new ArrayList<>();
        ArrayList<Match> biggest_swing = new ArrayList<>();
        ArrayList<Match> biggest_swing_equal_goals = new ArrayList<>();
        for (int i = 0; i < matches.size(); i++) {
            String team1 = matches.get(i).getHomeTeam();
            String team2 = matches.get(i).getAwayTeam();
            ArrayList<Match> home_away_matches = getHomeAwayMatches(team1, team2);
            if (home_away_matches != null) {
                if (!checked_home_away_teams.contains(team1 + team2) && !checked_home_away_teams.contains(team2 + team1)) {
                    checked_home_away_teams.add(team1 + team2);
                    if (biggest_swing.size() == 0) {
                        biggest_swing.add(home_away_matches.get(0));
                        biggest_swing.add(home_away_matches.get(1));
                    } else {
                        if (getHomeAwayGoalLead(biggest_swing.get(0), biggest_swing.get(1)) < getHomeAwayGoalLead(home_away_matches.get(0), home_away_matches.get(1))) {
                            biggest_swing.clear();
                            biggest_swing.add(home_away_matches.get(0));
                            biggest_swing.add(home_away_matches.get(1));
                        } else if (getHomeAwayGoalLead(biggest_swing.get(0), biggest_swing.get(1)) == getHomeAwayGoalLead(home_away_matches.get(0), home_away_matches.get(1))) {
                            biggest_swing_equal_goals.add(home_away_matches.get(0));
                            biggest_swing_equal_goals.add(home_away_matches.get(1));
                        }
                    }
                }
            }
        }
        if (getHomeAwayGoalLead(biggest_swing.get(0), biggest_swing.get(1)) == getHomeAwayGoalLead(biggest_swing_equal_goals.get(0), biggest_swing_equal_goals.get(1))) {
            for (Match m : biggest_swing_equal_goals) {
                biggest_swing.add(m);
            }
        }
        return biggest_swing;
    }

    /**
     * DO NOT MODIFY
     *
     * @return season in "Season: YY/YY" format. For example "Season: 13/14"
     */
    public String getSeasonYear() {
        DecimalFormat df = new DecimalFormat("00");
        return "Season " + df.format(year) + "/" + df.format(year + 1);
    }

    /**
     * DO NOT MODIFY
     */
    public String toString() {
        String result = getSeasonYear() + ":\n";
        for (Match m : matches) {
            result += m.toString() + "\n";
        }
        return result;
    }

    /**
     * @param team1
     * @param team2
     * @return a Match list of 2 row indexes: 1 is team1 as home and the other is team1 as away
     */
    public ArrayList<Match> getHomeAwayMatches(String team1, String team2) {
        // my custom method
        int idx_1 = 0;
        int idx_2 = 0;
        ArrayList<Match> home_away_game_matches = new ArrayList<>();
        for (int i = 0; i < matches.size(); i++) {
            if ((matches.get(i).getHomeTeam().equals(team1) && matches.get(i).getAwayTeam().equals(team2))) {
                home_away_game_matches.add(matches.get(i));
                idx_1 = i;
            }
            if ((matches.get(i).getHomeTeam().equals(team2) && matches.get(i).getAwayTeam().equals(team1))) {
                home_away_game_matches.add(matches.get(i));
                idx_2 = i;
            }
        }
        if (getMatchWinner(idx_1).equals(getMatchWinner(idx_2))) {
            home_away_game_matches = null;
        }
        return home_away_game_matches;
    }

    /**
     * @param match1
     * @param match2
     * @return (goal difference of home and away team of match1) + (goal difference of home and away team of match2)
     */
    public int getHomeAwayGoalLead(Match match1, Match match2) {
        // my custom method
        int match_1_goal_lead = Math.abs(match1.getHomeGoals() - match1.getAwayGoals());
        int match_2_goal_lead = Math.abs(match2.getHomeGoals() - match2.getAwayGoals());
        int total_goals_lead = match_1_goal_lead + match_2_goal_lead;
        return total_goals_lead;
    }
}
