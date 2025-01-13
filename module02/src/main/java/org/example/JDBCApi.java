package org.example;

import javax.swing.*;
import java.sql.*;

public class JDBCApi {
    public static void main(String[] args) {
        final String url = "jdbc:postgresql://localhost:5432/postgres";
        final String username = "myuser";
        final String password = "12345";

//
//        CreateTable(url,username,password);
//        AlterTable(url, username, password);
        delete_column(url, username, password);
//        Insert_table(url, username, password);
//        UpdateData(url,username,password);
//        Selectdata(url,username,password);
//        drop_table2(url, username, password);
//        truncate_table(url,username,password);
//        delete_table(url, username, password);



    }
    public static void CreateTable(String url,String username,String password) {
        String CREATE_TABLE = "CREATE TABLE Student(\n" +
                "    id  serial primary key ,\n" +
                "    name varchar(40),\n" +
                "    surname varchar(40),\n" +
                "    age int\n" +
                ")";
        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement =connection.createStatement();
            statement.execute(CREATE_TABLE);
            System.out.println("yeni table yaratdiq");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void AlterTable(String url,String username,String password) {
        String ALTER_TABLE = "ALTER TABLE Student  ADD COLUMN email varchar(255)";
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            PreparedStatement statement = connection.prepareStatement(ALTER_TABLE);
            statement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void Insert_table(String url,String username,String password) {
        String INSERT_INTO = "Insert into Student(id,name,surname,age)values (?,?,?,?)";
        try(        Connection connection = DriverManager.getConnection(url,username,password)){
            PreparedStatement preparedStatement =connection.prepareStatement(INSERT_INTO);
            preparedStatement.setInt(1,1);
            preparedStatement.setString(2,"Ilkin");
            preparedStatement.setString(3,"Mirzeyev");
            preparedStatement.setInt(4,24);
            preparedStatement.executeUpdate();

            preparedStatement.setInt(1,2);
            preparedStatement.setString(2,"Sona");
            preparedStatement.setString(3,"Abdulov");
            preparedStatement.setInt(4,24);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    public static void UpdateData(String url,String username,String password) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String UPDATE_COLUMN = "UPDATE student SET name = ?, age = ? WHERE id = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_COLUMN);
            preparedStatement.setString(1, "Huseyn"); // New name value
            preparedStatement.setInt(2, 21); // New age value
            preparedStatement.setInt(3, 25); // ID of the student to be updated

            preparedStatement.executeUpdate();
            System.out.println("Update successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static void Selectdata(String url,String username,String password) {
        String Select = "SELECT name, surname, age FROM student where name = 'Huseyn'";
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(Select);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + " " + resultSet.getString("surname") + " " + resultSet.getInt("age"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void drop_table2(String url,String username,String password){
        String Drop_table = "DROP TABLE IF EXISTS Student";
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            PreparedStatement preparedStatement = connection.prepareStatement(Drop_table);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void truncate_table(String url,String username,String password){
        String Truncate_table = "TRUNCATE TABLE Student";
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            PreparedStatement preparedStatement = connection.prepareStatement(Truncate_table);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void delete_table(String url,String username,String password){
        String delete_table = "DELETE FROM STUDENT WHERE ID = ?";
        try(Connection connection = DriverManager.getConnection(url, username, password)){
            PreparedStatement preparedStatement = connection.prepareStatement(delete_table);
            preparedStatement.setInt(1,25);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void delete_column(String url,String username,String password){

        try(Connection connection = DriverManager.getConnection(url, username, password)){
            String delete_column = "Alter table Student DROP COLUMN email";
            PreparedStatement preparedStatement = connection.prepareStatement(delete_column);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
