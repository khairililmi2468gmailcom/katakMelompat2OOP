public class Pemain{
    /**
     * inisialisasi nama bertipe string hak akses modifier private
     * inisialisasi nilai bertipe int hak akses modifier private
     * 
     */
    private String nama;
    private int nilai;

    /**
     * constructor Pemain dengan paramater
     * @param nama
     */
    public Pemain(String nama){
        this.nama = nama;
    }
    /** Getter 
     * return akan mereturn nama
     */
    public String getName(){
        return this.nama;
    }
    /**
     * Setter 
     * mengembalikan isi dari nama
     * @param nama
     */
    public void setNama(String nama){
        this.nama = nama;
    }

    /**
     * Setter get nilai
     * mereturn nilai
     * @return
     */
    public int getNilai(){
        return nilai;
    }
    /**
     * setter setNilai 
     * mengeset nilai
     * @param nilaiBaru
     */
    public void setNilai(int nilaiBaru){
        this.nilai = nilaiBaru;
    }
}