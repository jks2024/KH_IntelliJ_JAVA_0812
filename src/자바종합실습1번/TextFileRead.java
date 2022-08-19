package 자바종합실습1번;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class TextFileRead {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        TreeSet<StudentInfo> treeSet = new TreeSet<>();
        try {
            inputStream = new FileInputStream("src/자바종합실습1번/score.txt");
        } catch(FileNotFoundException e) {}
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] strArr = line.split(" ");
            treeSet.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for(StudentInfo e : treeSet) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
    }
}
