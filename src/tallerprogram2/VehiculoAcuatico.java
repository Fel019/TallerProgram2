/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerprogram2;

public class VehiculoAcuatico extends Vehiculo implements Vela {
    private String tipo;
    private int capacidadPasajeros;

    public VehiculoAcuatico(int velocidadActual, int velocidadMaxima, String tipo, int capacidadPasajeros) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void acelerar(int incremento) {
        velocidadActual += incremento;
        if (velocidadActual > velocidadMaxima) {
            velocidadActual = velocidadMaxima;
        }
    }

    @Override
    public void frenar(int decremento) {
        velocidadActual -= decremento;
        if (velocidadActual < 0) {
            velocidadActual = 0;
        }
    }

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento > 80) {
            System.out.println("¡Viento muy fuerte! No se recomienda navegar.");
            velocidadActual = 0;
        } else if (velocidadViento < 10) {
            System.out.println("¡Viento muy débil! No se recomienda navegar.");
        } else {
            System.out.println("Condiciones adecuadas para navegar.");
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de vehículo acuático: " + tipo);
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }
}