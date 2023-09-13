#Database üzerinden class_sections tablosundaki datalar arasından
# class_id ve section_id verisi birbirine eşit olan içeriklerin
# id'lerini listeleyiniz

  Feature: Query02
    @query2
    Scenario: class_sections tablosundan class_id ve section_id verisi birbirine esit olan içeriklerin
              id'lerini listeleyiniz

      * Database baglantisi kurulur
      * class_sections tablosu icin query hazırlanır
      * class_sections tablosu icin dogrulama yapılır
      * Database baglantisi kapatilir

