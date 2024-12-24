import java.io.InputStreamReader;
public class InputStRe{
	public static void main(String args[]){
		try(InputStreamReader isr=new InputStreamReader(System.in)){
			int l=isr.read();
			while(isr.ready()){
				System.out.println((char)l);
				l=isr.read();
			}
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}