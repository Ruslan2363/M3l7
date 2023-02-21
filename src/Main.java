import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.*;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    // ДЛя третього виразу (Створив тут лістом набір прізвищ)
    static List<String> names = new ArrayList<>();

    public static List names (){
        names.add("Federini");
        names.add("Jorjinho");
        names.add("Jordan");
        names.add("Pele");
        names.add("Aferist");
        return names;
    }

    // Закінчив його створення та добавив прізвища у список



    public static void main(String[] args) {
        // 1 вираз
        Optional<Integer>reduced= Stream.of(1, 2, 3, 6, 5, 4, 3, 5, 9, 88).map(x -> x * x).reduce((x1, x2) -> x1 + x2);
        reduced.ifPresent(System.out::println);
        // 2 вираз
        Stream.of(1,2,3,6,5).filter(i -> i % 2==0).forEach(System.out::println);

       // 3 вираз
        List<String> myName = names ();
        System.out.println("Прізвища на J:");
        myName.stream().filter(n-> n.startsWith("J")).forEach((n) -> System.out.println(n));
// 4 вираз

        Stream.of(1,2,4,5).filter(k -> k % 2==0).map(k -> k +k).forEach(System.out::println);
        Stream.of(1,2,4,5).filter(d -> d % 2!=0).map(d -> d +d).forEach(System.out::println);
    }
}