
public class Kotak {
    
    /**
     * deklarasi coin bertipe koin hak akses modifier private
     * dan deklrasi monster bertipe Monster dengan hak akses modifier private
     */
    private Koin coin;
    private Monster monster;
 
    /**
     * deklarasi wraper bertipe int untuk membantu variabel lain sebagai tempat penampung nilai sementara
     * 
     */
    int wraper;
    /**
     * constructor kotak tanpa parameter 
     */
    public Kotak() {
      
    }
    /**
     * constructor kotak dengan parameter
     * @param n
     */
    public Kotak(int n) {
        coin = new Koin(n);
        monster = new Monster(n);
    }
    
    /**
     * method menambah koin memiliki paramter c bertipe Koin
     * @param c
     */
    public void addKoin(Koin c) {
        wraper = (int) coin.getNilai();
        wraper += c.getNilai();
        coin.setNilai(wraper);
    }
    /**
     * method menambah monster memiliki parameter m bertipe Monster
     * @param m
     */
    public void addMonster(Monster m) {
        wraper = (int)monster.getNilai();
        wraper += m.getNilai();
        monster.setNilai(wraper);
    }

    /**
     * getter getCoin
     * @return
     */
    public int getKoin(){
        return coin.getNilai();     
    }

    /**
     * getter getMonster
     * 
     */
    public int getMonster() {
        return monster.getNilai();
    }

    /**
     * isThereCoin  dan genap
     * memeriksa apakah di dalam kotak ada koin atau monster
     * saya membedakan nilai koin atau monster
     * jika koin = genap
     * jika monster = ganjil
     * @return
     */
    public boolean isThereKoin() {
        if (this.coin.getNilai() % 2 == 0 ) {
            return true;
            
        }
       
        return false;
    }

    public boolean isThereMonster() {
        if (this.monster.getNilai() % 2 == 1) {
            return false;
        }
       
        return true;
    }
    
}
