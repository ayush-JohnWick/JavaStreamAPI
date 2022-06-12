package Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,20,25,30,35,40,45,50);
        List<Integer> evenNumberList= new ArrayList<>();

        //without using streams
       /* for(int n : list){
            if(n%2==0)
                evenNumberList.add(n);
        }

        System.out.println(evenNumberList);*/
        //using stream filters
       evenNumberList =list.stream().filter(n-> n%2==0).collect(Collectors.toList());
       System.out.println(evenNumberList);

       //using for each best way
       list.stream().filter(n-> n%2==0).forEach(System.out::println);

       list.stream().filter(n-> n%2==0).forEach(n-> System.out.println(n));



    }
}
