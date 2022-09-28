public class Product {
    //her bir classın kendi ismiyle bir constructor'ı vardır.
    public Product(int id,String name, String description,double price,int stockAmount){
        System.out.println("Yapıcı blok çalıştı");
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
    }

    //attribute veya field diyebiliriz.
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String kod;

//public -->her yerden erişilebilir.
//private -->sadece tanımlandığı blokta geçerlidir.(Bir üstündeki süslü parantez neredeyse orada geçerli !!!)

    //getter bloğu
    public int getId(){  //id'yi okuyabilir getId ile
        return id;
    }

    //setter bloğu
    public void setId(int id){ //set edilen değer parantez içine yazılmalı
        /* this.id=id; //this demek bu class anlamına gelir. içerisinde bulunduğum classın id'si demek fakat
     farklı ve doğru yazım -->tümünün başına _ koymak  !!!!  int _id gibi !*/
        this.id=id;
    }
//sağ tıkla refactor oradn encapsulation fields ve istediklerini seçip uygula !
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public double get_price() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public int getstockAmount() {
        return stockAmount;
    }

    public void setstockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;  //kodun yazılabilir olmasını istemediğim için set kısmını sildim !!!!!
    }

}


