import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetUname {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		Process p;
		try {
			p = r.exec("uname -a");
			p.waitFor();
			BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = "";
	
			while ((line = b.readLine()) != null) {
				System.out.println(line);
			}
	
			b.close();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
