abstract class Animal {
    protected int age;

    protected String id;

    protected String cage;

    /**
     * Constructor for Animal.
     * @param age       age of the animal
     * @param id        id of the animal
     * @param cage      cage of the animal
     */
    public Animal(int age, String id, String cage) {
        this.age = age;
        this.id = id;
        this.cage = cage;
    }

    public String getCage() {
        return cage;
    }

    public abstract String getSounds();

    public abstract boolean canWalk();

    public abstract boolean canSwim();
}