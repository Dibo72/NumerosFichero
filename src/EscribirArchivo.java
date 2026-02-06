import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class EscribirArchivo {
    public static void Escritor(List<String> lista){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter("archivo.txt"))){

            for(String line : lista){
                escritor.write(line);
                escritor.newLine();
            }
        }catch(Exception e){
            System.out.println("Error al escribir archivo");
        }
    }
}
