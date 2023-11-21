import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {


test();

    }

    public static void test() throws SQLException {
        try {
            FileReader file = new FileReader("C:\\Java.txt");
            BufferedReader Input = new BufferedReader(file);
            for (int i = 0; i < 3; i++)
                System.out.println(Input.readLine());
            Input.close();
            System.out.println("File does not exist");
            int a;
        } catch (IOException e) {
            throw new SQLException(e.getMessage());

        }
    }
}