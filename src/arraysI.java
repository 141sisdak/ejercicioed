
public class arraysI {

	public static void main(String[] args) {
		
		int array [] = {13,90,43,78,-26};
		
		int mayor = array[0];
		
		int menor = array[0];
		
		for(int i = 0; i < array.length; i++){
			
			if(mayor < array[i]){
				
				mayor = array[i];
				
				
			}
			
			if (menor > array[i]){
				
				menor = array[i];
			}
			
			
			
			
		}
		System.out.println("El número menor es "+menor);
		System.out.println("El número mayor es "+mayor);
	}

}
