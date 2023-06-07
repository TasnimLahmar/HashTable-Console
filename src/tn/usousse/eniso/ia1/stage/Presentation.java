package tn.usousse.eniso.ia1.stage;
import java.util.Scanner;

public class Presentation {


        public static void console(){
            Scanner s=new Scanner(System.in);
            System.out.println("enter size");
            String size=s.nextLine();


            Table tab=new Table(Integer.valueOf(size));
            Service service=new Service(tab);

            System.out.println("enter operation");
            String ch=s.nextLine();
            String []op=ch.split(" ");

            while(!("exit".equals(op[0])))
                switch(op[0]){
                    case "add" : {

                        boolean a = service.add(op[1]);

                        ch=s.nextLine();
                        op=ch.split(" ",-2);
                        break;
                    }
                    case "remove" : {

                        boolean rm=service.remove(op[1]);

                        ch=s.nextLine();
                        op=ch.split(" ",-2);
                        break;
                    }
                    case "find" :{

                        boolean exist=service.find(op[1]);
                        if(exist==false){
                            System.out.println("the value "+op[1]+" doesn't exist");
                        }
                        else{
                            System.out.println("the value "+op[1]+" exist");
                        }
                        System.out.println("enter new operation");
                        ch=s.nextLine();
                        op=ch.split(" ",-2);
                        break;
                    }
                    case "list" : {
                        service.list();

                        ch=s.nextLine();
                        op=ch.split(" ",-2);
                        break;

                    }
                    default : {
                        System.out.println("invalid operation. please enter a valid operation");
                        System.out.println("enter new operation");
                        ch=s.nextLine();
                        op=ch.split(" ",-2);
                        break;
                    }

                }


        }}