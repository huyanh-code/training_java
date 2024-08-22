package once;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class files_Exam {
    public static void main(String[] args) {
//        create_file();
//        readFile();
//        writeToFile();
//        fileProperty();
    }

    private static void fileProperty() {
        File f = new File("docx1.txt");

        System.out.println("File name: "  + f.getName());
        System.out.println("Path: " + f.getPath());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Exists: " + f.exists());

        if(f.exists()){
            System.out.println("Is writable: " + f.canWrite());
            System.out.println("Is readable" + f.canRead());
            System.out.println("Is a directory: " + f.isDirectory());
            System.out.println("File size in bytes " + f.length());
        }
    }

    private static void readFile() {
        String url = "D:\\docx.txt";

        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;

        try{
            fileInputStream = new FileInputStream(url);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = bufferedReader.readLine();
            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }catch (FileNotFoundException ex){
            Logger.getLogger(files_Exam.class.getName())
                    .log(Level.SEVERE,null,ex);
        }catch (IOException ex){
            Logger.getLogger(files_Exam.class.getName())
                    .log(Level.SEVERE,null,ex);
        }finally {
            try{
                bufferedReader.close();
                fileInputStream.close();
            }catch (IOException ex) {
                Logger.getLogger(files_Exam.class.getName())
                        .log(Level.SEVERE,null,ex);
            }
        }
    }

    private static void create_file() {
        try{
            File f = new File("docx1.txt");
            if(f.createNewFile()){
                System.out.println("File create!!");
            }else {
                System.out.println("File already exists");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    private static void writeToFile(){
        try {
            FileWriter myWriter = new FileWriter("docx1.txt");
            myWriter.write("Java 8 is the most awaited release of Java programming language development because, in the entire history of Java, it never released that many major features.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
