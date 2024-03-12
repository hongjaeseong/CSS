package Ch07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C99참고기타반복처리문 {

	public static void main(String[] args) {
		
		List<String> lists = new ArrayList();
		lists.add("JAVA");
		lists.add("JSP");
		lists.add("Servlet");
		lists.add("Spring");
		lists.add("Database");
		
//		for(String str : lists) {
//			System.out.println(str);
//		}

		lists.stream().forEach(	tmp -> System.out.println(tmp) );

		Map<String,String> map = new HashMap();
		map.put("k1", "V1");
		map.put("k2", "V2");
		map.put("k3", "V3");
		map.put("k4", "V4");
		
		for(String key : map.keySet()) {
			System.out.println("KEY : " +key + ",VAL : " + map.get(key));
		}
	}

}
