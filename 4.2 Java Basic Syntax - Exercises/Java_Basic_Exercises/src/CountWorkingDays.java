import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class CountWorkingDays {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date oldStartDate = df.parse(str1);
        Date oldEndDate = df.parse(str2);
        LocalDate startDate = oldStartDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate endDate = oldEndDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int sum = 0;
        for (LocalDate i = startDate; i.isBefore(endDate.plusDays(1)); i = i.plusDays(1)) {
            if(!isHoliday(i)){
                sum++;
            }
        }
        System.out.println(sum);
    }

    static boolean isHoliday(LocalDate date){
        if(date.getMonthValue() == 1  && date.getDayOfMonth() == 1){
            return true;
        }else if(date.getMonthValue() == 3 && date.getDayOfMonth() == 3){
            return true;
        }else if(date.getMonthValue() == 5 && date.getDayOfMonth() == 1){
            return true;
        }else if(date.getMonthValue() == 5 && date.getDayOfMonth() == 6){
            return true;
        }else if(date.getMonthValue() == 5 && date.getDayOfMonth() == 24){
            return true;
        }else if(date.getMonthValue() == 9 && date.getDayOfMonth() == 6){
            return true;
        }else if(date.getMonthValue() == 9 && date.getDayOfMonth() == 22){
            return true;
        }else if(date.getMonthValue() == 11 && date.getDayOfMonth() == 1){
            return true;
        }else if(date.getMonthValue() == 12 && date.getDayOfMonth() == 24){
            return true;
        }else if(date.getMonthValue() == 12 && date.getDayOfMonth() == 25){
            return true;
        }else if(date.getMonthValue() == 12 && date.getDayOfMonth() == 26) {
            return true;
        }else if(date.getDayOfWeek() == DayOfWeek.SATURDAY) {
            return true;
        }else if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return true;
        }return false;
    }
}
