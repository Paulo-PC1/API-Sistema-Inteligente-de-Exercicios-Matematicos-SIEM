package br.com.devpaulo.siem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devpaulo.siem.domain.model.Category;

@RestController
public class CategoryController {
	
	@GetMapping("/category")
	public List<Category> listCategories(){
		var category1 = new Category();
		category1.setId(1L);
		category1.setCategoryName("Aritimética");
		category1.setDescription("A base da matemática e abrange operações fundamentais como: Soma, Subtração, Multiplicação e Divisão.");
		category1.setActive(true);
		
		var category2 = new Category();
		category2.setId(1L);
		category2.setCategoryName("Geometria");
		category2.setDescription("A próxima fase lida com formas, tamanhos e as propriedades do espaço. Os principais tópicos incluem: Figuras Planas, Figuras Sólidas e Cálculo de áreas e volumes.");
		category2.setActive(true);
		
		return Arrays.asList(category1, category2);
	}
}
