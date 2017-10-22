package com.cnki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/10/22 0022.
 */
public class TestRe {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[1-2]{0,1}[0-9]{1,2}\\.[0-2]{1,3}\\.[0-2]{1,3}\\.[0-2]{1,3}");
        String s = "300.1.1.1";
        Matcher m = p.matcher(s);
        System.out.println(m.matches());
    }
}
