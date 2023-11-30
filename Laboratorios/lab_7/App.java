import java.io.FileInputStream;
import java.util.Scanner;

import aluno.Aluno;

public class App {
    public static void main(String[] args){

        try(FileInputStream fin = new FileInputStream("entrada.csv");
            Scanner s = new Scanner(fin, "ISO-8859-1")){
                
            while(s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
                try(Scanner lineScanner = new Scanner(line)){
                    lineScanner.useDelimiter(";");
                    String id = lineScanner.next();
                    String nome = lineScanner.next();
                    String aux = lineScanner.next();
                    float cr = Float.parseFloat(aux);
                    Aluno aluno = new Aluno(id, nome, cr);
                }
            }
        }catch(Exception e){
            
        }

    }
}