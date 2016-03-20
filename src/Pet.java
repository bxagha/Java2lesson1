/**
 * Created by Сергей on 20.03.2016.
 */
public class Pet<T extends Animals> {
    private T pet;
    private String type;

    public Pet(T _pet) {
        pet = _pet;
//        type = T.;
    }

    public String getName(){
        return pet.name;
    }

    public String getType(){
        return pet.type;
    }

}
