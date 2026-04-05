package Day_25;
import java.sql.*;
import java.util.Scanner;

public class transactionalprog{
    private static final String url="";
    private static final String username="";
    private static final String password="";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection=DriverManager.getConnection(url,username,password);
            connection.setAutoCommit(false);
            String debit_query="UPDATE accounts SET balance=balance-? WHERE account_number=?";
            String credit_query="UPDATE accounts SET balance=balance+? WHERE account_number=?";
            PreparedStatement debitpreparedStatement=connection.prepareStatement(debit_query);
            PreparedStatement creditpreparestatement=connection.prepareStatement(credit_query);
            Scanner sc=new Scanner(System.in);
            System.out.println("enter account number: ");
            int account_number=sc.nextInt();
            System.out.println("enter amount: ");
            double amount=sc.nextDouble();
            debitpreparedStatement.setDouble(1, amount);
            debitpreparedStatement.setInt(2, account_number);
            creditpreparestatement.setDouble(1, amount);
            creditpreparestatement.setInt(2, account_number);
            debitpreparedStatement.executeUpdate();
            creditpreparestatement.executeUpdate();
            if(isSufficient(connection,amount,account_number)){
                connection.commit();
                System.out.println("sucksexful");
            }else{
                connection.rollback();
                System.out.println("failed");
            }
            debitpreparedStatement.close();
            creditpreparestatement.close();
            sc.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        

    }
    static boolean isSufficient(Connection connection,int account_number,double amount){
        try {
            String query="SELECT FROM balance WHERE account_number=?";
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,account_number);
            ResultSet resultSet=preparedStatement.executeQuery();
            if(resultSet.next()){
                double current_balance=resultSet.getDouble("balance");
                if(amount>current_balance){
                    return false;
                }else{
                    return true;
                }
            }
            resultSet.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }
}