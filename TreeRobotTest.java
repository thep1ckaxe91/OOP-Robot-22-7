public class TreeRobotTest {
    public static void main(String[] args) {
        TreeRobot treeRobot = new TreeRobot(1, "TreeBot");

        assert treeRobot.getId() == 1 : "ID should be 1";
        assert "TreeBot".equals(treeRobot.getName()) : "Name should be TreeBot";

        treeRobot.setId(2);
        assert treeRobot.getId() == 2 : "ID should be 2";

        treeRobot.setName("TreeMaster");
        assert "TreeMaster".equals(treeRobot.getName()) : "Name should be TreeMaster";

        System.out.println("Expected: TreeMaster is harvesting trees.");
        System.out.println("Expected: TreeMaster is processing trees.");
        treeRobot.doWork();

        System.out.println("All TreeRobot tests passed.\n");
    }
}
