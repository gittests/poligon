package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tes m = new Tes();
        System.out.println(m.ccc);
        
        /*        
        
        List ll = new ArrayList<Integer>();
        ll.add(2);
        ArrayList ss = new ArrayList<Integer>();
        Collections.sort(ss);
        
        StringBuilder sb = new StringBuilder();
        sb.append("t");
        sb.append("e");
        sb.append("s");        
        sb.append("t");
        String s = sb.toString();
        if (s.matches("^tt+[a-z]+$")) {
            System.out.println(s);
        }
        Tes a = new Tes();
        Tes b = new Tes();
        
a.xx(3.3);
a.xx(2);
        a.x = 1;
        b.x = 2;
        System.out.println(a.x + " " + b.x);
        test(a, b);
        System.out.println(a.x + " " + b.x);
                
*/      
        
//        fibo(1);
//        fibo(2);
//        fibo(3);
//        fibo(4);
//        fibo(5);
//        fibo(6);
//        fibo(7);

        
    }

    public static void test(Tes a, Tes b) {
        a.x = 100;
        b.x = 200;
        Tes tmp=a;
        a=b;
        b=tmp;
    }
        
        
    public static void fibo(Integer max) {
        Integer result = 1;
        
        if (max.equals(0)) {
            result = 0;
        } else if (max.equals(1)) {
            result = 1;
        } else {
            Integer previousResult = 0, tmp;
            for (int i=1; i<max; i++) {
                tmp = result;
                result = result + previousResult;
                previousResult = tmp;
            }
        }
        
        
        
        System.out.println(result);
    }
}

class Moo {
    protected int ccc;
    Moo() {
        ccc = 443;
        System.out.println("Nadklasa");
    }
}

interface sss {
    void xx(Integer x);
}

class Tes extends Moo implements sss{
    public Tes() {
        this(3);
        System.out.println("Tutaj");        
    }
    
    public Tes(Integer s) {        
        System.out.println("VVV");        
    }
    
    public void xx(Integer x){
        System.out.println("fff");
    }
    
    public void xx(Double x){
        System.out.println("ddd");
    }

    public Integer x;
    
}



class Single{
    private static Single single;
    private Single() {
    }
    
    public static Single singleton() {
        if (single == null) {
            single = new Single();
        }
        return single;
    }
    
}