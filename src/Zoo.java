/**
 * Created by Сергей on 20.03.2016.
 */
public class Zoo {
    public static void main(String[] args) {
        Giraffe g1 = new Giraffe("g", 2);
        Pet<Cat> g2 = new Pet<>(new Cat("Cat1", 3));
        System.out.println(g1.getClass().getName() + " " + g1.name);
        System.out.println(g2.getType() + " " + g2.getName());
    }
}
