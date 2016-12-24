package kunitatu;

public class KuniMain {

	public static void main(String[] args) {
		KuniMain ins = new KuniMain();
		ins.test01();
		System.exit(0);
	}

	private void test01(){
		int max = 1000000;
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		
		long time = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<max; i++){
			sb.append(a).append(b).append(c).append(d);
		}
		log("StringBuilder:" + (System.currentTimeMillis()-time));
		
		time = System.currentTimeMillis();
		for (int i=0; i<max; i++){
			String.join(a, b, c, d);
		}
		log("String.join:" + (System.currentTimeMillis()-time));
		
		time = System.currentTimeMillis();
		sb = new StringBuilder();
		for (int i=0; i<max; i++){
			sb.append(a).append(b).append(c).append(d);
		}
		log("StringBuilder:" + (System.currentTimeMillis()-time));
		
		time = System.currentTimeMillis();
		for (int i=0; i<max; i++){
			String.join(a, b, c, d);
		}
		log("String.join:" + (System.currentTimeMillis()-time));
		
	}
	
	private void log(String msg){
		System.out.println(msg);
	}
}
