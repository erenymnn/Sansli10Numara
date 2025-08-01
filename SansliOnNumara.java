package SansliOnNumaraProje;

import java.util.*;

public class SansliOnNumara {

    static final int URETILECEK_SAYI_MAX_SINIR=60;
    static final int URETILECEK_SAYI_MIKTARI=1000000;

    public static void main(String[] args) {
        // hata verir map.put(1,2);
        HashMap<Integer, Integer> olusturulanSayilarMap = new HashMap<>();
        List<Integer> olusturulanSayiListesi = new ArrayList<>();
        Set<Integer> sansliOnSayi = new TreeSet<>(); // set yapma sebebimiz 1 sayı 2 defa yazılamayacagı için tree set ise sıralı bir şekilde yazar.

        mapiSayilarlaDoldur(olusturulanSayilarMap);
        mapiListeyeYazdir(olusturulanSayilarMap,olusturulanSayiListesi);
        sansliOnSayiyiBul(sansliOnSayi,olusturulanSayiListesi);

        System.out.println("Listenin size:"+olusturulanSayiListesi.size());

       /* for(Map.Entry <Integer,Integer> gecici:olusturulanSayilarMap.entrySet()){
            System.out.println(gecici);
        }

        */

        System.out.println("Map size:"+olusturulanSayilarMap.size());
        System.out.println("Set size:"+sansliOnSayi.size());


        System.out.println("Şanslı 10 Sayı");

        for(int gecici:sansliOnSayi){
            System.out.print(gecici+" ");
        }

    }

    private static void sansliOnSayiyiBul(Set<Integer> sansliOnSayi, List<Integer> olusturulanSayiListesi) {
        Collections.shuffle(olusturulanSayiListesi);

        while(sansliOnSayi.size()<10){
            int rastgeleSayi= (  (int)(Math.random()*URETILECEK_SAYI_MIKTARI)); // +1 yapmama sebebimiz 0. index için
         sansliOnSayi.add(olusturulanSayiListesi.get(rastgeleSayi));
        }


    }

    private static void mapiListeyeYazdir(HashMap<Integer, Integer> olusturulanSayilarMap, List<Integer> olusturulanSayiListesi) {
        for (Map.Entry<Integer, Integer> gecici : olusturulanSayilarMap.entrySet()) {
            int key=gecici.getKey(); //9
            int value=gecici.getValue(); //15 bu 9 sayınsının 15 kere olusturuldugunu anlamına gelir

            for(int i=0;i<value;i++){
                olusturulanSayiListesi.add(key);
            }

        }
    }
    private static void mapiSayilarlaDoldur(HashMap<Integer, Integer> olusturulanSayilarMap) {
        for(int i=0;i<URETILECEK_SAYI_MIKTARI;i++){
            int randomSayi=sayiOlustur();
            if(olusturulanSayilarMap.containsKey(randomSayi)){
                int value=olusturulanSayilarMap.get(randomSayi);
                olusturulanSayilarMap.put(randomSayi,value+1); // yani ornegin 4 sayısı 2 kere varsa value 2 olacak değeri 2
            }else {
                olusturulanSayilarMap.put(randomSayi,1);
            }
        }

    }
    private static int sayiOlustur(){
        return (  (int)(Math.random()*URETILECEK_SAYI_MAX_SINIR)+1);
    }
}