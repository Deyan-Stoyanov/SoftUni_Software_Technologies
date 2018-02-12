import java.util.Scanner;
import java.util.TreeMap;

public class PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, String> phonebook = new TreeMap<String, String>();
        String command = scanner.nextLine();
        while(!command.equals("END")){
            String[] toDo = command.split("\\s");
            String request = toDo[0];
            switch (request){
                case "A":
                    String name = toDo[1];
                    String phoneNumber = toDo[2];
                    if(phonebook.containsKey(name)){
                        phonebook.remove(name);
                    }
                    phonebook.put(name, phoneNumber);
                    break;
                case "S":
                    String nameOfPerson = toDo[1];
                    if(phonebook.containsKey(nameOfPerson)){
                        for (String key:phonebook.keySet()) {
                            if(key.equals(nameOfPerson)){
                                System.out.printf("%s -> %s\n", key, phonebook.get(key));
                            }
                        }
                    }else {
                        System.out.printf("Contact %s does not exist.\n", nameOfPerson);
                    }
                    break;
                case "ListAll":
                    for(String key:phonebook.keySet()){
                        System.out.printf("%s -> %s\n", key, phonebook.get(key));
                    }
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
