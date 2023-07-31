import java.io.*;

public class wordCounter {
    public static void main(String[] args) {
        try {
            String line;
            int counter = 0;

            // Corrected the file path format and removed extra spaces and backslashes
            FileReader file = new FileReader("C:\\Users\\Dell\\IdeaProjects\\javaProgram\\src\\task2.txt");
            BufferedReader br = new BufferedReader(file);

            while ((line = br.readLine()) != null) {
                String words[] = line.split(" "); // Removed the unnecessary 'regex:' prefix
                counter = counter + words.length;
            }

            System.out.println("Number of words present in the given file: " + counter);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
