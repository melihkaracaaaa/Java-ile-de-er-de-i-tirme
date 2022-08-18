
import java.util.Scanner;


public class IkıSayınınDegerınıDegıstırme {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int birinci_sayi;
    int ikinci_sayi;
    
    System.out.print("Birinci sayı :");
    birinci_sayi = scanner.nextInt();
    
    System.out.print("İkinci sayı :");
    ikinci_sayi = scanner.nextInt();
    System.out.println("Değiştirilmeden önce...");
        
    System.out.println("Birinci sayı :" + birinci_sayi + "  --  " + "ikinci sayı :" + ikinci_sayi);
    
    
    int gecici = birinci_sayi;
    birinci_sayi = ikinci_sayi;
    ikinci_sayi = gecici;
    
    System.out.println("Değiştirildikten sonra :");
    System.out.println("Birinci sayı :" + birinci_sayi + "  --  " + "ikinci sayı :" + ikinci_sayi);

        
    }
    
}
