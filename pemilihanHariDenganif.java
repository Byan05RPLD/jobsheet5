import java.util.Scanner;
public class pemilihanHariDenganif {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Angka");
        int hari = sc.nextInt();

        if (hari >=1 && hari <= 5) {
            System.out.println("wekkday");
        } else if (hari == 6 || hari == 7) {
            System.out.println("weekend");
        } else {
            System.out.println("Invalid Number");
        }
            
        }
            
}
