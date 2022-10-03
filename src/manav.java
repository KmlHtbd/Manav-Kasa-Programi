import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
       double total,arm=2.14,elm=3.67,dom=1.11,muz=0.95,pat=5,armKg,elmKg,domKg,muzKg,patKg;
       Scanner input = new Scanner(System.in);
       System.out.print("Armut Kaç Kilo ? :");
       armKg = input.nextDouble();
       System.out.print("Elma Kaç Kilo ? :");
       elmKg = input.nextDouble();
       System.out.print("Domates Kaç Kilo ? :");
       domKg = input.nextDouble();
       System.out.print("Muz Kaç Kilo ? :");
       muzKg = input.nextDouble();
       System.out.print("Patlıcan Kaç Kilo ?");
       patKg = input.nextDouble();
       total = armKg*arm + elmKg*elm +domKg*dom +muzKg*muz + patKg*pat;
       System.out.print("Toplam Tutar:"+total);
    }
}