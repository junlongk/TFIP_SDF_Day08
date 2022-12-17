import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Map {
    
    public static void read(String fileName) throws Exception{
        
        FileReader fr = new FileReader(fileName);
        BufferedReader bfr = new BufferedReader(fr);

        List<Room> gameMap = new LinkedList<>();

        while (true) {
            String line = bfr.readLine();
            if (line == null)
                break;

            while (line.length() > 0) {
                if (line.contains("room")) {
                    Room room = new Room();
                    room.setId(line.split(": ")[1]);
                }
                if (line.contains("name")) {
                    room.setName(line.split(": ")[1]);
                }
            }

        }


        // bfr.close();
        // fr.close();
    }
}
