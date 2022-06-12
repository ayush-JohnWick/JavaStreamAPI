package Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Filter1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("John", "Jenice", "Marry", "JohnWick", "Keeanu");

        List<String> longNames= new ArrayList<>();

        longNames=list.stream().filter(str-> str.length()>5 && str.length()<10).collect(Collectors.toList());

        System.out.println(longNames);

        list.stream().filter(str-> str.length()>5 && str.length()<10).forEach(System.out::println);

        List<String> words= Arrays.asList("cup","mug", null, "theatre", null, "book", "sky", null);

        //notNull objects
        words.stream().filter(Objects::nonNull).forEach(System.out::println);
    }
}
