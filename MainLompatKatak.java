/**
 * Membuat program katak hai lompat katak version ke-2
 * Dengan menggunakan OOP (Object Oritented Programming)
 * Program ini memiliki 7 class
 * @Khairil Ilmi
 * 2108107010011
 * Bener Meriah

 */
import java.util.Scanner;

public class MainLompatKatak {
/**
 * Membuat constructor MainLompatKatak untuk digunakan
 * membuat variabel objek di class main
 */
    public MainLompatKatak() {

    }
    /**
     * ini adalah method pengolahan permainan katak 
     * membuat objek katak, pemain, dan kotakpermainan
     * @param in
     */
    public void mainkan(int in) {
        
        Scanner input = new Scanner(System.in);
        int health = 100, pL;
        Pemain pemain = new Pemain(input.nextLine());
        System.out.print("Nama player: ");
        String nama = input.nextLine();
        pemain.setNama(nama);
        System.out.println("Player : " + pemain.getName());
        petunjuk();
        pL = in;
        Katak oKatak = new Katak();
        oKatak.setSkor(0);

        KotakPermainan kotakPermainan = new KotakPermainan(pilihLevel(pL));
        clearScreen();
/**
 * mengulang permainan sebanyak 10000 kali 
 * 
 */
        for (int i = 0; i < 100000; i++) {
            System.out.println("Kotak dalam permainan : " + pilihLevel(pL));
            try {
                /**
                 * for ini untuk membuat kotak 
                 * meloncat jauh dan dekat
                 */
                for (int j = 0; j < pilihLevel(pL); j++) {

                    System.out.print("\nMaju atau Mundur : ");
                    char getMM = input.next().charAt(0);
                    /**
                     * jika maju 
                     * 
                     */
                    if (getMM == 'w' || getMM == 'W') {
                        System.out.println("Katak maju 1 langkah");
                        oKatak.loncaDekat();
                        System.out.println("Dapat: " + kotakPermainan.contains(oKatak.getPosisi()));
                        System.out.println("");
                        if (kotakPermainan.contains(oKatak.getPosisi()) == "Monster") {
                            levelMonster(pilihLevel(pL)); // tampilkan jenis
                                                          // monster yang
                                                          // dihadapkan
                            health -= 5;
                        } else if (kotakPermainan.contains(oKatak.getPosisi()) == "Koin") {
                            levelCoin(pilihLevel(pL));
                            oKatak.setSkor(oKatak.getSkore() + 5);
                        }
                        System.out.println("\tPosisi Katak : " + oKatak.getPosisi());
                        if (health > 0) {
                            System.out.println("\tHealth : " + health);
                        }
                        System.out.println("\tSkor : " + oKatak.getSkore());

                        int syarat = pilihLevel(pL) - 1;

                        if (oKatak.getPosisi() == syarat) {

                            clearScreen();
                            System.out.println("\n\nHealth : 0");
                            System.out.println("Game Over");
                            pemain.setNilai(oKatak.getSkore());
                            System.out.println(
                                    "Total score " + pemain.getName().toUpperCase() + " : " + pemain.getNilai());
                            if (pemain.getNilai() < 40) {
                                for (int n = 0; n < 10; n++) {
                                    System.out.print("Bad");
                                }
                            } else if (pemain.getNilai() < 80) {
                                int n = 0;
                                while (n < 10) {
                                    System.out.print("Good");
                                    n++;
                                }
                            } else if (pemain.getNilai() <= 150) {
                                System.out.println("Excelent");
                            } else {
                                System.out.println("over");
                            }
                            break;

                        }
                    }
                    /**
                    jika mundur
                     */ 
                    else if (getMM == 'x' || getMM == 'X') {
                        System.out.println("Katak mundur 1 langkah");
                        oKatak.mundurDekat();
                        System.out.println("Dapat: " + kotakPermainan.contains(oKatak.getPosisi()));
                        j -= 1;

                        while (oKatak.getPosisi() < 0) {
                            System.out.println("Tidak bisa mundur lagi");
                            break;
                        }
                        if (kotakPermainan.contains(oKatak.getPosisi()) == "Monster") {
                            levelMonster(pilihLevel(pL)); // tampilkan jenis
                                                          // monster yang
                                                          // dihadapkan
                            health -= 5;
                        } else if (kotakPermainan.contains(oKatak.getPosisi()) == "Koin") {
                            levelCoin(pilihLevel(pL));
                            oKatak.setSkor(oKatak.getSkore() + 5);
                        }
                        if(oKatak.getPosisi() > 0){
                            System.out.println("\tPosisi Katak: " + oKatak.getPosisi());

                        }
                        if (health > 0) {
                            System.out.println("\tHealth : " + health);
                        }
                        System.out.println("\tSkor : " + oKatak.getSkore());
                        if (j < 0) {
                            System.out.println("Tidak bisa mundur lagi");
                        }
                        int syarat = pilihLevel(pL) - 1;

                        if (j >= 0 || j == syarat) {
                            System.out.println("\tPosisi Katak : " + oKatak.getPosisi());
                            if (health < 0 || oKatak.getPosisi() == syarat)
                                clearScreen();
                            System.out.println("\n\nHealth : 0");
                            System.out.println("Game Over");
                            pemain.setNilai(oKatak.getSkore());
                            System.out.println(
                                    "Total score " + pemain.getName().toUpperCase() + " : " + pemain.getNilai());
                            if (pemain.getNilai() < 40) {
                                for (int n = 0; n < 10; n++) {
                                    System.out.print("Bad");
                                }
                            } else if (pemain.getNilai() < 80) {
                                int n = 0;
                                while (n < 10) {
                                    System.out.print("Good");
                                    n++;
                                }
                            } else if (pemain.getNilai() <= 150) {
                                System.out.println("Excelent");
                            } else {
                                System.out.println("over");
                            }
                            break;

                        }

                    } 
                    /**
                     * jika maju 2 langkah
                     */
                    else if (getMM == 'd' || getMM == 'D') {
                        System.out.println("Katak maju 2 langkah");
                        oKatak.loncatJauh();
                        System.out.println("Dapat: " + kotakPermainan.contains(oKatak.getPosisi()));
                        j -= 2;
                        while (oKatak.getPosisi() < 0) {
                            System.out.println("Tidak bisa mundur lagi");
                            break;
                        }
                        if (kotakPermainan.contains(oKatak.getPosisi()) == "Monster") {
                            levelMonster(pilihLevel(pL)); // tampilkan jenis
                                                          // monster yang
                                                          // dihadapkan
                            health -= 5;
                        } else if (kotakPermainan.contains(oKatak.getPosisi()) == "Koin") {
                            levelCoin(pilihLevel(pL));
                            oKatak.setSkor(oKatak.getSkore() + 5);
                        }
                        System.out.println("\tPosisi Katak : " + oKatak.getPosisi());

                        if (health > 0) {
                            System.out.println("\tHealth : " + health);
                        }
                        System.out.println("\tSkor : " + oKatak.getSkore());

                        int syarat = pilihLevel(pL) - 1;

                        if (oKatak.getPosisi() == syarat) {

                            clearScreen();
                            System.out.println("\n\nHealth : 0");
                            System.out.println("Game Over");
                            pemain.setNilai(oKatak.getSkore());
                            System.out.println(
                                    "Total score " + pemain.getName().toUpperCase() + " : " + pemain.getNilai());
                            if (pemain.getNilai() < 40) {
                                for (int n = 0; n < 10; n++) {
                                    System.out.print("Bad");
                                }
                            } else if (pemain.getNilai() < 80) {
                                int n = 0;
                                while (n < 10) {
                                    System.out.print("Good");
                                    n++;
                                }
                            } else if (pemain.getNilai() <= 150) {
                                System.out.println("Excelent");
                            } else {
                                System.out.println("over");
                            }
                            break;

                        }
                    } 
                    /**
                     * mundur 2 langkah
                     */
                    else if (getMM == 'a' || getMM == 'A') {
                        System.out.println("Katak mundur 1 langkah");
                        oKatak.mundurJauh();
                        System.out.println("Dapat: " + kotakPermainan.contains(oKatak.getPosisi()));
                        if (kotakPermainan.contains(oKatak.getPosisi()) == "Monster") {
                            levelMonster(pilihLevel(pL)); // tampilkan jenis
                                                          // monster yang
                                                          // dihadapkan
                            health -= 5;
                        } else if (kotakPermainan.contains(oKatak.getPosisi()) == "Koin") {
                            levelCoin(pilihLevel(pL));
                            oKatak.setSkor(oKatak.getSkore() + 5);
                        }
                        if (oKatak.getPosisi() > 0) {
                            System.out.println("\tPosisi Katak: " + oKatak.getPosisi());
                        }
                        if (health > 0) {
                            System.out.println("\tHealth : " + health);
                        }
                        System.out.println("\tSkor : " + oKatak.getSkore());
                        if (j < 0) {
                            System.out.println("Tidak bisa mundur lagi");
                        }
                        int syarat = pilihLevel(pL) - 1;

                        if (j >= 0 || j == syarat) {
                            System.out.println("\tPosisi Katak : " + oKatak.getPosisi());
                            if (health < 0 || oKatak.getPosisi() == syarat)
                                clearScreen();
                            System.out.println("\n\nHealth : 0");
                            System.out.println("Game Over");
                            pemain.setNilai(oKatak.getSkore());
                            System.out.println(
                                    "Total score " + pemain.getName().toUpperCase() + " : " + pemain.getNilai());
                            if (pemain.getNilai() < 40) {
                                for (int n = 0; n < 10; n++) {
                                    System.out.print("Bad");
                                }
                                System.out.println("\nUsaha terus sampai excelent");
                            } else if (pemain.getNilai() < 80) {
                                int n = 0;
                                while (n < 10) {
                                    System.out.print("Good");
                                    n++;
                                }
                                System.out.println("Semangat");
                            } else if (pemain.getNilai() <= 150) {
                                System.out.println("Excelent");
                                System.out.println("Sedikit lagi");
                            } else {
                                System.out.println("over");
                                System.out.println("Lah....");
                            }
                            break;

                        }
                    }

                }

            } 
            /**
             * Exception
             * menanangani error saat runtime
             * atau pada saat user tidak menekan perintah petunjuk
             */
            catch (Exception e) {
                System.out.println("Tekan W, X, D, A");
                System.out.println("Tolong masukkan dengan benar");
                System.out.println("Harus maju");
                enter();
                clearScreen();
                break;
            }
            System.out.print("\nApakah anda ingin melanjutkan (y/n): ");
            char ulangi = input.next().charAt(0);
            do {
                if (ulangi == 'y' || ulangi == 'Y') {

                    i = 0;
                    oKatak.setPosisi(0);
                    pemain.setNilai(0);
                    oKatak.setSkor(0);
                    health = 100;
                    break;
                } else {
                    System.out.println("Enter!");
                    enter();
                    clearScreen();
                    return;
                }
            } while (ulangi != 'y' || ulangi != 'Y' || ulangi != 'n' || ulangi != 'N');
            continue;
        }
        input.close();
        return;
    }
/**
 * method main untuk run permainan
 * @param args
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        MainLompatKatak mainKita = new MainLompatKatak();
        try {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("\t\t\tWelcome in Katak Kupi");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("");
            
            System.out.println("\n1. Gure");
            System.out.println("2. Sedang");
            System.out.println("3. Nyanya");
            System.out.print("Pilih level: ");
            i = input.nextInt();
            System.out.println("Enter bermain!!!");
            mainKita.mainkan(i);
        } catch (Exception e) {
            clearScreen();
            System.out.println("\n\nTekan 1 / 2 / 3");
            System.out.println("Harus keluar dahulu");
            System.out.println("Terima kasih bermain Permainan ini");
        }
        input.close();
    }


    
    /**
     * method levelCoin untuk menentukan tipe coin 
     * apakah koin perunggu, silver atau gold
     * @param levelCoin
     */
    public void levelCoin(int levelCoin) {
        String[] namaKoin = { "Perunggu", "Silver", "Gold" };
        switch (levelCoin) {
            case 1:
                System.out.println(namaKoin[0]);
                break;
            case 2:
                System.out.println(namaKoin[1]);
                break;
            case 3:
                System.out.println(namaKoin[2]);
                break;
            default:
                System.out.println(namaKoin[0]);
                break;
        }

    }

    /**
     * method levelMonster untuk menentukan tipe monster
     * apakah tipe monster Macan, Harimau, atau Singa
     * @param levelMonster
     */
    public void levelMonster(int levelMonster) {
        String[] namaMonster = { "Macan", "Harimau", "Singa" };
        switch (levelMonster) {
            case 1:
                System.out.println("Monster: " + namaMonster[0]);
                break;
            case 2:
                System.out.println("Monster: " + namaMonster[1]);
                break;
            case 3:
                System.out.println("Monster: " + namaMonster[2]);
                break;
            default:
                System.out.println("Monster: " + namaMonster[0]);
                break;
        }

    }

    /**
     * method pilihLevel berfungsi untuk 
     * memilih level
     * menentukan panjang dari kotak yang kita mainkan
     * @param angka
     * @return
     */
    public int pilihLevel(int angka) {

        switch (angka) {
            case 1:
                angka = 25;
                break;
            case 2:
                angka = 100;
                break;
            case 3:
                angka = 300;
                break;
            default:
                angka = 25;
                break;
        }
        return angka;
    }
    /**
     * method petunjuk digunakan untuk memberi petunjuk kepada user
     */
    public void petunjuk() {
        System.out.println("W : Maju");
        System.out.println("X : Mundur");
        System.out.println("D : Maju Jauh");
        System.out.println("A : Mundur Jauh\n");

    }
    /**
     * method enter digunakan untuk mempermudah user 
     * sama seperti halnya enter pada keyboard
     */
    static void enter() {
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
        enter.close();
    }

    /**
     * method clear screen digunakan untuk membersihkan layar di terminal
     * dimana ini sangat bagus untuk membersihkan setelah bermain
     */
    static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception e) {
            System.err.println("Tidak bisa clear screen");
        }
    }

}