package kr.or.ksmart.eduManger.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ksmart.eduManger.Mapper.BooksMapper;
import kr.or.ksmart.eduManger.vo.Books;

@Service
public class BooksService {

	@Autowired
	private BooksMapper booksMapper;
	
	public List<Books> booksList(){
				
		return booksMapper.booksList();
	}
}
