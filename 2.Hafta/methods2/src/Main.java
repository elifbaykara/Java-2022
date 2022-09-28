public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = mesaj.substring(0,2);
        String eskiMesaj = sehirVer();
        System.out.println(eskiMesaj);
        System.out.println(yeniMesaj);
        int sayi = topla(5,7);// hata almam çünkü topla fonksiyonu static void int olduğu için integer değer döndürüyor.
        System.out.println(sayi);
        System.out.println(topla(6,8));
        int toplam = topla2(2,3,4,5,6,10);
        int toplam2= topla2();
        System.out.println(toplam);
        System.out.println(toplam2);
    }
    public static void ekle(){   //void operasyonu olarak isimlendirilir. Bir emir vardır ve söylediğini yapar.
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1,int sayi2){  //void yerine int yazmamın anlamı --> bu fonksiyon integer türünde bir değer döndürür demektir.
        return sayi1+sayi2;  // ve bu integer olan 5 değerini döndürürüm.
        // ya da return 5; yazarım o zaman hep 5 döndürür.
    }
    public static int topla2(int... sayilar){ // çok fazla sayıda int değerle işlem yapmak istersem int... olarak yazmam gerekir.
        //java bunu arka planda int array olarak dönüştürüyor. Yani aslında burada bir dizi var.
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
           return toplam;
    }
    public static String sehirVer(){
        return "Edirne";
    }

}