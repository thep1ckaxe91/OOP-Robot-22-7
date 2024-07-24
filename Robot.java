public abstract class Robot {
    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot() {
        this.id = null;
        this.name = "<blank>";
    }

    /**
     * Initializes a new instance of the Robot
     * 
     * @param id   id of the robot
     * @param name name of the robot
     */
    public Robot(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Every robot have a role and its associated work
     * this function call will make the robot do its work
     * This function should be called when all robot need to get some job done
     */
    public abstract void doWork();
}
