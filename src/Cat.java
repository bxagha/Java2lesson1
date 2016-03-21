/**
 * Created by Сергей on 20.03.2016.
 */
public class Cat extends Animals {
    private static int count = 0;

    public Cat() {
        super();
        count++;
        name = name + "_" + count;
    }
}
