/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package componenteteorico11;

/**
 *
 * @author Daniel
 */
public interface Vehiculo extends VehiculoConRuedas {
    
    // atributos (public static final)
    public static final boolean TIENE_MOTOR = true; // Todo atributo definido en una interfaz es público, static y final. Así no se especifique.
    int VELOCIDAD_MAXIMA = 120;
    
    // métodos (public abstract)
    public abstract int acelerar(int kms);
    public abstract int frenar(int kms);
}
