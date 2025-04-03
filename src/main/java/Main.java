import javax.swing.JOptionPane;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        Batallon batallon = new Batallon("Batallon Alfa", "2025-04-01", "Base Militar");
        int opcion;


        do{
            String menu = """
                    MENÚ BATALLON
                    1. Agregar Vehículo
                    2. Agregar Mision
                    3. Buscar Vehículo
                    4. Buscar Mision
                    5. Eliminar Vehículo
                    6. Eliminar Mision
                    7. salir del programa
                    
                    """;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion){
                case 1 -> { // Agregar vehículo
                    String id = JOptionPane.showInputDialog("Ingrese ID del vehículo:");
                    String modelo= JOptionPane.showInputDialog("Ingrese el modelo del modelo");
                    String fechafabricacion = JOptionPane.showInputDialog("Ingrese la fecha de fabricacion");
                    String kilometraje= JOptionPane.showInputDialog("Ingrese el kilometraje");
                    EstadoOperativo estadoOperativo=JOptionPane.showInputDialog("ingrese el estado operativo del vehiculo");



                    batallon.agregarVehiculo(nuevoVehiculo);
                    JOptionPane.showMessageDialog(null, "Vehículo agregado con éxito");
                }

                case 2 -> { // Agregar misión
                    String codigoMision = JOptionPane.showInputDialog("Ingrese código de misión:");
                    String fecha = JOptionPane.showInputDialog("Ingrese fecha de misión:");
                    String ubicacion = JOptionPane.showInputDialog("Ingrese ubicación:");
                    String personalAsignado = JOptionPane.showInputDialog("Ingrese personal asignado:");

                    LinkedList<Vehiculo> vehiculos = new LinkedList<>();
                    Mision nuevaMision = new Mision(fecha, ubicacion, personalAsignado, vehiculos, codigoMision);

                    batallon.crearMision(nuevaMision);

                    JOptionPane.showMessageDialog(null, "Misión agregada con éxito");
                }

            }






}