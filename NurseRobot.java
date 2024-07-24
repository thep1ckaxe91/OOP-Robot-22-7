import java.util.ArrayList;
import java.util.List;

public class NurseRobot extends Robot implements MedicalRobot {
    private List<Animal> responsibleAnimals = new ArrayList<>();

    public NurseRobot(String id, String name) {
        super(id, name);
    }

    public NurseRobot(String id, String name, List<Animal> responsibleAnimals) {
        super(id, name);
        this.responsibleAnimals = (ArrayList<Animal>) responsibleAnimals;
    }

    @Override
    public void doWork() {
        System.out.println(String.format("Nurse %s cleaning report:\n", this.getId()));
        for (Animal animal : responsibleAnimals) {
            System.out.println(this.dailyCheck(animal));
        }
    }

    @Override
    public String dailyCheck(Animal animal) {
        double chance = Math.random() * 100;
        String response;
        if (chance < 5) {
            response = animal.getId() + " Clean status: " + MedicalRobot.CRITICAL_STATUS;
        } else if (chance < 50) {
            response = animal.getId() + " Clean status: " + MedicalRobot.BAD_STATUS;
        } else {
            response = animal.getId() + " Clean status: " + MedicalRobot.GOOD_STATUS;
        }
        return response;
    }
}
