import java.util.Arrays;
import java.util.Random;

public class GitHomeWork11 {

    public static final int MIN_YEARS_TEAM = 18;

    public static final int MAX_YEARS_TEAM = 40;

    public static final int TEAM_MEMBERS = 25;

    public static void main(String[] args) {
        Random random = new Random();
        int[] teamA = new int[TEAM_MEMBERS];
        int[] teamB = new int[TEAM_MEMBERS];

        int sumTeamA = 0;
        int sumTeamB = 0;

        for (int index = 0; index < TEAM_MEMBERS; index++) {
            teamA[index] = random.nextInt(MAX_YEARS_TEAM - MIN_YEARS_TEAM) + MIN_YEARS_TEAM;
            teamB[index] = random.nextInt(MAX_YEARS_TEAM - MIN_YEARS_TEAM) + MIN_YEARS_TEAM;

            sumTeamA += teamA[index];
            sumTeamB += teamB[index];
        }

        System.out.println(Arrays.toString(teamA));
        System.out.println(Arrays.toString(teamB));

        int avrYearsTeamA = sumTeamA / TEAM_MEMBERS;
        int avrYearsTeamB = sumTeamB / TEAM_MEMBERS;

        System.out.println("Середній вік в команді Київ = " + avrYearsTeamA);
        System.out.println("Середній вік в команді Львів = " + avrYearsTeamB);

    }
}