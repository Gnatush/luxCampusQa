package Product;

import java.util.*;
import java.util.stream.Collectors;



public class Main {

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product(001, "Cola", 12.00, "drinks"),
                new Product(002, "Heineken", 24.10, "drinks"),
                new Product(003, "Tuborg", 20.15, "drinks"),
                new Product(004, "Obolon", 12.90, "drinks"),
                new Product(005, "Turkey", 154.90, "meat"),
                new Product(006, "BalticBread", 22.50, "bread"),
                new Product(010, "BalticBread", 28.50, "bread"),
                new Product(007, "Cola", 24.00, "drinks"));

        //sort products by price (lowest to highest)
        productList.stream().sorted(Comparator.comparing(Product::getPrice).thenComparing(Product::getPrice)).forEach(product -> System.out.println("UAH " + product.getPrice() + "-" + product.getName()));
        System.out.println();

        //sort products by name (a to z)
        productList.stream().sorted(Comparator.comparing(Product::getName).thenComparing(Product::getName)).forEach(product -> System.out.println(product.getName() + "-UAH " + product.getPrice()));
        System.out.println();

        //sort products by type (a to z)
        productList.stream().sorted(Comparator.comparing(Product::getType).thenComparing(Product::getType)).forEach(product -> System.out.println("Type: " + product.getType() + " " + product.getName()));
        System.out.println();

        //group products by type
        Map<String, Set<String>> map1 = productList.stream()
                .collect(Collectors.groupingBy(Product::getType, //group by type
                        Collectors.mapping(Product::getName, Collectors.toSet()))); //form a Set
        System.out.println("Products in group: " + map1);
        System.out.println();

        //counting products by type
        Map<String, Long> map2;
        map2 = productList.stream()
                .collect(Collectors.groupingBy(Product::getName, Collectors.counting()));

        System.out.println("Product counter by name: " + map2);

    }

}



