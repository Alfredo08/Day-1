
public class Methods {
    // Scope returnType nameMethod( parameters with their type )
    public static int addTwoNumbers( int num1, int num2 ){
        return num1 + num2;
    }
    public static void main( String args[] ){
        int num1 = 10;
        int num2 = 20;
        
        int result = addTwoNumbers( num1, num2 );

        System.out.println( result );
    }    
}
