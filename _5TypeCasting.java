/**
 * _5TypeCasting
 */
public class _5TypeCasting {

    public static void main(String[] args) {
        
        // There are two types of the type casting:

        // 1. Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        // Example as Follow:
        int x = 10;
        float y = x;
        System.out.println(" "+x+" : "+y+" ");
        // Above type casting is done atumatically when you declare it to ather varibale,
        // Beacuse it is from small data type to large.

        
        // 2. Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int -> char -> short -> byte 
        // Example as Follow:
        double a = 12.66;
        int b = (int)a;
        System.out.println(" "+a+" : "+b+" ");
        // Above type casting is done by manually because it is done from large data type to small.
    }
}