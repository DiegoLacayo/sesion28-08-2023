import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner lector = new Scanner(System.in);
    // Sentencia condicional simple
    System.out.println("Ingrese su edad: ");
        byte edad = lector.nextByte();           /* byte edad = 10; */
    System.out.println("Ingrese su sexo (f/m): ");
        char sexo = lector.next().charAt(0);     /* char sexo = 'f'; */

// && = Y // Cuando hablamos de "(edad == 5 || sexo == 'f')||(edad == 5 || sexo == 'f')" son 2 reglas a funcionar con el prefijo || = O
// En caso del "&&", 2 verdaderos = verdadero // 1 verdadero y 1 falso = falso // 2 falso = falso
// En caso del "||", 2 verdaderos = verdadero // 1 verdadero y 1 falso = verdadero // 2 falso = falso

// if((edad == 5 || sexo == 'f') && (edad == 10 && sexo =='m')){  //  if((edad == 5 || sexo == 'f') || (edad == 5 && sexo =='f')){ 
//       System.out.println("Linea 1 Dentro del if (x==5)?" + (edad == 5));
//      Sytem.out.println("Linea 2 Fuera del if (x == 5)?" + (edad != 5));
//   } else {
//      Sytem.out.println("Linea 0 Fuera del if (x == 5)?" + (edad == 9));

    if (edad <= 0){
        System.out.println("--Vose no ah nacido filo da pu**.\n vose ser un feto kkkkk--");
    } else if(edad <= 18){
        System.out.println("--Usted mayor de edad--");
    } else {
        System.out.println("--Usted es menor de edad--");
    }
    lector.close();
    }
}
