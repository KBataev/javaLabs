package com.example.idz12;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException {
        String connectionString = "jdbc:mysql://" + dbHost + ":"
                +dbPort  + "/" + dbName;
        Class.forName("com.mysql.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser,dbPass);
        return dbConnection;
    }


    //получение данных с бд
    public ArrayList<String> getWorkers(String position) throws SQLException, ClassNotFoundException {
        String select = "SELECT Name, Surname, Patronymic, phoneNumber, DateBirth, City, HB, IdPas, PlasePas, DatePas, salary FROM anketa WHERE position = '" + position + "';";
        PreparedStatement prSt = getDbConnection().prepareStatement(select);
        ResultSet rs =  prSt.executeQuery();
        while (rs.next()) {

            String name = rs.getString("Name");
            String surname = rs.getString("Surname");
            String patronymic = rs.getString("Patronymic");
            String phoneNumber = rs.getString("phoneNumber");
            String DateBirth = rs.getString("DateBirth");
            String City  = rs.getString("City");
            String HB = rs.getString("HB");
            String IdPas = rs.getString("IdPas");
            String PlasePas = rs.getString("PlasePas");
            String DatePas = rs.getString("DatePas");
            String salary = rs.getString("salary");

            System.out.println( "Имя: " + name +
                    ", Фамилия: " + surname +
                    ", Отчество: " + patronymic +
                    ", номер телефона: " + phoneNumber +
                    ", дата рождения: " + DateBirth +
                    ", Город: " + City +
                    ", номер пасспорта: " + HB +
                    ", идентификационный номер: " + IdPas +
                    ", место выдачи пасспорта: " + PlasePas +
                    ", дата выдачи пасспорта: " + DatePas +
                    ", предварительная зарплата: " + salary );


        }
        return null;

    }

    public void signUpUser(String Name, String Surname, String Patronymic, String phoneNubmber, String DateBirth, String City, String HB, String IdPas,String PlacePas, String DatePas, String position, String salary) throws SQLException, ClassNotFoundException { //добавление данных в бд
        String insert = "INSERT INTO " + Const.USER_TABLE + "(" +
                Const.USER_NAME + "," +
                Const.USER_SURNAME + "," +
                Const.USER_PATRONYMIC + "," +
                Const.USER_PHONENUMBER + "," +
                Const.USER_DATEBIRTH + "," +
                Const.USER_CITY + "," +
                Const.USER_HB + "," +
                Const.USER_IDPAS + "," +
                Const.USER_PLACEPAS + "," +
                Const.USER_DATEPAS + "," +
                Const.USER_POSITION + "," +
                Const.USER_SALARY + ")"  +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement prSt = getDbConnection().prepareStatement(insert);
        prSt.setString(1, Name);
        prSt.setString(2, Surname);
        prSt.setString(3, Patronymic);
        prSt.setString(4, phoneNubmber);
        prSt.setString(5, DateBirth);
        prSt.setString(6, City);
        prSt.setString(7, HB);
        prSt.setString(8, IdPas);
        prSt.setString(9, PlacePas);
        prSt.setString(10, DatePas);
        prSt.setString(11, position);
        prSt.setString(12, salary);

        prSt.executeUpdate();



    }
}
