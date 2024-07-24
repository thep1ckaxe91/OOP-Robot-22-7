public class Turtle extends Animal {
    /**
     * Constructor for Turtle.
     * @param age       age of the turtle
     * @param id        id of the turtle
     * @param cage      cage of the turtle
     */
    public Turtle(int age, String id, String cage) {
        super(age, id, cage);
    }

    @Override
    public String getSounds() {
        return "Hiss";
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}