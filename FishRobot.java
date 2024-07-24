public class FishRobot extends Robot implements FarmingRobot {
    /**
     * Default constructor
     */
    public FishRobot() {
        super();
    }

    /**
     * Constructor for FishRobot.
     * @param id        id of the robot
     * @param name      name of the robot
     */
    public FishRobot(String id, String name) {
        super(id, name);
    }

    @Override
    public void harvest() {
        System.out.println(getName() + " is harvesting fish.");
    }

    @Override
    public void process() {
        System.out.println(getName() + " is processing fish.");
    }

    @Override
    public void doWork() {
        harvest();
        process();
    }
}
