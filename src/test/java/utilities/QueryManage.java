package utilities;

public class QueryManage {

    private String query03 = "select mother_name ,mother_occupation from wonderworld_qa2.students where lastname like 'T%'";
    private String odevQuery1 ="update wonderworld_qa2.transport_feemaster set fine_amount= 200.00 where month='October'";
    private String Calisma2="select email from wonderworld_qa2.students where firstname='Edward' and lastname='Thomas'";



    public String getQuery03() {
        return query03;
    }

    public String getOdevQuery1() {
        return odevQuery1;

    }

    public String getCalisma2() {
        return Calisma2;
    }
}
