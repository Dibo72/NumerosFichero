import java.util.ArrayList;
import java.util.List;

public class GenerarLineas {
    public static List<String> GLineas(int lineas) {
        List<String> lista = new ArrayList<>();
        String cadena = "";
        for(int i = 0; i < lineas; i++) {
            lista.add( cadena += " " + (i+1));
        }
        return lista;
    }

}
