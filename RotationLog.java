import java.util.Scanner;
import java.io.*;

class RotationLog{

    public static void main(String[] args) throws FileNotFoundException
    {
        if(args.length < 1){
            System.out.println("Invalid Usage");
            return;
        }
        FileReader file = new FileReader(args[0]);
        String str_parsed = parse(file);  
      
    }


    static String parse(FileReader file){
        System.out.println("Entering parse method:");
        Scanner in = new Scanner(file);
        String fname ="";
        String lname ="";
        boolean sand = false;
        boolean polish = false;
        boolean eol = false;
        boolean jig = false;
        boolean quality = false;
        String line;
        // StringBuffer line = new StringBuffer();
        int i = 0;
        // For the header line
        if(in.hasNextLine()){
            System.out.println(in.nextLine());
        }
        // Assigns all parsed values to corresponding variables
        while(in.hasNextLine()){
            line = in.nextLine();
            //line.append(in.nextLine());
            String[] split_line = line.split(",");
            if(split_line.length > 0){
                String[] split_name = split_line[0].split("\\s");
                fname = split_name[0];
                lname = split_name[1];
                sand = convertToBoolean(split_line[1]);
                polish = convertToBoolean(split_line[2]);
                eol = convertToBoolean(split_line[3]);
                quality = convertToBoolean(split_line[4]);
            }
            System.out.printf("Person[%d] %s, %s sand:%b polish:%b\n",
                               i, fname, lname, sand, polish);
            i++;
        }
        return null;
    }

    static boolean convertToBoolean(String str){
        String base_str = str.toLowerCase();
        base_str = base_str.trim();
        if(base_str.equals("yes")){
           return true;
        }else if(base_str.equals("no")){
           return false;
        }
        System.out.println("Invalid option and use of field.");
        return false;
    }
    
}
