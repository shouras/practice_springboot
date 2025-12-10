import java.util.Scanner;
import java.util.ArrayList;

public class Todo{
	public static void main(String[] args){
		System.out.println("Todoリストを作成します！");

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> todoList = new ArrayList<>();
			
		
		while(true){
			System.out.print("タスクを入力してください：");
			String task = scanner.nextLine();

			System.out.println("「" + task + "」を登録しました");
			if(task.equals("exit")){
				break;
			}
			todoList.add(task);
			System.out.println("現在のタスク：" + todoList);

		}
	System.out.println("アプリを終了します。");

	}
}

