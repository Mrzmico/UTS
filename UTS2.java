import java.util.*;

public class UTS2{
    //Soal 3
    public static void main(String[] args){

        Scanner userinput = new Scanner(System.in);
        System.out.println("Masukan NIlai : ");
        int nilai = userinput.nextInt();

        System.out.println("Nilai yang dimasukan : ");

        PrintNilai(nilai);
        int jumlah = JumlahNilai(nilai);
        System.out.println("Hasil Penjumlahannya adalah : " +jumlah);
    }
    private static int JumlahNilai (int parameter){
        System.out.println("Bilangan : " +parameter);

        if(parameter ==0){
            return parameter;
        }
        return parameter + JumlahNilai(parameter-1);

    }

    private static void PrintNilai (int parameter){

            if(parameter== 0){
                return;
            }
            parameter--;

            PrintNilai(parameter);
        }

}