import java.sql.*;

public class Main {
    static void main(String[] args)  throws ClassNotFoundException{
        String url ="jdbc:mysql://127.0.0.1:3306/hotel_db";
        String username = "root";
        String password = "Yograj777";
        String qur = "SELECT * FROM student01 WHERE  name = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully !!");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("connection Establish successfully !");
           // Statement statement = con.createStatement();
            PreparedStatement preparedStatement = con.prepareStatement(qur);
            preparedStatement.setString(1,"amar");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String cousre = resultSet.getString("cousre");
                double fee = resultSet.getString("fee");
                System.out.println("ID"+id);
                System.out.println("Name"+name);
                System.out.println("course "+cousre);
                System.out.println("fee"+fee);
            }
            resultSet.close();
            preparedStatement.close();

            con.close();

            System.out.println();
            System.out.println("connection closed successfully !");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}