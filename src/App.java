import java.util.Scanner;
//Exercicio 10: Faça um Programa que peça a temperatura em graus Celsius,
// transforme e mostre em graus Fahrenheit.
class Main {
public static void main(String[] args){
//Declaração de variáveis
double celsius; 
double fahrenheit;
//Fazer a entrada de dados
Scanner teclado = new Scanner(System.in);
  System.out.println("Digite a temperatura em graus Celsius");
  celsius = teclado.nextDouble();
//Fazer o calculo
  fahrenheit = celsius * 1.8 + 32; 
//Mostrar a resposta ao usuário
  System.out.println(celsius + " graus Celsius é equivalente a " + fahrenheit + " graus Fahrenheit.");
  }
}