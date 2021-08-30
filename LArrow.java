import java.util.Scanner;

public class LArrow {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the symbol: ");
        char c = sc.next().charAt(0);
        int i=1;
        int j;
        while(i<=n){
            j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            j=i;
            while(j<=n){
                System.out.print(c);
                j++;
            }
            System.out.println();
            i++;
        }
        i=1;
        while(i<n){
            j=0;
            while(j<i){
                System.out.print(" ");
                j++;
            }
            j=0;
            while(j<=i){
                System.out.print(c);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
