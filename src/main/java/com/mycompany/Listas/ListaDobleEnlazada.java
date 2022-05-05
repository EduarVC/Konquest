package com.mycompany.Listas;

public class ListaDobleEnlazada<T> {

    private NodoDoble<T> inicio;
    private NodoDoble<T> ultimo;

    private int longitud = 0;

    public void agregar(T contenido) {
        if (esVacia()) {
            NodoDoble<T> nuevo = new NodoDoble<>(contenido);
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            NodoDoble<T> nuevo = new NodoDoble<>(contenido);
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }

        longitud++;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int obtenerLongitud() {
        return longitud;
    }

    public void eliminarElementoEnIndice(int indice) throws ListaException {
        if (indice >= longitud || indice < 0) {
            throw new ListaException("Indice fuera de rango");
        }

        if (indice == 0) {
            inicio = inicio.getSiguiente();
            if (inicio != null) {
                inicio.setAnterior(null);
            }
        } else if (indice == longitud - 1) {
            eliminarUltimo();
        } else {
            NodoDoble<T> actual = buscarIndice(indice);
            NodoDoble<T> anterior = actual.getAnterior();
            NodoDoble<T> siguiente = actual.getSiguiente();

            siguiente.setAnterior(anterior);
            anterior.setSiguiente(siguiente);
        }
        longitud--;

    }

    public void eliminarUltimo() throws ListaException {
        if (esVacia()) {
            throw new ListaException("La lista esta vacia!");
        } else if (longitud == 1) {
            inicio = null;
            ultimo = null;
        } else {
            ultimo.getAnterior().setSiguiente(null);
            ultimo = ultimo.getAnterior();
        }
    }

    public T obtenerContenido(int indice) throws ListaException {
        return buscarIndice(indice).getContenido();
    }

    public NodoDoble<T> buscarIndice(int indice) throws ListaException {
        if (indice >= longitud || indice < 0) {
            throw new ListaException("Indice fuera de rango");
        }

        int mitad = longitud / 2;
        if (indice <= mitad) {
            return buscarDeInicioAUltimo(indice);
        } else {
            return buscarDeUltimoAInicio(indice);
        }
    }

    public NodoDoble<T> buscarDeInicioAUltimo(int indice) throws ListaException {
        if (indice >= longitud || indice < 0) {
            throw new ListaException("Indice fuera de rango");
        }

        NodoDoble<T> actual = inicio;
        for (int i = 0; i < indice; i++) {
            NodoDoble<T> siguiente = actual.getSiguiente();
            actual = siguiente;
        }

        return actual;
    }

    public NodoDoble<T> buscarDeUltimoAInicio(int indice) throws ListaException {
        if (indice >= longitud || indice < 0) {
            throw new ListaException("Indice fuera de rango");
        }

        NodoDoble<T> actual = ultimo;
        for (int i = 0; i < indice; i++) {
            NodoDoble<T> anterior = actual.getAnterior();
            actual = anterior;
        }

        return actual;
    }

    public void agregarEnIndice(int indice, T contenido) throws ListaException {
        if (indice >= longitud || indice < 0) {
            throw new ListaException("Indice fuera de rango");
        }
        if (esVacia()) {
            NodoDoble<T> nuevo = new NodoDoble<>(contenido);
            inicio = nuevo;
            ultimo = nuevo;
            
        } else if (indice == longitud - 1) {
            NodoDoble<T> nuevo = new NodoDoble<>(contenido);
            nuevo.setAnterior(ultimo.getAnterior());
            nuevo.setSiguiente(ultimo);
            ultimo.getAnterior().setSiguiente(nuevo);
            ultimo.setAnterior(nuevo);
            
        } else if (indice == 0) {
            NodoDoble<T> nuevo = new NodoDoble<>(contenido);
            inicio.setAnterior(nuevo);
            nuevo.setSiguiente(inicio);
            nuevo.setAnterior(null);
            inicio = nuevo;

        } else if (indice == 1) {
            NodoDoble<T> nuevo = new NodoDoble<>(contenido);
            nuevo.setAnterior(inicio);
            nuevo.setSiguiente(inicio.getSiguiente());
            inicio.getSiguiente().setAnterior(nuevo);
            inicio.setSiguiente(nuevo);

        } else {
            NodoDoble<T> nuevo = new NodoDoble<>(contenido);
            NodoDoble<T> actual = buscarIndice(indice);
            nuevo.setAnterior(actual.getAnterior());
            nuevo.setSiguiente(actual);
            actual.getAnterior().setSiguiente(nuevo);
            actual.setAnterior(nuevo);
        }

        longitud++;
    }
    public void mostrarLista(){
        NodoDoble recorrer = inicio;
        while(recorrer!=null){
            System.out.println(recorrer.getContenido());
            recorrer = recorrer.getSiguiente();
        }
    }

    public NodoDoble<T> getInicio() {
        return inicio;
    }

}
