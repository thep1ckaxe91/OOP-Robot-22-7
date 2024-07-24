public class FishRobotTest {
    public static void main(String[] args) {
        FishRobot fishRobot = new FishRobot(2, "FishBot");

        assert fishRobot.getId() == 2 : "ID should be 2";
        assert "FishBot".equals(fishRobot.getName()) : "Name should be FishBot";

        fishRobot.setId(3);
        assert fishRobot.getId() == 3 : "ID should be 3";

        fishRobot.setName("FishMaster");
        assert "FishMaster".equals(fishRobot.getName()) : "Name should be FishMaster";

        System.out.println("Expected: FishMaster is harvesting fish.");
        System.out.println("Expected: FishMaster is processing fish.");
        fishRobot.doWork();

        System.out.println("All FishRobot tests passed.\n");
    }
}
