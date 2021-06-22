package me.isaac.demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.maxmind.db.Reader;

import java.io.File;
import java.net.InetAddress;


public class Main {
    //final static String PATH = "C:\\Users\\Isaac\\Downloads\\GeoIP2-CN-1.mmdb";
    final static String PATH = "GeoIP2-CN.mmdb";

    public static void main(String[] args) throws Exception {
//        try {
//            LookupService cl = new LookupService(PATH, LookupService.GEOIP_STANDARD);
//            Location l2 = cl.getLocation("213.52.50.8");
//            //Location l2 = cl.getLocation(args[0]);
//            System.out.println("countryCode: " + l2.countryCode +
//                    "\n countryName: " + l2.countryName +
//                    "\n region: " + l2.region +
//                    "\n regionName: " + regionName.regionNameByCode(l2.countryCode, l2.region) +
//                    "\n city: " + l2.city +
//                    "\n postalCode: " + l2.postalCode +
//                    "\n latitude: " + l2.latitude +
//                    "\n longitude: " + l2.longitude +
//                    "\n metro code: " + l2.metro_code +
//                    "\n area code: " + l2.area_code +
//                    "\n timezone: " + timeZone.timeZoneByCountryAndRegion(l2.countryCode, l2.region));
//
//            cl.close();
//        } catch (IOException e) {
//            System.out.println("IO Exception");
//        }
        File database=new File(PATH);
        Reader reader=new Reader(database);
        InetAddress address=InetAddress.getByName("113.128.240.98");
        JsonNode response = reader.get(address);
        System.out.println(response);
        reader.close();
    }
}
