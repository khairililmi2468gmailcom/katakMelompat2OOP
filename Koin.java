public class Koin  {
   /**
    * deklarasi nilai bertipe int dengan hak akses private
    */
   private int nilai;
   /**
    * constructor Koin tanpa parameter
    * menginialisasikan nilai = 0
    */
   public Koin(){
    nilai = 0;
   }
   /**
    * constructor dengan 
    * @param nilai
    * akan menginisialisasikan nilai setelah nilai parameter kita input
    */
   public Koin(int nilai){
    this.nilai = nilai;
   }

   /** method getter
    * akan mengembalikan nilai dari koin
    */
   public int getNilai(){
    return nilai;
   }
   /**
    * method setter
    * akan mengeset nilai 
    * @param nilaibaru
    */
   public void setNilai(int nilaibaru){
    this.nilai = nilaibaru;
   }
}
