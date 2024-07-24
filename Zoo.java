import java.util.ArrayList;

public class Zoo {
    private String name;
    private TeamManagement teamManagement = new TeamManagement();
    private ArrayList<Animal> animals = new ArrayList<>();

    /**
     * Constructor for Zoo
     */
    public Zoo() {
        animals = new ArrayList<>();
        teamManagement = new TeamManagement();
        name = "Zoo";
    }

    /**
     * Constructor for Zoo
     * @param name  name of the zoo
     */
    public Zoo(String name) {
        animals = new ArrayList<>();
        teamManagement = new TeamManagement();
        this.name = name;
    }

    /**
     * Constructor for Zoo
     * @param name              name of the zoo
     * @param teamManagement    team management of the zoo
     */
    public Zoo(String name, TeamManagement teamManagement) {
        animals = new ArrayList<>();
        this.teamManagement = teamManagement;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TeamManagement getTeamManagement() {
        return teamManagement;
    }

    /**
     * Show all team of the zoo.
     * @param team  the team to be added
     */
    public void showAllRobot() {
        for (Team team : teamManagement.getTeams()) {
            for (Robot robot : team.getRobots()) {
                System.out.println(robot.getId() + " " + robot.getName());
            }
        }
    }

    /**
     * Add an animal to the zoo.
     * @param animal    the animal to be added
     */
    public void addAnimal(Animal animal) {
        for (Animal a : animals) {
            if (a.id.equals(animal.id)) {
                return;
            }
        }
        animals.add(animal);
    }

    /**
     * Remove an animal from the zoo.
     * @param id    the id of the animal to be removed
     */
    public void removeAnimal(String id) {
        for (Animal a : animals) {
            if (a.id.equals(id)) {
                animals.remove(a);
                return;
            }
        }
    }

    /**
     * Get an animal from the zoo.
     * @param id    the id of the animal to be retrieved
     * @return      the animal with the given id
     */
    public Animal getAnimal(String id) {
        for (Animal a : animals) {
            if (a.id.equals(id)) {
                return a;
            }
        }
        return null;
    }

    /**
     * Get the total number of animals in the zoo.
     * @return      the total number of animals in the zoo
     */
    public long totalAnimals() {
        return animals.size();
    }

    /**
     * Get all animals in the zoo.
     * @return      a string representation of all animals in the zoo
     */
    public String splitAnimalByCage() {
        ArrayList<String> cages = new ArrayList<>();
        for (Animal a : animals) {
            if (!cages.contains(a.cage)) {
                cages.add(a.cage);
            }
        }
        String result = "";
        for (String cage : cages) {
            result += cage + ": ";
            for (Animal a : animals) {
                if (a.cage.equals(cage)) {
                    result += a.id + " ";
                }
            }
            result += "\n";
        }
        return result;
    }

    /**
     * Get the number of animals that can swim.
     * @return      the number of animals that can swim
     */
    public long getSwimmingAnimals() {
        long counter = 0;
        for (Animal a : animals) {
            if (a.canSwim()) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Get the number of animals that can walk.
     * @return      the number of animals that can walk
     */
    public long getWalkingAnimals() {
        long counter = 0;
        for (Animal a : animals) {
            if (a.canWalk()) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Get the number of animals that can walk and swim.
     * @return      the number of animals that can walk and swim
     */
    public long getWalkingSwimmingAnimals() {
        long counter = 0;
        for (Animal a : animals) {
            if (a.canWalk() && a.canSwim()) {
                counter++;
            }
        }
        return counter;
    }
}