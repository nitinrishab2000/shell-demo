import java.util.*;
import java.io.*;
public class B21163{
	static FastScanner fs = null;
	public static void main(String[] args) {
		fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = fs.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = fs.nextInt();
		}
		int N = (int)1e5+20;
		int co[] = new int[N];
		int mx = 0;
		int min = 0;
		int ans = 0;
		int cm[] = new int[N];
		Map<Integer,Integer> mp = new TreeMap<>(Collections.reverseOrder());
		Set<Integer> st = new HashSet<>();
		for(int i=0;i<n;i++){
			st.add(a[i]);
			int num = a[i];
			co[num]+=1;
			mx = Math.max(mx,co[num]);
			cm[co[num]]+=1;
			if(co[num]!=1)
			cm[co[num]-1]-=1;
			mp.put(num,co[num]);
			for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
				min = entry.getValue();
				break;
			}
			if(mx==1){
				ans = i+1;
			}
			if(st.size()==1){
				ans = i+1;
			}
			long d = (long)min*(long)cm[min]+(long)mx*(long)cm[mx];
			if(min==mx)
				d-=(long)min*(long)cm[min];
			if(d==(long)(i+1)){
				if(cm[mx]==1 && (mx-min)==1){
					ans = i+1;
				}
				if(cm[1]==1){
					ans = i+1;
				}
			}
			// out.println(min+" "+mx+" "+d+" "+(i+1)+" "+ans+" "+cm[min]+" "+cm[mx]);
		}
		out.println(ans);
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