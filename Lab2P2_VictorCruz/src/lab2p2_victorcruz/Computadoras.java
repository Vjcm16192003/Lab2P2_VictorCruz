/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_victorcruz;

/**
 *
 * @author Victor Jafet Cruz
 */
public class Computadoras {
    private int tam_pantalla,cap_disco,num_serie,cap_bateria,dur_bateria,time_fab;
    private String modelo,tipo_pocesador,tarjeta_grafica,OS;
    private boolean teclado = false;

    public Computadoras() {
    }
    
    

    public Computadoras(int tam_pantalla, int cap_disco, int num_serie, int cap_bateria, int dur_bateria, int time_fab, String modelo, String tipo_pocesador, String tarjeta_grafica, String OS) {
        this.tam_pantalla = tam_pantalla;
        this.cap_disco = cap_disco;
        this.num_serie = num_serie;
        this.cap_bateria = cap_bateria;
        this.dur_bateria = dur_bateria;
        this.time_fab = time_fab;
        this.modelo = modelo;
        this.tipo_pocesador = tipo_pocesador;
        this.tarjeta_grafica = tarjeta_grafica;
        this.OS = OS;
    }
    
    public Computadoras(int tam_pantalla, int cap_disco, int num_serie, int cap_bateria, int dur_bateria, int time_fab, String modelo, String tipo_pocesador, String tarjeta_grafica, String OS,boolean teclado) {
        this.tam_pantalla = tam_pantalla;
        this.cap_disco = cap_disco;
        this.num_serie = num_serie;
        this.cap_bateria = cap_bateria;
        this.dur_bateria = dur_bateria;
        this.time_fab = time_fab;
        this.modelo = modelo;
        this.tipo_pocesador = tipo_pocesador;
        this.tarjeta_grafica = tarjeta_grafica;
        this.OS = OS;
        this.teclado = teclado;
    }

    public int getTam_pantalla() {
        return tam_pantalla;
    }

    public void setTam_pantalla(int tam_pantalla) {
        this.tam_pantalla = tam_pantalla;
    }

    public int getCap_disco() {
        return cap_disco;
    }

    public void setCap_disco(int cap_disco) {
        this.cap_disco = cap_disco;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public int getCap_bateria() {
        return cap_bateria;
    }

    public void setCap_bateria(int cap_bateria) {
        this.cap_bateria = cap_bateria;
    }

    public int getDur_bateria() {
        return dur_bateria;
    }

    public void setDur_bateria(int dur_bateria) {
        this.dur_bateria = dur_bateria;
    }

    public int getTime_fab() {
        return time_fab;
    }

    public void setTime_fab(int time_fab) {
        this.time_fab = time_fab;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo_pocesador() {
        return tipo_pocesador;
    }

    public void setTipo_pocesador(String tipo_pocesador) {
        this.tipo_pocesador = tipo_pocesador;
    }

    public String getTarjeta_grafica() {
        return tarjeta_grafica;
    }

    public void setTarjeta_grafica(String tarjeta_grafica) {
        this.tarjeta_grafica = tarjeta_grafica;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public boolean isTeclado() {
        return teclado;
    }

    public void setTeclado(boolean teclado) {
        this.teclado = teclado;
    }
    
    public String PasaBoolean(){
        String tec="";
        if(teclado==true){
            tec+= "Si";
        }else{
            tec+= "No";
        }//fin de la condicion
        return tec;
    }//fin del metodo que pasa de Boolean a String Si o No

    @Override
    public String toString() {
        return "\nTamaño de La Pantalla: " + tam_pantalla 
                + "\nCapacidad del Disco: " + cap_disco 
                + "\nNumero de Serie: " + num_serie 
                + "\nCapacidad de Bateria: " + cap_bateria 
                + "\nDuracion de Bateria" + dur_bateria 
                + "\nTiempo De Fabricacion" + time_fab 
                + "\nModelo de la PC: " + modelo 
                + "\nTipo de Procesador: " + tipo_pocesador 
                + "\nTarjeta Grafica: " + tarjeta_grafica 
                + "\nSistema Operativo: " + OS 
                + "\nTeclado: " + PasaBoolean();
    }//fin del metodo to String
    
    
    
}
