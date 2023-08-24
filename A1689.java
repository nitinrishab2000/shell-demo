import java.util.*;
import java.io.*;
public class A1689{
	static FastScanner fs = null;
	public static void main(String[] args) {
		fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int t = fs.nextInt();
		while (t-->0) {
			int n = fs.nextInt();
			int m = fs.nextInt();
			int k = fs.nextInt();
			char c1[] = fs.next().toCharArray();
			char c2[] = fs.next().toCharArray();
			int o1 = 0;
			int o2 = 0;
			int a1[] = new int[n];
			int a2[] = new int[m];
			for(int i=0;i<n;i++){
				a1[i] = c1[i]-'a';
			}
			for(int i=0;i<m;i++){
				a2[i] = c2[i]-'a';
			}
			sort(a1);
			sort(a2);
			int c = 0;
			int d = 0;
			while (c<n &&d<m) {
				if(a1[c]<a2[d]){
					if(o1<k){
						o1+=1;
						out.print(((char)('a'+a1[c])));
						c+=1;
						o2 = 0;
					}
					else{
						out.print(((char)('a'+a2[d])));
						d+=1;
						o2+=1;
						o1 = 0;
					}
				}
				else{
					if(!(o2<k)){
						o1+=1;
						out.print(((char)('a'+a1[c])));
						c+=1;
						o2 = 0;
					}
					else{
						out.print(((char)('a'+a2[d])));
						d+=1;
						o2+=1;
						o1 = 0;
					}
				}
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
		double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}