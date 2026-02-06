import java.util.Scanner;
public class NumerosFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el numero de lineas");
        int n = sc.nextInt();

        EscribirArchivo.Escritor(GenerarLineas.GLineas(n));
        System.out.println("Archivo copiado");
    }
}