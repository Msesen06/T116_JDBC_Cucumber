#Database üzerinden transport_feemaster tablosundaki month degeri
# 'October' olan kaydın fine_amount değerini '200.00' olarak güncellenebilmeli.

  @odevquery3
  Feature: Odev Query3
    Scenario: transport_feemaster tablosundaki month degeri
              'October' olan kaydin fine_amount degerini '200.00' olarak guncelleme testi

      * Database baglantisi team4 farkiyla kurulur
      * transport_feemaster tablosu icin query hazirlanir ve calistirilir
      * transport_feemaster tablosu icin sonuclar dogrulanir
      * Database baglantisi team4 farkiyla kapatilir


# Database üzerinden students tablosundaki firstname= Edward ve lastname= Thomas olan
# öğrencinin email bilgisinin edvard@gmail.com olduğunu doğrulayınız.



      @calisma2
      Scenario: students tablosundaki firstname= Edward ve lastname= Thomas olan
                ogrencinin email bilgisinin edvard@gmail.com oldugunu dogrulayiniz


        * Database baglantisi team4 farkiyla kurulur
        * students tablosu icin query hazirlanir ve calistirilir
        * students tablosu icin sonuclar team4 farkiyla dogrulanir
        * Database baglantisi team4 farkiyla kapatilir
