public class Monster {
    private int nilai;
    /**
     * constructor monster 
     * inisialisasi nilai = 0
     * untuk awal
     */
    public Monster() {
        nilai = 0;

    }

    /**
     * constructor dengan 
     * @param nilai
     * dimana ini akan nilai akan diinisialisasikan dengan nilai dari parameter
     */
    public Monster(int nilai) {
        this.nilai = nilai;
    }

    /**
     * getter 
     * akan mengembalikan nilai 
     * @return
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * setter
     * mengeset nilai
     * @param nilai
     */
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}