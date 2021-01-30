
package proyect.go.navegation;

import java.util.Scanner;

public class NewClass {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        boolean mainLoop = true;
        int option;
        System.out.println("Enter name");
        name = input.nextLine();
        System.out.println("\n");
        
        do {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                    + "|     Touristic Places Of Quito      |" + "\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                    + "|  Hello, Where are we going today?  |"
                    + "\n"
                    + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("| 1. Parks                           |");
            System.out.println("| 2. Churches                        |");
            System.out.println("| 3. Square                          |");
            System.out.println("| 4. Viewpoints                      |");
            System.out.println("| 5. Malls                           |");
            System.out.println("| 6. Exit                            |");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\n"
                    + "______________________________________");

            System.out.println(name + " Enter yout option  ");
            System.out.print("--> ");
            option = input.nextInt();
            System.out.println("______________________________________");
            switch (option) {
                case 1:
            int optionP;
                    do {
            System.out.println("~~~~~~~~~~~~~~"
                                + "\n" + "| The parks in Quito:" + "\n"
                                + "~~~~~~~~~~~~~~");
            System.out.println("| 1.Quito metopolitan park           |");
            System.out.println("| 2.Itchimbia park                   |");
            System.out.println("| 3.Carolina park                    |");
            System.out.println("| 4. Exit                            |");
            System.out.println("~~~~~~~~~~~~~~" + "\n"
                                + "______________");

            System.out.println(name + " Enter yout option  ");
            System.out.print("--> ");
                        optionP = input.nextInt();
            System.out.println("______________");
                        switch(optionP){
                    case 1:System.out.println("Calle Manrique Lara,Quito");
                    case 2:System.out.println("Calle Itchimbia,Quito");
                    case 3:System.out.println("Av Naciones Unidas y Av De los Shyris ");
                    case 4:
                }
                    } while(optionP != 4);
            
                    break;
                    
                case 2:
                    int optionC;
                    break;
                case 3:
                    break;
                case 4:

                    break;
                case 5:  
                    int optionMalls;
                do{
                    System.out.println("~~~~~~~~~~~~ Malls in Quito ~~~~~~~~~~~~");                    
                    System.out.println(" I will give you several options, the most common: ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|1.Quicentro_North        |");
                    System.out.println("|2.CCI                    |");
                    System.out.println("|3.Mall_El_Jardin         |");
                    System.out.println("|4. Exit                  |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    optionMalls = input.nextInt();
                    switch(optionMalls){
                        
                    case 1:
                           
                            System.out.println(name + "Let's go to Quicentro_North");
                            System.out.println("The Ubication" + " Of The Quicentro_North Is:");
                            System.out.println("Direction: Avenida Naciones Unidas "
                                    + "between Avenida 6 de Diciembre and, "
                                    + "Av. de los Shyris. Quito");              
                        {
                            int Quicentro_North;
                            do{                               
                                System.out.println(" you know how to get " + "there?");
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                Quicentro_North = input.nextInt();
                                switch(Quicentro_North){
                                    case 1:
                                        System.out.println("have a good trip,"
                                                + " follow the direction given,"
                                                + " we will be accompanying you");
                                        System.exit(0);
                                        break;
                                    case 2:
                                        System.out.println("we will stay at your original point");
                                        break;
                                }
                                 }while( Quicentro_North != 2);
                        }
                           
                            break;

                    case 2:
                            System.out.println("Let's go to CCI");
                            System.out.println("The Ubication" + " Of The CCI Is:");
                            System.out.println("Diretion: Av. Amazonas N36-152 "
                                    + "y Naciones Unidas. Quito 170102");              
                        {
                            System.out.println("Let's go to Viewpoint " + "CCI");
                            {
                            int CCI;
                            do{                               
                                System.out.println(name+ " you know how to get "
                                        + "there?");
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                CCI = input.nextInt();
                                switch(CCI){
                                    case 1:
                                        System.out.println(name + "have a good trip, "
                                                + "follow the direction given"
                                                + " we will be accompanying you");
                                        System.exit(0);
                                        break;
                                    case 2:
                                        System.out.println("we will stay at "
                                                + "your original point");
                                        break;
                                }
                            }while( CCI != 2);
                        }
                        }
                            break;
                            
                    case 3:
                            System.out.println(name+ "Let's go to Mall_El_Jardin");
                            System.out.println("The Ubication" + " Of The Mall_El_Jardin Is:");
                            System.out.println("Direction: Av.Amazonas, Av. de la República N16-114 "
                                    + "y, Quito 170518");              
                        {
                            System.out.println(name + "Let's go to Viewpoint " 
                                    + "Mall_El_Jardin");
                            {
                            int Mall_El_Jardin;
                            do{                               
                                System.out.println(name + " you know how to get " + "there?");
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                Mall_El_Jardin = input.nextInt();
                                switch(Mall_El_Jardin){
                                    case 1:
                                        System.out.println("have a good trip, "
                                                + "follow the direction given, "
                                                + "we will be accompanying you");
                                        System.exit(0);
                                        break;
                                    case 2:
                                        System.out.println("we will stay at your original point");
                                        break;
                                }
                            }while( Mall_El_Jardin != 2);
                        }
                        }
                            break;
                        case 4:
                            System.out.println("Good bye " + name + "come back soon");
                            System.exit(0);
                            break;
                            default:
                            System.out.println("Invalid option\n\n\n");
                    break;
                    }
                }while (optionMalls !=4);
                   
                    break;
                    case 6:
                    System.out.println("Good bay " + name);
                    System.exit(0);
                    break;
            }

        } while (option != 6);


    }
}




