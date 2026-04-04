
import java.sql.*;
import java.util.Scanner;

//agar table me new entry fill karni hai
public class statementbatch {
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
            Statement statement=connection.createStatement();
            Scanner scanner=new Scanner(System.in);
            while(true){
                System.out.println("enter name: ");
                String name=scanner.next();
                System.out.println("enter age: ");
                int age=scanner.nextInt();
                System.out.println("enter marks: ");
                double marks=scanner.nextDouble();
                System.out.println("enter more data(Y/N): ");
                String choice=scanner.next();
                String query=String.format("INSERT INTO students(name,age,marks) VALUES('%s',%d,%f)",name,age,marks);
                
                statement.addBatch(query);
                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }
            int[] arr=statement.executeBatch();



            //preparedStatement.setInt(1,1);
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    System.out.println("Query: "+i+ "not executed sucksexfully");
                }
            }



            


        }catch(SQLException e){
            System.out.println(e.getMessage());

        }

    }
}

