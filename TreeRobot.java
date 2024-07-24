public class TreeRobot extends Robot implements FarmingRobot {
    /**
     * Default constructor
     */
    public TreeRobot() {
        super();
    }

    /**
     * Constructor for TreeRobot.
     * @param id        id of the robot
     * @param name      name of the robot
     */
    public TreeRobot(String id, String name) {
        super(id, name);
    }

    @Override
    public void harvest() {
        System.out.println(getName() + " is harvesting trees.");
    }

    @Override
    public void process() {
        System.out.println(getName() + " is processing trees.");
    }

    @Override
    public void doWork() {
        harvest();
        process();
    }
}