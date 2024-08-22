package stream;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.*;

public class javaStream {
    public static void main(String[] args) {
//        primitiveStreamExample();
//        streamFromArray();
//        streamFromCollection();
//        streamUsingRegex();
//        getCollectionUsingStreamCollection();
//        getArrayUsingStreamToArray();
//        forEachStreamExample();
//        minMaxStream();
//        intSummaryStatisticsExample();

//     List<Integer> number = Arrays.asList(1,2,3,4,5,6);
//
//     IntSummaryStatistics statistics = number.stream().mapToInt((x) -> x).summaryStatistics();
//        System.out.println("Sum: " + statistics.getSum());
//        System.out.println("Average: " + statistics.getAverage());

//        List<String> strings = Arrays.asList("Stream", "API", "Java", "Code", "Practice");
//        List<String> list = strings.stream()
//                .filter(s -> s.length() > 3)
//                .collect(Collectors.toList());
//        list.forEach(System.out::println);
//
//        List<Integer> numbers = Arrays.asList(5,4,8,10,11);
//        List<Integer> num = numbers.stream()
//                .map(n -> n * 2)
//                .collect(Collectors.toList());
//
//        num.forEach(System.out::println);

//        List<String> str = Arrays.asList("Anna", "Bob", "Alexandra", "Zoe");
//
//        List<String> list = str.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
//
//        list.forEach(System.out::println);

        List<String> names = Arrays.asList("Anna", "Bob", "Alexandra", "Zoe");
        List<String> nm =  names.stream().map(String::toString).collect(Collectors.toList());

        System.out.println(nm);

//        List<Integer> nb = Arrays.asList(3, 7, 2, 5, 6, 8, 4);
//        List<Integer> numbers = nb.stream().filter(n -> n > 5).sorted().collect(Collectors.toList());
//
//        numbers.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(2, 3, 4, 2, 3, 5, 4);
        List<Integer> nb = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        nb.forEach(System.out::println);

        List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript");
        List<String> str =  strings.stream().map(String::toString).collect(Collectors.toList());

        var books = strings.stream()
                .map(s -> new Book(s, 100_000.0))
                .toList();

        System.out.println(books);



        // data in DB
        var cityList= Arrays.asList(
                new City(1, "Ha Noi", "HN"),
                new City(2, "TP Ho Chi Minh", "HCM"),
                new City(3, "Hai Phong", "HP"),
                new City(4, "Hung Yen", "HY"),
                new City(5, "Can Tho", "CT"),
                new City(6, "Da Nang", "DN"),
                new City(7, "Bac Ninh", "BN")
        );

        // data for comboboxes
        var citiesForCombobox = cityList.stream()
                .map(item -> item.getName())
                .toList();


        var sortedList = cityList.stream()
                .sorted(Comparator.comparing(item -> item.getName()))
                .toList();

        System.out.println("combobox: " + citiesForCombobox);
        System.out.println("sorted: " + sortedList);
    }

    private static void intSummaryStatisticsExample() {
        List<Integer> primes = Arrays.asList(2,3,4,5,6,10);

        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Count: " + stats.getCount());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
    }

    private static void minMaxStream() {
        List<Progamming> students = Arrays.asList(
                new Progamming("Java", 5),
                new Progamming("PHP", 2),
                new Progamming("C#", 1)
        );

        Progamming maxByExp = students.stream()
                .max(Comparator.comparing(Progamming::getExp))
                .get();
        Progamming minByExp = students.stream()
                .min(Comparator.comparing(Progamming::getExp))
                .get();

        System.out.println("Max: " + maxByExp);
        System.out.println("Min: " + minByExp);
    }

    private static void forEachStreamExample() {
        Stream.iterate(1, count -> count + 1)
                .filter(number -> number % 3 == 0)
                .limit(6)
                .forEach(System.out::println);
    }

    private static void getArrayUsingStreamToArray() {
        Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        String[] language =  stream.toArray(String[]::new);
        System.out.println(Arrays.toString(language));
    }

    private static void getCollectionUsingStreamCollection() {
        Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript");
        List<String> language = stream.collect(Collectors.toList());
        System.out.println(language);
    }

    private static void streamUsingRegex() {
        // Generate Streams from APIs like Regex
        String str = "Welcome, to, regex";
        Pattern.compile(",").splitAsStream(str).forEach(System.out::print);
    }

    private static void streamFromCollection() {
        // Generate Streams from Collections
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");

        items.stream().forEach(item -> System.out.println(item));
    }

    private static void streamFromArray() {
        String[] languages = {"Java", "C#", "C++", "PHP", "Javascript"};

        // Get stream using the Arrays.stream
        Stream<String> testStream1 = Arrays.stream(languages);
        testStream1.forEach(x -> System.out.println(x));

        // Get stream using the Stream.of
        Stream<String> testStream2 = Stream.of(languages);
        testStream2.forEach(x -> System.out.println(x));
    }

    private static void primitiveStreamExample() {
        IntStream.range(1, 4).forEach(System.out::println);
        IntStream.of(5,6,7).forEach(System.out::println);
        DoubleStream.of(1,2,3).forEach(System.out::println);
        LongStream.range(1,4).forEach(System.out::println);
    }
}
