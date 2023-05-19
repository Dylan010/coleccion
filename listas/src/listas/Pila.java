package listas;

//import java.util.List;
import java.util.Stack; // esta libreria contiene lo que son las pilas listas mapas 

public class Pila {

	 private Stack<Integer> pila; // Declarar una pila de enteros
	 
	 public Pila() {
	        pila = new Stack<>(); // Inicializar la pila en el constructor
	    }
	 public void agrergar(int x) {
		 pila.push(x); // agrega un elemto a la pila
	 }
	 public int SacaryMostrar(){
		 return pila.pop(); // saca el ultimo agregado y lo retorna como si fuera un print
	 }
	 public int MostrarUltimo() {
		 return pila.peek(); // mustra el ultimo elemento de la pila sin eliminar
	 }
	 public boolean EstaVacio() {
		 return pila.isEmpty(); // te dice si la pila esta vacia 
	 }
	  public int obtenerTamano() {
	        return pila.size(); // te pasa el tamano de la pila 
	    }
	  public boolean buscarElemento(int x) {
	        return pila.contains(x); // te devuelve true o false , lo que hace es buscar x en la pila y si esta te devuelve true
	    }
	  public void AgregarEspecifico(Stack<Integer> pilax, int elemento) {
	        pilax.push(elemento); // es lo mismo que agregar pero se pasa por parametro una pila
	    }
}
