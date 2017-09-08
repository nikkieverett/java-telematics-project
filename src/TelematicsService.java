import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TelematicsService {
    void report(VehicleInfo vehicleInfo){
        try{
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(vehicleInfo);
            File file = new File(vehicleInfo.getVin() + ".json");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(json);
            fileWriter.close();
        } catch(IOException ex) {
            ex.printStackTrace();
        }

        File file = new File(".");
        ArrayList<VehicleInfo> vehicleList = new ArrayList<>();

        for (File f : file.listFiles()){
            if (f.getName().endsWith(".json")) {
                try {
                    ObjectMapper mapper = new ObjectMapper();
                    VehicleInfo vi = mapper.readValue(f, VehicleInfo.class);
                    System.out.println(vi);
                    vehicleList.add(vi);
                } catch(IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

        String output = "";

        output += VehicleInfoTemplate.header;

        output += VehicleInfoTemplate.historyHeader;

        for(VehicleInfo vehicle : vehicleList){
            String currentRow = VehicleInfoTemplate.history;
            currentRow = currentRow.replace("{{vin}}", vehicle.getVin());
            currentRow = currentRow.replace("{{odometer}}", Double.toString(vehicle.getOdometer()));
            currentRow = currentRow.replace("{{consumption}}", Double.toString(vehicle.getConsumption()));
            currentRow = currentRow.replace("{{lastOilChangeReading}}", Double.toString(vehicle                                 .getLastOilchangeReading()));
            currentRow = currentRow.replace("{{engineSize}}", Double.toString(vehicle.getEngineSize()));

            output += currentRow;

        }

        output += VehicleInfoTemplate.footer;

        try {
            File outPutFile = new File("dashboard.html");
            FileWriter fileWriter = null;
            fileWriter = new FileWriter(outPutFile);
            fileWriter.write(output);
            fileWriter.flush();
            fileWriter.close();

        } catch(IOException ex){
            System.out.println("Cannot write to HTML");
        }
    }

}
