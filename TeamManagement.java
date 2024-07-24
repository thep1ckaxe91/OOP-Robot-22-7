import java.util.ArrayList;
import java.util.List;

public class TeamManagement {
    private List<Team> teams = new ArrayList<>();

    /**
     * Constructor for TeamManagement
     */
    public TeamManagement() {
        this.teams = new ArrayList<>();
    }

    /**
     * Constructor for TeamManagement
     * @param teams     List of teams
     */
    public TeamManagement(List<Team> teams) {
        this.teams = teams;
    }

    /**
     * Add a team to the list of teams.
     * @param team      the team to be added
     */
    public void addTeam(Team team) {
        for (Team t : teams) {
            if (t.getTeamName().equalsIgnoreCase(team.getTeamName())) {
                return;
            }
        }
        teams.add(team);
    }

    /**
     * Remove a team from the list of teams.
     * @param team      the team to be removed
     */
    public void removeTeam(Team team) {
        for (Team t : teams) {
            if (t.getTeamName().equalsIgnoreCase(team.getTeamName())) {
                teams.remove(t);
                return;
            }
        }
    }

    public List<Team> getTeams() {
        return teams;
    }

    /**
     * Get a team by its name.
     * @param teamName      the name of the team
     * @return              the team with the given name
     */
    public Team getTeamByName(String teamName) {
        for (Team team : teams) {
            if (team.getTeamName().equalsIgnoreCase(teamName)) {
                return team;
            }
        }
        return null;
    }
}
