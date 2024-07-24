public class Fish extends Animal {
    /**
     * Constructor for Fish.
     * @param age       age of the fish
     * @param id        id of the fish
     * @param cage      cage of the fish
     */
    public Fish(int age, String id, String cage) {
        super(age, id, cage);
    }

    @Override
    public String getSounds() {
        return "Blub";
    }

    @Override
    public boolean canWalk() {
        return false;
    }

    @Override
    public boolean canSwim() {
        return true;
    }
}