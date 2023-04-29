public class amongus {

    int Supervivientes = 7;
    public void Matar(){
        this.Supervivientes--;}

    public static void main(String[] args) {
        amongus Traidor = new amongus();
        System.out.println("tenemos " + Traidor.Supervivientes);
        Traidor.Matar();
        System.out.println("Despues de la traicion de un tripulante tenemos " + Traidor.Supervivientes);
    }

}