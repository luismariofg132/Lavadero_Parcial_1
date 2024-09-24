/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lmfg0
 */
public class Vehiculo {
    private String placa;
    private String propietario;
    private tipoVehiculo vehiculo;
    private tipoLavado lavado;
    private boolean finalizado;
    private double ganancia;
    private double costo;
    private boolean isActive = true;

    public boolean IsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public Vehiculo(){
        this.costo = 0;
        this.ganancia = 0;
        this.finalizado = false;
    }
    
    public Vehiculo(String placa, String propietario, tipoVehiculo vehiculo, tipoLavado lavado, boolean finalizado, double ganancia, double costo) {
        this.placa = placa;
        this.propietario = propietario;
        this.vehiculo = vehiculo;
        this.lavado = lavado;
        this.finalizado = finalizado;
        this.ganancia = ganancia;
        this.costo = costo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public tipoVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(tipoVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public tipoLavado getLavado() {
        return lavado;
    }

    public void setLavado(tipoLavado lavado) {
        this.lavado = lavado;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
}
