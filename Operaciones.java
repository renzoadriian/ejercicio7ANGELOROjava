package ejercicio7;
import java.util.Scanner;
public class Operaciones {
private Scanner teclado;
private int num1;
private int num2;
private int sumar;
private int restar;
private int dividir;
private int multiplicar;
public void ingresar(){
teclado= new Scanner(System.in);
System.out.print("Ingrese el primer numero: ");
num1=teclado.nextInt();
System.out.print("Ingrese el segundo numero: ");
num2=teclado.nextInt();
}
public void sumar(){

	sumar=num1+num2;
}
public void restar(){

	restar=num1-num2;
}
public void divide(){

	dividir=num1/num2;
}
public void multiplicar(){
	multiplicar=num1*num2;
}
public void imprimir(){
	System.out.print("OPERACIONES CON NUMEROS INGRESADOS\n");
	System.out.print("La suma de los numeros es: "+sumar+"\n");
	System.out.print("La resta de los numeros es:"+restar+"\n");
	System.out.print("La division de los numeros es:"+dividir+"\n");
	System.out.print("La multiplicacion de los numeros es: "+multiplicar+"\n");
}
public static void main(String[]ar){
	Operaciones operaciones1;
	operaciones1=new Operaciones();
	operaciones1.ingresar();
	operaciones1.sumar();
	operaciones1.restar();
	operaciones1.divide();
	operaciones1.multiplicar();
	operaciones1.imprimir();
}
}