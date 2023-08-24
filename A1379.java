import java.util.*;
import java.io.*;
public class A1379{
	static FastScanner fs = null;
	public static void main(String[] args) {
		fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int t = fs.nextInt();
		while (t-- >0) {
			int n = fs.nextInt();
			String s = fs.next();
			String pi = "abacaba";
			char c2[] = pi.toCharArray();
			int co = 0;
			String fi = "";
			boolean res = false;
			for(int i=0;i<(n-6);i++){
				char ch[] = s.toCharArray();
					for(int j=0;j<7;j++){
							if(ch[i+j]==c2[j] || ch[i+j]=='?'){
								ch[i+j] = c2[j];
							}
							if(j==6){
								for(int m=0;m<n;m++){
									if(ch[m]=='?')
										ch[m] = 'd';
								}
								String pt = String.valueOf(ch);
								if(pt.contains(pi) && pt.indexOf(pi)==pt.lastIndexOf(pi)){
									res = true;
									fi = pt;
								}
							}
					}
			}
			if(res){
				out.println("YES");
				out.println(fi);
			}
			else{
				out.println("NO");
			}
		}
		out.close();
	}
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
}