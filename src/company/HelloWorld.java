package company;

public class HelloWorld {

	public static void main(String[] args) {
		
		//holaMundo();
		holaMundo(4);
		
		//metodo con parametro
		//holaMundo("lorena");
		
		String hola = devuelveTexto();
		System.out.println(devuelveTexto());

	}
    //sobreescribir con diferentes argumentos
	private static void holaMundo(int i) {
		System.out.println("el numero es "+ i);
		
	}

	//metodo con parametro
	private static void holaMundo(String name) {
		System.out.println("hola"+name ); 
			
	}

	//ejemplo de una funcion y llamada
	private static void holaMundo() {
		System.out.println("hola mundo");
		
	}
	//metodo cuando quiero que devuelva texto o numero
	private static String devuelveTexto() {
		return "hola devuelvo un texto";
		
	}
	


}
