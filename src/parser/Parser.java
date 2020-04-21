package parser;
import java.io.*;
import adds.*;

public class Parser {
    private String filename;
    public Parser(String filename) {
        this.filename = filename;
    }

    public Characters[] parse(){
        Characters[] mass = new Characters[5];
        try
        {
            FileReader reader = new FileReader(this.filename);
            BufferedReader breader = new BufferedReader(reader);
            String name;
            String type;
            int i = 0;
            String line = breader.readLine();
            while (line != null){
                String[] data = new String[4];
                int j = 0;
                for(String retval : line.split(" ")){
                    data[j] = retval;
                    j = j+1;
                }
                if(data[1].equals("tank")){
                    Characters chars = new Tank(data[3]);
                    mass[i] = chars;
                } else {
                    if(data[1].equals("melee")){
                        Characters chars = new Melee(data[3]);
                        mass[i] = chars;
                    } else {
                        if(data[1].equals("range")){
                            Characters chars = new Range(data[3]);
                            mass[i] = chars;
                        } else{
                            mass[i] = null;
                        }
                    }
                }

                line = breader.readLine();
                i = i + 1;
            }
            return mass;

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mass;
    }

    public static void write() {

        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());

        }
    }
}
