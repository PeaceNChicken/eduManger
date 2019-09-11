package kr.or.ksmart.eduManger.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.or.ksmart.eduManger.vo.Books;

@Mapper
public interface BooksMapper {
	
	public List<Books> booksList();

}
