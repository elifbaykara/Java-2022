/*Java'da direkt olarak main kodu çalışır ve proje oradan dallanır. Main kodunu boş bırakırsak
aşağıdaki fonk ne yazarsak yazalım çalışmaz. Örneğin sayiBulmaca'nın çalışması için main altına
sayiBulmaca(); yazmamız gerek ki oradan dallanıp aşağıdaki sayiBulmaca fonk çalıştırsın. İstediğimiz
kadar çalıştırabiliriz.
Fonksiyon yazarak kendimizi tekrarlamayı önlemiş oluyoruz.
 */
public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;
        boolean varMi = false; //ilk etapta sayı yokmuş gibi  düşüneyim.

        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            mesajVer("Sayı mevcuttur:" +aranacak); //mesajVer'e dallandırdım. Bu fonksiyon burada çalışacak.
        }else {
            mesajVer("Sayı mevcut değildir :" +aranacak);
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj); /*aranacak hata verir çünkü üstteki fonksiyonda
         tanımlı,burada değil. Tanımlı olması için mesajVer(int aranacak) yazıp tanımlayabilirim.Buna
         parametreli metod denir. Çünkü fonksiyonu çalıştıracağım ama içine parametre giriyorum, çalıştırabilmek
         için*/
        /*int aranacak yerine String mesaj yazarsam yukarıyı da (if bloklarını) revize ederim.
        System.out.println("Sayı mevcuttur:" +aranacak); 'ı silip yerine System.out.println(mesaj)
         yazarım.*/
    }
}