package example.lt.lhu.test3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int n = 10;
		int count = 0;
		Student[] st = new Student[n];
		st[0] = new Student("Ivanov", "I.I.", 1);
		st[1] = new Student("Sidorov", "S.S.", 2);
		st[2] = new Student("Petuhov", "P,P.", 3);
		st[3] = new Student("Nagornov", "P.V.", 4);
		st[4] = new Student("Semenov", "E.M.", 5);
		st[5] = new Student("Girgel", "I.G.", 6);
		st[6] = new Student("Tihanovich", "S.V.", 7);
		st[7] = new Student("Shappo", "V.M.", 8);
		st[8] = new Student("Banko", "A.V.", 9);
		st[9] = new Student("Korban", "A.I", 10);

		Random inPutPerformance = new Random();
		for (int i = 0; i < st.length; i++) {
			st[i].perf(inPutPerformance.nextInt(10) + 1);
			st[i].perf(inPutPerformance.nextInt(10) + 1);
			st[i].perf(inPutPerformance.nextInt(10) + 1);
			st[i].perf(inPutPerformance.nextInt(10) + 1);
			st[i].perf(inPutPerformance.nextInt(10) + 1);

		}
		System.out.println("All students:");
		for (int i = 0; i < st.length; i++) {
			st[i].print();
		}
		System.out.println("  ");
		System.out.println("Exelent student:");
		for (int i = 0; i < st.length; i++) {
			if (st[i].excellent()) {
				st[i].print();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Exelent students is Not");
		}
	}
}
