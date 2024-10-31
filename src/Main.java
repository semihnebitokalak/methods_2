// Parametreli metodlar
// Bir şeyleri return eden fonksiyonlardır.
public class Main {
    public static void main(String[] args) {

        ParametrikDönüş parametrikDönüş = new ParametrikDönüş();

        System.out.println("Today, the weather is so beautiful");
        String mesaj = "You are my sunshine";
        String newMesaj = mesaj.substring(0,2);
        System.out.println(mesaj);
        System.out.println(newMesaj);
        // Aşağıda void(mainin altına yazabildiğimiz gibi class oluşturup çağırabiliriz) ile oluşturulan fonksiyonları main bloğu içinde bir değer döndürmez.
        // Çünkü dönüş tipi yoktur.
        // Ama tabiki main içinde çağırabiliriz.
        parametrikDönüş.ekle();
        parametrikDönüş.sil();
        parametrikDönüş.guncelle();
        // hemen int dönüş tipi alan bi fonksiyon tanımlayalım.
        System.out.println(parametrikDönüş.topla(3,5));
        // topla fonksiyonunda sum diye bir değişken oluşturduktan sonra sonucu atayıp sum değişkeninin yazdırabiliriz.

        // eğer fonksiyon yardımı ile birden fazla elemanı toplamak istiyorsak şu adımlar izlenir.
        // biz buna variable arguments deriz.
        /*
        Bu aşağıdaki kodu main bloğunun oraya copy paste yaparsanız ve mainde değer verirseniz çalışacaktır.
        // Burada int... aslında dizi gibi çalışır.
        public static int topla2(int... sayilar){
            int toplam = 0;
            for(int i : sayilar){
            toplam +=sayi;
            }
            return toplam;
        }

         */
    }
}