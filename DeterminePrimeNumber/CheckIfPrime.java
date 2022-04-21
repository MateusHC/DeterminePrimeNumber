import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

public class CheckIfPrime {
    public static ArrayList<Integer> getPrimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int number : numbers) {
            if (checkBoolean(number)) {
                arrayList.add(number);
            }
        }
        return arrayList;
    }

    public static ArrayList<Integer> getComposites(ArrayList<Integer> numbers) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int number : numbers) {
            if (!checkBoolean(number)) {
                arrayList.add(number);
            }
        }
        return arrayList;
    }

    public static Map<NumberTypes, ArrayList<Integer>> getBoth(ArrayList<Integer> numbers) {
        EnumMap<NumberTypes, ArrayList<Integer>> numberTypes = new EnumMap(NumberTypes.class);
        numberTypes.put(NumberTypes.PRIME_NUMBER, new ArrayList<>());
        numberTypes.put(NumberTypes.COMPOSITE_NUMBER, new ArrayList<>());
        for (int number : numbers) {
            if (checkBoolean(number)) {
                numberTypes.get(NumberTypes.PRIME_NUMBER).add(number);
            } else {
                numberTypes.get(NumberTypes.COMPOSITE_NUMBER).add(number);
            }
        }
        return numberTypes;
    }

    public static boolean checkBoolean(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int checkInt(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return -1;
            }
        }
        return number;
    }
}
