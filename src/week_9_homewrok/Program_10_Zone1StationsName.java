package week_9_homewrok;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Scanner;

/*
10. Write a Java programme that tells you which line passes through particular stations.
Just use Zone 1 stations name
 */
public class Program_10_Zone1StationsName {

    public static void main(String[] args) {
        stationName();// calling static method directly
    }

    public static void stationName() {// static method
        char ch;

        System.out.println("Zone 1 Stations list : ");
        System.out.println(" ");
        System.out.println("ALDGATE,ANGEL,BAKER STREET, BANK,BARBICAN,BAYSWATER,BLACKFRIARS,BOND STREET,BOROUGH");
        System.out.println("CANNON STREET, CHANCERY LANE, CHARING CROSS,COVENT GARDEN,EARL'S COURT, EDGWARE ROAD, ELEPHANT & CASTLE");
        System.out.println("EMBANKMENT, EUSTON, FARRINGDON, GLOUCESTER ROAD, GOODGE STREET, GREAT PORTLAND, GREEN PARK,HIGH STREET KENSINGTON");
        System.out.println("HOLBORN, HYDE PARK CORNER, KING'S CROSS ST. PANCRAS, KNIGHTSBRIDGE, LAMBETH NORTH, LANCASTER GATE, LEICESTER SQUARE");
        System.out.println("LIVERPOOL, STREET, LONDON BRIDGE, MANSION HOUSE, MARBLE ARCH, MARYLEBONE, MONUMENT, MOORGATE, NOTTING HILL GATE, OLD STREET");
        System.out.println("OXFORD CIRCUS,PADDINGTON, PICCADILLY CIRCUS, PIMLICO, QUEENSWAY, REGENT'S PARK, RUSSEL SQUARE, SLOANE SQUARE, SOUTH KENSINGTON");
        System.out.println("SOUTHWARK, ST. JAME'S PARK, ST. PAULS, TEMPLE, TOTTENHAM COURT ROAD, TOWER HILL, VAUXHALL, VICTORIA, WARREN STREET, WATERLOO, WESTMINSTER");

        System.out.println(" ");

        // HashMap to declare stations and train line names using object
        HashMap<String, String> lines = new HashMap<String, String>();
        // adding values on lines array
        lines.put("ALDGATE", "Metropolitan/ Circle");
        lines.put("ANGEL", "Northern");
        lines.put("BAKER STREET", "Metropolitan/Bakerloo/Circle/Jubilee/Hammersmith & City");
        lines.put("BANK", "Waterloo & City/Northern/Central");
        lines.put("BARBICAN", "Metropolitan/Circle/Hammersmith & City");
        lines.put("BAYSWATER", "District/Circle");
        lines.put("BLACKFRIARS", "District/Circle");
        lines.put("BOND STREET", "Central/Jubilee");
        lines.put("BOROUGH", "Northern");
        lines.put("CANNON STREET", "District/Circle");
        lines.put("CHANCERY LANE", "Central");
        lines.put("CHARING CROSS", "Bakerloo/Northern");
        lines.put("COVENT GARDEN", "Piccadilly");
        lines.put("EARL'S COURT", "District/Piccadilly");
        lines.put("EDGWARE ROAD", "Bakerloo/Hammersmith & City/District/Circle");
        lines.put("ELEPHANT & CASTLE", "Northern/Bakerloo");
        lines.put("EMBANKMENT", "District/Bakerloo/Northern/Circle");
        lines.put("EUSTON", "Northern/Victoria");
        lines.put("FARRINGDON", "Metropolitan/Circle/Hammersmith & City");
        lines.put("GLOUCESTER ROAD", "District/Piccadilly/Circle");
        lines.put("GOODGE STREET", "Northern");
        lines.put("GREAT PORTLAND STREET", "Metropolitan/Circle/Hammersmith & City");
        lines.put("GREEN PARK", "Piccadilly/Victoria/Jubilee");
        lines.put("HIGH STREET KENSINGTON", "District/Circle");
        lines.put("HOLBORN", "Central/Piccadilly");
        lines.put("HYDE PARK CORNER", "Piccadilly");
        lines.put("KING'S CROSS ST. PANCRAS", "Metropolitan/Northern/Piccadilly/Circle/victoria/Hammersmith & Cty");
        lines.put("KNIGHTSBRIDGE", "Piccadilly");
        lines.put("LAMBETH NORTH", "Bakerloo");
        lines.put("LANCASTER GATE", "Central");
        lines.put("LEICESTER SQUARE", "Piccadilly/Northern");
        lines.put("LIVERPOOL STREET", "Metropolitan/Central/Circle/Hammersmith & City");
        lines.put("LONDON BRIDGE", "Northern/Jubilee");
        lines.put("MANSION HOUSE", "District/Circle");
        lines.put("MARBLE ARCH", "Central");
        lines.put("MARYLEBONE", "Bakerloo");
        lines.put("MONUMENT", "District/Circle");
        lines.put("MOORGATE", "Metropolitan/Circle/Northern/Hemmersmith & City");
        lines.put("NOTTING HILL GATE", "District/Central/Circle");
        lines.put("OLD STREET", "Northern");
        lines.put("OXFORD CIRCUS", "Central/Bakerloo/Victoria");
        lines.put("PADDINGTON", "District/ Circle/Bakerloo");
        lines.put("PICCADILLY CIRCUS", "Bakerloo/Piccadilly");
        lines.put("PIMLICO", "Victoria");
        lines.put("QUEENSWAY", "Central");
        lines.put("REGENT'S PARK", "Bakerloo");
        lines.put("RUSSEL SQUARE", "Piccadilly");
        lines.put("SLOANE SQUARE", "District/Circle");
        lines.put("SOUTH KENSINGTON", "District/Piccadilly/Circle");
        lines.put("SOUTHWARK", "Jubilee");
        lines.put("ST. JAME'S PARK", "District/Circle");
        lines.put("ST. PAUL'S", "Central");
        lines.put("TEMPLE", "District/Circle");
        lines.put("TOTTENHAM COURT ROAD", "Central/Northern");
        lines.put("TOWER HILL", "District/Circle");
        lines.put("VAUXHALL", "Victoria");
        lines.put("VICTORIA", "District/Circle/Victoria");
        lines.put("WARREN STREET", "Northern/Victoria");
        lines.put("WATERLOO", "waterloo & City/Bakerloo/Northern/Jubilee");
        lines.put("WESTMINSTER", "District/Circle/Jubilee");

        // using do-while loop, user will enter station name one time anyway
        do {
            // |scanner declaration for reading input from console
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any station name from above list : ");
            // user will enter station name
            String name = sc.nextLine();
            // station name will convert to uppercase, if user enter in lowercase
            name = name.toUpperCase();

            for (String i : lines.keySet()) {// keySet() method will assign key from array to i variable one by one
                if (name.equals(i)) {// check entered station name is matches with first key from array or not
                    System.out.println("Train line is available : " + lines.get(i));
                }
            }

            System.out.println("Do you want to try again : 'Y or 'N' ");
            ch = sc.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');// when condition is true then above code will execute again
    }
}
