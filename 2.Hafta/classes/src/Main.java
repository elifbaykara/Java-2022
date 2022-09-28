/*Java'da iş yapan her şey bir classtır. Classların birçok özelliği var. En önemlisi gruplama*/
public class Main {
    public static void main(String[] args) {
        // src sağ tıkladım java class'ı açtım. Örneğin müşteriler için CustomerManager adında bir class oluşturuyoruz.
        //CustomerManager'i burada çağıracağım.
        CustomerManager customerManager = new CustomerManager();//bu şekilde çağırılır.
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2; /* bunu yazdıktan sonra artık customerManager'in
         adresi de 102 oluyor :) Artık ikisi de heapteki 102 adresine gidecek. */
        //CustomerManager türünde bir örnek çağıracağım yani customerManager yerine a,b,c yazabilirim.
        //Bu şekilde bellekte customerManager türünde bir nesne oluşturmuş oluyorum.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
/*classlar referans tiptir.Bellekte iki alan var biri stack olarak diğeri heap olarak kabul ediliyor.customerManager
stack'te oluşuyor. new CustomerManager'in amacı stack'teki customerManager'in karşılığının heap'te oluşması.
Örneğin customerManager cM diye yazılsın stack'te ve adresi 101 olsun. customerManager 2 de CM olarak yazılsın.
Adresi de 102 olsun. Artık 101'i tutan hiçbir şey yok. O yüzden garbage collector(çöp toplayıcı) gelecek
ve onu bellekten silecek.
 */
        int sayi1= 10;
        int sayi2= 20;
        sayi2 = sayi1;
        sayi1=30;
        System.out.println(sayi2);
        /*sayi1=10, sayi2=20 daha sonra sayi1'in değeri sayi2'ye eşitleniyor. yani sayi1=10 olduğu için
        sayi2=10 oluyor. Daha sonra sayi1=30 oluyor. Yani son durum sayi1=30, sayi2=10 */

        //diziler referans tiptir !!
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);

    }
}
