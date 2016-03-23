/**
 * Created by Сергей on 20.03.2016.
 */
public class Dog extends Animals {
    private static int count = 0;

    public Dog() {
        super();
        count++;
        name = name + "_" + count;
        eatable.add(Zoo.Food.water);
        eatable.add(Zoo.Food.bone);
    }
}
