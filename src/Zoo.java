import java.util.ArrayList;

/**
 * Created by Сергей on 20.03.2016.
 */
public class Zoo {
    public static final int COUNT_ANIMALS = 50;
    public static Pet[] pets = new Pet[COUNT_ANIMALS];
    public enum Food{grass, water, mouse, bone, foliage}

    public static void main(String[] args) {

        ArrayList<Cell> cells = new ArrayList<Cell>(); //строим зоопарк из безразмерных клеток
        petIntoZoo(cells);//заселяем зоопарк животными
        cells.forEach(Cell::showCell);//выводим в консоль все клетки с животными
    }

    private static void petIntoZoo(ArrayList<Cell> cells) {
        for (int i = 0; i < pets.length; i++) { //добавляем животных
            pets[i] = createPet();
            if (addPetIntoCells(cells, pets[i])) continue;
            cells.add(new Cell(pets[i]));
        }
    }

    private static boolean addPetIntoCells(ArrayList<Cell> cells, Pet pet) {//попытка засунуть жЫвотное в клетку
        for (Cell _cell : cells) {
            if (!_cell.addPet(pet)) continue;
            return true;
        }
        return false;
    }

    public static Pet<?> createPet() {//создаем случайное жЫвотное
        switch (Animals.rand.nextInt(5)) {
            case 0:
                return new Pet<>(new Giraffe());
            case 1:
                return new Pet<>(new Cat());
            case 2:
                return new Pet<>(new Dog());
            case 3:
                return new Pet<>(new Snake());
            case 4:
                return new Pet<>(new Elephant());
        }
        return new Pet<>(new Cat());
    }
}
