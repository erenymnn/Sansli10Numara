Bu proje, rastgele sayılar üretip bu sayılardan şanslı 10 sayıyı seçen basit bir Java uygulamasıdır.
Amacı, rastgele sayı üretimi, Map, List, Set koleksiyonlarının kullanımı ve temel algoritmaların pratiğini yapmaktır.

Özellikler
1 ile 60 arasında rastgele 1.000.000 sayı üretir.

Üretilen sayıların kaç kere tekrarlandığı bir HashMap içerisinde tutulur.

Bu sayılar daha sonra bir listeye aktarılır.

Liste karıştırılır ve içinden 10 benzersiz şanslı sayı seçilir.

Sonuç olarak seçilen şanslı 10 sayı ekrana sıralı olarak yazdırılır.

Kullanılan Veri Yapıları
HashMap: Sayıların kaç kez üretildiğini saymak için.

ArrayList: Üretilen tüm sayıları saklamak için.

TreeSet: Tekrar etmeyen ve sıralı 10 şanslı sayıyı saklamak için.

Çalışma Mantığı
mapiSayilarlaDoldur() metodu ile 1.000.000 adet rastgele sayı üretilir ve sayılar HashMap ile sayılır.

mapiListeyeYazdir() metodu ile HashMap içeriği bir listeye aktarılır (tekrar sayısı kadar eklenir).

Liste karıştırılır (Collections.shuffle) ve rastgele indekslerden 10 sayı seçilir.

Şanslı 10 sayı ekrana yazdırılır.
