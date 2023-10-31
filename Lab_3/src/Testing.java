import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void test_1() {

        System.out.println("Тест №1:");
        ArrayList<Mammals> animals = new ArrayList<>(List.of(
                new CommonHedgehog("ёж #1"), new CommonHedgehog("ёж #2"), new CommonHedgehog("ёж #3"),
                new Manul("манул #1"), new Manul("манул #2"), new Manul("манул #3"),
                new Lynx("рысь #1"), new Lynx("рысь #2"), new Lynx("рысь #3")
        ));

        ArrayList<Hedgehogs> hedgehogs = new ArrayList<>();
        ArrayList<Felines> manuls = new ArrayList<>();
        ArrayList<Predatory> lynxes = new ArrayList<>();

        AnimalClassification.segregate(animals, hedgehogs, manuls, lynxes);
    }

    public static void test_2() {

        System.out.println("Тест №2:");
        ArrayList<Predatory> animals = new ArrayList<>(List.of(
                new Manul("манул #1"), new Manul("манул #2"), new Manul("манул #3"),
                new Lynx("рысь #1"), new Lynx("рысь #2"), new Lynx("рысь #3"), new Lynx("рысь #4")
        ));

        ArrayList<Chordates> hedgehogs = new ArrayList<>();
        ArrayList<Manul> manuls = new ArrayList<>();
        ArrayList<Felines> lynxes = new ArrayList<>();

        AnimalClassification.segregate(animals, hedgehogs, manuls, lynxes);
    }

    public static void test_3() {

        System.out.println("Тест №3:");
        ArrayList<Hedgehogs> animals = new ArrayList<>(List.of(
                new CommonHedgehog("ёж #1"), new CommonHedgehog("ёж #2"),
                new CommonHedgehog("ёж #3"), new CommonHedgehog("ёж #4")
        ));

        ArrayList<Insectivores> hedgehogs = new ArrayList<>();
        ArrayList<Predatory> manuls = new ArrayList<>();
        ArrayList<Predatory> lynxes = new ArrayList<>();

        AnimalClassification.segregate(animals, hedgehogs, manuls, lynxes);
    }
}
