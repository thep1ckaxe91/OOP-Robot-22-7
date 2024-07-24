public class AllTests {
    public static final String GREEN = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        testRobot();
        testTreeRobot();
        testFishRobot();
        testTeam();
        testTeamManagement();
        testFarmingRobot();
        testDoctorRobot();
        testNurseRobot();
        testZoo();

        System.out.println(GREEN + "All tests passed.\n" + RESET);
    }

    public static void testRobot() {
        Robot robot = new TreeRobot();

        robot = new FishRobot("1", "FishBot");
        assert robot.getId() == "1" : "ID should be 1";
        assert "FishBot".equals(robot.getName()) : "Name should be FishBot";

        robot.setId("2");
        assert robot.getId() == "2" : "ID should be 2";
        robot.setName("FishMaster");
        assert "FishMaster".equals(robot.getName()) : "Name should be FishMaster";

        System.out.println(GREEN + "Robot tests passed.\n" + RESET);
    }

    public static void testTreeRobot() {
        TreeRobot treeRobot = new TreeRobot("1", "TreeBot");

        assert treeRobot.getId() == "1" : "ID should be 1";
        assert "TreeBot".equals(treeRobot.getName()) : "Name should be TreeBot";

        treeRobot.setId("2");
        assert treeRobot.getId() == "2" : "ID should be 2";

        treeRobot.setName("TreeMaster");
        assert "TreeMaster".equals(treeRobot.getName()) : "Name should be TreeMaster";

        System.out.println(GREEN + "Expected: TreeMaster is harvesting trees." + RESET);
        System.out.println(GREEN + "Expected: TreeMaster is processing trees." + RESET);
        treeRobot.doWork();

        System.out.println(GREEN + "TreeRobot tests passed.\n" + RESET);
    }

    public static void testFishRobot() {
        FishRobot fishRobot = new FishRobot("2", "FishBot");

        assert fishRobot.getId() == "2" : "ID should be 2";
        assert "FishBot".equals(fishRobot.getName()) : "Name should be FishBot";

        fishRobot.setId("3");
        assert fishRobot.getId() == "3" : "ID should be 3";

        fishRobot.setName("FishMaster");
        assert "FishMaster".equals(fishRobot.getName()) : "Name should be FishMaster";

        System.out.println(GREEN + "Expected: FishMaster is harvesting fish." + RESET);
        System.out.println(GREEN + "Expected: FishMaster is processing fish." + RESET);
        fishRobot.doWork();

        System.out.println(GREEN + "FishRobot tests passed.\n" + RESET);
    }

    public static void testTeam() {
        Team team = new Team("Alpha");

        assert "Alpha".equals(team.getTeamName()) : "Team name should be Alpha";

        Robot robot = new TreeRobot("1", "TreeBot");
        team.addRobot(robot);
        assert team.getRobots().contains(robot) : "Robot should be in the team";

        team.removeRobot("1");
        assert !team.getRobots().contains(robot) : "Robot should not be in the team";

        team.addRobot(robot);
        Robot retrievedRobot = team.getRobotById("1");
        assert robot.equals(retrievedRobot) : "Retrieved robot should be the same as added robot";

        retrievedRobot = team.getRobotById("99");
        assert retrievedRobot == null : "Non-existent robot should return null";

        String expectedHeader = "********** WELCOME TO ***********\n************* Alpha *************\n";
        assert expectedHeader.equals(team.welcomeHeader()) : "Welcome header should be correct";

        System.out.println(GREEN + "Team tests passed.\n" + RESET);
    }

    public static void testTeamManagement() {
        TeamManagement management = new TeamManagement();

        Team team = new Team("Alpha");
        management.addTeam(team);
        assert management.getTeams().contains(team) : "Team should be in the management list";

        management.removeTeam(team);
        assert !management.getTeams().contains(team) : "Team should not be in the management list";

        management.addTeam(team);
        Team retrievedTeam = management.getTeamByName("Alpha");
        assert team.equals(retrievedTeam) : "Retrieved team should be the same as added team";

        retrievedTeam = management.getTeamByName("NonExistent");
        assert retrievedTeam == null : "Non-existent team should return null";

        System.out.println(GREEN + "TeamManagement tests passed.\n" + RESET);
    }

    public static void testFarmingRobot() {
        FarmingRobot farmingRobot = new TreeRobot("1", "TreeBot");

        farmingRobot.harvest();
        farmingRobot.process();

        System.out.println(GREEN + "FarmingRobot tests passed.\n" + RESET);
    }

    public static void testDoctorRobot() {
        DoctorRobot doctorRobot = new DoctorRobot("1", "DocBot");

        assert doctorRobot.getId() == "1" : "ID should be 1";
        assert "DocBot".equals(doctorRobot.getName()) : "Name should be DocBot";

        System.out.println(GREEN + "Expected: DocBot is providing medical care." + RESET);
        doctorRobot.doWork();

        System.out.println(GREEN + "DoctorRobot tests passed.\n" + RESET);
    }

    public static void testNurseRobot() {
        NurseRobot nurseRobot = new NurseRobot("2", "NurseBot");

        assert nurseRobot.getId() == "2" : "ID should be 2";
        assert "NurseBot".equals(nurseRobot.getName()) : "Name should be NurseBot";

        System.out.println(GREEN + "Expected: NurseBot is providing nursing care." + RESET);
        nurseRobot.doWork();

        System.out.println(GREEN + "NurseRobot tests passed.\n" + RESET);
    }

    public static void testZoo() {
        // Test constructors
        Zoo zoo1 = new Zoo();
        assert "Zoo".equals(zoo1.getName()) : "Default zoo name should be 'Zoo'";

        Zoo zoo2 = new Zoo("Safari");
        assert "Safari".equals(zoo2.getName()) : "Zoo name should be 'Safari'";

        TeamManagement teamManagement = new TeamManagement();
        Zoo zoo3 = new Zoo("National Zoo", teamManagement);
        assert "National Zoo".equals(zoo3.getName()) : "Zoo name should be 'National Zoo'";
        assert teamManagement.equals(zoo3.getTeamManagement()) : "Team management should be the same";

        // Test getName and setName
        Zoo zoo = new Zoo("Wildlife Zoo");
        assert "Wildlife Zoo".equals(zoo.getName()) : "Zoo name should be 'Wildlife Zoo'";
        zoo.setName("Urban Zoo");
        assert "Urban Zoo".equals(zoo.getName()) : "Zoo name should be 'Urban Zoo'";

        // Test addAnimal
        Fish f = new Fish(2, "10293801283", "Cage1");
        zoo.addAnimal(f);
        assert zoo.getAnimal("10293801283") != null : "Fish should be added to the zoo";

        // Test removeAnimal
        zoo.removeAnimal("10293801283");
        assert zoo.getAnimal("10293801283") == null : "Lion should be removed from the zoo";

        // Test getAnimal
        zoo.addAnimal(f);
        assert f.equals(zoo.getAnimal("10293801283")) : "Should return the lion";

        // Test totalAnimals
        Turtle t = new Turtle(11, "182739", "Cage1");
        zoo.addAnimal(f);
        zoo.addAnimal(t);
        assert zoo.totalAnimals() == 2 : "Total animals should be 2";

        // Test getSwimmingAnimals
        assert zoo.getSwimmingAnimals() == 2 : "There should be 3 swimming animals";

        // Test getWalkingAnimals
        assert zoo.getWalkingAnimals() == 1 : "There should be 2 walking animals";

        // Test getWalkingSwimmingAnimals
        assert zoo.getWalkingSwimmingAnimals() == 1 : "There should be 2 animals that can walk and swim";

        System.out.println(GREEN + "Zoo tests passed.\n" + RESET);
    }
}
