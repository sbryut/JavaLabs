import java.util.ArrayList;

public class AnimalClassification {
    public static void main(String[] args) {
        Testing.test_1();
        Testing.test_2();
        Testing.test_3();
    }

    public static void segregate(
            ArrayList<? extends Chordates> srcCollection,
            ArrayList<? super CommonHedgehog> collection1,
            ArrayList<? super Manul> collection2,
            ArrayList<? super Lynx> collection3) {

        for (Chordates animal : srcCollection) {
            if (animal instanceof CommonHedgehog) {
                collection1.add((CommonHedgehog) animal);
            } else if (animal instanceof Manul) {
                collection2.add((Manul) animal);
            } else if (animal instanceof Lynx) {
                collection3.add((Lynx) animal);
            }
        }

        System.out.print("Все животные: ");
        printAnimals(srcCollection);
        System.out.print("Ежи: ");
        printAnimals(collection1);
        System.out.print("Манулы: ");
        printAnimals(collection2);
        System.out.print("Рыси: ");
        printAnimals(collection3);
        System.out.println();
    }

    public static void printAnimals(ArrayList<?> collection) {
        int size = collection.size();
        for (int i = 0; i < size; i++) {
            System.out.print(collection.get(i));
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
