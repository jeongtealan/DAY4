import java.util.Scanner;
public class test5 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("exit�� �Է��ϸ� �����մϴ�.");
	
	while(true) {
		System.out.println(">>");
		String text = scanner.next();
		if(text.equals("exit"))
			break;
	}
	System.out.println("�����մϴ�...");
}
}
