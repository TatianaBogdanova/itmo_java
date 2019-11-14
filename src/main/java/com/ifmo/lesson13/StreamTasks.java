package com.ifmo.lesson13;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.ifmo.lesson13.StreamTasks.Country.randomCountry;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class StreamTasks {

    public enum Country{
        RUSSIA("RF"),
        USA("USA"),
        EUROPE("FRANCHE");
        private String country;

        public String getCountry() {
            return country;
        }

        Country(String country) {
            this.country = country;
        }

        private static final List<Country> VALUES =
                Collections.unmodifiableList(Arrays.asList(values()));
        private static final int SIZE = VALUES.size();
        private static final Random RANDOM = new Random();

        public static Country randomCountry()  {
            return VALUES.get(RANDOM.nextInt(SIZE));
        }
    }

    private static class Person {
        private final String name;
        private final int age;
        private final String country;

        public Person(String name, int age, String country) {
            this.name = name;
            this.age = age;
            this.country = country;
        }
    }

    public static void main(String[] args) {
        Stream<Person> people = generatePeople(100);

        List<String> countries = countriesSortedByTheirPopulationDescending(people);
        String countryThatHasMostKids = countryThatHasMostKids(people);
        Map<String, Long> populationByCountry = populationByCountry(people);

        System.out.println(countries);
        System.out.println(countryThatHasMostKids);
        System.out.println(populationByCountry);

        List<String> words = Arrays.asList("the", "hello", "approximation", "greetings", "java", "war");

        Map<Integer, Set<String>> wordsByLength = groupWordsByLength(words);
        Double averageWordLength = averageWordLength(words);
        Set<String> longestWords = longestWords(words);

        System.out.println(wordsByLength);
        System.out.println(averageWordLength);
        System.out.println(longestWords);
    }

    // Метод возвращает страны в порядке убывания их населения.
    public static List<String> countriesSortedByTheirPopulationDescending(Stream<Person> people) {
        // TODO implement
        return people
                .collect(groupingBy(p -> p.country, counting()))
                .entrySet().parallelStream()
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .map(s -> s.getKey())
                .collect(toList());
    }

    // Метод находит страну (или одну из стран), в которых больше всего человек в возрасте
    // до 18 лет.
    public static String countryThatHasMostKids(Stream<Person> people) {
        // TODO implement.
        return people.filter(p -> p.age < 18)
                .collect(groupingBy(p -> p.country, counting()))
                .entrySet().parallelStream()
                .max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey();

    }

    // Метод возвращает карту стран их населения.
    public static Map<String, Long> populationByCountry(Stream<Person> people) {
        // TODO implement.
        return people.collect(groupingBy(p -> p.country, counting()));
    }

    private static List<String> NAME = Arrays.asList("Ivan", "Igor", "Masha", "Valya", "Kolya", "Anton");
    // Метод генерирует случайных людей в ограниченном наборе стран.
    // number - число желаемых людей.
    public static Stream<Person> generatePeople(int number) {
        // TODO implement.

        return Stream.generate(() -> new Person( NAME.get(new Random().nextInt(NAME.size())),25,randomCountry().toString())).limit(number);
    }

    // Метод возвращает карту сгруппированных слов по их длине. Например, для
    // трёхбуквенных слов будет:
    // 3 -> "the", "map", "got", "war"...
    public static Map<Integer, Set<String>> groupWordsByLength(List<String> words) {
        // TODO implement.
        return words.stream().collect(groupingBy(String::length, mapping(String::toString, toSet())));
    }

    // Метод находит среднюю длину слов в списке.
    public static Double averageWordLength(List<String> words) {
        // TODO implement.
        Double collect = words.stream().collect(groupingBy(String::length, counting())).entrySet()
                .stream()
                .map(p -> p.getValue() * p.getKey())
                .collect(averagingInt(p -> p.intValue()));
        return collect;
    }

    // Метод находит самое длинное слово или слова, если таких несколько.
    public static Set<String> longestWords(List<String> words) {
        // TODO implement.
        return words.stream().collect(groupingBy(String::length, mapping(String::toString, toSet()))).entrySet().stream()
                .max((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .get().getValue();
    }


}
