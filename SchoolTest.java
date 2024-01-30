import acm.program.ConsoleProgram;

public class SchoolTest extends ConsoleProgram {

	public void run() {
		School school = new School();
		
		school.addTeacher("Tsiala");
		school.addTeacher("Dali");
		school.addTeacher("Zamira");
		school.addTeacher("Jilda");
		
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
		
		println("Dato: " + school.getTeachers("Dato"));
	//	println("Tsiala:" + school.getPupils("Tsiala"));
		

	}
}
