import java.util.Scanner;

//Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
//gecme notu 55

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;

        Scanner input1 = new Scanner(System.in);


        System.out.print("Matematik notunuzu giriniz : ");
        mat = input1.nextInt();
        System.out.print("Fizik notu giriniz : ");
        fizik = input1.nextInt();
        System.out.print("Turkce notu giriniz : ");
        turkce = input1.nextInt();
        System.out.print("Kimya notu giriniz : ");
        kimya = input1.nextInt();
        System.out.print("Muzik notu giriniz : ");
        muzik = input1.nextInt();

        if(((mat >=0 && mat <=100) && (turkce >=0 && turkce <=100)&&(fizik >=0 && fizik <=100)&&(kimya >=0 && kimya <=100)&&(muzik >=0 && muzik <=100))){

        int ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama >= 55) {
            ;
            System.out.print("Sinifi " + ortalama + " Ile Gectiniz..");
        }
        else{

            System.out.print("Sinifta " + ortalama + " Ile Kaldiniz");
        }
    }



    }


