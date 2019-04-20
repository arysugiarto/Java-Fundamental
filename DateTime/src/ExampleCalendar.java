import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args) {
//        menampilkan waktu sekrang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu Sekarang adalah " + calendar.getTime());

        // menampilkan spesifik waktu yang diinginkan
        System.out.println("Tanggal : " + calendar.get(Calendar.DATE));
        System.out.println("Bulan  : "+ calendar.get(Calendar.MONTH));
        System.out.println("Tahun :" + calendar.get(Calendar.YEAR));


        // Menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu : " + calendar.getTime());

        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 bulan kemudian: " + calendar.getTime());

        // Menampilkan waktu 2 tahun yang akan datang
        calendar.add(Calendar.YEAR,2);
        System.out.println("2 tahun kemudian: " + calendar.getTime());
    }
}
