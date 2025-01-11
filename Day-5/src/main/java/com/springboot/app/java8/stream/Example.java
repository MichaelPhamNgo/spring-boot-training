package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Bob", "123", 10),
                new User("Alice", "234", 12),
                new User("John", "345", 14),
                new User("Bob", "123", 10),
                new User("Xerox", "567", 100)
        );
//        users.forEach(System.out::println);

//        users.stream().filter(user -> user.getAge() == 12).forEach(System.out::println);

        // map
//        List<Integer> nums = users.stream().map(user -> user.getAge() * 365).collect(Collectors.toList());
//        // filter
//        users.stream().filter(user -> user.getAge() > 18).forEach(System.out::println);
//        // sorted
//        users.stream().sorted((u1, u2) -> u1.getAge() - u2.getAge()).forEach(System.out::println);
//        // distinct
//        users.stream().distinct().forEach(System.out::println);
//
//        // findAny
        // Optional it can contain either an actual object or it can contain a null
        Optional<User> possibleUser = users.stream().filter(user -> user.getUsername().startsWith("X")).findAny();
        if(possibleUser.isPresent()) {
            User user = possibleUser.get();
        }
//        possibleUser.ifPresent(System.out::println);
//        // collect
//        List<User> filteredUsers = users.stream().filter(user -> user.getAge() < 20).collect(Collectors.toList());
//        Map<String, User> map = users.stream().distinct().collect(Collectors.toMap(User::getUsername, Function.identity()));
//        // toArray
//        User[] userArray = users.stream().distinct().toArray(User[]::new);
//
//        // intstream
//        users.stream().mapToInt(User::getAge).average().ifPresent(System.out::println);
        System.out.println(IntStream.of(1, 2, 3, 4, 5).boxed().map(String::valueOf).reduce("", (resultSoFar, curr) -> resultSoFar + curr));
//        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
//        String resultSoFar = "";
//        for(String curr: strings) {
//            resultSoFar += curr;
//        }

    }
}
