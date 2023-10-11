#Database üzerinden students tablosundaki lastname bilgisi
#'T' ile başlayan öğrencinin mother_name ve mother:occupation
#degerlerini listeleyiniz


  @query03
  Feature: Query03
    Scenario: students tablosundaki lastname bilgisi 'T' ile başlayan ogrencinin mother_name ve mother:occupation
      degerlerini listeleme

      * Database baglantisi kurulur
      * students tablosu icin query03 hazirlanir
      * Students tablosundan donen sonuclari listeleyiniz
      * Database baglantisi kapatilir