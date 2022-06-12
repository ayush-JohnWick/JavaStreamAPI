package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap1 {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("John", "David", "Scott");
        List<String> list1= Arrays.asList("JohnWick", "Marry", "Jenice");
        List<String> lis2= Arrays.asList("Tom", "Harry", "Peter");

        List<List<String>> FinalList= Arrays.asList(list, list,lis2);

        //before Java8 to print name of each player
        for(List<String> team: FinalList){
            for(String name : team)
                System.out.print(name +  " ");
        }
        //using Streams FlatMap and ForEach
        FinalList.stream().flatMap(Collection::stream).forEach(System.out::println);

        //using Streams FlatMap and Collect
        List<String> names= FinalList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(names);


    }
}
