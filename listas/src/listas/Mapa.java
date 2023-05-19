package listas;

import java.util.HashMap;

public class Mapa {
	
    private HashMap<String, Integer> mapa;

    public Mapa() {
        mapa = new HashMap<>();
    }

    public void agregar(String clave, int valor) {
        mapa.put(clave, valor);
    }

    public int mostrarPorClave(String clave) {
        return mapa.get(clave);
    }

    public boolean contieneClave(String clave) {
        return mapa.containsKey(clave);
    }

    public int obtenerTamano() {
        return mapa.size();
    }

    public void eliminar(String clave) {
        mapa.remove(clave);
    }

    public boolean contieneValor(int valor) {
        return mapa.containsValue(valor);
    }
}
