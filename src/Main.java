import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<Integer> nums = List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7);
        for (Integer num : nums){
            if(num % 2 !=0){
                System.out.println(num);
            }
        }
        System.out.println("Задание 2");
        Set<Integer> integers = new TreeSet<>(nums);
        for (Integer num : integers){
            if(num % 2 ==0){
                System.out.println(num);
            }
        }
        System.out.println("Задание 3");
        List<String> strings = List.of("один", "два","два", "три", "три", "три");
        Set<String> StringHashSet = new HashSet<>(strings);
        System.out.println(StringHashSet);
        System.out.println("Задание 4");
        Map<String, Integer> result = new HashMap<>();
        for (String str: strings){
            Integer value = result.get(str);
            if(value != null){
                result.put(str, value + 1);
            } else {
                result.put(str, 1);
            }
        }
        System.out.println(result);
    }
}