import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Сергей on 20.03.2016.
 */
public class Zoo {
    public static void main(String[] args) {
        String animals[] = new String [5];
        animals[0] = "Giraffe";
        animals[1] = "Cat";
        animals[2] = "Dog";
        animals[3] = "Snake";
        animals[4] = "Elephant";

        String typePet = animals[Animals.rand.nextInt(5)];
        ArrayList<Cell> cells = new ArrayList<Cell>();
        cells.add(new Cell());
        Giraffe g1 = new Giraffe();
        Pet<Cat> g2 = new Pet<>(new Cat());
        Pet<Cat> g3 = new Pet<>(new Cat());
        System.out.println(g1.getClass().getName() + " " + g1.name + " age " + g1.getAge());
        System.out.println(g2.getPet().getClass().getName() + " " + g2.getPet().getName() + " age " + g2.getPet().getAge());
        System.out.println(g3.getPet().getClass().getName() + " " + g3.getPet().getName() + " age " + g3.getPet().getAge());
        cells.get(0).addPet(new Pet<>(new Cat()));
        cells.get(0).showCell();
    }
}
