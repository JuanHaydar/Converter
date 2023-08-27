/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import java.util.ArrayList;

/**
 *Convierte el contenido de un Array a una ArrayList o viseversa, e incluso se pueden cambiar los tipos de datos
 * de los que esta comformado el Array o el ArrayList cambiando de una Array de un tipo de dato a una ArrayList
 * de otro tipo de dato o viseversa, para la escritura de sus metodos se escribe primero "Array" o "ArrayList",
 * el tipo de dato de este, "_" y "ArrayList" o "Array" y el tipo de dato.
 * @author Juan Haydar
 */
public class Colecciones {
     //Array
    
    //boolean
        /**
        * Recibe un arreglo de tipo booleano y retorna una ArrayList de tipo booleano, con el mismo contenido
        * del arreglo.
        * @param Array arreglo booleano que desee convertir.
        * @return un ArrayList de tipo Booleano con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Boolean> ArrayBoolean_ArrayListBoolean(boolean[] Array){
    ArrayList<Boolean> List= new ArrayList<>();
    
    for(int i=0;i<Array.length;i++){
    List.add(Array[i]);
    }
    return List;
    }
        /**
        * Recibe un arreglo de tipo booleano y retorna una ArrayList de tipo String, con el mismo contenido
        * del arreglo.
        * @param Array arreglo booleano que desee convertir.
        * @return un ArrayList de tipo String con el mismo contido del arreglo.
        * 
        */
    public ArrayList<String> ArrayBoolean_ArrayListString(boolean[] Array){
    ArrayList<String> List= new ArrayList<>();
    
    for(int i=0;i<Array.length;i++){
    List.add(String.valueOf(Array[i]));
    }
    return List;
    }
    
    //objetos
        /**
        * Recibe un arreglo de tipo Object y retorna una ArrayList de tipo Object, con el mismo contenido
        * del arreglo.
        * @param Array arreglo de tipo Object que desee convertir.
        * @return un ArrayList de tipo Object con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Object> ArrayObject_ArrayListObject(Object[] Array){
    ArrayList<Object> List= new ArrayList<>();
    
    for(int i=0;i<Array.length;i++){
    List.add(Array[i]);
    }
    return List;
    }
    
    
    //String
        /**
        * Recibe un arreglo de tipo String y retorna una ArrayList de tipo String, con el mismo contenido
        * del arreglo.
        * @param Array arreglo de tipo String que desee convertir.
        * @return un ArrayList de tipo String con el mismo contido del arreglo.
        * 
        */
    public ArrayList<String> ArrayString_ArrayListString(String [] Array){
    ArrayList<String> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(Array[i]);
    }
    return List;
    }
    
        /**
        * Recibe un arreglo de tipo String y retorna una ArrayList de tipo booleano, con el mismo contenido
        * del arreglo. El contenido del arreglo de no ser "true" o "false" este retornara false.
        * @param Array arreglo de tipo String que desee convertir.
        * @return un ArrayList de tipo Boolean con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Boolean> ArrayString_ArrayListBoolean(String [] Array){
    ArrayList<Boolean> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(Boolean.valueOf(Array[i]));
    }
    return List;
    }
    
        /**
        * Recibe un arreglo de tipo String y retorna una ArrayList de tipo entero(int), con el mismo contenido
        * del arreglo.Las cadenas del arreglo deben tener un  tipo de numero.
        * @param Array arreglo de tipo String que desee convertir.
        * @return un ArrayList de tipo int con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Integer> ArrayString_ArrayListInt(String [] Array){
    ArrayList<Integer> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(Integer.valueOf(Array[i]));
    }
    return List;
    }
    /**
        * Recibe un arreglo de tipo String y retorna una ArrayList de tipo punto flotante(double), con el mismo contenido
        * del arreglo. Las cadenas del arreglo deben tener un tipo de numero.
        * @param Array arreglo de tipo String que desee convertir.
        * @return un ArrayList de tipo punto flotante(Double) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Double> ArrayString_ArrayListDouble(String [] Array){
    ArrayList<Double> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(Double.valueOf(Array[i]));
    }
    return List;
    }
        /**
        * Recibe un arreglo de tipo String y retorna una ArrayList de tipo caracter(char), con el mismo contenido
        * del arreglo. El contenido del arreglo debe ser un tipo de numero.
        * @param Array arreglo de tipo String que desee convertir.
        * @return un ArrayList de tipo caracter(Character) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Character> ArrayStringTypeNumber_ArrayListChar(String [] Array){
    ArrayList<Character> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    int num=(int) Double.parseDouble(Array[i]);
    List.add((char)num);
    }
    return List;
    }
        /**
        * Recibe un arreglo de tipo String y retorna una ArrayList de tipo caracter(char).
        * En este se debe indicar de las diferentes cadenas del arreglo el indice de donde se quiere
        * obtener el caracter y retornara, una lista con los caracteres que se encontraban en el indice indicado.
        * @param Array arreglo de tipo String que desee convertir.
        * @param index Numero del indice en la cadena.
        * @return un ArrayList con los caracteres indicados.
        * 
        */
    public ArrayList<Character> ArrayString_ArrayListChar(String [] Array,int index){
    ArrayList<Character> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
        
    List.add(Array[i].charAt(index));
    }
    return List;
    }
    
    
    //int
        /**
        * Recibe un arreglo de tipo entero (int) y retorna una ArrayList de tipo entero(int) con el mismo
        * contenido del arreglo.
        * @param Array arreglo de tipo int que desee convertir.
        * @return un ArrayList de tipo entero (int) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Integer> ArrayInt_ArrayListInt(int [] Array){
    ArrayList<Integer> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(Array[i]);
    }
        /**
        * Recibe un arreglo de tipo entero (int) y retorna una ArrayList de tipo punto flotante(double) con el mismo
        * contenido del arreglo.
        * @param Array arreglo de tipo int que desee convertir.
        * @return un ArrayList de tipo punto flotante (double) con el mismo contido del arreglo.
        * 
        */
    return List;
    }
    public ArrayList<Double> ArrayInt_ArrayListDouble(int [] Array){
    ArrayList<Double> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add((double)Array[i]);
    }
    return List;
    }
    /**
        * Recibe un arreglo de tipo entero (int) y retorna una ArrayList de tipo cadena(String) con el mismo
        * contenido del arreglo.
        * @param Array arreglo de tipo int que desee convertir.
        * @return un ArrayList de tipo Cadena (String) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<String> ArrayInt_ArrayListString(int [] Array){
    ArrayList<String> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(String.valueOf(Array[i]));
    }
    return List;
    }
        /**
        * Recibe un arreglo de tipo entero (int) y retorna una ArrayList de tipo caracter(char) con el mismo
        * contenido del arreglo.
        * @param Array arreglo de tipo int que desee convertir.
        * @return un ArrayList de tipo caracter(char) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Character> ArrayInt_ArrayListChar(int [] Array){
    ArrayList<Character> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add((char)Array[i]);
    }
    return List;
    }
    
    //Double
        /**
        * Recibe un arreglo de tipo punto flotante (double) y retorna una ArrayList de tipo punto flotante(double)
        * con el mismo contenido del arreglo.
        * @param Array arreglo de tipo punto flotante(double) que desee convertir.
        * @return un ArrayList de tipo punto flotante(double) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Double> ArrayDouble_ArrayListDouble(Double [] Array){
    ArrayList<Double> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(Array[i]);
    }
    return List;
    }
    
        /**
        * Recibe un arreglo de tipo punto flotante (double) y retorna una ArrayList de tipo entero(int)
        * con el mismo contenido del arreglo.
        * @param Array arreglo de tipo punto flotante(double) que desee convertir.
        * @return un ArrayList de tipo entero(int) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Integer> ArrayDouble_ArrayListInt(Double [] Array){
    ArrayList<Integer> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    double num=Array[i];
    int converted=(int) num;
    List.add(converted);
    }
    return List;
    }
        /**
        * Recibe un arreglo de tipo punto flotante (double) y retorna una ArrayList de tipo cadena(String)
        * con el mismo contenido del arreglo.
        * @param Array arreglo de tipo punto flotante(double) que desee convertir.
        * @return un ArrayList de tipo cadena(String) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<String> ArrayDouble_ArrayListString(Double [] Array){
    ArrayList<String> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(String.valueOf(Array[i]));
    }
    return List;
    }
        /**
        * Recibe un arreglo de tipo punto flotante (double) y retorna una ArrayList de tipo caracter(char)
        * con el mismo contenido del arreglo.
        * @param Array arreglo de tipo punto flotante(double) que desee convertir.
        * @return un ArrayList de tipo caracter(char) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Character> ArrayDouble_ArrayListChar(Double [] Array){
    ArrayList<Character> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    double num=Array[i];
    char converted=(char) num;
    List.add(converted);
    }
    return List;
    }
    
    
    //Char
    
        /**
        * Recibe un arreglo de tipo caracter(char) y retorna una ArrayList de tipo caracter(char)
        * con el mismo contenido del arreglo.
        * @param Array arreglo de tipo caracter(char) que desee convertir.
        * @return un ArrayList de tipo caracter(char) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Character> ArrayChar_ArrayListChar(Character [] Array){
    ArrayList<Character> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(Array[i]);
    }
    return List;
    }
        /**
        * Recibe un arreglo de tipo caracter(char) y retorna una ArrayList de tipo cadena(String)
        * con el mismo contenido del arreglo.
        * @param Array arreglo de tipo caracter(char) que desee convertir.
        * @return un ArrayList de tipo cadena(String) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<String> ArrayChar_ArrayListString(Character [] Array){
    ArrayList<String> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    List.add(String.valueOf(Array[i]));
    }
    return List;
    }
        /**
        * Recibe un arreglo de tipo caracter(char) y retorna una ArrayList de tipo entero(int)
        * con el mismo contenido del arreglo.
        * @param Array arreglo de tipo caracter(char) que desee convertir.
        * @return un ArrayList de tipo entero(int) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Integer> ArrayChar_ArrayListInt(Character [] Array){
    ArrayList<Integer> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    char num=Array[i];
    int converted=(int) num;
    List.add(converted);
    }
    return List;
    }
        /**
        * Recibe un arreglo de tipo caracter(char) y retorna una ArrayList de tipo punto flotante(double)
        * con el mismo contenido del arreglo.
        * @param Array arreglo de tipo caracter(char) que desee convertir.
        * @return un ArrayList de tipo punto flotante(double) con el mismo contido del arreglo.
        * 
        */
    public ArrayList<Double> ArrayChar_ArrayListDouble(Character [] Array){
    ArrayList<Double> List= new ArrayList<>();
    for(int i=0;i<Array.length;i++){
    char num=Array[i];
    double converted=(double) num;
    List.add(converted);
    }
    return List;
    }
    
    
    
    //Listas
    
    //objetos
        /**
        * Recibe una ArrayList de tipo Object y retorna un Array de tipo Object
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo Object que desee convertir.
        * @return un Array de tipo Object con el mismo contido de la ArrayList.
        * 
        */
    public Object [] ArrayListObject_ArrayObject( ArrayList<Object> List){
    Object [] Array = new Object [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=List.get(i);
    }
    return Array;
    }
    
    //boolean
        /**
        * Recibe una ArrayList de tipo Boolean y retorna un Array de tipo booleano(boolean)
        * con el mismo contenido de la ArrayList. 
        * @param List ArrayList de tipo Boolean que desee convertir.
        * @return un Array de tipo boolean con el mismo contido de la ArrayList.
        * 
        */
    public boolean [] ArrayListBoolean_ArrayBoolean( ArrayList<Boolean> List){
    boolean [] Array=new boolean [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=List.get(i);
    }
    return Array;
    }
    
        /**
        * Recibe una ArrayList de tipo Boolean y retorna un Array de tipo cadena(String)
        * con el mismo contenido de la ArrayList. 
        * @param List ArrayList de tipo Boolean que desee convertir.
        * @return un Array de tipo cadena(String) con el mismo contido de la ArrayList.
        * 
        */
    public String [] ArrayListBoolean_ArrayString( ArrayList<Boolean> List){
    String [] Array=new String [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=String.valueOf(List.get(i));
    }
    return Array;
    }
    
    //String
    
        /**
        * Recibe una ArrayList de tipo cadena(String) y retorna un Array de tipo cadena(String)
        * con el mismo contenido de la ArrayList. 
        * @param List ArrayList de tipo cadena(String) que desee convertir.
        * @return un Array de tipo cadena(String) con el mismo contido de la ArrayList.
        * 
        */
    public String [] ArrayListString_ArrayString( ArrayList<String> List){
    String [] Array=new String [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=List.get(i);
    }
    return Array;
    }
    
        /**
        * Recibe una ArrayList de tipo cadena(String) y retorna un Array de tipo entero(int)
        * con el mismo contenido de la ArrayList. Las cadenas de las listas deben tener un tipo de numero.
        * @param List ArrayList de tipo cadena(String) que desee convertir.
        * @return un Array de tipo entero(int) con el mismo contido de la ArrayList.
        * 
        */
    public int [] ArrayListString_ArrayInt( ArrayList<String> List){
    int [] Array=new int [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=Integer.parseInt(List.get(i));
    }
    return Array;
    }
    
        /**
        * Recibe una ArrayList de tipo cadena(String) y retorna un Array de tipo punto flotante(double)
        * con el mismo contenido de la ArrayList. Las cadenas de la lista deben tener un tipo de numero.
        * @param List ArrayList de tipo cadena(String) que desee convertir.
        * @return un Array de tipo punto flotante(double) con el mismo contido de la ArrayList.
        * 
        */
    public double [] ArrayListString_ArrayDouble( ArrayList<String> List){
    double [] Array=new double [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=Double.parseDouble(List.get(i));
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo cadena(String) y retorna un Array de tipo booleano(boolean)
        * con el mismo contenido de la ArrayList. El contenido de la ArrayList de no ser "true" o 
        * "false" este retornara false.
        * @param List ArrayList de tipo cadena(String) que desee convertir.
        * @return un Array de tipo booleano(boolean) con el mismo contido de la ArrayList.
        * 
        */
    public boolean [] ArrayListString_ArrayBoolean( ArrayList<String> List){
    boolean [] Array=new boolean [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=Boolean.parseBoolean(List.get(i));
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo String y retorna una ArrayList de tipo caracter(char), con el mismo contenido
        * del arreglo. El contenido de la ArrayList debe ser un tipo de numero.
        * @param List ArrayList de tipo cadena(String) que desee convertir.
        * @return un Array de tipo caracter(Character) con el mismo contido del arreglo.
        * 
        */
    public char [] ArrayListStringTypeNumber_ArrayChar( ArrayList<String> List){
    char [] Array=new char [List.size()];
    for(int i=0;i<List.size();i++){
        int num= (int) Double.parseDouble(List.get(i));
        Array [i]=(char)num;
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo String y retorna una ArrayList de tipo caracter(char), 
        * En este se debe indicar de las diferentes cadenas de la ArrayList el indice de donde se quiere
        * obtener el caracter y retornara una lista con los caracteres que se encontraban en el indice indicado.
        * @param List ArrayList de tipo cadena(String) que desee convertir.
        * @param index Numero del indice en la cadena.
        * @return un Array con los caracteres indicados.
        * 
        */
        
    public char [] ArrayListString_ArrayChar( ArrayList<String> List, int index){
    char [] Array=new char [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=List.get(i).charAt(index);
    }
    return Array;
    }
    
    
    
    //int
    
        /**
        * Recibe una ArrayList de tipo entero(int) y retorna un Array de tipo entero(int)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo entero(int) que desee convertir.
        * @return un Array de tipo entero(int) con el mismo contido de la ArrayList.
        * 
        */
    public int [] ArrayListInt_ArrayInt( ArrayList<Integer> List){
    int [] Array=new int [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=List.get(i);
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo entero(int) y retorna un Array de tipo cadena(String)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo entero(int) que desee convertir.
        * @return un Array de tipo cadena(String) con el mismo contido de la ArrayList.
        * 
        */
    public String [] ArrayListInt_ArrayString( ArrayList<Integer> List){
    String [] Array=new String [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]= String.valueOf(List.get(i));
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo entero(int) y retorna un Array de tipo punto flotante(double)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo entero(int) que desee convertir.
        * @return un Array de tipo punto flotante(double) con el mismo contido de la ArrayList.
        * 
        */
    public double [] ArrayListInt_ArrayDouble( ArrayList<Integer> List){
    double [] Array=new double [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]= (double) List.get(i);
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo entero(int) y retorna un Array de tipo caracter(char)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo entero(int) que desee convertir.
        * @return un Array de tipo caracter(char) con el mismo contido de la ArrayList.
        * 
        */
    public char [] ArrayListInt_ArrayChar( ArrayList<Integer> List){
    char [] Array=new char [List.size()];
    for(int i=0;i<List.size();i++){
    int num= List.get(i);
    char converted= (char) num;
    Array [i]= converted;
    }
    return Array;
    }
    
    //double
        /**
        * Recibe una ArrayList de tipo punto flotante(double) y retorna un Array de tipo punto flotante(double)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo punto flotante(double) que desee convertir.
        * @return un Array de tipo punto flotante(double) con el mismo contido de la ArrayList.
        * 
        */
    public double [] ArrayListDouble_ArrayDouble( ArrayList<Double> List){
    double [] Array=new double [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=List.get(i);
    }
    return Array;
    }
    /**
        * Recibe una ArrayList de tipo punto flotante(double) y retorna un Array de tipo cadena(String)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo punto flotante(double) que desee convertir.
        * @return un Array de tipo cadena(String) con el mismo contido de la ArrayList.
        * 
        */
    public String [] ArrayListDouble_ArrayString( ArrayList<Double> List){
    String [] Array=new String [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=String.valueOf(List.get(i));
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo punto flotante(double) y retorna un Array de tipo entero(int)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo punto flotante(double) que desee convertir.
        * @return un Array de tipo entero(int) con el mismo contido de la ArrayList.
        * 
        */
    public int [] ArrayListDouble_ArrayInt( ArrayList<Double> List){
    int [] Array=new int [List.size()];
    for(int i=0;i<List.size();i++){
        double num=List.get(i);
        int converted=(int)num;
    Array [i]=converted;
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo punto flotante(double) y retorna un Array de tipo caracter(char)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo punto flotante(double) que desee convertir.
        * @return un Array de tipo caracter(char) con el mismo contido de la ArrayList.
        * 
        */
    public char [] ArrayListDouble_ArrayChar( ArrayList<Double> List){
    char [] Array=new char [List.size()];
    for(int i=0;i<List.size();i++){
        double num=List.get(i);
        char converted=(char)num;
    Array [i]=converted;
    }
    return Array;
    }
    
    //char
    
        /**
        * Recibe una ArrayList de tipo caracter(char) y retorna un Array de tipo caracter(char)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo caracter(char) que desee convertir.
        * @return un Array de tipo caracter(char) con el mismo contido de la ArrayList.
        * 
        */
    public char [] ArrayListChar_ArrayChar( ArrayList<Character> List){
    char [] Array=new char [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=List.get(i);
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo caracter(char) y retorna un Array de tipo cadena(String)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo caracter(char) que desee convertir.
        * @return un Array de tipo cadena(String) con el mismo contido de la ArrayList.
        * 
        */
    public String [] ArrayListChar_ArrayString( ArrayList<Character> List){
    String [] Array=new String [List.size()];
    for(int i=0;i<List.size();i++){
    Array [i]=String.valueOf(List.get(i));
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo caracter(char) y retorna un Array de tipo entero(int)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo caracter(char) que desee convertir.
        * @return un Array de tipo entero(int) con el mismo contido de la ArrayList.
        * 
        */
    public int [] ArrayListChar_ArrayInt( ArrayList<Character> List){
    int [] Array=new int [List.size()];
    for(int i=0;i<List.size();i++){
        char num=List.get(i);
        int converted=(int)num;
    Array [i]=converted;
    }
    return Array;
    }
        /**
        * Recibe una ArrayList de tipo caracter(char) y retorna un Array de tipo punto flotante(double)
        * con el mismo contenido de la ArrayList.
        * @param List ArrayList de tipo caracter(char) que desee convertir.
        * @return un Array de tipo punto flotante(double) con el mismo contido de la ArrayList.
        * 
        */
    public double [] ArrayListChar_ArrayDouble( ArrayList<Character> List){
    double [] Array=new double [List.size()];
    for(int i=0;i<List.size();i++){
        char num=List.get(i);
        double converted=(double)num;
    Array [i]=converted;
    }
    return Array;
    }
}
