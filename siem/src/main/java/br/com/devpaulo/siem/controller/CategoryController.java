package br.com.devpaulo.siem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.devpaulo.siem.domain.model.Category;
import br.com.devpaulo.siem.repository.CategoryRepository;
import br.com.devpaulo.siem.service.CategoryService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Optional<Category> category = categoryRepository.findById(id);
		if(category.isPresent()) {
			return ResponseEntity.ok(category.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Category createCategory(@Valid @RequestBody Category category, HttpServletResponse response) {
		return categoryRepository.save(category);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeCategory(@PathVariable Long id) {
		categoryRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Category> updateCategory(@PathVariable Long id, @Valid @RequestBody Category category) {
		Category categorySaved = categoryService.update(id, category);
		return ResponseEntity.ok(categorySaved);
	}
}
