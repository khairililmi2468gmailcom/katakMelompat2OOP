
import java.util.ArrayList;
import java.util.Collections;

public class KotakPermainan {
   /**
    * inisialisasi semua variabel dengan tipe tipenya
    */
    private Kotak[] boardGame;
    private int jumKotak;
    private int skor;
    private String hasil;

    ArrayList<Integer> kotak = new ArrayList<Integer>();
    Kotak tampung;
    // private int[] acakKoin;
    // private int[] acakMonster;
/**
 * constuctor dengan parameter 
 * @param j
 */
    public KotakPermainan(int j) {
        this.jumKotak = j;
        boardGame = new Kotak[jumKotak];
        this.skor = 0;
    }
/**
 * membuat method generateAcak
 * generate angka yang dimasukkan ke dalam kotak
 * kemudian angka akan diacak dengan batasan n
 * n = nilai sebanyak jumlah kotak
 */
    private void generateAcak() {
        for (int i = 0; i < jumKotak; i++) {
            kotak.add(i);
        }
        Collections.shuffle(kotak);
      
    }
/**
 * method inisialisasi
 * ini akan memasukkan nilai ke dalam boardGame yang bertipe array
 */
    private void inisialisasi() {
        generateAcak();

        for (int n = 0; n < jumKotak; n++) {
            tampung = new Kotak(kotak.get(n));
            boardGame[n] = tampung;
        }

    }
/**
 * contains dengan 
 * @param posisi
 * @return
 * akan mereturn String
 * saya di sini menggunakan string
 * untuk memodifikasi
 * supaya tidak terjadi hal yang sama dengan mahasiswa lain
 */
    public String contains(int posisi) {
        inisialisasi();
        this.skor = 0;
        String a = "Koin";
        String b = "Monster";
        String c = "Tetap";
        for (int n = 0; n < posisi; n++) {

            if (boardGame[n].getKoin() == 0) {
                System.out.println(c);
                System.out.println("Health tetap");
                System.out.println("");
                hasil = c;
                return c;
            } else if (boardGame[n].isThereKoin() == true) {
                System.out.println("Selamat anda jumpa " + a);
                skor += 2;
                System.out.println("Koin ditambah");

                hasil = a;
                return a;
            } else if (boardGame[n].isThereMonster() == false) {
                System.out.println("Anda jumpa " + b);
                System.out.println("Anda kurang beruntung");
                System.out.println("Health anda berkurang");
                skor -= 2;
                hasil = b;

                return b;
            }

        }

        return hasil;

    }

}