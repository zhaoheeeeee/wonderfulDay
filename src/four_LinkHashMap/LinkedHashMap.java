package four_LinkHashMap;

import java.util.Map;
import java.util.Set;

public class LinkedHashMap {
    public static void main(String[] args) {
        java.util.LinkedHashMap<Person, String> map = new java.util.LinkedHashMap<>();
        map.put(new Person("name1", 1), "济南");
        map.put(new Person("name2", 2), "杭州");

//        Set<Map.Entry<Person,String>> entrySet=map.entrySet();
//        for(Map.Entry<Person,String> entry:entrySet){
//            Person person=entry.getKey();
//            String value=entry.getValue();
//            System.out.println(person+"的户籍是："+value);
//        }
        Set<Person> keys = map.keySet();
        for (Person person : keys) {
            String value = map.get(person);
            System.out.println(person + "的户籍是：" + value);
        }
        /*
         * +-这里提一下Map的两种遍历方式：
         * +-1：键找值（未被注释的部分）
         *   |-将键封装到一个Set集合（原因：所有的键都是唯一的不可重复的）  keySet()方法
         *   |-遍历键 通过map.get(key)获取值
         * +-2：键值对（被注释的部分）
         *   |-将键和值（键值对 entry）封装到Set集合                   entrySet()方法
         *   |-遍历entry对象 通过entry.getKey() entry.getValue获取键和值
         * */
    }
}