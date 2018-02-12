import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<String, String>();
        String command = scanner.nextLine();
        while(!command.equals("END")){
            String[] toDo = command.split("\\s");
            String request = toDo[0];
            String name = toDo[1];
            switch (request){
                case "A":
                    String phoneNumber = toDo[2];
                    if(phonebook.containsKey(name)){
                        phonebook.remove(name);
                    }
                    phonebook.put(name, phoneNumber);
                    break;
                case "S":
                    if(phonebook.containsKey(name)){
                        for (String key:phonebook.keySet()) {
                            if(key.equals(name)){
                                System.out.printf("%s -> %s\n", key, phonebook.get(key));
                            }
                        }
                    }else {
                        System.out.printf("Contact %s does not exist.\n", name);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
