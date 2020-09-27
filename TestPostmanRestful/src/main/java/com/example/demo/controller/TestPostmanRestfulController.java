package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.ProductManager;

@RestController
@RequestMapping("/api")
public class TestPostmanRestfulController {
	
	@Autowired
	private ProductManager pm;
	
	@GetMapping("/hello")
	//폼태그로 보낸 것이 아니기 때문에 url에 쿼리스트링으로 지정해줘야 함
	public String hello(@RequestParam(value="msg", required = false)String msg) {
		return msg;
	}
	
	@GetMapping("/product")
	public List<Product> getAll(){
		return pm.getList();
	}
	
	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable int id) {
		return pm.getList().get(id-1);
	}
	
}
