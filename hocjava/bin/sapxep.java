import java.util.Scanner;

public class sapxep {
    // public static void merge( int [] input , int l , int midle , int r ){

    //     int [] left = new int [midle];
    //     int [] right = new int [input.length - midle];
    //     for( int i = 0 ; i< midle ; i++ ){
    //         left[i] = input[i];
    //     }
    //     for( int i = midle ; i< input.length ; i++){
    //         right[i-midle] = input[i];
    //     }
    //     int i = 0 , j = 0 ; 
    //     while(  i<left.length && j<right.length ){
    //         if( left[i] < right[i] ){
    //             input[l] = left[i];
    //             ++l; ++i ; 
    //         }
    //         else {
    //             input[l] = right[j];
    //             ++j ;++l ; 
    //         }
    //     }
    //     while( i< left.length ){
    //         input[l ] = left[i] ; 
    //         ++i ;++l ; 
    //     }
    //     while( j < right.length){
    //         input[l] = right[j] ; 
    //         ++j; ++l; 
    //     }
    // }
    // public static void mergesort( int [] input , int l , int r ){
         
    //     if( l  >= r ) return ; 
    //     int midle = (l+r )/2 ;
    //     mergesort(input, l, midle);
    //     mergesort(input, midle +1 , r);
    //     merge(input, l, midle, r);
    // }
    // heapsort
    // 
    // quicksort 
    // phan hoach lomuto 
    public static int lomuto ( int [] intput , int l , int r ){
        int p = intput[r] ; 
        int i = l-1 ; 
        for( int j =  l ; j< r ; j++){
            if (intput[j] < p ){
                i++ ; 
                int tmp = intput[i] ; 
                intput[i ] = intput[j] ; 
                intput[j] = tmp ; 

            }
        }
        int tmp = intput[r] ; 
        intput[r]  = intput[i+1] ;
        intput[i+1] =  tmp ;
        return i+1;    
    }
    public static int hoare( int [] intput , int l , int r ){
        int p = intput[l]; 
        int i =  l-1 ; int j = r+1; 
        while(true){
            do{
                ++i ;
            }while( intput[i]<p);
            do{
                --j ; 
            }
            while( intput[j] >p ) ; 
            if( i < j ){
                int tmp = intput[i] ;
                intput[i] = intput[j] ;
                intput[j] = tmp ;
            }
            else return j ; 
        } 
    }
    public static void quicksort( int [] intput , int l, int r ){
        if( l>= r ) return ; 
        int p = hoare( intput, l , r ) ; 
        quicksort(intput, l, p);
        quicksort(intput, p+1, r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] input = new int[n];
        for( int i = 0 ; i< n ; i++){
            input[i] = sc.nextInt(); 
        }
        quicksort(input, 0,n-1);
        for( int x : input) {
            System.out.print(x+ " ");
        }
    }
}
