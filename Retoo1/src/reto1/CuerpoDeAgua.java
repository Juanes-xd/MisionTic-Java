/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package reto1;

/**
 *
 * @author Asus-PC
 */
public class CuerpoDeAgua extends ObjetoGeografico{
    private String nombre;
    private int id;
    private String tipoCuerpo;
    private String tipoAgua;
    private float irca;

    public CuerpoDeAgua(String nombre, int id, String tipoCuerpo, String tipoAgua, float irca, String municipio) {
        super(municipio);
        this.nombre = nombre;
        this.id = id;
        this.tipoCuerpo = tipoCuerpo;
        this.tipoAgua = tipoAgua;
        this.irca = irca;
    }

    public CuerpoDeAgua() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoCuerpo() {
        return tipoCuerpo;
    }

    public void setTipoCuerpo(String tipoCuerpo) {
        this.tipoCuerpo = tipoCuerpo;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public float getIrca() {
        return irca;
    }

    public void setIrca(float irca) {
        this.irca = irca;
    }
    
    public void clasificacion(float irca){
        String riesgo;
        if(irca >=0 && irca <=5 ){
            riesgo = "Sin riesgo";
        }
        else if(irca >5 && irca <=14){
            riesgo = "Bajo";
        }
        else if(irca >14 && irca <=35){
            riesgo = "Medio";
        }
        else if(irca >35 && irca <=80){
            riesgo = "Alto";
        }
        else if(irca >80 && irca <=100){
            riesgo = "Inviable sanitariamnete";
        }
    }
}
