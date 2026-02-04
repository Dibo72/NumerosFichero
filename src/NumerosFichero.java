import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
public class NumerosFichero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "";
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter("archivo.txt"))){
            System.out.println("Ingrese el numero de lineas:");
            int lineas = sc.nextInt();

            for(int i = 0; i < lineas; i++){
                cadena += " " + (i+1);
                escritor.write(cadena);
                escritor.newLine();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader lector = new BufferedReader(new FileReader("archivo.txt"))){
            String linea;
            while((linea = lector.readLine()) != null){
                System.out.println(linea);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}