public class cadena {
    public static void main(String[] args) {
        String estacion = "Otoño";



        ///inicio del switch es como una condicional
        switch (estacion){
            case "Verano" :
                System.out.println("es verano");
                break;  // pero esto seguira el sentido de arriba a abajo a menos
        // que se corte la sucesion de eventos con un brake
            case "Invierno":
                System.out.println("es invierno");
                break;
            case "Otoño":
                System.out.println("es otoño");
                break;
            default:
                System.out.println(estacion);
        }
        String HOY = "MIERCOLE";

        switch (HOY){
            case "DOMINGO":
            case "LUNES":
            case "MARTES":
                System.out.println("hoy no se trabaja porque es " + HOY);
            break;

            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
            case "SABADO":
                System.out.println("hoy se trabaja porque es "+ HOY);
            default:
                System.out.println("termino no valido");




        }
    }

}
