
import java.util.Scanner;

public class OptimizacionPabloPerez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*---------------------------------- CICLO------------------------*/
        
        /*----------------EJERCICIO1---------------------*/
        
        /*CODIGO NO OPTIMIZADO*/
        /*System.out.println("Por favor, introduzca una palabra para deletrearla");
         String palabra = "";
         Scanner cadenascan = new Scanner(System.in);
         palabra = cadenascan.nextLine();
         int i = 0;
         int contador = 0;
         while (i < palabra.length()) {
         contador = contador + 1;
         System.out.println("Letra " + contador + " = " + palabra.substring(0 + i, 1 + i));
         i = i + 1;
         }
            
        
        
         /* ------------------------CODIGO OPTIMIZADO-----------------------*/
        
        /*System.out.println("Por favor, introduzca una palabra para deletrearla");
         String palabra = "";
         Scanner cadenascan = new Scanner(System.in);
         palabra = cadenascan.nextLine();
         int i = 0;
         while (i < palabra.length()){
         System.out.println("Letra " + (i+1) + " = " + palabra.substring(i,i+1));
         i = i +1;
         }*/
    }

    /* --------------------EJERCICIO 2-------------------*/
    /*
    
     //-------SIN OPTIMIZAR-----------
     for (int i = 0; i < 10; i++) {
     int precision,simple,resultadosimple, resultadodoble;
     precision = 1;
     simple = 1;
            
     if (precision == simple) {
     resultadosimple = 1 * i;
     }else{
     resultadodoble = 1 * i;
     }
     }
    
     //-------------OPTIMIZADO------------
    
     int precision = 1;
     int simple = 1;
     int resultadosimple, resultadodoble;
     if (precision == simple) {
     for (int i = 0; i < 10; i++) {
     resultadosimple = 1 * i;
     }
     }else{
     for (int i = 0; i < 10; i++) {
     resultadodoble = 1 * i;
     }
     }
     */
    /*----------------EJERCICIO 3----------------------*/
    
    /* -----------SIN OPTIMIZAR*------------------/
    
    */
     /*
     for(i  = 0; i<MAX ;i++)
     {if (presicion == SIMPLE) {
     resultadoSimple = 0.0;
     }
     }
     else
     (
     resultadoDoble  = 0.0;

     )*/
    /* ------------------OPTIMIZADO-----------------------*/
    
    /*
     if (precision == SIMPLE)
     {
     for (1=0; 1>MAX; 1++)
     resultadoSimple = 0.0;
     }
     else
     {
     for (1=0; i<MAX; i++)
     resultadoDoble = 0.0;
     }*/
    /*---------EJERCICIO 4----------------------*/
    
    /*----------------NO OPTIMIZADO------------------*/
    
    /* for (i=0; i<MAX; i++)
     {
     if (i==0)
     acumulador = 0;
     acumulador += i;
     }
     System.out.println("Resultado = %id \n", acumulador);
    
    
     /*---------------OPTIMIZADO-----------*/
    
    /*
     acumulador = 0;
     for (i=0; i<MAX; i++)
     {
     acumulador +=i;
     }
     System.out.println("Resultado = %id \n", acumulador);
    
     */
    
    /*-------------------EJERCICIO 5-----------------*/
    /*---------------NO OPTIMIZADO--------------------*/
    /* for i in [7,8,9]:
     c = b * *2;
     System.out.println("I = (", b, ") y su cuadrado (", c, ")");
     */
    /*---------------CODIGO OPTIMIZADO--------------------*/
    /*
     a = [7,8,9];
     for b in a:
     System.out.println(f"I = ({b}) y su cuadrado ({b**2})");
     */
    /*---------------------------LOCAL-------------------*/
    /*------------------------EJERCICIO 6-------------------*/
    /*----------------NO OPTIMIAZADO---------------*/
    /*int foo() {
     int a = 24;
     int b = 25; // almacenamiento muerto
     int c = a << 2;
     if (true) //código muerto
     c = a << 2; //código redundante
     return c;
     b = 24; // código inalcanzable
     */
    /*--------------OPTIMIZADO--------------*/
    /*int foo() {
     int a = 24;
     int c = a << 2;
     return c;
     }*/
    /*----------------EJERCICIO 7-------------*/
    /*---------------NO OPTIMIZADO----------------*/
    /*x = 5;
     y = 5;
     b = 5;
     c=((x + y)+ b)/2;
     System.out.println("Resultado", c); */

    /*--------------CODIGO OPTIMIZADO--------------*/
    /*x,y=5,5
     a = x + y
     b = 5
     c = (a + b)/2
     System.out.println("Resultado", c);
     */

    /*---------------------EJERCICIO 8-----------------------*/
    /*---------------NO OPTIMIZADO----------------*/
    /*  
     int a;
     a = 40 + 90;
     System.out.println(a);
     */
    /*-----------------------OPTIMIZADO---------------------*/
    /*
     int a = 40;
     int j = a + 90;
     System.out.println(j);
     */
    /*---------------------EJERCICIO 9-----------------------*/
    /*---------------NO OPTIMIZADO----------------*/
    /*
     int resul;
     for (int i = 0; i < 10; i++) {
     int a,b;
     a = 6;
     b = 6;
     resul = i * a + b;
     System.out.println(resul);
     }
     */
    /*---------------CODIGO OPTIMIZADO----------------*/
    /*   
     int resul, b,a;
     b = 6;
     a = 6;
     int count = b;
     for (int i = 0; i < 10; i++) {
     resul = count;
     count += a;
     System.out.println(count);
     }
     */
    /*---------------------EJERCICIO 10-----------------------*/
    /*---------------NO OPTIMIZADO----------------*/
    /*
     for (int i = 0; i < 10; i++) {
     int pre,sim,resuldosim, resuldo;
     pre = 9;
     sim = 9;
            
     if (pre == sim) {
     resulsim = 9 * i;
     }else{
     resuldo = 9 * i;
     }
     }
     */
    /*---------------CODIGO OPTIMIZADO----------------*/
    /*
     int pre = 9;
     int sim = 9;
     int resulsim, resuldo;
     if (pre == sim) {
     for (int i = 0; i < 10; i++) {
     resulsim = 9 * i;
     }
     }else{
     for (int i = 0; i < 10; i++) {
     resuldo = 9 * i;
     }
     }
     */
}

}
