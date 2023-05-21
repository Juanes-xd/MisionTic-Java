/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

import static clase9.ModeloBase.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author faanb
 */
public class Canino extends ModeloBase{
    private int id;
    private static int contador;
    
    public String sexo;
    public String raza;
    public int edad;
    
    public Canino(int id, String raza, String sexo, int edad){
        super();
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        
        contador ++;
        id = contador;
    }
    
    
    public static Canino crearEnBaseDeDatos( String raza, String sexo, int edad){
        int id = 0;
        // Creando el Canino
        try{
            PreparedStatement query = conn.prepareStatement("Insert INTO Canino (raza, edad, sexo) VALUES (?, ?, ?);");
            query.setString(1, raza);
            query.setInt(2, edad);
            query.setString(3, sexo);
            
            query.execute();
        }catch(Exception e){
            System.out.println("Error al crear el perro: " + e.getMessage());
        }
        
        // Consultando el id del canino recien creado 
        try {
            // Revisamos si regesó algun resultado
            PreparedStatement query = conn.prepareStatement("Select MAX(id) as id From Canino");
            ResultSet resultado = query.executeQuery();
            
            if (resultado.next() && resultado != null) {
                id = resultado.getInt("id");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el perro: " + e.getMessage());
        }
        
        Canino canino_creado = new Canino(id, raza, sexo, edad);
        return canino_creado;
    }
    
    
    public int getId() throws SQLException{
        PreparedStatement query = conn.prepareStatement("");
        return 0;
    }    
}
