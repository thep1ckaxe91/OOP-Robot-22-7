
import java.util.ArrayList;
import java.util.List;

public class DoctorRobot extends Robot implements HealthRobot {

    private List<Animal> responsibleAnimals = new ArrayList<>();

    public DoctorRobot(String id, String name) {
        super(id, name);
    }

    public DoctorRobot(String id, String name, List<Animal> responsibleAnimals) {
        super(id, name);
        this.responsibleAnimals = responsibleAnimals;
    }

    @Override
    public void doWork() {
        System.out.println(String.format("Doctor %s report:\n", this.getId()));
        for (Animal animal : responsibleAnimals) {
            System.out.println(this.dailyCheck(animal));
        }
    }

    @Override
    public String dailyCheck(Animal animal) {
        double chance = Math.random() * 100;
        String response;
        if (chance < 5) {
            response = animal.getId() + " Health status: " + HealthRobot.CRITICAL_STATUS;
        } else if (chance < 50) {
            response = animal.getId() + " Health status: " + HealthRobot.BAD_STATUS;
        } else {
            response = animal.getId() + " Health status: " + HealthRobot.GOOD_STATUS;
        }
        return response;
    }
}
