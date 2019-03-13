package five_execise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
/*
* 练习题目：
* 要求：计算一个字符串中每个字符出现次数
* 用到方法：
*   1.字符串：.length()
*            .charAt()
*   2.Map集合：.containsKey()
*              集合中是否存在过这个键**/
public class Mapexecise {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        String line=new Scanner(System.in).nextLine();
        findChar(line);


    }

    private static void findChar(String line) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for (int i=0;i<line.length();i++){
            char c=line.charAt(i);
            if (!map.containsKey(c)){
                map.put(c,1);
            }else {
                Integer count = map.get(c);
                map.put(c, ++count);
            }
        }
        System.out.println(map);
    }
}
