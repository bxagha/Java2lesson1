import java.util.ArrayList;

/**
 * Created by Сергей on 20.03.2016.
 */
public class Cell {
    private static int count = 0;
    private int number = 0;
    private String typePet = "";

    ArrayList<Pet> pets = new ArrayList<>();

    public Cell() {
        number = count;
        count++;
    }

    public Cell(Pet _pet) {
        number = count;
        count++;
        pets.add(_pet);
        typePet = _pet.getPet().getClass().getName();
    }

    public String getTypePet() {
        return typePet;
    }

    public void setTypePet(String typePet) {
        this.typePet = typePet;
    }

    public void showCell() {
        System.out.println("cell " + number + ", type " + typePet + ": ");
        for (Pet _pet : pets) {
            System.out.println("   pet-" + _pet.getPet().getId() + "   " + _pet.getPet().getName() + " age " + _pet.getPet().getAge());
        }
    }

    public boolean addPet(Pet pet) {
        if (typePet == "") {
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
