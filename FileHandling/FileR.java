import java.io.FileReader;
public class FileR{
	public static void main(String args[]){
		try{
			FileReader fr=new FileReader("Jagan.txt");
			int l=fr.read();
			while(fr.ready()){
				System.out.println((char)l);
				l=fr.read();
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}