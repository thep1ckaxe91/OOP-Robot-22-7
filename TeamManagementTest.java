public class TeamManagementTest {
    public static void main(String[] args) {
        TeamManagement management = new TeamManagement();

        Team team = new Team("Alpha");
        management.addTeam(team);
        assert management.getTeams().contains(team) : "Team should be in the management list";

        management.removeTeam(team);
        assert !management.getTeams().contains(team) : "Team should not be in the management list";

        management.addTeam(team);
        Team retrievedTeam = management.getTeamByName("Alpha");
        assert team.equals(retrievedTeam) : "Retrieved team should be the same as added team";

        retrievedTeam = management.getTeamByName("NonExistent");
        assert retrievedTeam == null : "Non-existent team should return null";

        System.out.println("All TeamManagement tests passed.\n");
    }
}
