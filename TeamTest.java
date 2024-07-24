public class TeamTest {
    public static void main(String[] args) {
        Team team = new Team("Alpha");

        assert "Alpha".equals(team.getTeamName()) : "Team name should be Alpha";

        Robot robot = new TreeRobot(1, "TreeBot");
        team.addRobot(robot);
        assert team.getRobots().contains(robot) : "Robot should be in the team";

        team.removeRobot(1);
        assert !team.getRobots().contains(robot) : "Robot should not be in the team";

        System.out.println("All Team tests passed.");
    }
}
