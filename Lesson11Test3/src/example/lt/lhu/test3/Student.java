package example.lt.lhu.test3;

public class Student {
	private String surname;
	private String initials;
	private int numGroup;
	private int[] performance;
	private int mark;

	Student(String a, String b, int c) {
		this.surname = a;
		this.initials = b;
		this.numGroup = c;
		this.mark = 0;
		this.performance = new int[5];
	}

	public boolean perf(int a) {
		if (mark >= 5) {
			return false;
		}
		performance[mark] = a;
		mark++;
		return true;
	}

	public boolean excellent() {
		for (int i = 0; i < mark; i++)
			if (performance[i] != 9 && performance[i] != 10) {
				return false;
			}
		return true;
	}

	public void print() {
		System.out.println("_________________________________________");
		System.out.print(surname + " " + initials + "," + numGroup + " group; " + "Marks: ");
		for (int i = 0; i < mark; i++) {
			System.out.print(performance[i] + ";");

		}
		System.out.println(" ");

	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int getNumGroup() {
		return numGroup;
	}

	public void setNumGroup(int numGroup) {
		this.numGroup = numGroup;
	}

	public int[] getPerformance() {
		return performance;
	}

	public void setPerformance(int[] performance) {
		this.performance = performance;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

}
