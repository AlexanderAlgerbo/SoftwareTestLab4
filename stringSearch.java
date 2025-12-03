import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class stringSearch {
        public static void main(String[] args) throws FileNotFoundException
    {
        
        Scanner s = new Scanner(System.in);
        String[] command = s.nextLine().split(" ");

        if(command.length == 3 && command[0].toLowerCase().equals("search")){
            String pattern = command[1];
            FileReader fileReader = new FileReader(command[2]);
            
            try(Scanner myReader = new Scanner(new File(command[2]))){
                while(myReader.hasNext()){
                    String line = myReader.nextLine();

                    if(line.toLowerCase().contains(pattern.toLowerCase())){
                        System.out.println(line);
                    }
                }
            }
        }
        
    }
}
