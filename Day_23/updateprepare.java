
import java.sql.*;
//agar table me new entry fill karni hai
public class updateprepare {
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
            String query="UPDATE students SET  marks =? WHERE id=? ";
            //String query="DELETE  FROM students Where id = ?"; for delete
            PreparedStatement preparedStatement=connection.prepareStatement(query);

            preparedStatement.setDouble(1,87.5);
            preparedStatement.setInt(2,3);
            //preparedStatement.setInt(2,2); //for delete


            int rowsAffected=preparedStatement.executeUpdate();

            if(rowsAffected>0){
                System.out.println("data updated Sucessfully");
            }else{
                System.out.println("data not updated");
            }
//            ResultSet resultSet=preparedStatement.executeQuery();
//            if(resultSet.next()){
//                double marks=resultSet.getDouble("marks");
//
//                System.out.println("Marks: " +marks);
//            }else{
//                System.out.println("marks not found");
//            }


        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }
}

