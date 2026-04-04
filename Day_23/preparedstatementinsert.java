
import java.sql.*;
//agar table me new entry fill karni hai
public class preparedstatementinsert {
    private static final String url ="jdbc:mysql://localhost:3306/mydb";
    private static  final String username = "root";
    private static final String password ="1800425";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection connection=DriverManager.getConnection(url,username,password);
            String query="INSERT INTO students(name,age,marks) VALUES(?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setString(1,"Ankita");
            preparedStatement.setInt(2,25);
            preparedStatement.setDouble(3,84.7);

            int rowsAffected=preparedStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println("data inserted Sucessfully");
            }else{
                System.out.println("insert failed");
            }


        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }
}

