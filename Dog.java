public class Dog extends Animal {
    /**
     * Constructor for Dog.
     * @param age       age of the dog
     * @param id        id of the dog
     * @param cage      cage of the dog
     */
    public Dog(int age, String id, String cage) {
        super(age, id, cage);
    }

    @Override
    public String getSounds() {
        return "Bark";
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