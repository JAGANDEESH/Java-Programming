import java.io.*;
public class BufferR{
	public static void main(String args[]){
		try{
			File f=new File("Jagan.txt");
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			System.out.println(br.readLine());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Thank you : "+br.readLine());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}