package kr.or.ksmart.eduManger.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.or.ksmart.eduManger.Service.BooksService;
import kr.or.ksmart.eduManger.vo.Books;

@Controller
public class BooksController {

	@Autowired
	private BooksService booksService;
	
	@GetMapping("/booksList")
	public String books(Model model) {
		
		  List<Books> booksList = booksService.booksList();
		  System.out.println(booksList); model.addAttribute("booksList", booksList);
		
		return "/index";
	}
	
	
}
