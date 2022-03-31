package segurosbolivar;

public class EjercicoUnoDos {

	public static void main(String[] args) {
		//Ejercicio 1 y 2
		//Esta es mi solucion lo mas hacercado a de los dos ejercicio por tiempo y nervios no puede avanzar
		//una solucion mas adecuada
		
		
 		String fechaUno = "2020/11/10";
		String fechaDos = "2019/11/01";
		int dias = 365;
		
		diferenciaDiaz(fechaUno,fechaDos,dias);

	}
	
	public static void diferenciaDiaz(String fechaUno, String fechaDos, int diaz) {
		String numeroUno = fechaUno.substring(8);
		String numeroDos = fechaUno.substring(8);
		
		int diferenciaDiaz = Integer.parseInt(numeroDos) + diaz-1;
		
		fechaDos.substring(8);
		String  resultado;
		String endo = "endo";
		System.out.println("Diaz de diferencia: "+diferenciaDiaz);
	}

}
