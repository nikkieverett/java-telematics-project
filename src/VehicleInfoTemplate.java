public class VehicleInfoTemplate {
    public static final String header = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Telematics Project</title>\n" +
            "\n" +
            "</head>\n" +
            "<body>\n" +
            "    <h1 align=\"center\">Averages for # vehicles</h1>\n" +
            "    <table align=\"center\">";
    public static final String averages = "<tr>\n" +
            "            <th>Odometer (miles) |</th>\n" +
            "            <th>Consumption (gallons) |</th>\n" +
            "            <th>Last Oil Change |</th>\n" +
            "            <th>Engine Size (liters)</th>\n" +
            "        </tr>\n" +
            "        <tr>\n" +
            "            <td align=\"center\">{{odometer}}</td>\n" +
            "            <td align=\"center\">{{consumption}}</td>\n" +
            "            <td align=\"center\">{{lastOilChangeReading}}</td>\n" +
            "            <td align=\"center\">{{engineSize}}</td>\n" +
            "        </tr>\n" +
            "    </table>";
    public static final String historyHeader = "<h1 align=\"center\">History</h1>\n" +
            "    <table align=\"center\" border=\"1\">\n" +
            "        <tr>\n" +
            "         <th>VIN</th>\n" +
            "            <th>Odometer (miles)</th>\n" +
            "            <th>Consumption (gallons)</th>\n" +
            "            <th>Last Oil Change</th>\n" +
            "            <th>Engine Size (liters)</th>\n" +
            "        </tr>\n";
    public static final String history =
            "        <tr>\n" +
            "            <td align=\"center\">{{vin}} </td>\n" +
            "            <td align=\"center\">{{odometer}}</td>\n" +
            "            <td align=\"center\">{{consumption}}</td>\n" +
            "            <td align=\"center\">{{lastOilChangeReading}}</td>\n" +
            "            <td align=\"center\">{{engineSize}}</td>\n" +
            "        </tr>";
    public static final String footer = " </table>\n" +
            "</body>\n" +
            "</html>";
}
