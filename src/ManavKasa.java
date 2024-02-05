import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args)
    {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilogram? : ");
        armutKilo = input.nextDouble();

        System.out.print("Elma Kaç Kilogram? : ");
        elmaKilo = input.nextDouble();

        System.out.print("Domates Kaç Kilogram? : ");
        domatesKilo = input.nextDouble();

        System.out.print("Muz Kaç Kilogram? : ");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilogram? : ");
        patlicanKilo = input.nextDouble();

        double toplamTutar = (armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)
                +(muz*muzKilo)+(patlican*patlicanKilo);

        System.out.println("Toplam Tutar: " + toplamTutar + "TL");
    }

}