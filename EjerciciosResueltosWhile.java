/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswhile;

import java.util.Scanner;

public class EjerciciosResueltosWhile {

/**
 * Mostrar todos los números pares del 1 al 100.
 * 
 */
public static void Numero36()
{
    
    Integer contador=0;
    
    while(contador<100)
    {
        if (contador%2==0){
            
            System.out.println(contador);
        }
        contador++;
    
    }
   


}

/**
 * Mostrar todos los números Impares del 1 al 100.
 * 
 */
public static void Numero37()
{
    Integer contador=0;
    
    while (contador<100)
    {
        if (!(contador%2==0)){
            
            System.out.println(contador);
        }
    contador++;
    
    }
    


}



/**
 * Mostrar la suma de los primeros 100 números naturales.
 * 
 */
public static void Numero38()
{
    Integer contador=0,suma=0,numero=0;
    
    while(contador<100){
    
        numero++;
        System.out.println("El numero es "+numero);
        suma=suma+numero;
        System.out.println("La suma es "+suma);
        contador++;
    
    
    }
   


}


/**
 * Pedir 10 números e informar cuantos pares ingresaron.
 * 
 */
public static void Numero39()
{
    Scanner miSc= new Scanner(System.in);
    Integer contador=0,NumeroIngresado,Pares=0;
    
    while (contador<10){
    
        System.out.println("Ingrese un número: ");
        NumeroIngresado= miSc.nextInt();
        contador++;
        
    if (NumeroIngresado%2==0){
    
        Pares++;
    }
    }
                           
    System.out.println("la cantidad de numeros pares ingresados es: "+Pares);

}


/**
 * Pedir 10 números e informar cuantos negativos, positivos y ceros
 * ingresaron.
 * 
 */
public static void Numero40()
{
    Scanner miSc= new Scanner(System.in);
    Integer contador=0,NumeroIngresado,Negativos=0,Ceros=0,Positivos=0;
    
    while (contador<10){
    
        System.out.println("Ingrese un número: ");
        NumeroIngresado= miSc.nextInt();
        contador++;
        
    if (NumeroIngresado<0){
    
        Negativos++;
    }
     else if (NumeroIngresado>0){
    
        Positivos++;
    }
      else {
    
        Ceros++;
    }
    }
                           
    System.out.println("la cantidad de numeros negativos ingresados es: "+Negativos);
    System.out.println("la cantidad de numeros positivos ingresados es: "+Positivos);
    System.out.println("la cantidad de numeros ceros ingresados es: "+Ceros);


}



/**
 * Pedir un número y mostrar todos sus antecesores hasta el cero.
 * 
 */
public static void Numero41()
{
    Scanner miSc= new Scanner(System.in);
    Integer contador=0,numero=0,restador=0;
    
    System.out.println("Ingrese un número : ");
    numero= miSc.nextInt();
    numero= numero-1;
    
    while (contador<=numero){
    
        restador= numero--;
        System.out.println(restador);
    }


}



/**
 * De un grupo de vehículos (no se sabe la cantidad) se necesita tomar el
 * color, informar cuantos rojo y cuantos azules, además del total de vehículos.
 * 
 */
public static void Numero42()
{
    Scanner miSc = new Scanner(System.in);
        
        int contador=0;
        int sumaAutosRojos=0;
        int sumaAutosAzules=0;
        int sumaAutosTotal=0;
        String respuesta;
        String color;
        
        
         System.out.println("¿Desea ingresar un vehículo?");
         respuesta=miSc.next();
         
        while (respuesta.equals("si")) { 
            
            System.out.println("Ingrese el color");
            color=miSc.next();
            
            if (color.equals("rojo")) {
                sumaAutosRojos= sumaAutosRojos + 1;
            }
           
            if (color.equals("azul")) {
                sumaAutosAzules= sumaAutosAzules + 1;
            }
            
            sumaAutosTotal = sumaAutosRojos + sumaAutosAzules;
 
            
            System.out.println("¿Desea ingresar un vehículo más?");
            respuesta=miSc.next();
        }
        System.out.println("Ingresaron " + sumaAutosRojos + " rojos");
        System.out.println("Ingresaron " + sumaAutosAzules + " azules");
        System.out.println("Ingresaron " + sumaAutosTotal + " cantidad total de autos");

}



/**
 * Se piden los nombres de los alumnos, informar cuantas marías y cuantos
 * José hay en el curso, además de cuantos alumnos hay.
 * 
 */
public static void Numero43()
{
    Scanner miSc= new Scanner(System.in);
    String Respuesta,Nombre;
    Integer CantidadDeAlumnos=0,CantidadDeMaria=0,CantidadDeJose=0;        
    System.out.println("Desea ingresar un alumno?");
    Respuesta= miSc.next();
    
    while (Respuesta.equals("si")){
   
        CantidadDeAlumnos++;
    
        System.out.println("Ingrese nombre: ");
        Nombre=miSc.next();
        
        if (Nombre.equals("Maria")){
        
            CantidadDeMaria++;}
        if (Nombre.equals("Jose")){
        
            CantidadDeJose++;
        }    
        
    System.out.println("Desea ingresar un alumno nuevamente?");
    Respuesta= miSc.next();}
    
    System.out.println("Cantidad de alumnos "+CantidadDeAlumnos);
    System.out.println("Cantidad de alumnos con nombre Maria "+CantidadDeMaria);
    System.out.println("Cantidad de alumnos con nombre Jose "+CantidadDeJose);
    }





/**
 * Pedir un número e informar la suma de todos sus antecesores hasta el cero.
 * 
 */
public static void Numero44()
{
    Scanner miSc = new Scanner(System.in);
        
        int numero=0;
        int contador=0;
        int restador=0;
        int sumador=0;
        
        System.out.println("Ingrese el número");
        numero = miSc.nextInt();
        //le resto un número para que aparezcan los números siguientes pero no el número que pongo
        numero = numero -1;
            
        while (contador<=numero) { 
            sumador=sumador+numero;
           
            restador=numero--;
            
        }
            System.out.println("La suma de todos los antecesores es " + sumador);


}



/**
 * Pedir edad a un grupo de personas e informar cuando niño, adolescentes y 
 * adultos hay en el grupo, además de informar el promedio de edad.
 * 
 */
public static void Numero45()
{
    Scanner miSc = new Scanner(System.in);
        
        int contador=0;
        float adulto=0;
        float adolescente=0;
        float nino=0;
        float sumaTotal=0;
        float promedio;
        String respuesta;
        int edad;
        
        
        
         System.out.println("¿Desea ingresar la edad de alguna persona?");
         respuesta=miSc.next();
         
        while (respuesta.equals("si")) { 
            
            System.out.println("Ingrese edad");
            edad=miSc.nextInt();
            
            if (edad>=18) {
                adulto= adulto + 1;
            }
           
            if (edad>12 && edad<18) {
                adolescente= adolescente + 1;
            }
            
            if(edad<=12)
            {
               nino= nino + 1; 
            }
            
            sumaTotal = sumaTotal + edad;
            
            contador++;
            System.out.println("¿Desea ingresar la edad de alguna personas más?");
            respuesta=miSc.next();
        }
        
        promedio = sumaTotal / contador;
        
        System.out.println("Ingresaron " + adulto + " adultos");
        System.out.println("Ingresaron " + adolescente + " adolescentes");
        System.out.println("Ingresaron " + nino + " niños");
        System.out.println("El promedio de edad es: " + promedio);


}



/**
 * Informar si un número es primo o no.
 * 
 */
public static void Numero46()
{
     Scanner miSc = new Scanner(System.in);
        
        Integer numeroIngresado=0;
        Integer contador=2;
        
        System.out.println("Ingrese un número para saber si es primo");
        numeroIngresado = miSc.nextInt();
        
        while(numeroIngresado%contador!=0)
        {
            contador++;
        }
        
        if (contador==numeroIngresado) 
        {
            System.out.println("Es primo");
        }
        else
        {
            System.out.println("No es primo");

        }
}



/**
 * Informar todos los números primos del 1 al 1000. 
 * 
 */
public static void Numero47()
{

     Integer numeroIngresado=1;
        
        while(numeroIngresado<1000)
        {
            
            Integer contador=2;
            Integer contadorDivisores=0;

            while (contador<numeroIngresado) 
            {            
                if (numeroIngresado%contador==0)
                {
                    contadorDivisores++;
                    break;
                }
                contador++;
            }
            if (contadorDivisores>0)
            {
                //System.out.println("No es primo");
            }
            else
            {
                System.out.println("Es primo el número :" + numeroIngresado);
            }
            numeroIngresado++;

}}


/**
 * Informar si un número es centro numérico
 * 
 */
public static void Numero48()
{


}






/**
 * Informar todos los centro numéricos hasta el millón.
 * 
 */
public static void Numero50()
{


}



/**
 * Informar si un número es número perfecto.
 * 
 */
public static void Numero51()
{

     Scanner miSc = new Scanner(System.in);
        
        Integer numero;
        Integer suma=0;
        Integer contador=1;
         
        
        System.out.println("Introduce un número: ");
        numero = miSc.nextInt();
        
        while (contador<numero)
        {            
            
            if (numero%contador==0) 
            {
                suma = suma + contador;
            }
            
            contador++;
        }
        
        if (suma == numero) {
            System.out.println("El número es perfecto");
        }
        else 
        {
            System.out.println("El número no es perfecto");

}}



/**
 * Informar todos los números perfectos hasta el millón. 
 * 
 */
public static void Numero52()
{


}



/**
 * 
 * mostrar la Sucesión de Fibonacci hasta el 100.
 */
public static void Numero53()
{

     int num1=0;
        int num2=1;
        int suma;
        int limite=100;
    
        while (num2 + num1 <= limite) 
        {            
            suma=num1;
            num1 = num2;
            num2 = suma + num1;
            System.out.println(num2);

}

}
}