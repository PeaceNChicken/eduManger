package kr.or.ksmart.eduManger.BooksMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.eduManger.BooksVo.Books;

@Mapper
public interface BooksMapper {
	
	public List<Books> booksList();

}
