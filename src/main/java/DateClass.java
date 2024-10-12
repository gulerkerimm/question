import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateClass {
    public static void main(String[] args) {


        //Al!'n!n kaç gün yasadıgını bulan kodu yazınız.
        //Al!'n!n dogum tar!h! 12 Mayıs 2002'd!r.

        LocalDate dogumTrihi =LocalDate.of(2003,05,01);
        LocalDate bugun =LocalDate.now();
        long yasadıgıGun= ChronoUnit.DAYS.between(dogumTrihi,bugun);
        System.out.println(yasadıgıGun);

        //l!'n!n kaç ay yasadıgını bulan kodu yazınız.
        //Al!'n!n dogum tar!h! 4 Haz!ran 1997'd!r.

        LocalDate dogumTarıhı =LocalDate.of(1996,06,04);
        LocalDate bugunTarih = LocalDate.now();
        long yasadıgıay =ChronoUnit.MONTHS.between(dogumTrihi,bugunTarih);
        System.out.println(yasadıgıay);



    }
}
