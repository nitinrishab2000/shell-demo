import java.util.*;
import java.io.*;
public class C1615{
	static FastScanner fs = null;
	public static void main(String[] args) {
		fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int t = fs.nextInt();
		while (t-->0) {
			int n = fs.nextInt();
			String s1 = fs.next();
			String s2 = fs.next();
			char c1[] = s1.toCharArray();
			char c2[] = s2.toCharArray();
			int a = 0;   //11
			int b  = 0;  //00
			int c = 0;   //10
			int d = 0;   //01
			for(int i=0;i<n;i++){
				if(c1[i]=='1'){
					if(c2[i]=='1'){
						a+=1;
					}
					else{
						c+=1;
					}
				}
				else{
					if(c2[i]=='1'){
						d+=1;
					}
					else{
						b+=1;
					}
				}
			}
			boolean res = false;
			int ans = (int)1e7;
			// out.println((a+b)+" "+(c+d));
			if((a+b)%2==1 && (((a-b)==0)||((a-b)==1))){
				res = true;
				ans = Math.min(ans,(a+b));
			}
			if((c+d)%2==0 && (((c-d)==0)||((c-d)==1))){
				res = true;
				ans = Math.min(ans,(c+d));
			}
			if(ans==(int)1e7)
				ans = -1;
			out.println(ans);
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