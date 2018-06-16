package com.sortArraysAndArrayList;

public class Fruit //implements Comparable<Fruit> 
{

	private String fruitName;
	private String fruitDesc;
	private int quantity;

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass())
			return false;

		else {
			Fruit f = (Fruit) obj;
			if (this.quantity == f.getQuantity()
					&& this.fruitName == f.getFruitName()
					&& this.fruitDesc == f.getFruitDesc()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 7 * hash + this.fruitName.hashCode();
		hash = 7 * hash + this.fruitDesc.hashCode();
		return hash;
	}

	/*public int compareTo(Fruit compareFruit) {
		int compareQuantity = ((Fruit) compareFruit).getQuantity();

		// ascending order
		//return this.quantity - compareQuantity;

		// descending order
		 return compareQuantity - this.quantity;
	}
*/
	@Override
	public String toString() {
		return this.fruitName + "  :  " + this.fruitDesc + "  :  "
				+ this.quantity;

	}

	public Fruit(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitDesc() {
		return fruitDesc;
	}

	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
