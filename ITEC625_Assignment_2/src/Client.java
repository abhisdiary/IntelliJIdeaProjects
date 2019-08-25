

import java.io.FileNotFoundException;

public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Season season = new Season("0910.csv");
		System.out.println("Season 2009/10 Winner: "+season.getLeagueWinner());
		System.out.println(season.getTeamsBetterAway());
		
		for(int year = 10; year <= 18; year++) {
			season = new Season(year+""+(year+1)+".csv");
			System.out.println("Teams who played better during "+season.getSeasonYear()+": "+season.getTeamsBetterAway());
		}		
	}

}
