import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	       int l;
	       String s= sc.nextLine();
	       l = s.length();
	       for(int i=0; i<l;i++)
	       {
	           int k = s.length() - i;
	           if (k> 0) {
	               System.out.printf("%" + k + "s", " ");
	           }
	           for(int j=0;j<i;j++)
	           {
	               System.out.printf("%c ",s.charAt(j));
	           }
	           System.out.printf("%c\n",s.charAt(i));
	       }         

	   }
}
