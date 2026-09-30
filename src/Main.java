

public class Main {
    public static void main(String[] args) {

        /*  //1.BÖLÜM TRİM();
            // TEXTİN BAŞINDAKİ VE SONUNDAKİ BOŞLUKLARI KALDIRARAK YENİ BİR STRING DÖNDÜRÜR        /// Trim(); fonksiyonu (kısa yolu)
        String text1 = "    Java OOP"    ;
        String result = text1.trim();   // trim(): baştaki ve sondaki boşlukları siler.

        System.out.println(result);
        */


       /* ///️ Trim(); kısa yolunun manuel hali ☠️☠️☠️
        // Manuel Mantık:
        // 1. Baştan başlayıp ilk boşluk olmayan karakteri bul
        // 2.Sondan başlaıyp ilik boşluk olmayan karakteri bul
        // 3. Bu iki indeks arasındaki karakterleri yeni Stringe ekle.

        ///UYGULAMA
        String text = "   Java OOP   "; // Başınbda ve sonubnda boşluk bulunan text

        int start = 0; //textin ilk karakterinin indeksi
        int end = text.length() - 1; //son karakter indeksi

        while (start <= end && text.charAt(start) == ' ') {  //soldan başlayarak boşlukları geçer
            start++; //boşluk varsa next karaktere git       // start ve end sınırlarını birbirene geçmdeğini kontrol ede4r
        }                                                    //charAt(start) == ''  :  o konumda boşluk var mı ?  der.

        while (end >= start && text.charAt(end) == ' ') {    // sağdan başlayarak boşlukları geç
            end--;  // boşluk varsa bir önceki karaktere ilerle
        }

        String result = ""; //boşlukalrdan kurtulmuş texti saklayacağımız empt String

        for (int i = start; i <= end; i++) { //starttan end'e kadar karakterleri dolaşs  // end mevcut old için <= kullanıyoruz
            result += text.charAt(i);        // o nki karakterin resultın sonuna ekle
        }

        System.out.println(result); //sonuucu output yap  */

        // 2.BÖLÜM SUBSTRİNG();
        // VAR OLAN STRINGİN İSTENİLEN İNDEKS ARALIĞINI ALIP YENİ BİR STRING DÖNDÜRÜR
/*
        // kısa yol hali :

        String text = "JAVA IS NOT FUN ANYMORE"; //text girildi (dünyaya yardım çığlığı)
        System.out.println(text.substring(0 , 4));  // çıktı JAVA olacak çünkü 0,1,2 ve 3. indeks alınır. end'i dahil etmiyoruz.
       */

     /*   // manuel hali:

        String text = "JAVA IS NOT FUN ANYMORE"; //text giriildi
        int start = 0; // almak istediğimiz ilk indkes
        int end = 4; // bitiş indeksidir, bu örnekte 4'tür. Bitiş indeksi dahil edilmeyecektir.

        String result = ""; //yeni metni tutacak değişken
        for (int i = start; i < end; i++) {  //mantık var ezber yok: i indeksi bir değer alabilmesi için ilk önce texte girş yapması lazım
            //bu bir başlangıçtır yani i indeski başlangıç (start) yapar.
            //i indeksi birer birer (++) pıt pıt gittiğinde en son end-1. karaktere gider ve ende ulaşmadan durur.
            result += text.charAt(i);  //geçerli indeksteki karaktri yeni metne ekler.

        }
        // Ekrana JAVA yazdırır
        System.out.println(result); */

        // 3.BÖLÜM EQUALS()
        // İKİ STRİNG'İN İÇERİĞİNİ KARŞILAŞTIRIR
        //MANUELDE BOOLEN KULLANILIR

        //kısa yol hali:
/*
        String a = "Java";
        String b = "Java";

        System.out.println(a.equals(b)); //output: true
*/
/*
        //manuel hali:
        String a = "Java"; //birinci text
        String b = "Java"; //ikinci text

        boolean same = true; //başlangıçyta true oldkları varsayılır
        if (a.length() != b.length()) {  //boyutları eşit olmazsa textler eşit olamaz
            same = false;  //eşit olmadıkarını işaretle
        } else {
            for (int i = 0; i < a.length(); i++) {  // uzunluklar aynıysa karşılaştır
                if (a.charAt(i) != b.charAt(i)) { //imdat  //aynı indkeste farklı karakter var mı kontrol et
                    same = false;  //farklı karakterler bulundu eşit değiller

                    break;
                }
            }

        }
            System.out.println(same);  // output: true yine
        */

        // an itibarı ile manuel yol örnek vermeyi bırakıorum çünkü önceki üç örnekte manuel altyapı oluştuğunu varsayıyorum (asla üşenmedim)
     /*   //4.Bölüm CONTAINS()
        //İÇİNDE VAR MI?

        String text = "Java Programming"; //içinde aramaya yapacağımız string
        boolean result = text.contains("Pro"); //"Pro" text'in içinde var mı  diye kontrol eder.
        System.out.println(result); //true yazdırı çünkü textin içinde pro geçiuor
      */
      /*  //5.BÖLÜM indexOf();
          // ARANAN KARAKTERİN İLK BULUNDUĞU İNDEKSİ DÖNDÜRÜR
        String text = "Computer"; //text yazılrı
        int index = text.indexOf('p'); // 'p' karakterinin ilk bulunduğu indeksi bulur
        System.out.println(index); //3 yazdırır.
        //eğer başka bir durumda karakter o texte bulunamasaydı output: -1 olurdu
       */

        // 6.BÖLÜM REPLACE()
        //KARAKTERLERİ DEĞİŞTİRİR
       /* String text = "Banana"; //orijinal string
        String result = text.replace('a' , 'o'); //bütün a karakterlierini o yapar
        System.out.println(result); */ // output: Bonono

      /*  //kelimeler de yer değiştirebilir
        String text = "I like C++"; //orijinal string
        String result = text.replace("C++", "Python"); //yani artık c++'ı yolladık  python getirdik.
        System.out.println(result);  // output: I like Python
       */

     /*  // 7.BÖLÜM  isEmpty()
        //tamamen boş mu sorgulamaca
        String text = "";                         // İçinde hiçbir karakter olmayan String
        boolean result = text.isEmpty();          // String'in uzunluğu 0 mı?
        System.out.println(result);               // true
      */

        // 8.Bölüm split()
        //virgülle parçalama
        /*
        String text = "Java,Python,C++";          // Virgülle ayrılmış metin

        String[] languages = text.split(",");     // Virgül gördüğü yerlerden parçalar

        System.out.println(languages[0]);         // Java
        System.out.println(languages[1]);         // Python
        System.out.println(languages[2]);         // C++
         */

        //9.BÖLÜM toUpperCase()
       /* //bütün karakterleri büyük harf yapar
        String text = "java";                     // Küçük harfli String
        String result = text.toUpperCase();       // Bütün harfleri büyütür
        System.out.println(result);               // JAVA
        */

        //10.BÖLÜM toLowerCase()
        // bütün harfleri küçük yapar
       /* String text = "JAVA";                     // Büyük harfli String
        String result = text.toLowerCase();       // Bütün harfleri küçültür
        System.out.println(result);               // java
     */

     /*   //11.BÖLÜM startsWith()
        //bununla mı başlıyor?
        //boolen var

        String text = "Programming";              // Kontrol edeceğimiz String
        boolean result = text.startsWith("Pro");  // "Pro" ile başlıyor mu?
        System.out.println(result);               // true
       */

       /* //12.BÖLÜM endsWith()
        //bununla mı bitiyor?
        //boolen var

        String file = "photo.jpg";                 // Dosya adı
        boolean result = file.endsWith(".jpg");    // .jpg ile bitiyor mu?
        System.out.println(result);                // true
        */


    }

}