public class Main {
    public static void main(String[] args) {
        //Çok boyutlu diziler matrislere benzetilebilir.
        //String sehirler bu şekilde tanımladığımız zaman --> tek başına bir string oluyor
        //String[] sehirler bu şekilde tanımladığımız zaman --> tek satırdan oluşan bir array oluyor
        //String[][] sehirler --> bu şekilde tanımladığımız zaman satır ve sütunlardan oluşmuş oluyor.
        String[][] sehirler= new String[3][3];

        sehirler[0][0]="İstanbul";
        sehirler[0][1]="Bursa";
        sehirler[0][2]="Bilecik";
        sehirler[1][0]="Ankara";
        sehirler[1][1]="Konya";
        sehirler[1][2]="Kayseri";
        sehirler[2][0]="Diyarbakır";
        sehirler[2][1]="Şanlıurfa";
        sehirler[2][2]="Gaziantep";

        //önce satırları gezeriz sonra sütunları bu nedenle iç içe bir döngü oluşur

        for(int i=0;  i<=2; i++) {
            System.out.println("------------------------"); // her bölge için ayrı ayrı yazdıracağım.
            // satırları gezmek anlamına geliyor ve bu satırları gezerken sütunları da gezmiş olacağım bu
            //nedenle içine yeniden bir for döngüsü tanımlayacağım.
            for(int j=0; j<=2; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}