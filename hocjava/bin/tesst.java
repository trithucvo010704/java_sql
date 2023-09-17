import java.util.Scanner;

public class tesst {
    int [] a = null  ; 
    public static boolean soNguyenTo(int n ){
        for( int i = 2 ; i<= (int) Math.sqrt(n) ; i++ ){
            if( n %i == 0 ) return false ; 
        }
        return n>2 ; 
    }
    public static void main(String[] args) {
        System.out.println("CHAO VO TRI THUC ") ; 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if( soNguyenTo(n))
            System.out.println("La so nguyen to ") ;
        else System.out.println("KHONG PHAI LA SO NGUYEN TO ");
        int x = 25 ; 
        System.out.println(x) ; 
        
    }
}
