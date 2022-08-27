import java.util.Scanner;
import java.util.ArrayList;

public class ToDo {
   static Scanner sc = new Scanner(System.in);
   
	public static void main(String[] args) {
		ArrayList<String> task = new ArrayList<String>();
		
		int option = -10;
		while (option != 0) {
			System.out.println("-----------Task List-----------");
			for (int i = 0; i < task.size(); i++) {
				System.out.println(i + " - " + task.get(i));
			}
			System.out.println("------- End of Task List-------");
			System.out.println("Choose a option\nType a number:\n 0 -> To Exit\n 1 -> Add task\n 2 -> Delete task\n 3 -> Edit Task ");
			option = sc.nextInt();
			sc.nextLine();

			if (option == 1) {
				System.out.println("Type the new Task ");
				String newTask = sc.nextLine();
				task.add(newTask);

			} else if (option == 2) {
				System.out.println("Type the task number to delete: ");
				int deleteIndex = sc.nextInt();
				task.remove(deleteIndex);

			} else if (option == 3) {
				System.out.println("Type the task number to edit: ");
				int editIndex = sc.nextInt();
				sc.nextLine();
				System.out.println("Type the new Task: ");
				String setTask = sc.nextLine();
				task.set(editIndex,setTask);

			} else if(option!=0) {
				System.out.println("Invalid Option!");
			}
		}

		sc.close();
		

	}
}
