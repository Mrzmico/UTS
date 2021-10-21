import java.util.*;
public class UTS3
{
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int J1,M1,D1;
        int J2,M2,D2;
        System.out.println("Waktu Awal");
        System.out.print("Masukkan Jam: ");J1= masuk.nextInt();
        System.out.print("Masukkan Menit: ");M1= masuk.nextInt();
        System.out.print("Masukkan Detik: ");D1= masuk.nextInt();
        System.out.println("Waktu Akhir");
        System.out.print("Masukkan Jam: ");J2= masuk.nextInt();
        System.out.print("Masukkan Menit: ");M2= masuk.nextInt();
        System.out.print("Masukkan Detik: ");D2= masuk.nextInt();
        int waktu1, waktu2,selisih,biaya;
        waktu1=3600*J1+(60*M1)+D1;
        waktu2=3600*J2+(60*M2)+D2;
        selisih=waktu2-waktu1;
        if (selisih<101)
        {
            biaya = 5*selisih;
        }
        else
        {
            biaya =(150*20)+((selisih-150)*1);
        }
        System.out.println("Waktu Awal Telp  : "+J1+":"+M1+":"+J1);
        System.out.println("Waktu Akhir Telp : "+J2+":"+M2+":"+J2);
        System.out.println("Lama Telepon     : "+selisih+" detik");
        System.out.println("Biaya Yang dihabiskan "+biaya+" rupiah");
    }
}