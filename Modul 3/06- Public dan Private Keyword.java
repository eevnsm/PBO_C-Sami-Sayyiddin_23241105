class player{
    // data member atau variabel instant
    String nama; // default, bisa di akses dari luar c1
    public int exp; // public, bisa diakses dari luar c1
    private int health; // private, tidak bisa diakses


    // konstruktor modifier default
    Player(String nama, int exp, int health){
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }
    
    // method, public
    void cetak(){
        kurangi exp();
        System.out.println("player : " + this.nama);
        System.out.println("exp : " + this.exp);
        System.out.println("health : " + this.health);
    }    

    // method, public
    public void ubahhealth(int value){
        this.health = value;
    }
    
    // method, private
    private void kurangiExp(){
        this.exp -=10; // exp = exp - 10
    }    





public class App {
    public static void main(String[] args) throws Exception {
        // instansiasi objek
        Player player1 = new player(nama:"saitama sensei",exp:50, health:100);

        // default
        // membaca
        System.out.println(player1.nama);
        // menulis
        player1.nama = "nami";
        // membaca
        System.out.println(player1.nama);

        // public
        // membaca
        System.out.println(player1.exp);
        // menulis
        player1.exp = 75;
        // membaca
        System.out.println(player1.exp);

        // private
        // membaca
        // System.out.println(player1.health);
        // menulis
        // player1.health = 125;
        // membaca

        // method default
        // membaca private
        player1.cetak();

        // method public
        // menulis private
        player1.ubahHealth(value:125);
        player1.cetak();

        // method private
        player1.cetak();
        
    }    

    }
}
