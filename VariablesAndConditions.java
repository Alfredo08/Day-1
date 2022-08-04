
public class VariablesAndConditions{
    public static void main( String args[] ){
        // Inline comment

        /* Block
         * Level
         * Comment
         */

         // Primitive
         int age = 20;
         age = 60;
         boolean flag = true; // false
         double average = 9.65;
         char status = 'A';

         // Class
         String firstName =  new String("Alex");
         String alexName = new String("Alex");

         String completeText = age + " " + flag + " " + average;

         System.out.println( completeText );
         System.out.println( status + " " + firstName );

         // Aritmethic operators () * / + - % ++ -- += -= *= /= 
         // Relational operators == != > >= < <= && || !

         if ( age < 50 ){
            System.out.println( "You have less than 50 years!" );
         }
         else if( average > 9.0){
            System.out.println( "You have more than 50 years. And you passed the exam" );
         }
        
         if( firstName.equals( alexName ) ){
            System.out.println( "We shouldn't see this!" );
         }
    }   
}



