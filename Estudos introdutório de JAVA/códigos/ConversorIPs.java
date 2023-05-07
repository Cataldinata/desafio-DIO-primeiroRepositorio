// a ideia de criar esse projeto foi totalmente original, após algumas aula de Introdução a Redes de Computadores na Faculdade
/**
@author: Natã Cataldi
**/

import java.util.*;
import java.lang.Math;

public class ConversorIPs {
	private static Scanner s = new Scanner(System.in);

	public static void main (String[] args) {

	System.out.println("Olá! Eu vou te ajudar a converter IPs em números binários!");
	System.out.println("Por favor, digite o número do primeiro octeto do IP: ");
	int primerocteto;
	primerocteto = s.nextInt();
	
	System.out.println("");
	System.out.println("Agora, digite o número do segundo octeto: ");
	int segundocteto;
	segundocteto = s.nextInt();

	System.out.println("");
	System.out.println("Agora, digite o número do terceiro octeto: ");
	int tercerocteto;
	tercerocteto = s.nextInt();

	System.out.println("");
	System.out.println("Agora, digite o número do quarto octeto: ");
	int quartocteto;
	quartocteto = s.nextInt();

	System.out.println("");
	System.out.println("Convertendo o IP em binário. Aguarde, por favor ... ");

	String primerbinario;
	primerbinario = ( ( (((((((primerocteto/2)/2)/2)/2)/2)/2)/2)%2) + "" + ((((((primerocteto/2)/2)/2)/2)/2)/2)%2) + "" + ((((((primerocteto/2)/2)/2)/2)/2)%2) + ""+ (((((primerocteto/2)/2)/2)/2)%2) + "" + ((((primerocteto/2)/2)/2)%2) + "" + (((primerocteto/2)/2)%2) + "" + ((primerocteto/2)%2) + "" + (primerocteto%2) ;  

	String segundobinario;
	segundobinario = ( ( (((((((segundocteto/2)/2)/2)/2)/2)/2)/2)%2) + "" + ((((((segundocteto/2)/2)/2)/2)/2)/2)%2) + "" + ((((((segundocteto/2)/2)/2)/2)/2)%2) + ""+ (((((segundocteto/2)/2)/2)/2)%2) + "" + ((((segundocteto/2)/2)/2)%2) + "" + (((segundocteto/2)/2)%2) + "" + ((segundocteto/2)%2) + "" + (segundocteto%2) ;  

	String tercerobinario;
	tercerobinario = ( ( (((((((tercerocteto/2)/2)/2)/2)/2)/2)/2)%2) + "" + ((((((tercerocteto/2)/2)/2)/2)/2)/2)%2) + "" + ((((((tercerocteto/2)/2)/2)/2)/2)%2) + ""+ (((((tercerocteto/2)/2)/2)/2)%2) + "" + ((((tercerocteto/2)/2)/2)%2) + "" + (((tercerocteto/2)/2)%2) + "" + ((tercerocteto/2)%2) + "" + (tercerocteto%2) ;  

	String quartobinario;
	quartobinario = ( ( (((((((quartocteto/2)/2)/2)/2)/2)/2)/2)%2) + "" + ((((((quartocteto/2)/2)/2)/2)/2)/2)%2) + "" + ((((((quartocteto/2)/2)/2)/2)/2)%2) + ""+ (((((quartocteto/2)/2)/2)/2)%2) + "" + ((((quartocteto/2)/2)/2)%2) + "" + (((quartocteto/2)/2)%2) + "" + ((quartocteto/2)%2) + "" + (quartocteto%2) ;  
 	 
	System.out.println("");
	
	String IpBinario;
	IpBinario = primerbinario + "." + segundobinario + "." + tercerobinario + "." + quartobinario ;
	System.out.println("O seu IP em Binário é: " + IpBinario);
	}
}