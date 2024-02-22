import java.util.ArrayList;
import java.util.List;

public class DfsAlgorithmMain {

	public static ArrayList<ArrayList<Integer>> graph = new  ArrayList<ArrayList<Integer>>();
	public static boolean [] visited = new boolean[9];
	
	public static void main(String[] args) {
		// 요소를 담는 리스트 생성 (사이즈 만큼)
		for (int i = 0; i < visited.length; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		graph.get(1).add(2); // 1번과 2변 연결
		graph.get(1).add(3);
		graph.get(1).add(8);
		graph.get(2).add(1); 
		graph.get(2).add(7);
		graph.get(3).add(1); 
		graph.get(3).add(4);
		graph.get(3).add(5);
		graph.get(4).add(3); 
		graph.get(4).add(5);
		graph.get(5).add(3);
		graph.get(5).add(4);
		graph.get(6).add(7);
		graph.get(7).add(2);
		graph.get(7).add(6);
		graph.get(7).add(8);
		graph.get(8).add(1);
		graph.get(8).add(7);
		
		dfs(1);
		
	}
	
	public static void dfs(int start) {
		System.out.print(start + " \t ");
		visited[start] = true;
		
		for (int node : graph.get(start)) {
			if (!visited[node])
				dfs(node);
		}
		
	}

}
