/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converter;

/**
 *Convierte un tipo de dato el cual ingresa como parametro para algunas de las funciones de la clase, y
 * lo convierte en otro tipo de dato, para la escritura de sus funciones, se escribe primero el tipo de dato
 * de entrada, "_" y el tipo de dato de salida.
 * @author Juan Haydar
 */
public class Datos {
//Convertidores de String
        /**
         * Recibe una cadena(String) como parametro y lo convierte en un dato booleano,
         * la cadena debe decir "true" o "false". De no ser el caso, retornara false.
        * @param Str String que desee convertir.
        * @return un dato booleano.
        * 
        */
    public boolean String_Boolean(String Str){
        return Boolean.parseBoolean(Str);
    }
    
    /**
         * Recibe una cadena(String) como parametro y lo convierte en un caracter(char)
         * la cadena debe ser un tipo de numero.
        * @param Str String que desee convertir.
        * @return un dato char.
        * 
        */
    public char StringTypeNumber_char(String Str){
        int i=Integer.parseInt(Str);
        return (char)i;
    }
    /**
         * Recibe una cadena(String) y el indice de donde se quiere conseguir el caracter de la cadena
         * como parametro y te devuelve el caracter que se encuentre en el indice indicado.
        * @param Str String que desee convertir.
        * @param index Numero del indice en la cadena.
        * @return un dato char.
        * 
        */
    public char String_charNum(String Str,int index){
        return Str.charAt(index);
    }
        /**
         * Recibe una cadena(String) como parametro y lo convierte en un dato punto flotante (double).
         * La cadena debe ser un tipo de numero.
        * @param Str String que desee convertir.
        * @return un tipo de dato double.
        * 
        */
    public double String_double(String Str){
        return Double.parseDouble(Str);
    }
    /**
         * Recibe una cadena(String) como parametro y lo convierte en un dato entero(int).
         * La cadena debe ser un tipo de numero.
        * @param Str String que desee convertir.
        * @return un tipo de dato int.
        * 
        */
    public int String_int(String Str){
        return Integer.parseInt(Str);
    }
    
    //booleanos
    /**
         * Recibe un dato booelano y lo convierte en una cadena de texto(String).
         * 
        * @param b Un dato booleano (true or false).
        * @return una cadena de texto (String) con el mismo dato booleano.
        * 
        */
    public String boolean_String(boolean b){
        return String.valueOf(b);
    }
    
    //char
    /**
         * Recibe un dato tipo caracter (char), y lo convierte en una cadena de texto(String).
         * El caracter puede ser tanto numeros, como un caracter.
        * @param c caracter que desee convertir.
        * @return un dato tipo cadena de texto (String) con el mismo caracter.
        * 
        */
    public String char_String(char c){
        return String.valueOf(c);
    }
        /**
         * Recibe un dato tipo caracter (char), y lo convierte en un dato tipo entero(int).
         * El caracter debe ser un tipo de numero.
        * @param c caracter que desee convertir.
        * @return un dato tipo entero(int).
        * 
        */
    public int char_int(char c){
        return (int)c;
    }
    /**
         * Recibe un dato tipo caracter (char), y lo convierte en un dato tipo punto flotante(double).
         * El caracter debe ser un tipo de numero.
        * @param c caracter que desee convertir.
        * @return un dato tipo punto flotante(double).
        * 
        */
    public double char_double(char c){
        return (double)c;
    }
    
    //double
        /**
         * Recibe un dato tipo punto flotante(double), y lo convierte en un dato tipo cadena de texto(String).
        * @param d numero punto flotante que desee convertir.
        * @return un dato tipo cadena de texto(String).
        * 
        */
    public String double_String(double d){
        return String.valueOf(d);
    }
    /**
         * Recibe un dato tipo punto flotante(double), y lo convierte en un dato tipo entero(int).
        * @param d numero punto flotante que desee convertir.
        * @return un dato tipo entero (int).
        * 
        */
    public int double_int(double d){
        return (int)d;
    }
    /**
         * Recibe un dato tipo punto flotante(double), y lo convierte en un dato tipo caracter(char).
        * @param d numero punto flotante que desee convertir.
        * @return un dato tipo caracter (char).
        * 
        */
    public char double_char(double d){
        return (char)d;
    }
    
    
    //int
        /**
         * Recibe un dato tipo entero(int), y lo convierte en un dato tipo cadena de texto(String).
        * @param i numero entero que desee convertir.
        * @return un dato tipo cadena de texto(String).
        * 
        */
    public String int_String(int i){
        return String.valueOf(i);
    }
        /**
         * Recibe un dato tipo entero(int), y lo convierte en un dato tipo punto flotante(double).
        * @param i numero entero que desee convertir.
        * @return un dato tipo punto flotante(double).
        * 
        */
    public double int_double(int i){
        return (double)i;
    }
        /**
         * Recibe un dato tipo entero(int), y lo convierte en un dato tipo caracter(char).
        * @param i numero entero que desee convertir.
        * @return un dato tipo caracter (char).
        * 
        */
    public char int_char(int i){
        return (char)i;
    }
}
