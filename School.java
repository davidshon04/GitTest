import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class School {

	private HashMap<String, HashSet<String>> teachersSubjects;
	private HashMap<String, HashSet<String>> subjectsTeachers;
	private HashMap<String, HashSet<String>> subjectsStudents; 
	private HashMap<String, HashSet<String>> studentsSubjects;
	
	public School() {
		teachersSubjects = new HashMap<String, HashSet<String>>();
		subjectsTeachers = new HashMap<String, HashSet<String>>();
		subjectsStudents = new HashMap<String, HashSet<String>>();
		studentsSubjects = new HashMap<String, HashSet<String>>();
	}
	
	public void addTeacher(String teacher) {
		teachersSubjects.putIfAbsent(teacher, new HashSet<String>());
	}
	
	public void addSubject(String teacher, String subject) {
		if (teachersSubjects.containsKey(teacher)) {
			teachersSubjects.get(teacher).add(subject);
			if (!subjectsTeachers.containsKey(subject)) {
				subjectsTeachers.put(subject, new HashSet<String>());
			} 
			subjectsTeachers.get(subject).add(teacher);
			subjectsStudents.putIfAbsent(subject, new HashSet<String>());
		}
	}
	
	public void addPupil(String pupil, String subject) {
		if (subjectsStudents.containsKey(subject)) {
			subjectsStudents.get(subject).add(pupil);
			if (!studentsSubjects.containsKey(pupil)) {
				studentsSubjects.put(pupil, new HashSet<String>());
			} 
			studentsSubjects.get(pupil).add(subject);
		}
		
	}
	
	public Iterator<String> getTeachers(String pupil) {
		HashSet<String> teachers = new HashSet<>();
		if (studentsSubjects.containsKey(pupil)) {
			HashSet<String> subjects = studentsSubjects.get(pupil);
			for (String subj: subjects) {
				subjectsTeachers.get(subj);
				for (String teach: subjectsTeachers.get(subj)) {
					teachers.add(teach);
				}
			}
			return teachers.iterator();
		}
		return null;
	}
	
	public Iterator<String> getPupils(String teacher) {
		HashSet<String> students = new HashSet<>();
		if (teachersSubjects.containsKey(teacher)) {
			HashSet<String> subjects = teachersSubjects.get(teacher);
			for (String subj: subjects) {
				subjectsStudents.get(subj);
				for (String stud: subjectsStudents.get(subj)) {
					students.add(stud);
				}
			}
			return students.iterator();
		}
		return null;
	}
	
	public void removeTeacher(String teacher) {
		if (teachersSubjects.containsKey(teacher)) {
			teachersSubjects.get(teacher);
			for (String subj: teachersSubjects.get(teacher)) {
				subjectsTeachers.get(subj).remove(teacher);
			}
			teachersSubjects.remove(teacher);
		}
	}
}
