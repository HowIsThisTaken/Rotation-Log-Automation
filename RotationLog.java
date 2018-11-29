import java.util.Scanner;
import java.io.*;

class RotationLog{

    public static void main(String[] args) throws FileNotFoundException
    {
        if(args.length < 1){
            System.out.println("Invalid Usage");
            return;
        }
        FileReader file = new FileReader("args[0]");
        String str_parsed = parse(file);  
      
    }


    static String parse(FileReader file){
        Scanner in = new Scanner(file);
        String fname;
        String lname;
        boolean sand = false;
        boolean polish = false;
        boolean eol = false;
        boolean jig = false;
        boolean quality = false;
        StringBuffer line = new StringBuffer();
        while(in.hasNextLine()){
            line.append(in.nextLine());
            fname= in.nextLine();
        }
        return null;
    }
    
}
