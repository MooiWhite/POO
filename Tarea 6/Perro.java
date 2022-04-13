
/**
*Es la clase perro que tiene como variables raza, color y tamanio
*además incluye los métodos ladrar, dormir y comer 
**/
public class Perro{
	String raza;
	String color;
	int tamano;

	/**
	*El método ladrar imprime "Guaaaauuuuuu compa"
	**/
	public void ladrar(){
 		System.out.println("Guuuauuuuu compa");
	}
	/**
	*El método comer imprime "Estoy comiendo"
	**/
	public void comer(){
		System.out.println("Estoy comiendo");
	}
	/**
	*El método dormir imprime ("ZZZzz")
	**/
	public void dormir(){
		System.out.println("ZZZzzzz");
	}
	/**
	*Este método estático crea dos objetos "perkins" y "puchi" 
	*de tipo Perro, mandar llamar los métodos de perkins y por
	*consola el usuario inserta los atributos de puchi y luego 
	*manda llamar a los métodos
	**/
	public static void main(String args[]){
		System.out.println("Hola Mundo Java");
                Perro perkins = new Perro();
		perkins.comer();
		perkins.ladrar();
		perkins.dormir();
		/*Recordemos que para que funcione esta instriccion 
		debemos pasarle como argumentos estos tres elementos
		sig. en este caso la inst. de ejecución sería :
		java Perro 13 rojo Cocker 
		como ejemplo
		*/
		perkins.tamano=Integer.parseInt(args[0]);
		perkins.color=args[1];
		perkins.raza=args[2];
		System.out.println("El tamano del perro es:"+perkins.tamano);
		Perro puchi = new Perro();
		puchi.comer();
		puchi.color="cafe claro";
		puchi.raza="cocker spanish";
		}

}
