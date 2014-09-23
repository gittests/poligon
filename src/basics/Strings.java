package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;

import javax.naming.BinaryRefAddr;

class A {
    
}

class B extends A {
    
}


public class Strings {
    
    public static void fun(String a) {
        a = "ff";
    }
    
    public static void main(String[] args) throws CloneNotSupportedException {
        String test = "ABC";
//        System.out.println("charAt(0):" + test.charAt(0) + " codePointAt(0):" + test.codePointAt(0));
//        System.out.println("charAt(1):" + test.charAt(1) + " codePointAt(1):" + test.codePointAt(1));
        String x = "fefe";
        System.out.println(x);
        fun(x);
        System.out.println(x);
        
        B a = new B();
        if (a instanceof A) {
            System.out.println("www");
        }
        TreeSet<String> ss = new TreeSet<String>();
        ss.add("nnn");
        ss.add("bbb");
        ss.add("ddd");
        
        for (String s : ss) {
            System.out.println(s);
        }
    }

}
