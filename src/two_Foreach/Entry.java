package two_Foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
* +-该类用于键值对方式遍历集合
*   +-过程：
*    |-1.用Set集合接收每一个键值对对象
*    |-2.遍历每一个对象
*    |-3.获取键和值
*   +-用到的方法：
*    |-1.entrySet()
*    |-2.getKey()
*    |-3.getValue()
* */
public class Entry {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"v1");
        map.put(2,"v2");
        map.put(3,"v3");
        //entrySet()方法 获取集合中所有的键值对（Entry）对象，用Set集合形式返回
        Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet){
            //getKey()获取entry对象的键
            Integer key=entry.getKey();
            //getValue获取entry对象的值
            String value=entry.getValue();
            System.out.println(key+"的值是"+value);
        }
    }
}
