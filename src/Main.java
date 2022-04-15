import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Belajar Deret Aritmatika, Deret Geometri dan Menghitung Faktorial ***");
        setVariable();
    }
    public static <Int> void setVariable(){
        /* Block inputan */
        Scanner input = new Scanner(System.in);  //membuat object scanner baru
        System.out.println("\n Masukan panjang bilangan [2-10]:");
        int panjangBil = input.nextInt();
        if(panjangBil < 2 || panjangBil > 10) //melakukan cek apakah panjang bilangan antara 2-10
            throw new RuntimeException("Range bilangan harus diatanta 2-10"); //jika tidak maka ditampilkan pesan error

        System.out.println("Masukan beda [2-9]:");
        int beda = input.nextInt();
        if(beda < 2 || beda > 9) //melakukan cek apakah beda antara 2-9
            throw new RuntimeException("Range beda harus diatanta 2-9"); //jika tidak maka ditampilkan pesan error

        aritmatika(panjangBil,beda);
        geometri(panjangBil,beda);
        faktorial(panjangBil,beda);
        input.nextLine(); //flush data

        /* block untuk mengulangi proses */
        System.out.println("Apakah anda ingin mengulang [y/t]");
        String ulang = input.nextLine();
        if(ulang.equalsIgnoreCase("y"))setVariable();
    }
    public static void aritmatika(int n, int b){
        ArrayList<Integer> aritmatika = new ArrayList<>();
        int a =1;
        int un;
        int i;

        for ( i=1; i<=n; i++) {
            if(i == 1){
                un=1; // set suku pertama
            }else{
                 un = a + (i-1)*b; //rumus deret aritmatika
            }
            aritmatika.add(un);
        }
        System.out.println("Deret Aritmatika : ");
        System.out.println(aritmatika.toString().substring(1, aritmatika.toString().length() - 1));
    }
    public static void geometri(int n, int b){
        ArrayList<Integer> geometri = new ArrayList<>();
        int a =1;
        int un=1;
        int i;
        for ( i=1; i<=n; i++) {
            if(i == 1){
                un=1; // set suku pertama
            }else{
                un = un*b; //rumus deret geometri
            }
            geometri.add(un);
        }
        System.out.println("Deret Geometri : ");
        System.out.println(geometri.toString().substring(1, geometri.toString().length() - 1));
    }
    public static void faktorial(int n, int b){
        ArrayList<Integer> faktorial = new ArrayList<>();
        int a = 1;
        int un = 0;
        int sum =0;
        int i=0;

        for ( i=n; i>=a; i--) {
            if(i == n){
                un = n; //set suku pertama
                sum = un; //set jumlah awal
            }else{
                un = un-1; //rumus faktorial
                sum = sum*un; //menampung jumlah faktorial
            }
            faktorial.add(un);
        }
        String hasil = faktorial.toString().substring(1, faktorial.toString().length() - 1);
        String hasil_final = hasil.replace(", "," * ");
        System.out.println("Hasil faktorial :");
        System.out.println(hasil_final+" = "+sum);
    }

}
