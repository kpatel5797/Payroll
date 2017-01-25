import java.io.*;
public class New
{
     
     int count=5;
    String name[]=new String[10];
    String add[]=new String[10];
    int code[]=new int[10];
    String pan[]=new String[10];
    int age[]=new int[10];
    double bsal[]=new double[10];
    double DA[]=new double[10];
    double HRA[]=new double[10];
    double LTA[]=new double[10];
    double PF[]=new double[10];
    double ITax[]=new double[10];
    double GSal[]=new double[10];
    double NetSal[]=new double[10];
    
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader buf=new BufferedReader(read);
    

    //Default constructor
     New()throws IOException
     {
        name[0]="John";
        add[0]="A-21, Palace Towers, Mumbai";
        code[0]=123;
        pan[0]="12abcd1234";
        age[0]=45;
        bsal[0]=15000.00;
        
        name[1]="James";
        add[1]="605, Oscar Towers, Mumbai";
        code[1]=456;
        pan[1]="23efgh2345";
        age[1]=31;
        bsal[1]=6700.00;
        
        name[2]="Alex";
        add[2]="5, B7, Garden Society,  Mumbai";
        code[2]=789;
        pan[2]="34ijkl3456";
        age[2]=53;
        bsal[2]=12500.00;
        
        name[3]="Frank";
        add[3]="12, Coral Towers, Mumbai";
        code[3]=1011;
        pan[3]="45mnop4567";
        age[3]=35;
        bsal[3]=5900.00;
        
        name[4]="Connor";
        add[4]="D, 706, Imperial Heights, Mumbai";
        code[4]=1213;
        pan[4]="56qrst5678";
        age[4]=39;
        bsal[4]=8900.00;
        

        for(int i=0; i<count; i++)
        {
          DA[i]=0.75*bsal[i];
          HRA[i]=0.25*bsal[i];
          LTA[i]=0.15*bsal[i];
          PF[i]=0.12*bsal[i];
          GSal[i]=bsal[i]+DA[i]+HRA[i]+LTA[i];
          ITax[i]=0.10*GSal[i];
          NetSal[i]=GSal[i]-(PF[i]+ITax[i]);
        }
    }
     public void NewEmployee()throws IOException
    {
        int i=0;
        System.out.println("LOADING");
        for(i=0; i<=37; i++)
        {
           for(int j=0; j<=999999999; j++)
           {
            }
               System.out.print(".");
        }
        System.out.println();
        System.out.println("New Employee--->");
        System.out.println();
         do
         {
            try
            {
                 System.out.print ("Enter your new Employee Code: ");
                 code[count]=Integer.parseInt(buf.readLine());
            }
            catch(NumberFormatException obj)
            {
                 System.out.println("Please enter digits only...");
                 continue;
            }
            break;
         }while(true);    
              
         int flag=1;
         for (i =0;i<count;i++)
          {  
             if (code[count]==code[i])
             {
                System.out.println ("You are already an existing employee...Sorry "); 
                flag=0;
                break;
             }
         }
          if(flag==0)
          {
              return;
          }
         else
         {         
             System.out.print("Enter your Name: ");
             name[count]=buf.readLine();
              do
             {
                try
                {
                       System.out.print("Enter your age: ");
                       age[count]=Integer.parseInt(buf.readLine());
                }
                catch(NumberFormatException obj)
                {
                         System.out.println("Please enter digits only...");
                         continue;
                    }
                if(age[count]<21 || age[count]>58)
                {
                    System.out.println("Sorry... enter a valid age");
                    continue;
                }
                break;
             }while(true);    
        
            System.out.print("Enter your address: ");
            add[count]=buf.readLine();
            do
            {
                try
                {
                     System.out.print("Enter your monthly Basic salary: ");
                     bsal[count]=Double.parseDouble(buf.readLine());
                }
                catch(NumberFormatException obj)
                {
                     System.out.println("Please enter digits only...");
                     continue;
                }
                 
                break;
            }while(true);    
            
            System.out.print("Enter your PAN Number: ");
            pan[count]=buf.readLine();
            int panflag=1;
            for (i =0;i<count;i++)
             {  
              if (pan[count].equals(pan[i]))
                {
                   System.out.println ("You are already an existing employee...Sorry "); 
                   panflag=0;
                   break;
                 }
            }
            if(panflag==0)
            {
              return;
            }
            DA[i]=0.75*bsal[i];
            HRA[i]=0.25*bsal[i];
            LTA[i]=0.15*bsal[i];
            PF[i]=0.12*bsal[i];
            ITax[i]=0.10*GSal[i];
            GSal[i]=bsal[i]+DA[i]+HRA[i]+LTA[i];
            NetSal[i]=GSal[i]-(PF[i]+ITax[i]);

            count++;
            System.out.println();
            System.out.println (" You are now registered ");
         }
        count++;
        Payroll obj=new Payroll();
    }//end of newEmployee
 }
