package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Map {

    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bus", "car", "bicycle", "flight", "train");
        List<String> vehicleListUpper= new ArrayList<>();

        //without using streams before java 8
        for(String name : vehicles){
            vehicleListUpper.add(name.toUpperCase());
        }

        System.out.println(vehicleListUpper);

        //using Streams Java8 map using foreach best way
        vehicles.stream().map(String::toUpperCase).forEach(System.out::println);
        //by storing into other collections
        vehicleListUpper=vehicles.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(vehicleListUpper);
    }
}

