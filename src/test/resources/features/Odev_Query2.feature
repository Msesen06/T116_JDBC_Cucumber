# Database üzerinden students tablosundaki admission_no 18001 ile 18010
# arasındaki öğrencilerin firstname ve lastname bilgilerini sıralayarak listeleyiniz.

  Feature: OdevQuery
    @odev
    Scenario: students tablosundaki admission_no 18001 ile 18010 arasindaki ogrencilerin
              firstname ve lastname bilgileri siralama testi


      * Database baglantisi kurulur.
      * students tablosu icin query hazirlanir
      * students tablosu icin sonuclar dogrulanir
      * Database baglantisi kapatilir.