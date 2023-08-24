import java.util.*;
import java.io.*;
public class C1363{
	static FastScanner fs = null;
	public static void main(String[] args) {
		fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int t = fs.nextInt();
		while (t-- >0) {
			int n = fs.nextInt();
			int x = fs.nextInt();
			int co = 0;
			for(int i=1;i<n;i++){
				int u = fs.nextInt();
				int v = fs.nextInt();
				if(u==x || v==x){
					co+=1;
				}
			}
			int ans = 0;
			if(co==1){
				ans = 1;
			}
			else{
				int dif = n-2;
				if(dif%2==0){
					ans = 1;
				}
				else{
					ans = 2;
				}
			}
			if(n<3)
				ans = 1;
			if(ans==1){
				out.println("Ayush");
			}
			else{
				out.println("Ashish");
			}
			out.println();
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