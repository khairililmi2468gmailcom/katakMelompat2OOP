/**
 * definisi class katak
 */
public class Katak {

    private int posisi;
    private int skor;

    /**
     * constructor untuk katak
     */
    public Katak() {
        posisi = 0;
        skor = 100;
    }

    /**
     * method accessor atau getter
     * mengembalikan keberadaan posisi dari katak
     * 
     * @return
     */
    public int getPosisi() {
        return posisi;
    }

    /**
     * mengset posisi katak berada di posisi mana
     * 
     * @param posisi
     */
    public void setPosisi(int posisi) {
        this.posisi = posisi;
    }

    /**
     * mengambil nilai skor
     * 
     * @return
     */

    public int getSkore() {
        return skor;
    }

    /**
     * mengeset nilai skor dengan nilai skor yang baru
     * 
     * @param skorbaru
     */
    public void setSkor(int skorbaru) {
        skor = skorbaru;
    }

    // loncat dekat
    /**
     * loncat dekat untuk loncat satu langkah ke depan
     * dimana posisi katak akan berpindah ke depan
     * dengan menambahkan posisi
     */
    public void loncaDekat() {
        posisi += 1;
    }

    // loncat jauh
    /**
     * loncat jauh untuk loncat dua langkah ke depan
     * dimana posisi katak akan berpindah ke depan
     * dengan menambahkan posisi
     */
    public void loncatJauh() {
        posisi += 2;
    }

    /**
     * mundur dekat untuk loncat mundur dua langkah ke belakang
     * dimana posisi katak akan mundur ke belakang
     * dengan mengurangi posisi saat ini
     */
    public void mundurDekat() {
        posisi -= 1;
    }

    /**
     * mundur jauh untuk loncat mundur dua langkah ke belakang
     * dimana posisi katak akan berpindah ke belakang
     * dengan menambahkan posisi
     */
    public void mundurJauh() {
        posisi -= 2;
    }
}
