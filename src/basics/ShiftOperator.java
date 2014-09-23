package basics;

public class ShiftOperator {
    public static void main(String[] args) {
        Integer i = -32;
        Integer j, k = 0;
        
        System.out.println(Integer.toBinaryString(i));
        j = i >> 7;
        System.out.println(Integer.toBinaryString(j));
        k = i >>> 7;
        System.out.println(Integer.toBinaryString(k));
         
    }
}
