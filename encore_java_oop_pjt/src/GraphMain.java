import com.encore.data.structor.graph.GraphNode;
import com.encore.data.structor.graph.GraphServiceImpl;

public class GraphMain {

	public static void main(String[] args) {
		// 1-6 노드 생성
		// serviceimpl - makeNode(int data) : GraphNode 
		
		GraphServiceImpl service = new GraphServiceImpl();
		
		GraphNode node1 = service.makeNode(1);
		GraphNode node2 = service.makeNode(2);
		GraphNode node3 = service.makeNode(3);
		GraphNode node4 = service.makeNode(4);
		GraphNode node5 = service.makeNode(5);
		GraphNode node6 = service.makeNode(6);
		
		// 방향을 연결
		service.makeEdge(node1, node2);
		service.makeEdge(node2, node4);
		service.makeEdge(node3, node5);
		service.makeEdge(node3, node6);
		service.makeEdge(node4, node3);
		service.makeEdge(node5, node4);
		
		
		//DFS 탐색...
		service.dfs(node1);
		
		System.out.println();
		System.out.println("BFS");
		
		// 1 - 8 노드 생성 및 연결
		// 배열, GraphNode 사용
		// 1. 배열
		System.out.println(">>> array version");
		int [][] ary = {{}, {2, 3, 7}, {1, 3, 5}, {1, 2}, {6, 8}, {2}, {4, 7, 8}, {1, 6}, {4, 6}};
		boolean [] visit = new boolean[9];
		
		service.bfs(ary, visit);

		// 2. graphNode
		GraphNode node01 = service.makeNode(1);
		GraphNode node02 = service.makeNode(2);
		GraphNode node03 = service.makeNode(3);
		GraphNode node04 = service.makeNode(4);
		GraphNode node05 = service.makeNode(5);
		GraphNode node06 = service.makeNode(6);
		GraphNode node07 = service.makeNode(7);
		GraphNode node08 = service.makeNode(8);
		
		service.makeEdge(node01, node02);
		service.makeEdge(node01, node03);
		service.makeEdge(node01, node07);
		service.makeEdge(node02, node01);
		service.makeEdge(node02, node03);
		service.makeEdge(node02, node05);
		service.makeEdge(node03, node01);
		service.makeEdge(node03, node02);
		service.makeEdge(node04, node06);
		service.makeEdge(node04, node08);
		service.makeEdge(node05, node02);
		service.makeEdge(node06, node04);
		service.makeEdge(node06, node07);
		service.makeEdge(node06, node08);
		service.makeEdge(node07, node01);
		service.makeEdge(node07, node06);
		service.makeEdge(node08, node04);
		service.makeEdge(node08, node06);
		
		System.out.println();
		System.out.println(">>> graph version");
		service.bfs(node01);
	}

}
