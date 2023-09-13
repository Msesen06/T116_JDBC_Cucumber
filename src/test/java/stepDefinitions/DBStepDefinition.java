package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.JDBCReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBStepDefinition {
        static Statement statement;
        static ResultSet resultSet;


        @Given("Database baglantisi kurulur")
        public void database_baglantisi_kurulur() {
                JDBCReusableMethods.getConnection();
                statement = JDBCReusableMethods.getStatement();

        }
        @Given("Query hazirlanir ve calistirilir")
        public void query_hazirlanir_ve_calistirilir() throws SQLException {

                String query ="SELECT COUNT(*) FROM wonderworld_qa2.chat_users WHERE create_staff_id=1";

                resultSet =statement.executeQuery(query);


        }
        @Given("Query sonuclari dogrulanir")
        public void query_sonuclari_dogrulanir() throws SQLException {

                resultSet.next();
                int expectedData=11;
                int actualData =resultSet.getInt(1);
                Assert.assertEquals(expectedData,actualData);

        }
        @Given("Database baglantisi kapatilir")
        public void database_baglantisi_kapatilir() {
                JDBCReusableMethods.closeConnection();

        }

        //------------------Query 2--------------------
        @Given("class_sections tablosu icin query hazırlanır")
        public void class_sections_tablosu_icin_query_hazırlanır() throws SQLException {
                String query = ConfigReader.getProperty("query2");
                resultSet =statement.executeQuery(query);

        }
        @Given("class_sections tablosu icin dogrulama yapılır")
        public void class_sections_tablosu_icin_dogrulama_yapılır() throws SQLException {

                resultSet.next();

                while (resultSet.next()){
                        System.out.println(resultSet.getInt(1));
                }

        }


}
