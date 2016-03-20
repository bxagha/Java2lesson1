/**
 * Created by Сергей on 20.03.2016.
 */
public class Elephant extends Animals {
    public Elephant(String _name, int _age) {
        name = _name;
        age = _age;
        type = this.getClass().getName();

    }
}
