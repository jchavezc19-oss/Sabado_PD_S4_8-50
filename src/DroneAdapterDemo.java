public class DroneAdapterDemo {
    public static void main(String[] args) {
        System.out.println("=== Patrón Adapter: Drone → Pato ===\n");
        
        // Crear un drone
        SuperDrone superDrone = new SuperDrone();
        
        // Adaptarlo a Pato
        Pato adaptador = new AdaptadorDrone(superDrone);
        
        System.out.println("--- Usando el adaptador como si fuera un Pato ---");
        adaptador.cuaquear();
        adaptador.volar();
    }
}