package com.pet.model.product;
import com.pet.model.category.Category;

public class Cart extends Product{
	private int ea;//장바구니에 담겨질 갯수

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}
	
	
}
