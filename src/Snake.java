/**
 * Created by Сергей on 20.03.2016.
 */
public class Snake extends Animals {
    public Snake(String _name, int _age) {
        name = _name;
        age = _age;
        type = this.getClass().getName();
    }
}
