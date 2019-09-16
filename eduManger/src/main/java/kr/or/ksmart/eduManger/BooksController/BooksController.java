package kr.or.ksmart.eduManger.BooksController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.ksmart.eduManger.BooksService.BooksService;
import kr.or.ksmart.eduManger.BooksVo.Books;

@Controller
public class BooksController {

	@Autowired
	private BooksService booksService;
	
	@GetMapping("/")
	public String books(Model model) {		
		
		  List<Books> booksList = booksService.booksList();
		  System.out.println(booksList);
		  model.addAttribute("booksList", booksList);
		 	
		return "/index";
	}
	
	
}
