import java.util.Random;

/**
 * Created by Сергей on 20.03.2016.
 */
public class Animals {
    protected String name;
    protected int age;
//    private static int count=0;
    public static Random rand = new Random();

    public Animals() {
//        count++;
        name = this.getClass().getName();
        age = rand.nextInt(10);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void feed(){
        
    }
}
