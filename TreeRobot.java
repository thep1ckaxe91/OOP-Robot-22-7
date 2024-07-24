public class TreeRobot extends Robot implements FarmingRobot {
    public TreeRobot(long id, String name) {
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