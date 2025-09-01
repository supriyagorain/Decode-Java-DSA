 import java.util.Scanner;
public class question1//print roll no.of students with marks less than 15
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();

		int[] marks=new int[size];

        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();  
        }
        for(int i=0;i<size;i++){
            if(marks[i]<15)
            System.out.println(i);
        }
        sc.close();
	}
}

