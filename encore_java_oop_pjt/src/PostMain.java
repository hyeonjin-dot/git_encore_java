import com.encore.post.domain.PostRequestDTO;
import com.encore.post.service.PostService;
import com.encore.post.view.PostView;

public class PostMain {

	public static void main(String[] args) {
//		PostService service = new PostService(); 
//		
//		String msg = service.savePost("ff", "공지사항", "내일 휴강입니다.", null, 0, true);
//		System.out.println("Result >>>> " + msg);
//		
//		PostRequestDTO request = new PostRequestDTO("ff", "공지사항", "내일 휴강입니다.", 0, true);
//		String msg = service.savePost(request);
//		System.out.println("Result >>>> " + msg);
		
		//view를 이용한 사용자 입력과 연결......
		PostView view = new PostView();
		view.menu();
	}

}