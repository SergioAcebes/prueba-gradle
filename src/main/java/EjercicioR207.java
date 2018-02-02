import java.util.ArrayList;
class EjercicioR207
{
    public String devolverEnOrden(ArrayList<String> palabras)
    {
        String aDevolver = "";
        while (palabras.size() > 0){
            String word = palabras.get(0);
            for(String palabra : palabras){
                if(palabra.length() >= word.length()){
                    word = palabra;
                }
            }
            aDevolver += word;
            palabras.remove(word);
            if(palabras.size() > 0){
                aDevolver += ",";
            }
        }
        return aDevolver;
    }
}