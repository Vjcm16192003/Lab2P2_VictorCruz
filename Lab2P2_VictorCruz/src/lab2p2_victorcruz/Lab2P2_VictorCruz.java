package lab2p2_victorcruz;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab2P2_VictorCruz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Computadoras> compus = new ArrayList();
        int opcion = 0;
        while (opcion != 3) {
            System.out.println("***MENU ADMINISTRATIVO***");
            System.out.println("***BIENVENIDO ADMIN***");
            System.out.println("1. Reporte de los Computadoras\n"
                    + "2. Manejo de Computadoras\n"
                    + "3. Salir\n");
            System.out.println("Ingrese una Opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    if (compus.isEmpty()) { //Condicion que verifica si existen restaurantes para Listar
                            System.out.println("No hay nada que reportar, no se han agregado Computadoras");
                        } else {
                    System.out.println("1. Reporte 1\n"
                            + "2. Reporte 2\n"
                            + "3. Reporte 3\n");
                    int opc1 = 0;
                    System.out.println("Ingrese una opcion");
                    opc1 = sc.nextInt();
                    switch (opc1) {
                        case 1:
                            for (int i = 0; i < compus.size(); i++) {//for que recorre la lista
                                if (compus.get(i).getTarjeta_grafica().equalsIgnoreCase("Gamer") && 
                                    compus.get(i).getTam_pantalla()> 17 && 
                                    compus.get(i).isTeclado()== true) {
                                    
                                     System.out.println(i+")"+compus.get(i));
                                }else{
                                    System.out.println("No  se imprime Nada M8");
                                }//fin de la condicion
                            }//fin del for
                            break;
                        case 2://Reporte 2
                            for (int i = 0; i < compus.size(); i++) {//for que recorre la lista
                                if (compus.get(i).getCap_disco()< 300 && 
                                    compus.get(i).getOS().equalsIgnoreCase("ChromeOS") && 
                                    compus.get(i).getTam_pantalla()< 13) {
                                    
                                     System.out.println(i+")"+compus.get(i));
                                }else{
                                    System.out.println("No se imprime Nada M8");
                                }//fin de la condicion
                            }//fin del for
                            
                            break;
                        case 3://Reporte 3
                            for (int i = 0; i < compus.size(); i++) {//for que recorre la Lista
                                if (compus.get(i).getTime_fab()< 2 && 
                                    compus.get(i).getDur_bateria()< 1 && 
                                    compus.get(i).getOS().equalsIgnoreCase("Windows")) {
                                    
                                     System.out.println(i+")"+compus.get(i));
                                }else{
                                    System.out.println("No se imprime Nada M8");
                                }//fin de la condicion
                            }//fin del for
                            break;
                        default:
                            System.out.println("BYE!!");

                    }//fin del switch de los Reportes
                    }//fin de la condicion
                    break;//fin del case Reportes
                case 2:
                    System.out.println("1. Agregar Computadoras\n"
                            + "2. Modifcar Computadoras\n"
                            + "3. Eliminar Computadoras\n"
                            + "4. Listar Computadoras\n");
                    int opc2 = 0;
                    System.out.println("Ingrese una Opcion");
                    opc2 = sc.nextInt();
                    switch (opc2) {
                        case 1: {//Agregar
                            int tam_pantalla, cap_disco, num_serie, cap_bateria, dur_bateria, time_fab;
                            String modelo, tipo_pocesador, tarjeta_grafica, OS;
                            String tec;
                            System.out.println("Ingrese el Tamaño de la Pantalla de su Computadora(En pulgadas): ");
                            tam_pantalla = sc.nextInt();
                            System.out.println("Ingrese La capacidad del Disco Duro(en GB): ");
                            cap_disco = sc.nextInt();
                            System.out.println("Ingrese el numero de serie: ");
                            num_serie =sc .nextInt(); 
                            for (int i = 0; i < compus.size(); i++) {
                                while (compus.get(i).getNum_serie()== num_serie) {
                                    System.out.println("El numero de serie que ingreso ya existe porfavor ingrese otro: ");
                                    num_serie = sc.nextInt();
                                }//fin del while
                            }//fin del for que recorre la lista para validar el numero de serie
                            System.out.println("Ingrese la Capacidad de la Bateria: ");
                            cap_bateria = sc.nextInt();
                            System.out.println("Ingrese la duracion de su Bateria(en horas): ");
                            dur_bateria = sc.nextInt();
                            System.out.println("Ingrese el Tiempo de Fabricacion(en horas): ");
                            time_fab = sc.nextInt();
                            System.out.println("Ingrese el Modelo de su computadora: ");
                            modelo = sc.next();
                            System.out.println("Ingrese el tipo de su Prcesador");
                            tipo_pocesador = sc.next();
                            System.out.println("Ingrese el tipo de Tarjeta Grafica(Gamer/Normal");
                            tarjeta_grafica = sc.next();
                            while (!tarjeta_grafica.equalsIgnoreCase("Gamer") && !tarjeta_grafica.equalsIgnoreCase("Normal")) {
                                System.out.println("Por favor esriba solo Gamer o Normal");
                                System.out.println("Ingrese el tipo de Tarjeta Grafica(Gamer/Normal");
                                tarjeta_grafica = sc.next();
                            }//fin del while que valida correctamente los datos

                            System.out.println("Ingrese el Sistema Operativo(Windows/ChromeOS");
                            OS = sc.next();
                            while (!OS.equalsIgnoreCase("Windows") && !OS.equalsIgnoreCase("ChromeOS")) {
                                System.out.println("Por favor esriba solo Windows o ChromeOS");
                                System.out.println("Ingrese el tipo de Tarjeta Grafica(Gamer/Normal");
                                OS = sc.next();
                            }//fin del while que valida correctamente los datos
                            System.out.println("Tiene Teclado Numerico? (Si/No): ");
                            tec = sc.next();
                            while (!tec.equalsIgnoreCase("Si") && !tec.equalsIgnoreCase("No")) {
                                System.out.println("Por favor ingrese (si/no): ");
                                tec = sc.next();
                            }//fin del while que valida correctamente los datos

                            if (tec.equalsIgnoreCase("Si")) {
                                boolean t = true;
                                compus.add(new Computadoras(tam_pantalla, cap_disco, num_serie, cap_bateria, dur_bateria, time_fab, modelo, tipo_pocesador, tarjeta_grafica, OS, t));
                            } else {
                                compus.add(new Computadoras(tam_pantalla, cap_disco, num_serie, cap_bateria, dur_bateria, time_fab, modelo, tipo_pocesador, tarjeta_grafica, OS));
                            }//fin de la condicion
                            System.out.println("SE HA AGREGADO EXITOSAMENTE!!!!");
                        }//fin del case 1    
                        break;

                        case 2://Modificar
                            if (compus.isEmpty()) {
                                System.out.println("No hay Computadroas para modificar");
                            } else {
                                System.out.println("Ingrese posicion para modificar una Computadora");
                                for (int i = 0; i < compus.size(); i++) { //Imprime solo el numero de Serie
                                    System.out.println("En la posicion " + i + ") " + ", está: " + compus.get(i).getNum_serie());
                                }//fin del for
                                System.out.print("Ingrese poscion: ");
                                int pos = sc.nextInt();
                                int tam_pantalla, cap_disco, cap_bateria, dur_bateria, time_fab;
                                String modelo, tipo_pocesador, tarjeta_grafica, OS;
                                String tec;
                                System.out.println("\nModificando...");
                                int opc3 = 0;
                                System.out.println("***MENU***");
                                System.out.println("1. Tam. Pantalla"
                                        + "2. Capacidad Disco Duro"
                                        + "3. Capacidad Bateria"
                                        + "4. Duracion Bateria"
                                        + "5. Tiempo de Fabricacion"
                                        + "6. Modelo de Computadora"
                                        + "7. Tipo de Procesador"
                                        + "8. Tipo de Tarjeta Grafica"
                                        + "9. Tipo de Sistema Operativo"
                                        + "10. Teclado Numerico");
                                System.out.println("Ingrese Atributo a Modificar");
                                switch (opc3) {
                                    case 1:
                                        System.out.println("Ingrese el Tamaño de la Pantalla de su Computadora(En pulgadas): ");//1
                                        tam_pantalla = sc.nextInt();
                                        compus.get(pos).setTam_pantalla(tam_pantalla);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese La capacidad del Disco Duro(en GB): ");//2
                                        cap_disco = sc.nextInt();
                                        compus.get(pos).setCap_disco(cap_disco);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la Capacidad de la Bateria: ");//3
                                        cap_bateria = sc.nextInt();
                                        compus.get(pos).setCap_bateria(cap_bateria);
                                        break;
                                    case 4:
                                        System.out.println("Ingrese la duracion de su Bateria(en horas): ");//4
                                        dur_bateria = sc.nextInt();
                                        compus.get(pos).setDur_bateria(dur_bateria);
                                        break;
                                    case 5:
                                        System.out.println("Ingrese el Tiempo de Fabricacion(en horas): ");//5
                                        time_fab = sc.nextInt();
                                        compus.get(pos).setTime_fab(time_fab);
                                        break;
                                    case 6:
                                        System.out.println("Ingrese el Modelo de su computadora: ");//6
                                        modelo = sc.next();
                                        compus.get(pos).setModelo(modelo);
                                        break;
                                    case 7:
                                        System.out.println("Ingrese el tipo de su Prcesador");//7
                                        tipo_pocesador = sc.next();
                                        compus.get(pos).setTipo_pocesador(tipo_pocesador);
                                        break;
                                    case 8:
                                        System.out.println("Ingrese el tipo de Tarjeta Grafica(Gamer/Normal");//8
                                        tarjeta_grafica = sc.next();
                                        compus.get(pos).setTarjeta_grafica(tarjeta_grafica);
                                        while (!tarjeta_grafica.equalsIgnoreCase("Gamer") && !tarjeta_grafica.equalsIgnoreCase("Normal")) {
                                            System.out.println("Por favor esriba solo Gamer o Normal");
                                            System.out.println("Ingrese el tipo de Tarjeta Grafica(Gamer/Normal");
                                            tarjeta_grafica = sc.next();
                                            compus.get(pos).setTarjeta_grafica(tarjeta_grafica);
                                        }//fin del while que valida correctamente los datos
                                        break;
                                    case 9:
                                        System.out.println("Ingrese el Sistema Operativo(Windows/ChromeOS");//9
                                        OS = sc.next();
                                        compus.get(pos).setOS(OS);
                                        while (!OS.equalsIgnoreCase("Windows") && !OS.equalsIgnoreCase("ChromeOS")) {
                                            System.out.println("Por favor esriba solo Windows o ChromeOS");
                                            System.out.println("Ingrese el tipo de Tarjeta Grafica(Gamer/Normal");
                                            OS = sc.next();
                                            compus.get(pos).setOS(OS);
                                        }//fin del while que valida correctamente los datos
                                        break;
                                    case 10:
                                        System.out.println("Tiene Teclado Numerico? (Si/No): ");//10
                                        tec = sc.next();
                                        while (!tec.equalsIgnoreCase("Si") && !tec.equalsIgnoreCase("No")) {
                                            System.out.println("Por favor ingrese (si/no): ");
                                            tec = sc.next();
                                        }//fin del while que valida correctamente los datos
                                        if (tec.equalsIgnoreCase("Si")) {
                                            boolean t = true;
                                            compus.get(pos).setTeclado(t);
                                        } else {
                                            System.out.println("");
                                        }//fin de la condicion
                                        break;
                                    default:
                                        System.out.println("BYEEEE!!!!");
                                }//fin del switch case
                                System.out.println("SE HA MODIFICADO EXITOSAMENTE!!!!");

                            }//fin de la condicion

                            break;
                        case 3://Eliminar
                            if (compus.isEmpty()) {
                                    System.out.println("No hay Computadoras agregados");
                                } else {
                                    System.out.println("Ingrese la posicion del restaurante a eliminar ");
                                    for (int i = 0; i < compus.size(); i++) {
                                        System.out.println("En la posicion " + i +") "+ ", está: " + compus.get(i).getNum_serie());
                                    }//fin del for que recorre la lista
                                    System.out.print("Ingrese poscion: ");
                                    int pos = sc.nextInt();
                                    compus.remove(pos);
                                    System.out.println("Se ha eliminado La Computadora satisfactoriamente!!!");
                                }//fin de la condicon
                            break;
                        case 4://Listar
                            if (compus.isEmpty()) {
                                    System.out.println("No hay Computadoras agregados");
                                } else {
                                    System.out.println("\nCOMPUTADORAS");
                                    for (Object c : compus) {
                                        System.out.println(compus.indexOf(c) +")"+ c+"\n");
                                    }//fin del for especial
                                }//fin de la condicion
                            break;
                        default:
                            System.out.println("BYE!!!");
                    }//fin del switch del CRUD
                    break;//fin del CRUD
                case 3:
                    System.out.println("Gracias, Vuelva Pronto!!!");
                    break;//FIN DE TODO
                default:
                    System.out.println("LOGGIN OFF!!!");
            }//fin del Switch Principal
        }//fin del While
        System.out.println("BYE!!!!");
    }//fin del main
}//fin de la Clase

