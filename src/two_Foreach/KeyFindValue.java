package two_Foreach;

import java.util.HashMap;
import java.util.Set;
/*
* 该类用于演示map集合中遍历键找值
* 方法 map.keySet(key)
* */
public class KeyFindValue {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"v1");
        map.put(2,"v2");
        map.put(3,"v3");
        //为啥要用set集合接收所有的键？
        //因为Map中所有的键是唯一的，所以返回一个Set集合存储所有的键
        Set<Integer> keys = map.keySet();
        for (Integer key:keys){
            String value=map.get(key);
            System.out.println(key+"的值为："+value);
        }
    }
}
