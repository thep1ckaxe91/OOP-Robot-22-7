public class FishRobot extends Robot implements FarmingRobot {
    public FishRobot(long id, String name) {
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
