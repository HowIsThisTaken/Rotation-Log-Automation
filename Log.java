import java.util.lang.*;

class Log{

    public static void main(String[] args) throws FileNotFoundException
    {
        if(args.length() < 1){
            System.out.println("Invalid Usage");
            return;
        }
        FileReader file = new File("args[0]");
        String str_parsed = parse(file);  
      
    }


    static String parse(file){
        Scanner in = new Scanner(file);
        String fname;
        String lname;
        boolean sand = false;
        boolean polish = false;
        boolean eol = false;
        boolean jig = false;
        boolean quality = false;
        while(in.hasNextLine){
            line = in.nextLine();
            fname= in.nextLine();
        }
    }
    
    }
