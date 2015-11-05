package exercice;


import static exercice.Staires.generate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Massil
 */
public class Times {
    public static void main(String[] args) {
        System.out.println(toFrenchTime("4:40PM"));
    }
    
    public static String toFrenchTime(String usTime)
    {
        String heure , minute;
        if(usTime.contains("PM"))
        {
            usTime =usTime.replace("PM", "");
            heure = usTime.substring(0 , usTime.indexOf(":"));
            System.out.println("Heure: " + heure);
            int intHeure = Integer.parseInt(heure) + 12;
            heure = Integer.toString(intHeure);
            minute = usTime.substring(usTime.indexOf(":")+1);
            System.out.println("Minute: " + minute);
        }
        else
        {
            usTime = usTime.replace("AM", "");
            heure = usTime.substring(0 , usTime.indexOf(":"));
            System.out.println("Heure: " + heure);
            minute = usTime.substring(usTime.indexOf(":")+1);
            System.out.println("Minute: " + minute);
        }
        return heure + "h" +minute;
    }
}
