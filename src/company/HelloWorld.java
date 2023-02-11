package company;

public class HelloWorld {

	public static void main(String[] args) {
		
		holaMundo();
		holaMundo();
		
		//metodo con parametro
		holaMundo("lorena");

	}

	//metodo con parametro
	private static void holaMundo(String name) {
		System.out.println("hola"+name ); 
		
		
	}

	//ejemplo de una funcion y llamada
	private static void holaMundo() {
		System.out.println("hola mundo");
		
	}

}
