/**
 * Created by Сергей on 20.03.2016.
 */
public class Giraffe extends Animals {
    private static int count = 0;

    public Giraffe() {
        super();
        count++;
        name = name + "_" + count;
    }
}
