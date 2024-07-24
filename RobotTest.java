public class RobotTest {
    public static void main(String[] args) {
        // Test default constructor
        Robot robot = new TreeRobot();
        assert robot.getId() == 0 : "ID should be 0";
        assert "<blank>".equals(robot.getName()) : "Name should be <blank>";

        // Test parameterized constructor
        robot = new FishRobot(1, "FishBot");
        assert robot.getId() == 1 : "ID should be 1";
        assert "FishBot".equals(robot.getName()) : "Name should be FishBot";

        // Test setId and setName
        robot.setId(2);
        assert robot.getId() == 2 : "ID should be 2";
        robot.setName("FishMaster");
        assert "FishMaster".equals(robot.getName()) : "Name should be FishMaster";

        System.out.println("All Robot tests passed.\n");
    }
}
