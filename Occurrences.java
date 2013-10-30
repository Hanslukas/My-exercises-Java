import java.util.*;

public class SubCogNom {

	public String initials(){

		String ini ="";
		String name, surname;

		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		surname = input.nextLine();

		ini = name.charAt(0)+"&"+surname.charAt(0);	

		return ini;
	}

	public static String reverse(String s){

		String inv="";
		int i;

		for(i=s.length()-1; i>=0; i--)
			inv = inv+s.charAt(i);

		return inv;
	}

	public int occurrences(String pattern, String text){

		int occ = 0, i;
		int lenPattern = pattern.length();
		String verify="";


		for(i=0; i<text.length(); i++)
			{
				if(i==text.length()-2) break;

				verify = text.substring(i, lenPattern++);

				if(verify.equals(pattern)) occ++;

				verify="";
			}

			return occ;
	}

		public static void main(String[] argv) 
		{
			SubCogNom p = new SubCogNom();
			System.out.println(p.initials());
			System.out.println(SubCogNom.reverse("abc"));
			System.out.println("Number of occurrences: " + p.occurrences("sca", "Ho pescato una scarpa"));
		}
}
