import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TelematicsService {
    void report(VehicleInfo vehicleInfo){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(vehicleInfo);
            File file = new File(vehicleInfo.getVin() + ".json");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(json);
            fileWriter.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
    void converter(VehicleInfo vehicleInfo){
        File file = new File(".");
        for (File f : file.listFiles()){
            if (f.getName().endsWith(".json")) {
                try{
                    ObjectMapper mapper = new ObjectMapper();
                    VehicleInfo vi = mapper.readValue(f, VehicleInfo.class);
                } catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        }

    }
}
