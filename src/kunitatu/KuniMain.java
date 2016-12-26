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
//	private String a = "a";
//	private String b = "b";
//	private String c = "c";
//	private String d = "d";
//	private String e = "e";

	// ï∂éöóÒåãçáë¨ìxí≤ç∏
	private void test01() {
		int max = 300000;

		this.doStringPlus(max);
		this.doStringJoin(max);
		this.doStringBuilder(max);
		this.doStringBuilder(max);
		this.doStringJoin(max);
		this.doStringPlus(max);
	}

	private void doStringBuilder(int max) {
		String str = "";
		StringBuilder sb = new StringBuilder();
		long time = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			sb = new StringBuilder();
			sb.append(a).append(b).append(c).append(d).append(e).append("f").append(String.valueOf(i + max * 2));
			str = sb.toString();
		}
		log("doStringBuilder:" + (System.currentTimeMillis() - time));

	}

	private void doStringJoin(int max) {
		String str = "";
		long time = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			str = String.join(a, b, c, d, e, "g", String.valueOf(i + max * 3));
		}
		log("doStringJoin:" + (System.currentTimeMillis() - time));

	}

	private void doStringPlus(int max) {
		String str = "";
		long time = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			str = a + b + c + d + e + "h" + String.valueOf(i + max * 4);
		}
		log("doStringPlus:" + (System.currentTimeMillis() - time));

	}

	private void log(String msg) {
		System.out.println(msg);
	}
}
