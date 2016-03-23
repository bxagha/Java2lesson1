/**
 * Created by Сергей on 20.03.2016.
 */
public class Snake extends Animals {
    private static int count = 0;

    public Snake() {
        super();
        count++;
        name = name + "_" + count;
        eatable.add(Zoo.Food.mouse);
        eatable.add(Zoo.Food.water);
    }
}
