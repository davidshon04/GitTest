import java.util.Iterator;

import acm.program.ConsoleProgram;

public class SchoolTest extends ConsoleProgram {

	public void run() {
		School school = new School();
		
		school.addTeacher("Tsiala");
		school.addTeacher("Dali");
		school.addTeacher("Zamira");
		school.addTeacher("Jilda");
		school.addTeacher("Mzeona");
		
		school.addSubject("Dali", "Georgian");
		school.addSubject("Jilda", "Georgian");
		school.addSubject("Mtvarisa", "Georgian");
		school.addSubject("Tsiala", "Georgian");
		school.addSubject("Tsiala", "History");
		school.addSubject("Zamira", "Art");
		school.addSubject("Mzeona", "Geography");
		
		school.addPupil("Dato", "Geography");
		school.addPupil("Kristi", "Geography");
		school.addPupil("Dato", "Georgian");
		school.addPupil("Kristi", "History");
		school.addPupil("Guka", "Art");
		school.addPupil("Gigi", "Art");
		school.addPupil("Dato", "History");
		
		println("Dato: " + toString(school.getTeachers("Dato")));
		println("Tsiala:" + toString(school.getPupils("Tsiala")));
		println("Kristi: " + toString(school.getTeachers("Kristi")));
		println("Mzeona: " + toString(school.getPupils("Mzeona")));
		println("Mtvarisa: " + toString(school.getPupils("Mtvarisa")));
		println("Gigi: " + toString(school.getTeachers("Gigi")));
		println("Giga: " + toString(school.getTeachers("Giga")));

	}

	private String toString(Iterator<String> teachers) {
		String res = "[ ";
		if (teachers == null) {
			return null;
		}
		while (teachers.hasNext()) {
			String str = teachers.next();
			res += str;
			res += " ";	
		}
		res += "]";
		return res;
	}
}
