package homework;

import java.util.ArrayList;

//Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Zoo.
// У класі створити список, який записати 8 тварин через метод add(index, element). Вивести список у консоль.
public class Zoo {
    public ArrayList<String> animals = new ArrayList<>();

    public void abbAnimals() {
        animals.add(0, "Cat");
        animals.add(1, "Dog");
        animals.add(2, "Mouse");
        animals.add(3, "Lion");
        animals.add(4, "Lizard");
        animals.add(5, "Cow");
        animals.add(6, "Horse");
        animals.add(7, "Hare");

    }

    public void print() {
        abbAnimals();
        for (int i = animals.size() - 1; i >= 0; i--) {
            System.out.println(animals.get(i));
        }
    }
}