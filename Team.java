import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Robot> robots = new ArrayList<>();

    /**
     * Constructor for Team
     */
    public Team() {
        this.name = "Team";
        this.robots = new ArrayList<>();
    }

    /**
     * Constructor for Team
     * @param name      Name of the team
     */
    public Team(String name) {
        this.name = name;
        this.robots = new ArrayList<>();
    }

    /**
     * Constructor for Team
     * @param name      Name of the team
     * @param robots    List of robots in the team
     */
    public Team(String name, List<Robot> robots) {
        this.name = name;
        this.robots = robots;
    }

    /**
     * Add a robot to the team.
     * @param robot     the robot to be added
     */
    public void addRobot(Robot robot) {
        for (Robot r : robots) {
            if (r.getId().equals(robot.getId())) {
                return;
            }
        }
        robots.add(robot);
    }

    /**
     * Remove a robot from the team.
     * @param id        the id of the robot to be removed   
     */
    public void removeRobot(String id) {
        for (Robot r : robots) {
            if (r.getId().equals(id)) {
                robots.remove(r);
                return;
            }
        }
    }

    public String getTeamName() {
        return name;
    }

    public List<Robot> getRobots() {
        return robots;
    }

    public void setTeamName(String name) {
        this.name = name;
    }

    public void setRobots(List<Robot> robots) {
        this.robots = robots;
    }
}
