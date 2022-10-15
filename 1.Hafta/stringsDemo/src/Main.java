public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel !";
        //stringler aslında bir karakter dizisidir.
        System.out.println(mesaj);

        /*System.out.println("Eleman Sayısı:" + mesaj.length());
        System.out.println("5.Eleman : "+mesaj.charAt(4)); //hangi elemanı istersen içine onun indexini yaz
        System.out.println(mesaj.concat(" Yaşasın!")); //birleştirmek için kullanılır mesaj değişkeninin içindeki stringi ve concat'in içindeki yazıyı birleştirecek ve yeni bir string oluşturacak
        System.out.println(mesaj.startsWith("A")); //startswith ile başlıyor mu ? Booelan değer döndürür.
        System.out.println(mesaj.endsWith("!")); //endswith ile bitiyor mu ? Bu da boolean değer döndürür.
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5,karakterler,0);//karakterleri al anlamında kullanılır.bir şey döndürmez.Karakterlere ata anlamında kullanılır.0'dan başlayıp 5'e kadar. dst begin ise 0. indexten itibaren aktar demektir.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('h')); //yazdığım karakterin mesajın içinde kaçıncı index olduğunu bulmama yarar. Boşluk da bir index sayılır. index of ilk bulduğunu verir ve işlemi bitirir.
        System.out.println(mesaj.indexOf("av")); //a'yı bulduğu indexi verir ve işlemi bitirir.
        System.out.println(mesaj.lastIndexOf("a")); //aramaya en sağdan başlar*/

        String yeniMesaj = (mesaj.replace(' ','-')); //boşluk gördüğü yerlere artık - koyacak.
        System.out.println(yeniMesaj);
        System.out.println(mesaj);
        System.out.println(mesaj.substring(2)); //2'den itibaren kes !! 2 de dahil !!
        System.out.println(mesaj.substring(2,4)); //2'den başla 4'e kadar 4 dahil değil!

        for(String kelime: mesaj.split(" ")){ // boşluğa göre kelimeleri ayırıyorum !!!!!!!!!!
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //mesajı küçük harfe çeviriyor.
        System.out.println(mesaj.toUpperCase()); //mesajı büyük harfe çeviriyor.

        System.out.println(mesaj.trim()); // baştaki ve sondaki tüm boşlukları atabiliyoruz !!!!!!!

    }

}