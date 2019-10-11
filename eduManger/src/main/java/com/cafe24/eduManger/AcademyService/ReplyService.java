package com.cafe24.eduManger.AcademyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.cafe24.eduManger.AcademyMapper.ReplyMapper;
import com.cafe24.eduManger.AcademyVo.Reply;

@Service
@Transactional
public class ReplyService {
@Autowired private ReplyMapper replyMapper;
	public Map<String, Object> getReply(){
		Map<String, Object> map = new HashMap<String, Object>();
		List<Reply> re = replyMapper.getReply();
		map.put("reply", re);
		return map;
	}
}
