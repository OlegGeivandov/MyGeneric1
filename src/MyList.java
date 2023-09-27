import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Сделать собственную коллекцию, в которой будет
помещаться до 3 однотипных Животных,
которые при добавлении автоматически сортируются по весу
 */

public class MyList<E extends Animal> { // Так работает сортировка
//public class MyList<Animal> { // Так не работает сортировка

    private List<Animal> animals;

    public MyList() {
        this.animals = new ArrayList<>();
    }

    public int getCount() {
        return animals.size();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void put(Animal an) {
        if (animals.size() < 3) {
            animals.add(an);
            System.out.println("добавили  " + an);
            Collections.sort(animals);
        }
        else System.out.println("коллекция заполнена, добавить не удалось:  " + an);
    }
}
