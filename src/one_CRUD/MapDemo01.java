package one_CRUD;

import java.util.HashMap;
import java.util.Map;
/*
* 该类用于集合内容的
* 增:put(key,value)
* 删:remove(key)
* 改:put(key,value)覆盖之前相同key的value
* 查:get(key)
* */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建map对象
        HashMap<String,String> map=new HashMap<String,String>();
        //方法1：put(key,value)将指定的键和值添加到Map集合中
        map.put("k1","v1");
        map.put("k2","v2");
        map.put("k3","v3");
        //方法2：remove(键名) 输出结果： v1
        //System.out.println(map.remove("k1"));
        //输出结果：{k2=v2,k3=v3}
        //System.out.println(map);
        System.out.println(map.get("k2"));

    }
}
