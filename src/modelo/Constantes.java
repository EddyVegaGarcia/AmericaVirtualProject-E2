package modelo;

import static modelo.TipoEmpleado.*;

public class Constantes {

    public static String NOMBRE_EMPLEADO_BUENO_PRETENDIDO = "waylon";
    public static String NOMBRE_EMPLEADO_MALO_PRETENDIDO = "homero";

    public static String SOLO_EMPLEADO_BUENO = "soloEmpleadoBueno";
    public static String SOLO_EMPLEADO_MALO = "soloEmpleadoMalo";

    public static EmpleadoTablaDB EMPLEADODB_BUENO_PRETENDIDO = new EmpleadoTablaDB("waylon", "smithers", BUENO);
    public static EmpleadoTablaDB EMPLEADODB_MALO_PRETENDIDO = new EmpleadoTablaDB( "homero", "simpsom", MALO );

    public static Empleado HOMERO = new EmpleadoMalo();
    public static Empleado SMITHERS = new EmpleadoBueno();
    public static Empleado NUEVO = new EmpleadoNuevo();


}
