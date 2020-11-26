public class _6Operators {
    
    public static void main(String[] args) {
        
        
        // Java divides the operators into the following groups:
        //Arithmetic operators
        //Assignment operators
        //Comparison operators
        //Logical operators
        //Bitwise operators


        // Arthmetic are as Follow:
        /*
        Operator	Name	Description	                            Example
            +	Addition	Adds together two values	            x + y	
            -	Subtraction	Subtracts one value from another	    x - y	
            *	Multiply	Multiplies two values	                x * y	
            /	Division	Divides one value by another	        x / y	
            %	Modulus	    Returns the division remainder	        x % y	
            ++	Increment	Increases the value of a variable by 1	++x	
            --	Decrement	Decreases the value of a variable by 1	--x	
         */
        //Eg.
        int x = 5+2;
        x++;


         // Assignment Operator
         // Eg. is "=".
         int y = 14;
         //List of Assignment operator
         /*
         Operator	Example	Same As
                =	x = 5	x = 5	
                +=	x += 3	x = x + 3	
                -=	x -= 3	x = x - 3	
                *=	x *= 3	x = x * 3	
                /=	x /= 3	x = x / 3	
                %=	x %= 3	x = x % 3	
                &=	x &= 3	x = x & 3	
                |=	x |= 3	x = x | 3	
                ^=	x ^= 3	x = x ^ 3	
                >>=	x >>= 3	x = x >> 3	
                <<=	x <<= 3	x = x << 3
         */

         // Comparision Operator
         // List of the Comparision Operator
         /*
         Operator	Name	                    Example	
                ==	Equal to	                x == y	
                !=	Not equal	                x != y	
                >	Greater than	            x > y	
                <	Less than	                x < y	
                >=	Greater than or equal to	x >= y	
                <=	Less than or equal to	    x <= y

         */
        // Eg.
        System.out.println(x==y);

        // Logical Operator
        // List as below:
        /*
        Operator	Name	    Description	                                                    Example
            && 	Logical and	    Returns true if both statements are true	                x < 5 &&  x < 10	
            || 	Logical or	    Returns true if one of the statements is true	            x < 5 || x < 4	
            !	Logical not	    Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)	

        */
        // Eg.
        if (x==8 && y==14) {
            System.out.println("Hello");
        }



    }
}
