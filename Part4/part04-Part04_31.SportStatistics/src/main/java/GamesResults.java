/**
 *
 * @author Flavio
 */
public class GamesResults {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    
    public GamesResults(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public boolean isHomeTeam(String team) {
        if (!team.equals(this.homeTeam)) {
            return false;
        }
        return true;
    }
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getAwayTeam() {
        return this.awayTeam;
    }
    
    public int getHomeScore() {
        return this.homeScore;
    }
    
    public int getAwayScore() {
        return this.awayScore;
    }
}
