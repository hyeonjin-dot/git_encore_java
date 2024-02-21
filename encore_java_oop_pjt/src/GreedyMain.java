import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.encore.algorithm.greedy.GreedyNode;

public class GreedyMain {

	public static void main(String[] args) {
		List<GreedyNode> lst = new ArrayList();

		lst.add(new GreedyNode("A", 7, 8));
		lst.add(new GreedyNode("B", 5, 7));
		lst.add(new GreedyNode("C", 3, 6));
		lst.add(new GreedyNode("D", 1, 2));
		lst.add(new GreedyNode("E", 6, 9));
		lst.add(new GreedyNode("F", 10, 11));
		
		Collections.sort(lst);
		for (GreedyNode g : lst) {
			System.out.print(g.getEndTime() + "\t");
		}
		System.out.println();
		
		//Greedy Algorithm 수행 후 결과(활동명) 출력
		List<GreedyNode> result = process(lst);
		for (GreedyNode g : result) {
			System.out.print(g.getActionName() + "\t");
		}
	}
	
	public static List<GreedyNode> process(List<GreedyNode> lst){
		List<GreedyNode> tmp = new ArrayList();
		
		tmp.add(lst.get(0));
		
		for (int i = 0; i < lst.size() - 1 ; i++) {
			for (int j = i + 1 ; j < lst.size() ; j++) {
				if (lst.get(i).getEndTime() < lst.get(j).getStartTime()) {
					tmp.add(lst.get(j));
					i = j - 1;
					break;
				}
			}
		}
		
		//iterator
		List<GreedyNode> ans = new ArrayList();
		
		Iterator<GreedyNode> iter = lst.iterator();
		int time = 0;
		
		while (iter.hasNext()) {
			GreedyNode node = iter.next();
			if (time < node.getStartTime()){
				ans.add(node);
				time = node.getEndTime();
			}
		}
		//임시 출력
		/*System.out.println();
		for (GreedyNode g : ans) {
			System.out.print(g.getActionName() + "\t");
		}*/
		
		return tmp;
	}

}
