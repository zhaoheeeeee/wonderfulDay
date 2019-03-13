package three_custom_type;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Students,String> map=new HashMap<>();
        map.put(new Students("name1",1),"济南");
        map.put(new Students("name2",2),"杭州");

        Set<Students> students = map.keySet();
        for (Students stu:students){
            String value=map.get(stu);
            System.out.println(stu.toString()+"的户籍是："+value);
        }
    }
}
