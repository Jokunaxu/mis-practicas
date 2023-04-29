public class bucle {
    public static void main(String[] args) {

        //inicio del bloque                              //accion
        for(int contador = 1; contador <= 5; contador = contador +1){
            System.out.println(contador); //fin del bloque
            ///se ejecuta la accion, solo despues de terminar todo el bloque
    }
        int valores[] = {10, 20, 30, 40, 50 };

        for (int i = 0; i < valores.length; i++)
        System.out.println(valores[i]);

        //lista de objetos, el valor i=0 es un valor interno que se puede llamar en la variable objetos
        //importante poner la variable i entre [i] de esta forma se toma su valor en el sout
        //si se va sumando de uno en uno va a seguir la secuencia de objetos
                             //0            1            2     hasta el numero de objetos que desee
        String objetos[] = {"caramelos", "comida", "herramientas"};

        for (int i = 0; i < objetos.length; i+= 2)
            System.out.println(objetos[i]);
        for (int i = 0; i < objetos.length; i++)
            System.out.println(objetos[i]);
}
}
