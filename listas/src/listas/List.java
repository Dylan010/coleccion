package listas;

import java.util.LinkedList;

public class List {
	
    private LinkedList<Integer> lista;

    public List() {
        lista = new LinkedList<>();
    }

    public void agregar(int x) {
        lista.add(x);
    }

    public int mostrarUltimo() {
        return lista.getLast();
    }

    public int mostrarPorIndice(int posicion) {
        return lista.get(posicion);
    }

    public int obtenerTamano() {
        return lista.size();
    }

    public boolean buscarElemento(int x) {
        return lista.contains(x);
    }

    public void agregarEnPosicion(int posicion, int elemento) {
        lista.add(posicion, elemento);
    }

    public int eliminarUltimo() {
        return lista.removeLast();
    }

    public int eliminarPorIndice(int indice) {
        return lista.remove(indice);
    }

    public boolean eliminarElemento(int elemento) {
        return lista.remove(Integer.valueOf(elemento));
    }
}
