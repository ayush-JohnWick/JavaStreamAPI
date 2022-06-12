package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2);
        List<Integer> list2= Arrays.asList(3,4);
        List<Integer> list3= Arrays.asList(5,6);

        //flatMap
        List<List<Integer>> finalList= Arrays.asList(list1,list2,list3);
        List<Integer> targetList= new ArrayList<>();

        //Storing each collection into stream again using flatMap
        targetList=finalList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(targetList);

        //using FlatMap and ForEach
        finalList.stream().flatMap(Collection::stream).forEach(System.out::println);

        //adding 10 to each element usingFlatMap and then use Map
        finalList.stream().flatMap(x-> x.stream().map(n-> n+10)).forEach(System.out::println);


    }
}
