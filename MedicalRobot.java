public interface MedicalRobot {
    public static final String GOOD_STATUS = "Good";
    public static final String BAD_STATUS = "Bad";
    public static final String CRITICAL_STATUS = "Critical";

    /*
     * @return health status of the checked Animal
     */
    public String dailyCheck(Animal animal);
}
