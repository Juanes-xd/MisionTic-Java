/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder_principal;

/**
 *
 * @author faanb
 */
public class Perro {
    public String nombre;
    public String raza;
    public int anho_nacimiento;
    public int tamanho_cm;
    public String color;
    public boolean castrado;
    public String sexo;
    public boolean tiene_pedigree;
    public Perro padre;
    public Perro madre;
    
    public String obtenerInfo() {
        return nombre + " Edad:" + (2022-anho_nacimiento) + "("+ raza+")";
    }
   
}
