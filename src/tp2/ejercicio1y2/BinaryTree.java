package tp2.ejercicio1y2;



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


    	 
    public BinaryTree<T> espejo(){
		invertirHijos( this);
 	   return this;
    }

	private void invertirHijos(BinaryTree<T> main) {
		if (!main.isLeaf()) {
			BinaryTree<T> tmp = main.getLeftChild();
			main.addLeftChild(main.getRightChild());
			main.addRightChild(tmp);
			if (main.hasLeftChild()) {
				invertirHijos(main.getLeftChild());
			}
			if (main.hasRightChild()) {
				invertirHijos(main.getRightChild());
			}
		}
	}

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		
   }
		
}

