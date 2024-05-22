package wp.week02.home.assessments;

import java.util.ArrayList;
import java.util.List;

public class LearningLanguages {

	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<String>();
		
		languages.add("Tamil");
		languages.add("English");
		languages.add(1, "Dutch");
		languages.add("Hungary");
		languages.add("German");
		
		System.out.println(languages);
		
		System.out.println(languages.get(0));
		
		languages.set(4, "Hindi");
		
		languages.remove(3);
		
		System.out.println(languages);

	}

}
