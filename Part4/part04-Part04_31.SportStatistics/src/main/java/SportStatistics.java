
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        
        ArrayList<GamesResults> games = readGamesFromFile(file);
        int numGames = 0;
        int wins = 0;
        int losses = 0;
        
        for (GamesResults game: games) {
            if (game.getHomeTeam().equals(team) || game.getAwayTeam().equals(team)) {
                numGames++;
                
                if (game.isHomeTeam(team)) {
                    if (game.getHomeScore() > game.getAwayScore()) {
                        wins++;
                    } else {
                        losses++;
                    }
                } else {
                    if (game.getAwayScore() > game.getHomeScore()) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
            
        }
        System.out.println("Games: " + numGames);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
    }
    
    public static ArrayList<GamesResults> readGamesFromFile(String file) {
        ArrayList<GamesResults> gameResults = new ArrayList<>();
        
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] parts = line.split(",");
                
                String hTeam = parts[0];
                String aTeam = parts[1];
                int hScore = Integer.valueOf(parts[2]);
                int aScore = Integer.valueOf(parts[3]);
                
                gameResults.add(new GamesResults(hTeam, aTeam, hScore, aScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return gameResults;
    }

}
