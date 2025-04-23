
package tallerprogram2;




  public class Main {
    public static void main(String[] args) {
      
        VehiculoTerrestre camioneta = new VehiculoTerrestre(0, 180, 4, "civil");
        camioneta.acelerar(60);
        camioneta.frenar(20);
        int revoluciones = camioneta.calcularRevolucionesMotor(300, 5);
        System.out.println("Revoluciones del motor: " + revoluciones);
        camioneta.imprimir();

        System.out.println("--------------------------");

      
        VehiculoAcuatico motoAcuatica = new VehiculoAcuatico(0, 90, "superficie", 2);
        motoAcuatica.acelerar(40);
        motoAcuatica.frenar(10);
        motoAcuatica.recomendarVelocidad(85);
        motoAcuatica.imprimir();
    }
}

