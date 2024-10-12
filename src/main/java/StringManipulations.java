public class StringManipulations {
    public static void main(String[] args) {

        //Sadece tek b!r kel!meden olusan seh!r !s!mler! !ç!n b!r Str!ng deg!sken! olusturun. Seh!r
        //!sm!n!, bas harf! büyük ve d!ger tüm karakterler! küçük harfler olacak sek!lde konsolda
        //yazdırınız.

        String sehırIsım=("aNTALYA");
        String konsolSehırIsım=sehırIsım.trim().toLowerCase();
        konsolSehırIsım=konsolSehırIsım.substring(0,1).toUpperCase()+konsolSehırIsım.substring(1);
        System.out.println(konsolSehırIsım);


        //K!s! !s!mler! !ç!n 3 Str!ng deg!sken olusturunuz. Bosluk karakterler! har!ç 3 !s!mdek!
        //karakter sayısının toplamını yazdırınız.
        //Örnek: Isimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.

        String a=("Ali Can");
        String b=("Merve Star");
        String c=("Mark Tom");

        Integer c1=a.replaceAll("\\s","").length();
        Integer c2=a.replaceAll("\\s","").length();
        Integer c3=a.replaceAll("\\s","").length();

        System.out.println("Bosluk karakteri olmadan 3 ismin toplam karakter sayisi: " +(c1+c2+c3));

        //B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! toplam alfabet!k ve sayısal karakter sayısını
        //konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

        String s ="Miami 33018!!!  ";
        Integer karakterSayisi = s.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length();
        System.out.println("Toplam alfabetik ve sayısal karakter sayisi :" + karakterSayisi);

        //B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! rakam olmayan karakterler!n sayısını
        //konsolda yazdırınız.
        //Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.

        String s1 ="2a3B4?-!5";

        Integer rakamOlmayanKrkSayısı =s1.replaceAll("[0-9]","").length();
        System.out.println("rakam olmayan toplam karakter sayisi :" + rakamOlmayanKrkSayısı);


        //B!r Str!ng deg!sken! olusturunuz ve Str!ng deg!sken!n konsolda bosluk olmayan son
        //karakter! yazdırınız.
        //Örnek: 'Ali Can' için n yazdırmalısınız.
        //‘Miami’ için i yazdırmalısınız.

        String s3 ="Miami    ";
        int boslukOlmayanSonKrkIndex =s3.trim().length()-1;
        String boslukOlmayanSonKrk=s3.substring(boslukOlmayanSonKrkIndex,boslukOlmayanSonKrkIndex+1);
        System.out.println("Bosluk olmayan son karakter : "+boslukOlmayanSonKrk);

        //B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n
        //toplamını bulunuz.

        String s5="Miami   ";
        int sonKrkIndex=s5.length()-1;
        int ilkKrkAscii=s5.charAt(0);
        int sonKrkAscii=s5.charAt(sonKrkIndex);
        System.out.println("ilk ve osn karakterlerin ASCII degerlerinin toplamı :"+(ilkKrkAscii+sonKrkAscii));


        //B!r Str!ng deg!sken! olusturunuz ve !lk karakter! dısındak! tüm karakterler! konsolda
        //yazdırınız.
        //Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.

        String ab ="Java";
        String ilkKrkDısındakiler =ab.substring(1);
        System.out.println("ilk kaakter dişindakiler tum karakterleri : " +ilkKrkDısındakiler);


        //B!r Str!ng deg!sken! olusturunuz ve son karakter! dısındak! tüm karakterler!n! konsolda
        //büyük harfle yazdırınız.
        //Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.

        String i="Java";
        String sonKrktrDısı=i.substring(0,i.length()-1).toUpperCase();
        System.out.println("son karakter dısındakiler tum karakterler buyuk harf ile : " + sonKrktrDısı);



        //B!r Str!ng deg!sken! olusturunuz ve konsolda !lk karakter ve son karakter dısındak! tüm
        //karakterler! büyük harflerle yazdırınız.
        //Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
        String w ="Java";

        Integer sonKrkIndexa =w.length()-1;
        String ilkSonKrkDisindakıler= w.substring(1,sonKrkIndexa);
        System.out.println("ilk ve son dısındakiler yazdır  ="+ilkSonKrkDisindakıler);

        //B!r Str!ng !n ortadak! herhang! b!r konumda yalnızca tek b!r bosluk karakter! olup
        //olmadıgını kontrol etmek !ç!n kod yazınız.

        String o ="Tom Hanks";
        String trimlenmıs1=o.trim();
        String hıcBoslukYok= trimlenmıs1.replaceAll("\\s","");
        Boolean ortadaTekBoslukVarMı=trimlenmıs1.length()-hıcBoslukYok.length()==1;
        System.out.println(ortadaTekBoslukVarMı);

        //B!r Str!ng’ !n basında büyük harf ve sonunda nokta olup olmadıgını kontrol etmek !ç!n kod
        //yazınız.

        String e ="Tom Hanks.";
        char ilkKrktr=e.charAt(0);
        char snKrktr=e.charAt(e.length()-1);

        Boolean ilkKrktrBykMu = ilkKrktr >='A' && ilkKrktr <='Z';

        Boolean snKrktrNktMı = snKrktr=='.';

        Boolean  kntrl = ilkKrktrBykMu && snKrktrNktMı;
        System.out.println(kntrl);


        //Asagıdak! kosullar !ç!n b!r parolanın geçerl! olup olmadıgını kontrol etmek !ç!n kod yazınız;
        //S!fre bosluk karakter!nden farklı olacak sek!lde en az 8 karakter !çermel!d!r. S!frede en az 1
        //sembol olmalıdır.


        String q = "1223131331";

        Boolean enAzSekizKrktrMi=q.replaceAll("\\s","").length()>8;
        Boolean enAzBirSmblVarMı=q.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;

        System.out.println("sıfre gecerli mi :"+(enAzBirSmblVarMı && enAzSekizKrktrMi));


        String gomlekFiyat = "$12.99";
        String kitapFiyat = "$35.99";
        //Gömlek ve k!tap f!yatlarının toplamını bulmak !ç!n gereken kodu yazınız.

        String g =gomlekFiyat.replaceAll("[$]","");
        String k = kitapFiyat.replaceAll("[$]","");

        double x = Double.valueOf(g);
        double y = Double.valueOf(k);
        System.out.println("Toplam Fiyat  " + (x+y));







    }
}
