public class FarmingRobotTest {
    public static void main(String[] args) {
        FarmingRobot farmingRobot = new TreeRobot(1, "TreeBot");

        farmingRobot.harvest();
        farmingRobot.process();

        System.out.println("All FarmingRobot tests passed.\n");
    }
}
