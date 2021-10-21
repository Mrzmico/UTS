import java.util.Scanner;
public class UTS1 {
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        float berat, tinggi, bmi, meter;
     
        System.out.println("PROGRAM JAVA MENGHITUNG BERAT BADAN IDEAL DENGAN BMI ");
        System.out.print ("Masukan Berat: ");
        berat = masuk.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tinggi = masuk.nextFloat();
        meter=tinggi/100;
   
        bmi=(berat/(meter*meter));

        System.out.println("............................................");
        System.out.print("BMI : "+bmi+" ");

        if (bmi>=18.5){
            System.out.println("(Normal)");
        }else if (bmi>=22.9){
            System.out.println("(Overweight)"); 
        }else if (bmi<=18.5){
            System.out.println("(Underweight)"); 
        }else{
            System.out.println("Tidak Valid");
        }


   }
}