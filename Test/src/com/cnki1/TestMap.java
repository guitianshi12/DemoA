package com.cnki1;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
public class TestMap {
    @Test
    public void testGetNum() {
        String s = "asdfdddasseet";
        getNum(s);
    }

    public static void getNum(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] c = s.toCharArray();
        int i = 1;
        char temp;
        for (char a : c) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, i);
            }
        }
        Iterator<Character> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            temp = iterator.next();
            System.out.println(temp + ":" + map.get(temp));

        }
    }
}
