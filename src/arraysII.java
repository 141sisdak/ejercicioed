import java.util.*;
public class arraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []array = new int [5];
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduce 5 n�meros");
		
		array[0]= entrada.nextInt();
		array[1]= entrada.nextInt();
		array[2]= entrada.nextInt();
		array[3]= entrada.nextInt();
		array[4]= entrada.nextInt();
		
		System.out.println("Los n�meros introducidos son: "+ array[0]+ ", " + array[1]
				+ ", "+ array[2]+", "+ array[3] +", " + array[4]);
		
		
		for(int posicion = 0; posicion<array.length -1; posicion++){
			
			if (array[posicion] < array[posicion + 1]){
				
				int siguiente = array[posicion];
				
				array[posicion] = array[posicion +1];
				
				array[posicion + 1] = siguiente;
				
				posicion = -1;
			
				
				
			}
			
			
		}
		
		String capullo = "";
		for(Integer numero : array){
			
			capullo += numero + ",";
		}
		System.out.println("La ordenaci�n de mayor a menor es:" +capullo);
		
	}

}
