import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Сергей on 20.03.2016.
 */
public class Animals {
    protected String name;
    protected int age;
    private static int count = 0;
    protected int id;
    protected ArrayList<Zoo.Food> eatable;

    public static Random rand = new Random();

    public Animals() {
        count++;
        id = count;
        name = this.getClass().getName();
        age = rand.nextInt(10);
        eatable = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean edibleFood(Zoo.Food _food) {
        for (Zoo.Food _f : eatable) {
            if (_food.equals(_f)) return true;
        }
        return false;
    }

    public void feed(Pet<?> _pet, Zoo.Food _food) {
        if (edibleFood(_food)) {
            System.out.println("Животное " + _pet.getPet().name + " поело " + _food);
        }else {
            System.out.println("Животное " + _pet.getPet().name + " не ест " + _food);
        }
    }
}
