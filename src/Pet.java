/**
 * Created by Сергей on 20.03.2016.
 */
public class Pet<T extends Animals> {
    private T pet;

    public Pet(T _pet) {
        pet = _pet;
    }

    public String getName(){
        return pet.name;
    }

    public String getType(){
        return pet.type;
    }

}
