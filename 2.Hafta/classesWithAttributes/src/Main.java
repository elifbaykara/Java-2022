//Classların bir diğer özelliği de özellik tutmasıdır.Field ya da attribute olarak değerlendirilir.Bir class
//aynı zamanda bir attribute barındırır.
public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Laptop",3000,2);
      /*product.setname("Laptop");
        product.setId(1);
        product.setdescription("Asus Laptop");
        product.setprice(5000);
        product.setstockAmount(3);*/

        //Şimdi ürünü veri tabanına ekleyeceğim. Bunu product manager classı yapıyor.
        ProductManager  productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
        // productManager.Add2(1,"","",2,300); //id,name,description,stock,price
        //diyelim ki yeni bir özellik daha eklemem gerekti, o zaman kaç ekran kullandıysam hepsinde ayrı
        //ayrı bu operasyonu düzenlemem gerekli bu nedenle hatalı bir işlem
    }
}
//Encapsulation ---> kullanıcıyı herhangi bir alanı kullanması için kısıtlamayı öngörür.
//constructor --->yapıcı,oluşturucu

//aynı isimle ama farklı parametrelerle metodlarımızı kullanabiliyoruz buna overloading deniyor.