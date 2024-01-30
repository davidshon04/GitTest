import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class School {

	private HashMap<String, ArrayList<String>> teachersSubjects;
	private HashMap<String, ArrayList<String>> subjectsTeachers;
	private HashMap<String, ArrayList<String>> subjectsStudents; 
	private HashMap<String, ArrayList<String>> studentsSubjects;
	
	public School() {
		teachersSubjects = new HashMap<String, ArrayList<String>>();
		subjectsTeachers = new HashMap<String, ArrayList<String>>();
		subjectsStudents = new HashMap<String, ArrayList<String>>();
		studentsSubjects = new HashMap<String, ArrayList<String>>();
	}
	
	public void addTeacher(String teacher) {
		if (!teachersSubjects.containsKey(teacher)) {
			teachersSubjects.put(teacher, new ArrayList<String>());
		}
	}
	
	public void addSubject(String teacher, String subject) {
		if (teachersSubjects.containsKey(teacher)) {
			ArrayList<String> subjList = teachersSubjects.get(teacher);
			if (!subjList.contains(subject)) {
				subjList.add(subject);
			}
			teachersSubjects.put(teacher, subjList);
		}
		
		if (subjectsTeachers.containsKey(subject)) {
			ArrayList<String> teachList = subjectsTeachers.get(subject);
			if (!teachList.contains(teacher)) {
				teachList.add(teacher);
			}
			subjectsTeachers.put(subject, teachList);
		}
	}
	
	public void addPupil(String pupil, String subject) {
		if (subjectsStudents.containsKey(subject)) {
			ArrayList<String> studList = subjectsStudents.get(subject);
			if (!studList.contains(pupil)) {
				studList.add(pupil);
			}
			subjectsStudents.put(subject, studList);
		}
		
		if (studentsSubjects.containsKey(pupil)) {
			ArrayList<String> subjList = studentsSubjects.get(pupil);
			if (!subjList.contains(subject)) {
				subjList.add(subject);
			}
			studentsSubjects.put(pupil, subjList);
		}
	}
	
	public Iterator<String> getTeachers(String pupil) {
		if (studentsSubjects.containsKey(pupil)) {
			ArrayList<String> subjList = studentsSubjects.get(pupil);
			ArrayList<String> teachersList = new ArrayList<String>();
			for (String subjects: subjList) {
				//subjectsTeachers.get(subjects);
//				for (String teachOneSubj: subjectsTeachers.get(subjects)) {
//					teachersList.add(teachOneSubj);
//				}
				if (subjectsTeachers.containsKey(subjects)) {
					teachersList.addAll(subjectsTeachers.get(subjects)); // TODO test on addAll(null);
				}
			}
			return teachersList.iterator();
		}
		return null;
	}
	
	public Iterator<String> getPupils(String teacher) {
		if (teachersSubjects.containsKey(teacher)) {
			ArrayList<String> subjList = teachersSubjects.get(teacher);
			ArrayList<String> studentsList = new ArrayList<String>();
			for (String subjects: subjList) {
				//subjectsTeachers.get(subjects);
//				for (String studOneSubj: subjectsStudents.get(subjects)) {
//					studentsList.add(studOneSubj);
//				}
				if (subjectsStudents.containsKey(subjects)) {
					studentsList.addAll(subjectsStudents.get(subjects));
				}
			}
			return studentsList.iterator();
		}
		return null;
	}
	
	public void removeTeacher(String teacher) {
		if (teachersSubjects.containsKey(teacher)) {
			teachersSubjects.remove(teacher);
			
			Iterator<String> subjects = subjectsTeachers.keySet().iterator();
			while(subjects.hasNext()) {
				String subj = subjects.next();
				if (subjectsTeachers.get(subj).contains(teacher)) {
					subjectsTeachers.get(subj).remove(teacher);
				}
			}
		}
	}
}
