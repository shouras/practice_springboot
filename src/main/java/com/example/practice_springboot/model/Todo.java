import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Todo{
	public static void main(String[] args){
		System.out.println("=== Todoリスト ===");
		
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> todoList = new ArrayList<>();
			
		
		while(true){
			System.out.println("\n--- 現在のタスク ---");
			if(todoList.size() == 0){
				System.out.println("(なし)");
			}else{
				for(int i = 0; i < todoList.size(); i++){
					System.out.println((i + 1) + "." + todoList.get(i));
				}
			}
			System.out.println("----------------------");

			System.out.println("タスクを入力（削除なら'del',終了なら'exit')");
			String input = scanner.nextLine();

			if(input.equals("exit")){
				break;
			}else if (input.equals("del")){
				System.out.println("削除する番号を入力してくださ：");
				String numStr = scanner.nextLine();
				int num = Integer.parseInt(numStr);

				todoList.remove(num - 1);
				System.out.println(">>削除しました");
			}else{
				todoList.add(input);
				System.out.println(">>追加しました");
			}


		}
	System.out.println("アプリを終了します。");

	}
}
