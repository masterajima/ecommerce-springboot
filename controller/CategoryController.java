package com.educative.ecommerce.controller;
import java.util.List;
import java.util.object;
//create controller that will call api and service for user request to process
@RestController
@GetMapping("/category")
public class CategoryController{
    public CategoryService categoryService;
    //getting list of item from listArray 
    public ResponseEntity<List<Category>> getCategories(){
        //object property to access method
List<Category>body=categoryService.listCategories();
//return status from server for category response
return new ResponseEntity<>(body,HttpStatus.ok);

    }
    //
    public ResponseEntity<ApiResponse> createCategory(Category category){

    }

}