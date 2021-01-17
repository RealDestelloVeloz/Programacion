package tema3;
import java.util.Scanner;
public class BBDD_Carcasona_Hector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner (System.in); 
System.out.println("Introduce el numero de alumnos matriculados"); 
int numeroalumnos = entrada.nextInt(); entrada.close();
int alumnos [] = new int [numeroalumnos]; int contador = 0, suspensos = 0, aprobados = 0, bienes = 0, notables = 0, sobresalientes = 0;
System.out.print("Las notas son: ");
for (contador = 0; contador<alumnos.length; contador++) {
	int notas = (int) (Math.random() * (0+10));
	alumnos [contador] = notas;
	System.out.print(alumnos[contador] + " ");
} contador = 0; System.out.println("\n");
for (contador = 0; contador<alumnos.length; contador++) {
	if (alumnos [contador] < 5) 
		suspensos++;
	 else if (alumnos [contador] >= 5 && alumnos [contador] < 6)
		 aprobados++;
	 else if (alumnos [contador] >= 6 && alumnos [contador] <7) bienes ++;
	 else if (alumnos [contador] >=7 && alumnos [contador] <9) notables++;
	 else if (alumnos [contador] >=9) sobresalientes++;
}

System.out.println("Hay " + suspensos + " suspensos, " + aprobados + " aprobados, " + bienes + " bienes, " + notables + " notables, " + sobresalientes + " sobresalientes");

	}

}
/*En primer lugar, el programa va a pedir al usuario por pantalla que introduzca o indique 
el número de alumnos que hay matriculados en la asignatura
En función del número introducido se generarán de nuevo aleatoriamente
 las notas para esa cantidad de alumnos.

A continuación, el programa mostrará las notas de todos los alumnos y se informará del número de 
SUSPENSOS, APROBADOS, BIENES, NOTABLES Y SOBRESALIENTES que ha habido en la clase.
 El programa, también tendrá que mostrar la nota media de la clase en dicha asignatura.*/