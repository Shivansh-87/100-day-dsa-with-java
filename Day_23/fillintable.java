import java.sql.*;
//agar table me new entry fill karni hai
public class fillintable {
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
            Statement statement = connection.createStatement();
            String query=String.format("INSERT INTO students(name,age,marks) VALUES('%s',%o,%f)","Rahul",23,74.5);
            //String query=String.format("UPDATE students SET marks=%f WHERE id=%d",89.5,2);//if u want to update marks of id 2
            //String query= "DELETE FROM students WHERE ID=2"; //if u want to delete the record of id 2
            int rowsAffected=statement.executeUpdate(query);
            if(rowsAffected>0){
                System.out.println("Data Inserted Sucessfully");
            }else{
                System.out.println("data not inserted");
            }


        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }
}
