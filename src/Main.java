import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
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
    static List<Integer> number = new ArrayList<>();

    public static List<Integer> number() {
        number.add(1);
        number.add(4);
        number.add(7);
        number.add(6);
        number.add(9);
        return number;
    }

    public static void main(String[] args) {
        int size = 10;
        int min = 55;
        int max = 123;

        List<Integer> randList = new Random().ints(size, min, max)
                .boxed().collect(Collectors.toList());
        System.out.println(randList);
        // 1 вираз;
        randList.stream().map(x -> x * x).reduce((x1, x2) -> x1 + x2).ifPresent(System.out::println);


        // 2 вираз
        Stream.of(1,2,3,6,5).filter(i -> i % 2==0).forEach(System.out::println);

       // 3 вираз
        List<String> myName = names ();
        System.out.println("Прізвища на J:");
        myName.stream().filter(n-> n.startsWith("J")).forEach((n) -> System.out.println(n));
// 4 вираз

        List<Integer>red1=number();
        System.out.println("Сума парних:");
        red1.stream().filter(k -> k % 2==0).reduce((k1, k2) -> k1 + k2).ifPresent(System.out::println);
        System.out.println("Сума непарних:");
        red1.stream().filter(k -> k % 2!=0).reduce((k1, k2) -> k1 + k2).ifPresent(System.out::println);



    }
}