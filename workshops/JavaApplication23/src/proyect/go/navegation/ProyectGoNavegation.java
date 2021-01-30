
package proyect.go.navegation;

import java.util.Scanner;

public class ProyectGoNavegation {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String name;
        boolean mainLoop = true;
        int option;

        do {
            System.out.println("Enter your name");
            name = input.nextLine();
            System.out.println(" Hello " + name + " Where are we going today?");
            System.out.println("1. Parks");
            System.out.println("2. Churches");
            System.out.println("3. Square");
            System.out.println("4. Viewpoints");
            System.out.println("5. Malls");
            System.out.println("6. Exit");
            System.out.println(name + " Enter yout option");
            option = input.nextInt();
            switch (option) {
                
                case 1:
            int optionParks;

                do{
                    System.out.println("Hey " + name +
                            " The parks in Quito :");
                    System.out.println("1.Quito metopolitan park");
                    System.out.println("2.Itchimbia park");
                    System.out.println("3.Carolina park");
                    System.out.println("4. Exit");
                    optionParks = input.nextInt();
                    switch(optionParks){
                        case 1:
                           int CarolinaPark;
                           
                            System.out.println("Let's go to Carolina park");
                            System.out.println("The Ubication"
                                    + " Of The Carolina Park is:");
                            System.out.println("Sector: north of Quito");
                            System.out.println("Av. de los Shyris "
                                    + "you can enter by "
                                    + "Quito 170135");
                        {
                           
                            do{                               
                                System.out.println(name + "you know how to get"
                                        + "there?");
                                System.out.println("1. Yes");
                                    System.out.println("2. No");
                                CarolinaPark= input.nextInt();
                                    switch (CarolinaPark){
                                        case 1: 
                                            System.out.println(name+" have a good trip");
                                            System.exit(0);   
                                            break;
                                        case 2:
                                            System.out.println("");
                                            break;
                                    }
                                } while (CarolinaPark!=2);
                            }

                            break;

                        case 2:
                            System.out.println("Let's go to the Itchimbia park"
                                    + "Itchimbia");
                            break;
                        case 3:
                            System.out.println("Let's go to the Quito metopolitan park"
                                    + "Quito metropolitan park");
                            break;
                        case 4:
                            System.out.println("Good bye " + name + 
                                    " come back soon!");
                    System.exit(0);
                            break;
                    }
               
                }while (optionParks !=4);
                break;
                case 2:
                    int optionChurches;
                    do {
                        System.out.println("Hey " + name
                                + " The Churches in Quito are ");
                        System.out.println("1.THE BASILICA");
                        System.out.println("2.CHURCH OF SANTO DOMINGO");
                        System.out.println("3.CHURCH OF EL SAGRARIO");
                        System.out.println("4. Exit");
                        optionChurches = input.nextInt();
                        switch (optionChurches) {
                            case 1:

                                System.out.println("Let's go to THE BASILICA");
                                System.out.println("The Ubication"
                                        + " Of THE BASILICA Is:");
                                System.out.println("Sector: Quito's Historic center");
                                System.out.println("Sector de Santa Prisca "
                                        + "between the streets "
                                        + "Carchi N122 y Venezuela");
                                 {
                                    int THEBASILICA;
                                    do {
                                        System.out.println(name + " you know how to get "
                                                + "there?");
                                        System.out.println("1. Yes");
                                        System.out.println("2. No");
                                        THEBASILICA = input.nextInt();
                                        switch (THEBASILICA){
                                    case 1:
                                                System.out.println(name + " have a good trip");
                                                System.exit(0);
                                                break;
                                            case 2:
                                                 System.out.println("");
					       String LaComuna;
                                                String sector;
                                                System.out.println("Enter sector");
                                                sector = input.nextLine();
                                                System.out.println("we leave from La Comuna");
                                                System.out.println("Head north for. "
                                                        + "José Berrutieta and "
                                                        + "Take the exit towards Av. Universitaria. "
                                                        + "At the roundabout, take the 1st exit.");
                                                System.out.println("continue straight ");
                                                System.out.println(name + " we got to"
                                                        + " THE BASILICA");
                                                System.out.println("Good bye " + name);
                                                System.exit(0);                                   
                                                break;
                                        }
                                    } while (THEBASILICA != 2
                                
                                );
                        }                              
                            break;

                            case 2:
                                System.out.println("Let's go to CHURCH "
                                        + "OF SANTO DOMINGO");
                                break;
                            case 3:
                                System.out.println("Let's go to CHURCH "
                                        + "OF EL SAGRARIO");
                                break;
                            case 4:
                                System.out.println("Good bye " + name
                                        + " come back soon!");
                                System.exit(0);
                                break;
                        }
                    } while (optionChurches != 4);
                    break;                   
                case 3:
                    int optionPlaza;
                do{           
                    System.out.println("Hey " + name + 
                            " The Plaza in Quito are: ");
                    System.out.println("1.Plaza Grande");
                    System.out.println("2.Plaza del Teatro");
                    System.out.println("3.Plaza las Americas");
                    System.out.println("4. Exit");
                    optionPlaza = input.nextInt();
                    switch(optionPlaza){
                        case 1:
                           
                            System.out.println("Let's go to Plaza Grande");
                            System.out.println("The Ubication"
                                    + " Of The Plaza Grande Is:");
                            System.out.println("Sector: Quito's Historic center");
                            System.out.println("Av. and Chile St Venezuela "
                                    + "you can enter by "
                                    + "av. García Moreno Quito 170401");
                        {
                            int PlazaGrande;
                            do{                               
                                System.out.println(name +
                                        " you know how to get "
                                        + "there?");
                                System.out.println("1. Yes");
                                System.out.println("2. No");
                                PlazaGrande  = input.nextInt();
                                switch(PlazaGrande){
                                    case 1:
                                        System.out.println(name + 
                                                " have a good trip");
                                        System.exit(0);
                                        break;
                                    case 2:
                                        System.out.println("");
                                        break;
                                }
                            }while( PlazaGrande != 2);
                        }                              
                            break;

                        case 2:
                            System.out.println("Let's go to Viewpoint "
                                    + "The Plaza del Teatro");
                            break;
                        case 3:
                            System.out.println("Let's go to Viewpoint "
                                    + "The Plaza las Americas");
                            break;
                        case 4:
                            System.out.println("Good bye " + name + 
                                    " come back soon!");
                    System.exit(0);
                            break;
                    }
                }while (optionPlaza !=4);            
                     break;
                case 4:
                    int optionViewpoint;
                    do {
                        System.out.println("Hey " + name
                                + " The viewpoints in Quito are: ");
                        System.out.println("1.Panecillo");
                        System.out.println("2.Viewpoint the Guapulo");
                        System.out.println("3.Viewpoint the Cruz Loma");
                        System.out.println("4. Exit");
                        optionViewpoint = input.nextInt();
                        switch (optionViewpoint) {
                            case 1:

                                System.out.println("Let's go to Panecillo");
                                System.out.println("The Ubication"
                                        + " Of The Panecillo Is:");
                                System.out.println("Sector: Quito's Historic center");
                                System.out.println("Av. Gral Melchor Aymerich "
                                        + "you can enter by "
                                        + "av. General Alberto Enriquez");
                                 {
                                    int panecillo;
                                    do {
                                        System.out.println(name + " you know how to get "
                                                + "there?");
                                        System.out.println("1. Yes");
                                        System.out.println("2. No");
                                        panecillo = input.nextInt();
                                        switch (panecillo) {
                                            case 1:
                                                System.out.println(name + " have a good trip");
                                                System.exit(0);
                                                break;
                                            case 2:
                                                String solanda;
                                                String sector;
                                                System.out.println("Enter sector");
                                                sector = input.nextLine();
                                                System.out.println("we leave from solanda");
                                                System.out.println("go for the av. "
                                                        + "Cardenal de la Torre and "
                                                        + "then take Av. Teniente Hugo "
                                                        + "Ortiz.");
                                                System.out.println("continue along "
                                                        + "Av. Teniente Hugo Ortiz "
                                                        + "towards Quisquis");
                                                System.out.println("go down "
                                                        + "av. Rodrigo de Chavez "
                                                        + "and then take "
                                                        + "av. Mriscal Sucre");
                                                System.out.println("Take Agoyan towards"
                                                        + " Av. Gral Melchor Aymerich");
                                                System.out.println(name + " we got to"
                                                        + " the Panecillo");
                                                System.out.println("Good bye " + name);
                                                System.exit(0);
                                                break;
                                        }
                                    } while (panecillo != 2);
                                }
                                break;
                            case 2:
                                System.out.println("Let's go to Viewpoint "
                                        + "the Guapulo");
                                System.out.println("The Ubication"
                                        + " Of The Viewpoint The Guapulo Is:");
                                System.out.println("Sector: Guapulo");
                                System.out.println("Rafael Leon, Quito");
                                 {
                                    int guapulo;
                                    do {
                                        System.out.println(name + " you know how to get "
                                                + "there?");
                                        System.out.println("1. Yes");
                                        System.out.println("2. No");
                                        guapulo = input.nextInt();
                                        switch (guapulo) {
                                            case 1:
                                                System.out.println(name + " have a good trip");
                                                System.exit(0);
                                                break;
                                            case 2:
                                                String solanda;
                                                String sector;
                                                System.out.println("Enter sector");
                                                sector = input.nextLine();
                                                System.out.println("we leave from solanda");
                                                System.out.println("go for the av. "
                                                        + "Cardenal de la Torre");
                                                System.out.println("continue on "
                                                        + "av. cardinal de la torre."
                                                        + " take av. Napo and "
                                                        + "av. Velasco Ibarra to Toledo");
                                                System.out.println("go down "
                                                        + "av. Rodrigo de Chavez "
                                                        + "and then take "
                                                        + "av. Mriscal Sucre");
                                                System.out.println("Take Agoyan towards"
                                                        + " Av. Gral Melchor Aymerich");
                                                System.out.println(name + " we got to"
                                                        + " the Panecillo");
                                                System.out.println("Good bye " + name);
                                                System.exit(0);
                                                break;
                                        }
                                    } while (guapulo != 2);
                                }
                                break;
                            case 3:
                                System.out.println("Let's go to Viewpoint "
                                        + "the Cruz Loma");
                                break;
                            case 4:
                                System.out.println("Good bye " + name
                                        + " come back soon!");
                                System.exit(0);
                                break;
                        }
                    } while (optionViewpoint != 4);
                    break;

                case 5:
                          int optionMalls;
                do{
                    System.out.println(name + " Welcome to the Shopping Center in Quito ");                    
                    System.out.println(" I will give you several options, the most common: ");
                    System.out.println("1.Quicentro_North");
                    System.out.println("2.CCI");
                    System.out.println("3.Mall_El_Jardin");
                    System.out.println("4. Exit");
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
                    System.out.println("Good bye " + name + " come back soon!");
                    System.exit(0);
                    break;
            }
        } while (option != 6);
    }

}


