import java.util.HashMap;

public class clase {
    HashMap<String, String> tablaSimbolos = new HashMap<>();
    HashMap<String, Integer> contados = new HashMap<>();
    int count = 0;

    public String addSimbolo(String bloque, String funcion, String nombre){
        if (!bloque.equals("no")){
            if (funcion.equals("")){
                tablaSimbolos.put(nombre, bloque+":"+nombre);
                return "<A NAME=\""+ bloque+":"+nombre + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
            }else{
                tablaSimbolos.put(funcion+":"+nombre, bloque+":"+funcion+":"+nombre);
                return "<A NAME=\""+ bloque+":"+funcion+":"+nombre + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
            }}
        return "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN>";
    }

    public String getSimbolo(String funcion, String nombre){
        if (tablaSimbolos.containsKey(funcion+":"+nombre)){
            return "<A HREF=\"#" + tablaSimbolos.get(funcion+":"+nombre) + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
        }else if (tablaSimbolos.containsKey(nombre)){
            return "<A HREF=\"#" + tablaSimbolos.get(nombre) + "\">" + "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN></A>";
        }else{
            if (funcion.lastIndexOf(":") == -1){
                return "<SPAN CLASS=\"ident\"/>" + nombre + "</SPAN>";
            }
            else{
                return getSimbolo(funcion.substring(0, funcion.lastIndexOf(":")), nombre);
            }
        }
    }

    public String getCount(){
        count++;
        return Integer.toString(count);
    }
}
