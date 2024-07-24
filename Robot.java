public abstract class Robot {
    private long id;
    private String name;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot() {
        this.id = 0;
        this.name = "<blank>";
    }

    /**
     * Initializes a new instance of the Robot
     * 
     * @param id id of the robot
     * @param name name of the robot
     */
    public Robot(long id, String name) {
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
