/**
 * Created by Сергей on 20.03.2016.
 */
public class Pet<T extends Animals> {
    private T pet;

    public Pet(T _pet) {
        pet = _pet;
    }

    public T getPet(){
        return pet;
    }
}
