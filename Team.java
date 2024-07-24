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
     * 
     * @param name Name of the team
     */
    public Team(String name) {
        this.name = name;
        this.robots = new ArrayList<>();
    }

    /**
     * Constructor for Team
     * 
     * @param name   Name of the team
     * @param robots List of robots in the team
     */
    public Team(String name, List<Robot> robots) {
        this.name = name;
        this.robots = robots;
    }

    /**
     * Add a robot to the team.
     * 
     * @param robot the robot to be added
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
     * 
     * @param id the id of the robot to be removed
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

    /**
     * @return welcome message, print this to get the welcome screen
     */
    public String welcomeHeader() {
        String wt = "********** WELCOME TO **********";
        int len = wt.length();
        String teamName = "";
        int cnt = len / 2 - this.name.length() / 2 - 1;
        for (int i = 0; i < cnt; i++) {
            teamName += "*";
        }
        teamName += " " + this.name + " ";
        for (int i = 0; i < cnt; i++) {
            teamName += "*";
        }
        return wt + (this.name.length() % 2 == 0 ? "" : "*") + "\n" + teamName + "\n";
    }

    /**
     * get all the robots do its job
     */
    public void dispatchWork() {
        for (Robot robot : this.robots) {
            robot.doWork();
        }
    }
}
