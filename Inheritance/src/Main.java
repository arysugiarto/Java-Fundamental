public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan(); //memanggil constructor
        System.out.println("Apakah hewan IS-A Object ->"+(hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan  ->"+ (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing ->"+(hewan instanceof Kucing));

        System.out.println("------------------------");

        Kucing kucing = new Kucing(); // memanggil constructor
        System.out.println("Apakah hewan IS-A object ->"+(kucing instanceof Object));
        System.out.println("Apakah kucing IS-A Hewan ->"+(kucing instanceof Hewan));
        System.out.println("Apakah kucing IS-A Kucing ->" + (kucing instanceof Kucing));
    }
}
