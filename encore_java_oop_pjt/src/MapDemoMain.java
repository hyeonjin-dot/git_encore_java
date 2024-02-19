
/*
 *  Map interface
 *  비선형 자료구조
 *  key, value 데이터를 관리
 *  값은 중복허용하지만, 키는 중복허용하지 않음
 *  직접 파일 형식처럼 direct access 가능하여 검색에 용이
 *  HashMap 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemoMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(" value 추가 >>>> ");
		map.put("title","sss");
		map.put("content","qqq");
		map.put("writer","ddd");
		
		System.out.println("출력 >>>");
		System.out.println(map);
		
		System.out.println(" entrySet >>>>"); // map.entrySet() : key와 value값을 entry에 담음
		for (Entry<String, String> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey()+ " : " + entrySet.getValue());
		}
		System.out.println();
		System.out.println(" keySet >>> ");
		for (String key :map.keySet()) {// map.keySet() : key값을 set에 담음
			System.out.println(key);
		}
		
		////////////////////////////////////////
		List<String> lst01 = new ArrayList<String>();
		lst01.add("A");lst01.add("B");lst01.add("C");
		
		List<String> lst02 = new ArrayList<String>();
		lst02.add("D");lst02.add("E");lst02.add("F");
		
		Map<String, List<String>> multiLst = new HashMap<String, List<String>>();
		multiLst.put("a_section", lst01);
		multiLst.put("b_section", lst02);
		////////////////////////////////////////
		
		List<String> a_section_lst = multiLst.get("b_section");
		for(String data : a_section_lst) {
			System.out.println(data);
		}
		
	}

}
