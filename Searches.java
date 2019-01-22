import java.lang.Math;


public class Searches{

	public static int search( 	int[]	name,
					int 	targetval	){

		for( int  index = 0;  index < name.length;  index++ )
			if ( targetval == name[ index ] )
				return index;

		return -1;
	}	//	end search


	public static void publish_result( 	int[]	searchval,
						int[] 	arr,
						int 	index		){

		System.out.printf( "\n\nValue number %d is %d", index + 1, searchval[ index ] );
		int	result = search( arr, searchval[ index ] );		//	invoke search on first value

		if ( result == -1 )
			System.out.printf( "\nValue not found." );		//	if it ain't there, say so
		else
			System.out.printf( "\nArray index of searched value: %d", result );

	}	//	end publish_result


	public static void main( String[]  args ){

		final	int	arrsize		= 10;
		final	int	searchvalcount	=  5;
			int[]	arr		= new int[ arrsize ];		//	Array of random integers to be searched
			int[]	searchval	= new int[ searchvalcount ];	//	five values to search for in arr

		for ( int  num = 0;  num < arrsize;  num++ )
			arr[ num ] = ( int )( 1000 * Math.random() - 500 );	//	initialize array arr

		System.out.printf( "Here are the array values:" );

		for ( int  num = 0;  num < arrsize;  num++ )
			System.out.printf( "\nIndex %d, has value %d", num, arr[ num ] );	//	show the user the values in arr

		int searchindex2	= ( int )( arrsize * Math.random() );	//	index of first array element
		int searchindex3	= ( int )( arrsize * Math.random() );	//	index of 2nd array element
		int searchindex4	= ( int )( arrsize * Math.random() );	//	index of 3rd array element
		searchval[ 0 ]		= -600;					//  NOT in the array.
		searchval[ 1 ]		=  594;					//  NOT in the array.
		searchval[ 2 ]		= arr[ searchindex2 ];			//  IN the array.
		searchval[ 3 ]		= arr[ searchindex3 ];			//  IN the array.
		searchval[ 4 ]		= arr[ searchindex4 ];			//  IN the array.

		//	self explanatory
		System.out.printf( "\n\nWe search the array to find the following values:" );
		System.out.printf( "\n%d", searchval[ 0 ] );
		System.out.printf( "\n%d", searchval[ 1 ] );
		System.out.printf( "\n%d", searchval[ 2 ] );
		System.out.printf( "\n%d", searchval[ 3 ] );
		System.out.printf( "\n%d", searchval[ 4 ] );
		System.out.printf( "\nNote that the first two are not in the array, but the final three are." );
		System.out.printf( "\nindex of third search value: %d", searchindex2 );
		System.out.printf( "\nindex of fourth search value: %d", searchindex3 );
		System.out.printf( "\nindex of fifth search value: %d", searchindex4 );
		System.out.printf( "\nWe search the array now for each value:" );

		for ( int index = 0;  index < searchvalcount;  index++ )
			publish_result( searchval, arr, index );

		System.out.printf( "\n\nProgram finished, thanks for playing!\n\n" );

	}	//	end main

}
