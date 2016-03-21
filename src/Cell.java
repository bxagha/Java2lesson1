import java.util.ArrayList;

/**
 * Created by Сергей on 20.03.2016.
 */
public class Cell {
    private static int count = 0;
    private int number;

    ArrayList<Pet> pets = new ArrayList<>();
    private String typePet;

    public Cell() {
        count++;
        number = count;
    }

    public String getTypePet() {
        return typePet;
    }

    public void setTypePet(String typePet) {
        this.typePet = typePet;
    }

    public void showCell() {
        for (Pet _pet : pets) {
            System.out.println("cell " + number + " " + _pet.getPet().getClass().getName() + " " + _pet.getPet().getName() + " age " + _pet.getPet().getAge());
        }
    }

    public boolean addPet(Pet pet) {
        if (!(pets.size() > 0)) {
            this.setTypePet(pet.getPet().getClass().getName());
            return pets.add(pet);
        } else {
            if (this.getTypePet() == pet.getPet().getClass().getName()) {
                return pets.add(pet);
            } else {
                return false;
            }
        }
    }

}
