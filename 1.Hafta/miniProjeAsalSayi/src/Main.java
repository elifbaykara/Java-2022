public class Main {
    public static void main(String[] args) {
        //1 ve kendisinden başka böleni olmayan sayıya asal sayı denir.
        //uygulamadaki mantıksal hatalara ya da açıklara bug denir.
        int number = 1;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;

        if(number==1){
            System.out.println("Sayı asal değildir.");
            return; // return dediğimizde bağlı olduğumuz bloğu bitirir başa döneriz devam etmeyiz :)
        }

        if(number<1){
            System.out.println("Geçersiz sayı.");
        }

        for(int i=2; i<number; i++){
            if(number % i ==0){
                isPrime = false;
            }
        }
        if(isPrime){ // eğer if içine bu boolean ifadeyi böyle yazıyorsak isPrime==true anlamına gelir :)
            System.out.println("Sayı asaldır.");
        }
        else{
            System.out.println("Sayı asal değildir.");
        }
    }
}