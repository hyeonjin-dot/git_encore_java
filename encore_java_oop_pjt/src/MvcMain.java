import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.encore.mvc.controller.InsertController;
import com.encore.mvc.controller.SelectController;
import com.encore.mvc.domain.PostRequestDTO;
import com.encore.mvc.domain.PostResponseDTO;

public class MvcMain {

	public static void main(String[] args) {
		// 사용자의 입력화면을 통해서 게시글 작성을 요청하는 영역
		InsertController insert = new InsertController();
		
		/*
		// 사용자가 입력한 값을 DTO에 담아서 Controller에게 전달
		PostRequestDTO params = new PostRequestDTO();
		params.setTitle("aaa");
		params.setContent("bbb");
		params.setWriter("ccc");
		
		int flag = insert.execute(params);*/
		
		/*Map<String, String> map = new HashMap<String, String>();
		System.out.println(" value 추가 >>>> ");
		map.put("title","sss");
		map.put("content","qqq");
		map.put("writer","ddd");
		
		System.out.println(">>> insert result : " + insert.execute(map) );*/
		
		SelectController select = new SelectController();
		List<PostResponseDTO> list =  select.execute();
		System.out.println(list);
	}

}
