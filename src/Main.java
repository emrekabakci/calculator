import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables defined
        int num1, num2, select;

        //New scanner created.
        Scanner inp = new Scanner(System.in);

        //Operation selected.
        System.out.println("toplama icin 1");
        System.out.println("cikarma icin 2");
        System.out.println("carpma icin 3");
        System.out.println("bolme icin 4'e basiniz.");
        System.out.print("Secim : ");
        select = inp.nextInt();


        //First data retrieved from user.
        System.out.print("Ilk sayiyi giriniz : ");
        num1 = inp.nextInt();

        //Second data retrieved from user.
        System.out.print("Ikinci sayiyi giriniz : ");
        num2 = inp.nextInt();


        //Selected operation done.
        switch (select) {
            case 1 -> System.out.println("Sonuc = " + (num1 + num2));
            case 2 -> System.out.println("Sonuc = " + (num1 - num2));
            case 3 -> System.out.println("Sonuc = " + (num1 * num2));
            case 4 -> System.out.println("Sonuc = " + num1 / num2);
            default -> System.out.println("Hatali giris yaptiniz.");
        }


    }
}