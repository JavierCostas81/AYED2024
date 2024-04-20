package tp3.ejercicio01;

import tp1.ejercicio08.Queue;

import java.util.LinkedList;
import java.util.List;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	public int altura() {
		/*a) public int altura(): int devuelve la altura del árbol, es decir, la longitud del camino más largo
		desde el nodo raíz hasta una hoja.*/
		return calcularAltura(0);
	}

	private int calcularAltura(int i) {
		int max = 0;
		if ((this == null) || (this.isEmpty())) {
			return -1;
		}

		else {
			for (GeneralTree<T> ag : this.getChildren()
			) {
				max = Math.max(ag.calcularAltura(i + 1), max);
			}
		}
		return Math.max(max,i);
	}

	public int nivel(T dato){
		/*public int nivel(T dato) devuelve la profundidad o nivel del dato en el árbol. El nivel de un nodo
		es la longitud del único camino de la raíz al nodo.*/
		return busquedaYNivel(dato, 0);
	  }

	private int busquedaYNivel(T dato, int nivel) {
		int resultado = -1;
		if ((this == null) || (this.isEmpty())) {
			return resultado;
		}
		else {
			if (this.getData().equals(dato)) {
				resultado = nivel;
				return resultado;
			}
			for (GeneralTree<T> ag : this.getChildren()
			) {
				resultado = Math.max(ag.busquedaYNivel( dato, nivel + 1),resultado);
			}
		}

		return resultado;
	}

	public int ancho() throws IllegalAccessException {
		/*public int ancho(): int la amplitud (ancho) de un árbol se define como la cantidad de nodos que
		se encuentran en el nivel que posee la mayor cantidad de nodos.*/
		Queue<List<GeneralTree<T>>> cola = new Queue<>();
		List<GeneralTree<T>> childs;
		int resultado = -1;
		if ((!this.isEmpty())) {
			resultado = 1;
		}
		else {
			return resultado;
		}
		cola.enqueue(this.getChildren());
		cola.enqueue(null);

		while (!cola.isEmpty()) {
			int tmp = 0;
			while ((childs = cola.dequeue()) != null) {
				tmp+= childs.size();
				for (GeneralTree<T> aG: childs
					 ) {
					cola.enqueue(aG.getChildren());
				}
			}
			resultado = Math.max(resultado,tmp);
			if (!cola.isEmpty()) {
				cola.enqueue(null);
			}
		}
		return resultado;
	}

	@Override
	public String toString() {
		String tmp = "Dato: " + this.data.toString() + "\nHijos: ";
		for (GeneralTree<T> hijos: this.children
			 ) {
			tmp+= "\n" + hijos.data.toString();
		}
		return tmp;
	}
}