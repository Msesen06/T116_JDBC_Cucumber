package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.DB_Utils;
import utilities.QueryManage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CalismaStepDefinition {
    QueryManage queryManage =new QueryManage();
    Statement statement;
    int row;
    String actualEmail;
    ResultSet resultSet;


    @Given("Database baglantisi team4 farkiyla kurulur")
    public void database_baglantisi_team4_farkiyla_kurulur() {
        DB_Utils.getConnection();
        statement=DB_Utils.getStatement();


    }
    @Given("transport_feemaster tablosu icin query hazirlanir ve calistirilir")
    public void transport_feemaster_tablosu_icin_query_hazirlanir_ve_calistirilir() throws SQLException {

        String query =queryManage.getOdevQuery1();
        row=statement.executeUpdate(query);

    }
    @Given("transport_feemaster tablosu icin sonuclar dogrulanir")
    public void transport_feemaster_tablosu_icin_sonuclar_dogrulanir() {

        Assert.assertTrue(row>0);

    }
    @Given("Database baglantisi team4 farkiyla kapatilir")
    public void database_baglantisi_team4_farkiyla_kapatilir() {
        DB_Utils.closeConnection();

    }

    //--------------------------senaryo 2------------------------------

    @Given("students tablosu icin query hazirlanir ve calistirilir")
    public void students_tablosu_icin_query_hazirlanir_ve_calistirilir() throws SQLException {

        String query =queryManage.getCalisma2();
        resultSet =statement.executeQuery(query);

        resultSet.next();

        actualEmail =resultSet.getString("email");
        System.out.println(actualEmail);


    }
    @Given("students tablosu icin sonuclar team4 farkiyla dogrulanir")
    public void students_tablosu_icin_sonuclar_team4_farkiyla_dogrulanir() {

       String expectedEmail="edward@gmail.com";
       Assert.assertEquals(expectedEmail,actualEmail);

    }


}
