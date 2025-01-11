import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(37, "Luke"));
        users.add(new User(10, "Sam"));
        users.add(new User(19, "Alice"));
//        Collections.sort(users);
//        System.out.println(users);
        User.UserComparator userComparator = new User.UserComparator();
//        Collections.sort(users, userComparator);
        users.sort(userComparator);
        System.out.println(users);
    }
}
