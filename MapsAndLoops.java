import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

public class MapsAndLoops {

    public static void main( String args[] ){
        HashMap<String, String> studentHash = new HashMap<String, String>();

        studentHash.put( "alex@miller.com", "Alex Miller" );
        studentHash.put( "martha@smith.com", "Martha Smith" );
        studentHash.put( "roger@anderson.com", "Roger Anderson" );

        String martha = studentHash.get( "martha@smith.com" );
        String hashContent = studentHash.toString();
        System.out.println( martha );
        System.out.println( hashContent );

        Set<String> keys = studentHash.keySet();
        System.out.println( keys );

        for ( String key : keys ){
            System.out.println( key + " : " + studentHash.get( key ) );
        }


        int nums[] = {10, 20, 30, 40, 50};

        for( int i = 0; i < nums.length; i ++ ){
            System.out.println( nums[i] );
        }

        int j = 0;
        while( j < nums.length ){
            System.out.println( nums[j] );
            j ++;
        }

        ArrayList<Integer> listOfScores = new ArrayList<Integer>();
        listOfScores.add( 98 );
        listOfScores.add( 85 );
        listOfScores.add( 100 );
        listOfScores.add( 92 );

        for( int i = 0; i < listOfScores.size(); i ++ ){
            System.out.println( listOfScores.get( i ) );
        }

        for( Integer num : listOfScores ){
            System.out.println( num );
        }
        
    }
    
}
