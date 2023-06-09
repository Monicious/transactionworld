/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airtelmoneys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SmartPC
 */
public class AirtelMoneys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        int r=0;
            do{
        try {
            // TODO code application logic here
         
            Scanner input = new Scanner(new File("E:accountdb.txt"));
            Scanner sc = new Scanner(System.in);
            int opt;
           
            int n =input.nextInt();
            int y = 0;
            double gener = Math.random() * 123475;
            int i = (int) gener;
            String call = "0687593246";
            
            System.out.println("Airtel money");
            String menu = sc.next();
            if (menu.equals("*150*60#")) {
                
               
                    
                    System.out.println("Airtel money");
                    System.out.println("1.Tuma pesa\n2.Toa pesa\n3.Akaunti yangu\n4.TRANSACTION HISTORY");
                    System.out.flush();
                    opt = sc.nextInt();
                    for (int o = 0; o < 8; o += 1) {
                        System.out.println("\b");
                        
                    }
                    switch (opt) {
                        
                        case 1:
                            tumaPesa(n, i, call);
                            break;
                        case 2:
                            toaPesa(n);
                            break;
                        case 3:
                            akauntiYangu(n - y, y, i, call);
                            break;
                        case 4:
                            viewhistory();
                    }
                    System.out.println("press 00 to main menu");
                    r = sc.nextInt();
                    
               
            } else {
                System.out.println("invalid service code");
            }
          }catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }while(r==00);
        }
    public static int tumaPesa(int y, int mu, String q)  {
        int j = 0, k, m = 0, sub, amont = 1000, z = 0;

        String arr[] = {"MPXZ", "QJCL", "JUTB", "EGSP"};
        String number = "";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 800 * 300; i += 100) {
            System.out.println("\b");
        }

        do {
            System.out.println("1.Weka Namba Ya Simu\n2.Tuma Mitandao Mingine");
            int num = sc.nextInt();
            if (num == 1) {

                System.out.println("Ingiza namba ya simu ya mpokeaji");
                String n = sc.next();

                if (n.startsWith("078") || n.startsWith("068")) {
                    if ((n.matches("[0-9]+"))) {
                        if (n.length() == 10) {
                            number = n;
                            System.out.println("Ingiza kiasi ");
                           String str= sc.next();
                            if ((str.matches("[0-9]+"))) {
                                 m =Integer.parseInt(str);
                            if (m <= y && m > 100) {
                                System.out.println("unakaribia kutuma pesa kwenda namba " + number);
                                System.out.println("ingiza namba ya siri");
                                String p = sc.next();
                                if (p.equals("2020")) {
                                    System.out.println("");
                                    try {
                                        Scanner input = new Scanner(System.in);
                                        FileWriter account = new FileWriter("E:accountdb.txt");
                                        FileWriter manage = new FileWriter("E: generator.txt",true);
                                        BufferedWriter generator =new BufferedWriter(manage);
                                         FileWriter fwrite = new FileWriter("E:senderdb.txt",true);
                                        BufferedWriter sender =new BufferedWriter(fwrite);
                                        // writing the content into the FileOperationExample.txt file  
                                        Date date = Calendar.getInstance().getTime();
                                        sender.write("\numefanikiwa kutuma kiasi cha sh " + m + "\n kwenda namba " + number + "\n salio lako ni" + (y - m) + "\n Muamala no  " + mu + "\n tarehe" + date);
                                        account.write(""+(y-m));
                                        generator.write("\n"+mu);
                                        // Closing the stream 
                                        account.close();
                                        generator.close();
                                        sender.close();
                                        System.out.println("umefanikiwa kutuma kiasi cha sh " + m + "\n kwenda namba " + number + "\n salio lako ni" + (y - m) + "\nMuamala no  " + mu + " tarehe" + date);
                                        demoaccount(m, q,number,mu);
                                        
                                    } catch (IOException e) {
                                        System.out.println("Unexpected error occurred");
                                        e.printStackTrace();
                                    }

                                } else {
                                    System.out.println("ndugu mteja neno la siri uliloingiza sio sahihi .Tafadhali jaribu tena");
                                }
                            
                            
                        }else if (m >= 0 && m < 100) {
                                System.out.println("kiasi unachotuma nichini ya kiwango kinachoruhusiwa");
                            } else if (m > y) {
                                System.out.println("hauna salio la kutosha kwenye account yako");
                            } else {
                                System.out.println("kiwango ulichoingiza sio sahihi");
                            }
                            }
                            else{
                             System.out.println("ingiza kiasi kwa tarakimu");
                            }
                        }

                    }
                } else {
                    System.out.println("ndugu mteja namba uliloingiza sio sahihi .Tafadhali jaribu tena");
                    break;
                }

            } else if (num == 2) {

                System.out.println("1.Tigo pesa\n2.M-pesa\n3.Halopesa");
                k = sc.nextInt();

                if (k == 1) {
                    System.out.println("Ingiza namba ya simu ya mpokeaji");
                String n = sc.next();

                if (n.startsWith("071") || n.startsWith("071")) {
                    if ((n.matches("[0-9]+"))) {
                        if (n.length() == 10) {
                            number = n;
                            System.out.println("Ingiza kiasi ");
                           String str= sc.next();
                            if ((str.matches("[0-9]+"))) {
                                 m =Integer.parseInt(str);
                            if (m <= y && m > 100) {
                                System.out.println("unakaribia kutuma pesa kwenda namba " + number);
                                System.out.println("ingiza namba ya siri");
                                String p = sc.next();
                                if (p.equals("2020")) {
                                    System.out.println("");
                                    try {
                                        Scanner input = new Scanner(System.in);
                                        FileWriter account = new FileWriter("E:accountdb.txt");
                                        FileWriter manage = new FileWriter("E: generator.txt",true);
                                        BufferedWriter generator =new BufferedWriter(manage);
                                         FileWriter fwrite = new FileWriter("E:senderdb.txt",true);
                                        BufferedWriter sender =new BufferedWriter(fwrite);
                                        // writing the content into the FileOperationExample.txt file  
                                        Date date = Calendar.getInstance().getTime();
                                        sender.write("\numefanikiwa kutuma kiasi cha sh " + m + "\n kwenda namba " + number + "\n salio lako ni" + (y - m) + "\n Muamala no  " + mu + "\n tarehe" + date);
                                        account.write(""+(y-m));
                                        generator.write("\n"+mu);
                                        // Closing the stream 
                                        account.close();
                                        generator.close();
                                        sender.close();
                                        System.out.println("umefanikiwa kutuma kiasi cha sh " + m + "\n kwenda namba " + number + "\n salio lako ni" + (y - m) + "\nMuamala no  " + mu + " tarehe" + date);
                                        demoaccount(m, q,number,mu);
                                        
                                    } catch (IOException e) {
                                        System.out.println("Unexpected error occurred");
                                        e.printStackTrace();
                                    }

                                } else {
                                    System.out.println("ndugu mteja neno la siri uliloingiza sio sahihi .Tafadhali jaribu tena");
                                }
                            
                            
                        }else if (m >= 0 && m < 100) {
                                System.out.println("kiasi unachotuma nichini ya kiwango kinachoruhusiwa");
                            } else if (m > y) {
                                System.out.println("hauna salio la kutosha kwenye account yako");
                            } else {
                                System.out.println("kiwango ulichoingiza sio sahihi");
                            }
                            }
                            else{
                             System.out.println("ingiza kiasi kwa tarakimu");
                            }
                        }

                    }
                } else {
                    System.out.println("ndugu mteja namba uliloingiza sio sahihi .Tafadhali jaribu tena");
                    break;
                }

                } else if (k == 2) {
                  System.out.println("Ingiza namba ya simu ya mpokeaji");
                String n = sc.next();

                if (n.startsWith("075") || n.startsWith("076")||n.startsWith("074")) {
                    if ((n.matches("[0-9]+"))) {
                        if (n.length() == 10) {
                            number = n;
                            System.out.println("Ingiza kiasi ");
                           String str= sc.next();
                            if ((str.matches("[0-9]+"))) {
                                 m =Integer.parseInt(str);
                            if (m <= y && m > 100) {
                                System.out.println("unakaribia kutuma pesa kwenda namba " + number);
                                System.out.println("ingiza namba ya siri");
                                String p = sc.next();
                                if (p.equals("2020")) {
                                    System.out.println("");
                                    try {
                                        Scanner input = new Scanner(System.in);
                                        FileWriter account = new FileWriter("E:accountdb.txt");
                                        FileWriter manage = new FileWriter("E: generator.txt",true);
                                        BufferedWriter generator =new BufferedWriter(manage);
                                         FileWriter fwrite = new FileWriter("E:senderdb.txt",true);
                                        BufferedWriter sender =new BufferedWriter(fwrite);
                                        // writing the content into the FileOperationExample.txt file  
                                        Date date = Calendar.getInstance().getTime();
                                        sender.write("\numefanikiwa kutuma kiasi cha sh " + m + "\n kwenda namba " + number + "\n salio lako ni" + (y - m) + "\n Muamala no  " + mu + "\n tarehe" + date);
                                        account.write(""+(y-m));
                                        generator.write("\n"+mu);
                                        // Closing the stream 
                                        account.close();
                                        generator.close();
                                        sender.close();
                                        System.out.println("umefanikiwa kutuma kiasi cha sh " + m + "\n kwenda namba " + number + "\n salio lako ni" + (y - m) + "\nMuamala no  " + mu + " tarehe" + date);
                                        demoaccount(m, q,number,mu);
                                        
                                    } catch (IOException e) {
                                        System.out.println("Unexpected error occurred");
                                        e.printStackTrace();
                                    }

                                } else {
                                    System.out.println("ndugu mteja neno la siri uliloingiza sio sahihi .Tafadhali jaribu tena");
                                }
                            
                            
                        }else if (m >= 0 && m < 100) {
                                System.out.println("kiasi unachotuma nichini ya kiwango kinachoruhusiwa");
                            } else if (m > y) {
                                System.out.println("hauna salio la kutosha kwenye account yako");
                            } else {
                                System.out.println("kiwango ulichoingiza sio sahihi");
                            }
                            }
                            else{
                             System.out.println("ingiza kiasi kwa tarakimu");
                            }
                        }

                    }
                } else {
                    System.out.println("ndugu mteja namba uliloingiza sio sahihi .Tafadhali jaribu tena");
                    break;
                }

                
                }
                
                else if(k==3){
                System.out.println("Ingiza namba ya simu ya mpokeaji");
                String n = sc.next();

                if (n.startsWith("078") || n.startsWith("068")) {
                    if ((n.matches("[0-9]+"))) {
                        if (n.length() == 10) {
                            number = n;
                            System.out.println("Ingiza kiasi ");
                           String str= sc.next();
                            if ((str.matches("[0-9]+"))) {
                                 m =Integer.parseInt(str);
                            if (m <= y && m > 100) {
                                System.out.println("unakaribia kutuma pesa kwenda namba " + number);
                                System.out.println("ingiza namba ya siri");
                                String p = sc.next();
                                if (p.equals("2020")) {
                                    System.out.println("");
                                    try {
                                        Scanner input = new Scanner(System.in);
                                        FileWriter account = new FileWriter("E:accountdb.txt");
                                        FileWriter manage = new FileWriter("E: generator.txt",true);
                                        BufferedWriter generator =new BufferedWriter(manage);
                                         FileWriter fwrite = new FileWriter("E:senderdb.txt",true);
                                        BufferedWriter sender =new BufferedWriter(fwrite);
                                        // writing the content into the FileOperationExample.txt file  
                                        Date date = Calendar.getInstance().getTime();
                                        sender.write("\numefanikiwa kutuma kiasi cha sh " + m + "\n kwenda namba " + number + "\n salio lako ni" + (y - m) + "\n Muamala no  " + mu + "\n tarehe" + date);
                                        account.write(""+(y-m));
                                        generator.write("\n"+mu);
                                        // Closing the stream 
                                        account.close();
                                        generator.close();
                                        sender.close();
                                        System.out.println("umefanikiwa kutuma kiasi cha sh " + m + "\n kwenda namba " + number + "\n salio lako ni" + (y - m) + "\nMuamala no  " + mu + " tarehe" + date);
                                        demoaccount(m, q,number,mu);
                                        
                                    } catch (IOException e) {
                                        System.out.println("Unexpected error occurred");
                                        e.printStackTrace();
                                    }

                                } else {
                                    System.out.println("ndugu mteja neno la siri uliloingiza sio sahihi .Tafadhali jaribu tena");
                                }
                            
                            
                        }else if (m >= 0 && m < 100) {
                                System.out.println("kiasi unachotuma nichini ya kiwango kinachoruhusiwa");
                            } else if (m > y) {
                                System.out.println("hauna salio la kutosha kwenye account yako");
                            } else {
                                System.out.println("kiwango ulichoingiza sio sahihi");
                            }
                            }
                            else{
                             System.out.println("ingiza kiasi kwa tarakimu");
                            }
                        }

                    }
                } else {
                    System.out.println("ndugu mteja namba uliloingiza sio sahihi .Tafadhali jaribu tena");
                    break;
                }

                }
            
            }
            main(null);
            
        } while (j == 0);
        return y - m;
        }
        
    public static void toaPesa(int y) throws IOException {

        Scanner in = new Scanner(System.in);

        System.out.println("1.Code ya wakala");
        int c = in.nextInt();
        if (c == 1) {
            System.out.println("ingiza cod ya wakala");
            int w = in.nextInt();
            System.out.println("ingiza kiasi cha pesa");
            int p = in.nextInt();
            if(p<=y&&p>=1000){
            int acc=y-p;
             FileWriter account = new FileWriter("E:accountdb.txt");
             account.write(""+acc);
             account.close();
            System.out.println("unakaribia kutoa pesa kwa wakala mwenye nambari" + w + " weka namba ya siri kuthibitisha");
            String pin = in.next();
            if(pin.equals("2020")){
            System.out.println("umefanikiwa kutoa kiasi cha shilingi " +p+ " kwa wakala mwenye nambari " +w+"jumla kuu ni"+acc);}
            else{
            System.out.println("namba ya siri sio sahii");
            }
        }
            else if(p>0&&p<1000){
            System.out.println("salio lako ni chini ya kiwango");
            
            }
            
            else if(p>y){
            System.out.println("salio lako halitoshi kutoa kiasi cha Tsh"+p+"angalia salio na ujaribu tena");
            }
            else{
            
            System.out.println("kiasi sio sahihi");
            }
        } else {
            System.out.println("invalid input");
        }

    }

    public static void akauntiYangu(int y, int m, int i, String n) throws FileNotFoundException, IOException {

        Scanner sc = new Scanner(System.in);
String b[]=null;
        System.out.println("1.Angalia salio\n2.Rudisha ");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.println("ingiza namba ya siri");
            int pin = sc.nextInt();
            if(pin==2020){
            System.out.println("salio lililobakia kwenye akaunti yako ni shilingi" + y);}
            else{
            System.out.println("number ya siri sio sahihi");
            }
        }
        if (c == 2) {
            File f1 =new File("E: managementdb.txt");
            String[] words=null;
            FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr);
            String s;
            int ver=0;
            System.out.println("INGIZA MUAMALA NAMBA");
            String t = sc.next();
              System.out.println("INGIZA NAMBA YA SIMU ULIYOITUMI FEDHA KIMAKOSA");
                String phon = sc.next();
            while((s=br.readLine())!=null){
               
            if(phon.equals(s.substring(0, 10))){
         n=s.substring(0, 10);
         String rem=s.substring(10);
        b =rem.split(" ");
        m=Integer.parseInt(b[0]);
             int rudisha = y + m;
                if(t.equals(b[1])){
                     String[] word=null;
                     String z;
            FileReader fre=new FileReader("E:returndb.txt");
            BufferedReader bre=new BufferedReader(fre);
                    while((z=bre.readLine())!=null){
                    if(z.equals(t)){
                    ver=1;
                    }
                    
                    }bre.close();
                    if(ver==0){
                    int siri = 2020;
                    System.out.println("ingiza namba ya siri");
                    int pin = sc.nextInt(); 
                    if (pin == siri) {
                        Date date = Calendar.getInstance().getTime();
                        System.out.print("Tafadhali Subiri");
                        for (double j = 0; j <= 2; j += 0.001) {
                            System.out.print("..\b");
                        }
                        System.out.println("\n");
                                        FileWriter account = new FileWriter("E:accountdb.txt");
                                         FileWriter ret= new FileWriter("E:returndb.txt");
                                         BufferedWriter fret =new BufferedWriter(ret);
                                         fret.write(""+t);
                                        account.write(""+rudisha);
                                        fret.close();
                                        account.close();
                                        FileWriter rd=new FileWriter("E:RDDB.txt");
                                        BufferedWriter rdsha=new BufferedWriter(rd);
                                        rd.write("imethibitishwa muamala wako wa Tshs   " + b[0] + "\numerejeshwa kutoka Airtel money" + n + "jumla kuu " + rudisha + "tarehe " + date);
                        System.out.println("imethibitishwa muamala wako wa Tshs   " + b[0] + "\numerejeshwa kutoka Airtel money" + n + "jumla kuu " + rudisha + "tarehe " + date);
        rd.close();
                    } else {
                        System.out.println("namba ya siri sio sahihi");
                    }
                }
                    else{
                    System.out.println("muamala huu umekwisharudishwa kwenye account yako .Tafadhari wasiliana na uduma kwa wateja ");
                    }
                }
                else{
                System.out.println("samahan, naamba ya muamala haitambuliki");
                }
            }
            
            }
            br.close();
        }
        

        main(null);

    }

    public static void demoaccount(int y, String x,String n,int mu) {
        try {
            Scanner input = new Scanner(System.in);
            
            FileWriter fwrite = new FileWriter("E:receiverdb.txt",true);
            // writing the content into the FileOperationExample.txt file 
            FileWriter manage = new FileWriter("E: managementdb.txt",true);
            BufferedWriter manages =new BufferedWriter(manage);
            BufferedWriter fwrit =new BufferedWriter(fwrite);
            Date date = Calendar.getInstance().getTime();
            fwrit.write("\n" + "\n imethibitishwa Umepokea Tshs\n " + y + " kutoka Airtel money" + x + " \nGROUP 8 COMPANY\n " + "tarehe " + date);
             manages.write("\n"+n+y+" "+mu);
            // Closing the stream  
            fwrit.close();
            manages.close();
        } catch (IOException e) {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }

    }
     public static void viewhistory(){
         Scanner input=new Scanner(System.in);
         
        try {
            File f1 =new File("E:senderdb.txt");
            String[] words=null;
            FileReader fr=new FileReader(f1);
            BufferedReader br=new BufferedReader(fr);
            FileReader RN=new FileReader("E:RDDB.txt");
            BufferedReader r=new BufferedReader(RN);
            String s;
            int ver=0;
             System.out.println("1.SENT TRANSACTION\n2.RETURNED TRANSACTION");
             int rn=input.nextInt();
             if(rn==1){
             System.out.println("SENT TRANSACTION");
             
            while((s=br.readLine())!=null){
                System.out.println(s);}}
              if(rn==2){
             System.out.println("RETURNED TRANSACTION");
             
            while((s=r.readLine())!=null){
                System.out.println(s);}}
            
        } catch (IOException ex) {
            Logger.getLogger(AirtelMoneys.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
     }

}

