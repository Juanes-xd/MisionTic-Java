/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
        
/**
 *
 * @author faanb
 */
public class ModeloBase {
    // Obtener el driver que va a manejar la conexion con la base de datos
    protected static Driver driverSqlite = new org.sqlite.JDBC();
    protected static Connection conn;
    
    public static void conectarConBaseDeDatos(){
        // Aquí haremos cosas peligrosas que pueden salir muy mal, por eso 
        // se usa el try catch.
        if (conn==null){
            try{
                // Informar al Java que nos vamos a conectar a una base de datos
                DriverManager.registerDriver(driverSqlite);
                // Esta conexion representa la base de datos como tal
                conn = DriverManager.getConnection("jdbc:sqlite:src/recursos/bd_veterinaria.db");
            }
            catch(Exception e){
                System.out.println("Erro al conectar con la base de datos: " + e.getMessage());
            }
        }
    }
    
}
