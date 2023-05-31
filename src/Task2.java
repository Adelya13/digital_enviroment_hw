import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Task2 {
    private static final int NAME_LENGTH = 5;
    private static char[] alphabet = "абвгдежзийклмнопрстуфхцчщэюя".toCharArray();
    private static char[] name = "аделя".toCharArray();
    private static int length = alphabet.length;
    private static Random randomInt = new Random();

    public static void main(String[] args) {
        ArrayList<String> parents = new ArrayList();
        ArrayList<String> children = new ArrayList();
        for (int i = 0; i < 100; i++) {
            parents.add(generateName(NAME_LENGTH));
            System.out.println(parents.get(i));
        }
        System.out.println("\n--------------");
        boolean flag = true;
        while (flag) {

            ArrayList<String> result = doIt(parents);
            if (result.size() == 1) flag = false;
        }
    }

    public static ArrayList<String> doIt(ArrayList<String> names) {
        ArrayList<String> generation = crossParents(names);
        return chooseBestChildren(generation);
    }

    public static ArrayList<String> chooseBestChildren(ArrayList<String> children) {
        HashMap<String, Integer> namesWithValues = new HashMap<>();

        for (int i = 0; i < children.size(); i++) {
            String child = children.get(i);
            int equalsCount = 0;
            if (child.charAt(0) == 'а') {
                equalsCount++;
            }
            if (child.charAt(1) == 'д') {
                equalsCount++;
            }
            if (child.charAt(2) == 'е') {
                equalsCount++;
            }
            if (child.charAt(3) == 'л') {
                equalsCount++;
            }
            if (child.charAt(4) == 'я') {
                equalsCount++;
            }
            namesWithValues.put(child, equalsCount);
        }

        namesWithValues =
                namesWithValues.entrySet()
                        .stream()
                        .sorted(Collections.reverseOrder(comparingByValue()))
                        .collect(toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

        List<Integer> cnt = new ArrayList<>(namesWithValues.values());
        ArrayList<String> names = new ArrayList<>(namesWithValues.keySet());
        ArrayList<String> names1 = new ArrayList<>(namesWithValues.keySet());

        namesWithValues.entrySet().forEach(System.out::println);
        names1.forEach(System.out::println);

        if (names.get(0).length() == 5) return new ArrayList<>(Collections.singleton(names.get(0)));

        for (int i = 0; i < names1.size() / 2; i++) {
            names.remove(names1.get(i));
            System.out.println(names1.get(i));
        }
        return names;
    }

    public static ArrayList<String> crossParents(ArrayList<String> parents) {
        ArrayList<String> generation = new ArrayList<>();
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < parents.size() - 1; i++) {
            s.append(parents.get(i).toCharArray()[0]);
            s.append(parents.get(i).toCharArray()[1]);
            s.append(parents.get(i).toCharArray()[2]);
            s.append(parents.get(i + 1).toCharArray()[3]);
            s.append(parents.get(i + 1).toCharArray()[4]);
            generation.add(s.toString());

            s.append(parents.get(i + 1).toCharArray()[0]);
            s.append(parents.get(i + 1).toCharArray()[1]);
            s.append(parents.get(i + 1).toCharArray()[2]);
            s.append(parents.get(i).toCharArray()[3]);
            s.append(parents.get(i).toCharArray()[4]);

            generation.add(s.toString());

        }

        return generation;
    }

    public static String addMutation(String name) {
        char[] newName = name.toCharArray();
        int charIndex = randomInt.nextInt(name.length());
        newName[charIndex] = getRandomChar();
        return Arrays.toString(newName);
    }

    public static char getRandomChar() {
        return alphabet[randomInt.nextInt(length)];
    }

    private static String generateName(int length) {
        int i = 0;
        StringBuilder name = new StringBuilder();
        while (i < length) {
            name.append(getRandomChar());
            i++;
        }
        return name.toString();
    }
}