package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductManager {
	private List<Product> list = new ArrayList<>();
	
	public ProductManager() {
		list.add(new Product(1, "애플 아이폰", 15));
		list.add(new Product(2, "삼성 노트", 10));
		list.add(new Product(3, "삼성 갤럭시", 25));
		list.add(new Product(4, "엘 g9", 7));
	}
	
	//상품 추가
	public void addProduct(Product p) {
		p.setId(list.size()+1);
		list.add(p);
	}
	
	//전체 상품 조회
	public List<Product> getList(){
		return list;
	}
	
	//id 조회로 해당하는 상품 불러오기
	public Product getProduct(int id) {
		return list.get(id-1);
	}
	
	//상품 제거
	public void delProduct(int id) {
		list.remove(id-1);
	}
	
}