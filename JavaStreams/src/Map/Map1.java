package Map;

import java.util.Arrays;
import java.util.List;

public class Map1 {

    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bus", "car", "bicycle", "flight", "train");

        //without using streams before java 8
        /*for(String name : vehicles){
            System.out.println(name.length());
        }*/

        //using streams
        vehicles.stream().map(String::length).forEach(System.out::println);

        List<Integer> list= Arrays.asList(2,3,4,5);

        list.stream().map(n-> n*3).forEach(System.out::println);

    }
}
