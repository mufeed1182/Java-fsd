package Mock11Req4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollegeBo {
	public static List<College> findCollege(List<College> collegeList,List<String> nameList){
		List<College> college=new ArrayList<>();
		for (College c:collegeList) {
			for (String s:nameList) {
				if (c.getName().equals(s)) {
					college.add(c);
				}
			}
		}
		return college;
		
	}
	public static List<College> findCollege(List<College> collegeList,Date startingDate){
		List<College> list=new ArrayList<College>();
		for (College c:collegeList) {
			if (c.getStartingDate().equals(startingDate)) {
				list.add(c);
			}
		}
		return list;
		
	}
	public static List<College> findCollege(List<College> collegeList, String location){
		List<College> list1=new ArrayList<College>();
		for (College c:collegeList) {
			if (c.getLocation().equals(location)) {
				list1.add(c);
			}
		}
		return list1;
		
	}

}
