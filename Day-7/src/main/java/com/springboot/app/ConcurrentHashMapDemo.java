import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ConcurrentHashMap<Integer, String> threadSafeMap = new ConcurrentHashMap<>();

        Map<Integer, String> map = new HashMap();
        new Thread(()->{
            for(int i=0;i<1000;i++)
                map.put(i, "word");
        }).start();

        new Thread(()->{
            for(int i=1000;i<2000;i++)
                map.put(i, "word");
        }).start();
        System.out.println(map);

    }

}
