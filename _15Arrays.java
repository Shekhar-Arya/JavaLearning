public class _15Arrays {
    public static void main(String[] args) {
        
        // Declaring array;
        String[] x;

        // Assing the value
        String[] greeting = {"Hello", "Hi", "Hola"};

        // We can create array of any data type;
        int[] num = {1,2,3,4};

        // Accessing the array elemnts;
        System.out.println(greeting[0]);
        
        // Change the array elemnts at particular position
        num[0]=9;

        // .length will return the length of the array means number of elements in array
        System.out.println(num.length);

        // loop through array
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        // By for Each
        for (String i : greeting) {
            System.out.println(i);
        }

        // MultiDimensional array
        int[][] number = {{1,2,3},{4,5,6}};

        // Acceessing the mutlidimensional array element
        System.out.println(number[1][2]);

        //For loop for multidimensional
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.println(number[i][j]);
            }
        }
    }
}
