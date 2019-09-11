package kr.or.ksmart.eduManger.BooksService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ksmart.eduManger.BooksMapper.BooksMapper;
import kr.or.ksmart.eduManger.BooksVo.Books;

@Service
public class BooksService {

	@Autowired
	private BooksMapper booksMapper;
	
	public List<Books> booksList(){
				
		return booksMapper.booksList();
	}
}
