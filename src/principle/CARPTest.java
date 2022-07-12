package principle;

//合成复用原则
public class CARPTest {

    public static void main(String[] args) {

        ProductDao dao = new ProductDao();
        DBConnection dbConn = new DBConnection();
        dao.setDbConnection(dbConn);
        dao.addProduct();
    }

}

class DBConnection{
    public String getConnection(){
        return "MySQL数据库连接";
    }
}

class ProductDao{
    private DBConnection dbConnection;
    public void setDbConnection(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("使用"+conn+"增加产品");
    }
}
