public class Main {
    public static void main(String[] args) {
        int sayi=20;
        //eğer buradaki şart bloğum doğruysa süslü parantezin içini çalıştır.
        if(sayi<20){
            System.out.println("Sayı 20'den küçüktür");
        } else if (sayi==20) {
            System.out.println("Sayı 20'ye eşittir.");
        }
        //ya if bloğu çalışacak ya da else bloğu
        else{
            System.out.println("Sayı 20'den büyüktür.");
        }
    }
}