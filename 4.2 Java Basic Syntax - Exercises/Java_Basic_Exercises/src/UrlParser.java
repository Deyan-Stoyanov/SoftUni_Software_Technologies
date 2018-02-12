import java.util.Scanner;

public class UrlParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        String protocol = "";
        String recources = "";
        String server = "";
        if(address.indexOf("://") != -1) {
            protocol = address.substring(0, address.indexOf("://"));
            address = address.substring(protocol.length() + 3);
        }
        if(address.indexOf('/') != -1){
            server = address.substring(0, address.indexOf('/'));
            recources = address.substring(address.indexOf('/') + 1);
        }else {
            server = address;
        }
        System.out.printf("[protocol] = \"%s\"", protocol);
        System.out.println();
        System.out.printf("[server] = \"%s\"", server);
        System.out.println();
        System.out.printf("[resource] = \"%s\"", recources);
    }
}
