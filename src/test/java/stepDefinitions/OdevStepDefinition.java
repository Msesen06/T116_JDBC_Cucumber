package stepDefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdevStepDefinition {
        Connection connection;
        Statement statement;
        ResultSet resultSet;

    @Given("Database baglantisi kurulur2.")
    public void database_baglantisi_kurulur() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://194.140.198.209/wonderworld_qa2",
                "wonderworld_qawcollegeuser",
                "1gvyfx6#Q");

        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

    }
    @Given("students tablosu icin query hazirlanir")
    public void students_tablosu_icin_query_hazirlanir() throws SQLException {
        String query ="SELECT admission_no,firstname,lastname FROM wonderworld_qa2.students WHERE admission_no >18001 and admission_no <18010 ORDER BY admission_no";
        resultSet =statement.executeQuery(query);
        List<String> isimListesi =new ArrayList<>();
        int i=0;
       while (resultSet.next()){
           isimListesi.add(i,resultSet.getString("admission_no"));
           i++;
       }
        System.out.println(isimListesi);

        System.out.println(resultSet.getInt("admission_no"));


    }
    @Given("students tablosu icin sonuclar dogrulanir")
    public void students_tablosu_icin_sonuclar_dogrulanir()  {
        System.out.println(" ");

    }
    @Given("Database baglantisi kapatilir2.")
    public void database_baglantisi_kapatilir() {
        System.out.println(" ");

    }

}
