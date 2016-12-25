package kunitatu;

public class KuniMain {

	public static void main(String[] args) {
		KuniMain ins = new KuniMain();
		ins.test01();
		System.exit(0);
	}

	private static final String a = "a";
	private static final String b = "b";
	private static final String c = "c";
	private static final String d = "d";
	private static final String e = "e";

	private void test01() {
		int max = 300000;
		String str = "";
		StringBuilder sb = new StringBuilder();

		long time = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			sb = new StringBuilder();
			sb.append(a).append(b).append(c).append(d).append(e);
			str = sb.toString();
		}
		log("StringBuilder:" + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			str = String.join(a, b, c, d, e);
		}
		log("String.join:" + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			str = a + b + c + d + e;
		}
		log("String +:" + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			sb = new StringBuilder();
			sb.append(a).append(b).append(c).append(d).append(e).append("f").append(String.valueOf(i));
			str = sb.toString();
		}
		log("StringBuilder:" + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			str = String.join(a, b, c, d, e, "f", String.valueOf(i));
		}
		log("String.join:" + (System.currentTimeMillis() - time));

		time = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			str = a + b + c + d + e + "f" + String.valueOf(i);
		}
		log("String +:" + (System.currentTimeMillis() - time));

	}

	private void log(String msg) {
		System.out.println(msg);
	}
}
