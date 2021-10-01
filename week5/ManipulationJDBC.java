package com.company;

import java.sql.*;

public class Main {
    static final String username = "Zhanylai";
    static final String password = "mules1234!";
    static final String url = "jdbc:mysql://localhost:3306/shop";


    public static void main(String[] args) throws SQLException {

        addEmployee("Ulkan", "Muratova", "seller", 2000, 2);
       // updateEmployee(30000, "Ulkan");
       // deleteEmployee("Ulkan");

    }

    private static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private static void addEmployee(String name, String last_name, String department, int salary, int work_experience_year) throws SQLException {
        Connection conn = getConnection();
        if (conn != null) {
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = conn.prepareStatement("Insert into Employee(name,last_name,department,salary" +
                        "work_experience_year)  values(?,?,?,?,?)");
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, last_name);
                preparedStatement.setString(3, department);
                preparedStatement.setInt(4, salary);
                preparedStatement.setInt(5, work_experience_year);

                int values = preparedStatement.executeUpdate();
                System.out.println("values added: " + values);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (preparedStatement != null)
                        preparedStatement.close();
                    if (conn != null)
                        conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }


//    private static void updateEmployee(int salary,String name ) throws SQLException {
//        Connection conn = getConnection();
//        if (conn != null) {
//            PreparedStatement preparedStatement = null;
//            try {
//                preparedStatement = conn.prepareStatement("UPDATE employee" +
//                        " SET salary = ? WHERE name = ? ");
//
//                preparedStatement.setInt(1, salary);
//                preparedStatement.setString(2, name);
//                int values = preparedStatement.executeUpdate();
//                System.out.println("values updated: " + values);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    if (preparedStatement != null)
//                        preparedStatement.close();
//                    if (conn != null)
//                        conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//    private static void deleteEmployee(String name) throws SQLException {
//        Connection conn = getConnection();
//        if (conn != null) {
//            PreparedStatement preparedStatement = null;
//            try {
//                preparedStatement = conn.prepareStatement("DELETE FROM Employee WHERE name = ?");
//                preparedStatement.setString(1, name);
//                int value = preparedStatement.executeUpdate();
//                System.out.println("values deleted: " + value);
//            } catch (SQLException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    if (preparedStatement != null)
//                        preparedStatement.close();
//                    if (conn != null)
//                        conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }



}
