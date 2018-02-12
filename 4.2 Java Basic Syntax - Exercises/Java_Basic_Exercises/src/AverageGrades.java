import java.util.*;

public class AverageGrades {
    static class Student{
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double[] getGrades() {
            return grades;
        }
        public void setGrades(double[] grades) {
            this.grades = grades;
        }
        public double getAverageGrade() {
            return averageGrade;
        }
        public void setAverageGrade(double averageGrade) {
            this.averageGrade = averageGrade;
        }

        private String name;
        private double[] grades;
        private double averageGrade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] text = scanner.nextLine().split("\\s+");
            String name = text[0];
            double[] grades = new double[text.length - 1];
            double sum = 0;
            for (int j = 1; j < text.length; j++) {
                grades[j - 1] = Double.parseDouble(text[j]);
                sum += grades[j - 1];
            }
            double average = sum / grades.length;
            Student student = new Student();
            student.setGrades(grades);
            student.setName(name);
            student.setAverageGrade(average);
            listOfStudents.add(student);
        }
        Comparator<Student> byName = Comparator.comparing(Student::getName);

        Comparator<Student> byGrade = Comparator.comparing(Student::getAverageGrade).reversed();

        listOfStudents.stream().sorted(byName.thenComparing(byGrade)).forEach(e -> {
            if(e.getAverageGrade() >= 5){
                System.out.printf("%s -> %.2f\n", e.getName(), e.getAverageGrade());
            }
        });

//        students = (ArrayList<Student>) students.stream().filter(x -> x.avrGrade >= 5).collect(Collectors.toList());
//
//        students.sort((x1, x2) -> {
//            if (x1.name.compareTo(x2.name) == 0) {
//                return Double.compare(x2.avrGrade, x1.avrGrade);
//            }
//            return x1.name.compareTo(x2.name);
//        });
    }
}
