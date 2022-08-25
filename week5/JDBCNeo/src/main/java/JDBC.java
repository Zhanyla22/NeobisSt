import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {
    static Connection connection = null;
    static final String url = "jdbc:postgresql://localhost:5433/shop1";
    static final String username = "postgres";
    static final String password = "zhanylaiMamytova";
    public static void main(String[] args) throws SQLException {
        addEmployee("Ulkan", "Muratova", "seller", 2000, 2);
        updateEmployee("Zhanyl", 40000);
        deleteEmployee("Ulkan");

        }
    private static Connection getConnection() throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }

    private static void addEmployee(String name, String lastName, String department, int salary, int workExperienceYear) throws SQLException{
        Connection connection = getConnection();
        if(connection !=null){
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("Insert into Employee(name,last_name,departmentmsalary" +
                        "work_experience_year) values(?,?,?,?,?)");
                preparedStatement.setString(1,name);
                preparedStatement.setString(2,lastName);
                preparedStatement.setString(3,department);
                preparedStatement.setInt(4,salary);
                preparedStatement.setInt(5,workExperienceYear);

                int values = preparedStatement.executeUpdate();
                System.out.println("values added"+values);
            }
            catch (SQLException e){
                e.printStackTrace();
            }
            finally {
                try{
                    if(preparedStatement != null)
                        preparedStatement.close();
                    if (connection !=null)
                        connection.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }

    private static void updateEmployee(String name, int salary) throws SQLException {
        Connection connection = getConnection();
        if( connection !=null){
            PreparedStatement preparedStatement =null;
            try{
                preparedStatement = connection.prepareStatement("UPDATE employee" +
                        "SET salary = ? WHERE name = ?");

                preparedStatement.setString(1,name);
                preparedStatement.setInt(2,salary);
                int values = preparedStatement.executeUpdate();
                System.out.println("values updated"+values);

            }   catch (SQLException e){
            e.printStackTrace();
            }finally {
                try {
                    if(preparedStatement != null)
                        preparedStatement.close();
                    if(connection!=null)
                        connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
    private static void deleteEmployee(String name) throws SQLException{
        Connection connection = getConnection();
        if (connection != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement("DELETE FROM Employee WHERE name = ?");
                preparedStatement.setString(1, name);
                int value = preparedStatement.executeUpdate();
                System.out.println("values deleted: " + value);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (preparedStatement != null)
                        preparedStatement.close();
                    if (connection != null)
                        connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
