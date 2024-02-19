package com.encore.data.structor.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphServiceImpl {
	
	public GraphServiceImpl() {}
	
	public GraphNode makeNode(int data) {
		return new GraphNode(data);
	}
	
	public void makeEdge(GraphNode from, GraphNode to) {
		from.getCorLst().add(to);
	}
	
	// 재귀, iterator, 방문체크
	public void dfs(GraphNode node) { // 깊이 우선
		node.setVisited(true);
		System.out.print(node.getData() + "\t");
		for (GraphNode tmp : node.getCorLst()) {
			if (tmp.isVisited() == false)
				dfs(tmp);
		}
		
	
		/*List<GraphNode> lst = node.getCorLst();
		for (int idx = 0; idx < lst.size(); idx++) {
			GraphNode data = lst.get(idx);
			if (!data.isVisited())
				dfs(data);
		}*/
		 
	}
	
	// ary로 구현 queue
	public void bfs(int [][] ary, boolean [] visit) { // 너비 우선 idx = 1부터 시작			
		Queue<Integer> queue = new LinkedList<Integer>();
		//데이터면서 2차원 배열의 행 인덱스
		queue.offer(1);
		visit[1] = true;
		
		while (!queue.isEmpty()) {
			int row_data = queue.poll();
			System.out.print(row_data + "\t");
			for (int i = 0; i < ary[row_data].length; i++) {
				// tmp = 데이터지만 인덱스
				int tmp = ary[row_data][i];
				if (!visit[tmp]) {
					visit[tmp] = true;
					queue.offer(tmp);
				}
			}
		}
	}
	
	//graphNode로 구현
	public void bfs(GraphNode node) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		
		queue.offer(node);
		node.setVisited(true);
		while (!queue.isEmpty()) {
			GraphNode t_node = queue.poll();
			System.out.print(t_node.getData() + "\t");
			for (GraphNode tmp : t_node.getCorLst()) {
				if (!tmp.isVisited()) {
					tmp.setVisited(true);
					queue.offer(tmp);
				}
			}
		}
	}
	
}
