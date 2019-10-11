package com.cafe24.eduManger.AcademyController;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.eduManger.AcademyService.BoardService;
import com.cafe24.eduManger.AcademyVo.Board;

@Controller
public class BoardController {
@Autowired private BoardService boardService;

	@GetMapping("/boardList")
	public String getBoard(Model model) {
		Map<String, Object> map = boardService.getBoard();
		System.out.println(map+"<-- map board");
		model.addAttribute("boardList", map.get("board"));
		return "/academy/board/boardList";
	}
	
	@GetMapping("/boardInsert")
	public String getBoardInsert() {
		return "/academy/board/boardInsert";
	}
	
	@GetMapping("/boardUpdate")
	public String getBoardUpdate(@RequestParam(value="boardList") String board, Model model) {
		System.out.println(board+"<--dd");
		System.out.println(boardService.getBoardUpdate(board)+"<--");
		model.addAttribute("boardUpdate", boardService.getBoardUpdate(board));
		return "/academy/board/boardUpdate";
	}
	
	@GetMapping("/boardDelete")
	public String getBoardDelete(@RequestParam(value="board") String board) {
		System.out.println("게시글 삭제 완료");
		int a = boardService.getBoardDelete(board);
		System.out.println(a +"<-- delete 결과");
		return "redirect:/boardList";
	}
	
	@GetMapping("boardSearch")
	public String getBoardSearch(@RequestParam(value="sk", required = false)String sk
								,@RequestParam(value="sv", required = false)String sv
								,Model model) {
		System.out.println(sk+"<--sk");
		System.out.println(sv+"<--sv");
		model.addAttribute("boardList", boardService.getBoardSearch(sk, sv));		
		return "/academy/board/boardList";
	}
}
