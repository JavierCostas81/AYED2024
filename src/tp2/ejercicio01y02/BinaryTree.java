package tp2.ejercicio01y02;


import tp1.ejercicio08.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;
	private BinaryTree<T> rightChild;


	public BinaryTree() {
		super();
	}

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}

	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}





	//TP2 Ejercicio2
	public  int contarHojas() {
		if (this.isLeaf()) {
			return 1;
		}
		if ((this.hasLeftChild()) && this.hasRightChild()){
			return this.leftChild.contarHojas() + this.rightChild.contarHojas();
		} else if (this.hasLeftChild()) {
			return this.leftChild.contarHojas();
		}
		else return this.rightChild.contarHojas() ;
	}

	public BinaryTree<T> clonar(BinaryTree<T> clon) {

//		if (this.isLeaf()) {
//			return clon;
//		} else {
		if (!this.isLeaf()) {
			clon.setData(this.getData());
			BinaryTree<T> izq = new BinaryTree<>(this.getLeftChild().getData());
			BinaryTree<T> der = new BinaryTree<>(this.getRightChild().getData());
			clon.addLeftChild(izq);
			clon.addRightChild(der);
			if (this.hasLeftChild()) {
				this.getLeftChild().clonar(clon.getLeftChild());
			}
			if (this.hasRightChild()) {
				this.getRightChild().clonar(clon.getRightChild());
			}
		}
		return clon;
	}
    	 
    public BinaryTree<T> espejo() {
		BinaryTree<T> espejo = new BinaryTree<>();
		this.clonar(espejo);
		invertirHijos(espejo);
		return espejo;
    }

	private void swap (BinaryTree<T> nodo) {
		BinaryTree<T> tmp = nodo.getLeftChild();
		nodo.addLeftChild(nodo.getRightChild());
		nodo.addRightChild(tmp);
	}

	private void invertirHijos(BinaryTree<T> main) {
		if (!main.isLeaf()) {
			swap(main);
			if (main.hasLeftChild()) {
				invertirHijos(main.getLeftChild());
			}
			if (main.hasRightChild()) {
				invertirHijos(main.getRightChild());
			}
		}
	}


	// 0<=n<=m
	public void entreNiveles(int n, int m) throws IllegalAccessException {
		Queue<BinaryTree<T>> cola = new Queue<>();
		BinaryTree<T> aBTemp = new BinaryTree<>();
		int nivel = 0;
		cola.enqueue(this);
		cola.enqueue(null);
		System.out.println("Se imprimirán los nodos entre los niveles: " + n + " y " + m);
		while (!cola.isEmpty()) {
			aBTemp = cola.dequeue();
			if (aBTemp != null) {
				if ((nivel >= n) && (nivel <= m)) {
					System.out.print("Nivel : " + nivel + " con valor: " + aBTemp.getData() + "\n");
				}
				else if (nivel > m) {
					return;
				}
				if (aBTemp.hasLeftChild()) {
					cola.enqueue(aBTemp.getLeftChild());
				}
				if (aBTemp.hasRightChild()) {
					cola.enqueue(aBTemp.getRightChild());
				}
			} else {
				nivel++;
				if (!cola.isEmpty()) {
					cola.enqueue(null);
				}
				System.out.println("");
			}
		}
   }
		
}

