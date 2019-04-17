package metodeEquals;

public class Main {
    public static void main(String[] args) {
        Kucing meow = new Kucing("Ocitat", "Tropis");
        Kucing puss = new Kucing("Ocitat", "Subtropis");
        Kucing popo = new Kucing("Anggora", "Subtropis");

        System.out.println(meow.toString());
        System.out.println(puss.toString());
        System.out.println(popo.toString());

        System.out.println("Meow equals puss?" +meow.equals(puss));
        System.out.println("meow equals popo ? "+ meow.equals(popo));

    }
}
