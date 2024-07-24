public class Cat extends Animal {
    /**
     * Constructor for Cat.
     * @param age       age of the cat
     * @param id        id of the cat
     * @param cage      cage of the cat
     */
    public Cat(int age, String id, String cage) {
        super(age, id, cage);
    }

    @Override
    public String getSounds() {
        return "Meow";
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canSwim() {
        return false;
    }
}