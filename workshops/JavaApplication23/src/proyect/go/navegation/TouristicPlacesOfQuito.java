package touristicplacesofquito;

import java.util.Scanner;

public class TouristicPlacesOfQuito {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        boolean mainLoop = true;
        int option;
        System.out.println("=========================================");
        System.out.println("\t" + "Welcome User \n" + "To start, please tell me your name");
        name = input.nextLine();
        System.out.println("\t" + "Welcome " + name);
        System.out.println("=========================================");
       
        do {
            printGeneralBanner(name);
            option = input.nextInt();
            System.out.println("______");
            switch (option) {
                case 1:
                  int optionP;
                    do {
                        bannerparks(name);
                        optionP = input.nextInt();
                        System.out.println("__");
                        switch (optionP) {
                            case 1:
                                 int matrixM[][] = {{600, 315, 9}, {136, 486, 9}, {127, 409, 9}};
                                printMetropolitanParkLocation(name);
                                   showArea(matrixM);
                                int Metropolitan_Park;
                                do {
                                    showOptionParks(name);
                                    Metropolitan_Park = input.nextInt();
                                    switch (Metropolitan_Park) {
                                        case 1:
                                            System.out.println(name + " have a good trip, "
                                                    + "follow the direction given, "
                                                    + "we will be accompanying you");
                                            System.exit(0);
                                            break;
                                        case 2:
                                            System.out.println(" we will stay at your original point");
                                            break;
                                    }
                                } while (Metropolitan_Park != 2);
                                Metropolitan_Park = input.nextInt();
                            case 2:
                                int matrixI[][] = {{300, 650, 6}, {118, 934, 6}, {230, 410, 6}};
                                showArea(matrixI);
                                printItchimbiaParkLocation(name);
                                 {
                                    int Itchimbia_Park;
                                    do {
                                        showOptionParks(name);
                                        Itchimbia_Park = input.nextInt();
                                        switch (Itchimbia_Park) {
                                            case 1:
                                                System.out.println(name + " have a good trip, "
                                                        + "follow the direction given"
                                                        + " we will be accompanying you");
                                                System.exit(0);
                                                break;
                                            case 2:
                                                System.out.println(" we will stay at "
                                                        + "your original point");
                                                break;
                                        }
                                    } while (Itchimbia_Park != 2);
                                }
                            case 3:
                              int matrixC[][] = {{900, 95, 8}, {18, 934, 8}, {23, 10, 8}};
                                showArea(matrixC);
                                printCarolinaParkLocation(name);
                                int Carolina_Park;
                                do {
                                    showOptionParks(name);
                                    Carolina_Park = input.nextInt();
                                    switch (Carolina_Park) {
                                        case 1:
                                            System.out.println(name + " have a good trip, "
                                                    + "follow the direction given"
                                                    + " we will be accompanying you");
                                            System.exit(0);
                                            break;
                                        case 2:
                                            System.out.println(" we will stay at "
                                                    + "your original point");
                                            break;
                                    }
                                } while (Carolina_Park != 2);
                            case 4:
                        }
                    } while (optionP != 4);
                    break;
                case 2:
                    int optionChurches;
                    do {
                        bannerChurches();
                        optionChurches = input.nextInt();
                        switch (optionChurches) {
                            case 1:
                                int matrixB[][] = {{200, 341, 3}, {103, 483, 3}, {120, 406, 3}};
                                showInfChurchTheBasilica(name);
                                showArea(matrixB);
                                 {
                                    int The_Basilica;
                                    do {
                                        showOption(name);
                                        The_Basilica = input.nextInt();
                                        switch (The_Basilica) {
                                            case 1:
                                                System.out.println(name + " have a good trip,"
                                                        + " follow the direction given,"
                                                        + " we will be accompanying you");
                                                System.exit(0);
                                                break;
                                            case 2:
                                                System.out.println(" we will stay at your original point");
                                                break;
                                        }
                                    } while (The_Basilica != 2);
                                }
                                break;
                            case 2:
                                int matrixSD[][] = {{103, 241, 3}, {173, 398, 3}, {100, 239, 3}};
                                showInfChurchOfSantoDomingo(name);
                                showArea(matrixSD);
                                 {
                                    {
                                        int Church_Of_Santo_Domingo;
                                        do {
                                            showOption(name);
                                            Church_Of_Santo_Domingo = input.nextInt();
                                            switch (Church_Of_Santo_Domingo) {
                                                case 1:
                                                    System.out.println(name + " have a good trip, "
                                                            + "follow the direction given"
                                                            + " we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println(" we will stay at "
                                                            + "your original point");
                                                    break;
                                            }
                                        } while (Church_Of_Santo_Domingo != 2);
                                    }
                                }
                                break;
                            case 3:
                                int matrixS[][] = {{101, 220, 3}, {205, 303, 3}, {161, 272, 3}};
                                showInfChurchOfElSagrario(name);
                                showArea(matrixS);
                                 {
                                    {
                                        int Church_Of_El_Sagrario;
                                        do {
                                            showOption(name);
                                            Church_Of_El_Sagrario = input.nextInt();
                                            switch (Church_Of_El_Sagrario) {
                                                case 1:
                                                    System.out.println(name + " have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println(" we will stay at your original point");
                                                    break;
                                            }
                                        } while (Church_Of_El_Sagrario != 2);
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Good bye " + name + " come back soon");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option\n\n\n");
                                break;
                        }
                    } while (optionChurches != 4);
                    break;
                case 3:
                    int optionS = 0;
                    do {
                        printBannerSquare(name);
                        optionS = input.nextInt();
                        switch (optionS) {
                            case 1:
                                 int matrixPG[][] = {{500, 65, 12}, {168, 974, 12}, {240, 460, 12}};
                                showArea(matrixPG);
                                printBigSquareLocation(name);
                                break;
                            case 2:
                                 int matrixT[][] = {{800, 450, 20}, {718, 634, 20}, {930, 710, 20}};
                                showArea(matrixT);
                                printTheaterSquareLocation(name);
                                break;
                            case 3:
                                 int matrixA[][] = {{700, 620, 40}, {818, 434, 40}, {630, 460, 40}};
                                showArea(matrixA);
                                printPlazaDeLasAmericasLocation(name);
                                break;
                            case 4:
                                System.out.println("Good bye " + name + " come back soon");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Invalid option\n\n\n");
                                break;
                        }
                    } while (optionS != 4);

                    break;

                case 4:
                    int optionV;
                    do {
                        showBannerViewpoint(name);
                        optionV = input.nextInt();
                        System.out.println("______");
                        switch (optionV) {
                            case 1:
                                int areaP[][] = {{205, 353, 1}, {145, 458, 1}, {128, 454, 1}};
                                showInfPanecillo();
                                showArea(areaP);
                                 {
                                    System.out.println(name + "Let's go to Viewpoint "
                                            + "Panecillo");
                                    {
                                        int panecillo;
                                        do {
                                            showOption(name);
                                            panecillo = input.nextInt();
                                            switch (panecillo) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (panecillo != 2);
                                    }
                                }
                                break;
                            case 2:
                                int areaG[][] = {{100, 223, 1}, {145, 358, 1}, {128, 254, 1}};
                                ShowInfGuapulo();
                                showArea(areaG);
                                 {
                                    {
                                        int optionG;
                                        do {
                                            showOption(name);
                                            optionG = input.nextInt();
                                            switch (optionG) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (optionG != 2);
                                    }
                                }
                                break;
                            case 3:
                                int areaC[][] = {{95, 214, 1}, {272, 345, 1}, {108, 234, 1}};
                                showInfCruzLoma();
                                showArea(areaC);
                                 {
                                    System.out.println(name + "Let's go to Viewpoint "
                                            + "CRUZ LOMA");
                                    {
                                        int cruzLoma;
                                        do {
                                            showOption(name);
                                            cruzLoma = input.nextInt();
                                            switch (cruzLoma) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, "
                                                            + "follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (cruzLoma != 2);
                                    }
                                }
                                break;
                            case 4:
                        }
                    } while (optionV != 4);
                    break;
                case 5:
                    int optionMalls;
                    do {
                        showBannerMalls();
                        optionMalls = input.nextInt();
                        switch (optionMalls) {
                            case 1:
                                int areamallQ[][] = {{60, 55, 76}, {19, 26, 5}, {41, 58, 60}};
                                showArea(areamallQ);
                                showInfmallQuicentronorth(name);
                                 {
                                    int Quicentro_North;
                                    do {
                                        showOptionmalls(name);
                                        Quicentro_North = input.nextInt();
                                        switch (Quicentro_North) {
                                            case 1:
                                                System.out.println(name + " have a good trip, follow the direction given,"
                                                        + " we will be accompanying you");
                                                System.exit(0);
                                                break;
                                            case 2:
                                                System.out.println("we will stay at your original point");
                                                break;
                                        }
                                    } while (Quicentro_North != 2);
                                }
                                break;
                            case 2:
                                int areamallCCI[][] = {{31, 50, 18}, {2, 7, 41}, {12, 13, 45}};
                                showArea(areamallCCI);
                                showInfCCI(name);
                                 {
                                    {
                                        int CCI;
                                        do {
                                            showOption(name);
                                            CCI = input.nextInt();
                                            switch (CCI) {
                                                case 1:
                                                    System.out.println(name + " have a good trip, follow the direction given"
                                                            + " we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at "
                                                            + "your original point");
                                                    break;
                                            }
                                        } while (CCI != 2);
                                    }
                                }
                                break;
                            case 3:
                                int areamallJardin[][] = {{12, 3, 16}, {16, 5, 12}, {5, 19, 5}};
                                showArea(areamallJardin);
                                showInfmallElJardin(name);
                                 {
                                    {
                                        int Mall_El_Jardin;
                                        do {
                                            showOption(name);
                                            Mall_El_Jardin = input.nextInt();
                                            switch (Mall_El_Jardin) {
                                                case 1:
                                                    System.out.println(name + "have a good trip, follow the direction given, "
                                                            + "we will be accompanying you");
                                                    System.exit(0);
                                                    break;
                                                case 2:
                                                    System.out.println("we will stay at your original point");
                                                    break;
                                            }
                                        } while (Mall_El_Jardin != 2);
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
                    } while (optionMalls != 4);
                    break;
                case 6:
                    System.out.println("Good bay " + name);
                    System.exit(0);
                    break;
            }
        } while (option
                != 6);
    }

    public static void printPlazaDeLasAmericasLocation(String name) {
        System.out.println(name + " Let's go to Plaza de las Americas ");
        System.out.println("The Ubication" + " Of The Plaza de las Americas Is:");
        System.out.println("Avenida NNUU Oe4-27 and,"
                + "a Av. de la República, Quito ");
    }

    public static void printTheaterSquareLocation(String name) {
        System.out.println(name + " Let's go to Plaza del Teatro (Theater Square)");
        System.out.println("The Ubication" + " Of The Theater Square Is:");
        System.out.println("Calle Guayaquil between "
                + "Manabi y Flores, Quito 170150");
    }

    public static void printBigSquareLocation(String name) {
        System.out.println(name + " Let's go to Plaza Grande (Big Square) ");
        System.out.println("The Ubication" + " Of The Big Square Is:");
        System.out.println("Chile St Venezuela and "
                + " García Moreno, Quito 170401");
    }

    public static void printBannerSquare(String name) {
        System.out.println("~~"
                + "\n" + "| The Square in Quito:" + "\n"
                + "~~");
        System.out.println("| 1.Plaza Grande            |");
        System.out.println("| 2.Plaza del Teatro        |");
        System.out.println("| 3.Plaza las Americas      |");
        System.out.println("| 4. Exit                   |");
        System.out.println("~~" + "\n"
                + "__");

        System.out.println(name + " Enter yout option  ");
        System.out.print("--> ");
    }
      
    public static void showOptionParks(String name) {
        System.out.println(name + " you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
    }

    public static void printCarolinaParkLocation(String name) {
        System.out.println(name + "Let's go to Carolina Park ");
        System.out.println("The Ubication" + " Of the Carolina Park Is:");
        System.out.println(" Naciones Unidas Avenue y De los Shyris Avenue (Iñaquito Neighborhood -Quito Downtown)");
    }

    public static void printItchimbiaParkLocation(String name) {
        System.out.println(name + "Let's go to Itchimbia Park ");
        System.out.println("The Ubication" + " Of The Itchimbia Park Is:");
        System.out.println(" Itchimbia Street, Quito (El Dorado Neighborhood - Quito Center)");
        System.out.println("Let's go to Park " + " Itchimbia ");
    }

    public static void printMetropolitanParkLocation(String name) {
        System.out.println(name + "Let's go to Metropolitan Park");
        System.out.println("The Ubication" + " Of The Metropolitan Park Is:");
        System.out.println(" Manrique Lara Street, Quito (El Batán Neighborhood - Quito North)");
    }

    public static void showInfmallElJardin(String name) {
        System.out.println(name + "Let's go to Mall_El_Jardin");
        System.out.println("The Ubication" + " Of The Mall_El_Jardin Is:");
        System.out.println("Direction: Av.Amazonas, Av. de la República N16-114 "
                + "y, Quito 170518");
    }

    public static void showInfCCI(String name) {
        System.out.println(name + "Let's go to CCI");
        System.out.println("The Ubication" + " Of The CCI Is:");
        System.out.println("Diretion: Av. Amazonas N36-152 "
                + "y Naciones Unidas. Quito 170102");
    }

    public static void showOptionmalls(String name) {
        System.out.println(name + "you know how to get " + "there?");
        System.out.println("1. Yes");
        System.out.println("2. No");
    }

    public static void showInfmallQuicentronorth(String name) {
        System.out.println(name + "Let's go to Quicentro_North");
        System.out.println("The Ubication" + " Of The Quicentro_North Is:");
        System.out.println("Direction: Avenida Naciones Unidas "
                + "between Avenida 6 de Diciembre and, "
                + "Av. de los Shyris. Quito");
    }

    public static void showBannerMalls() {
        System.out.println("~~ Malls in Quito ~~");
        System.out.println(" I will give you several options, the most common: ");
        System.out.println("~~~");
        System.out.println("|1.Quicentro_North        |");
        System.out.println("|2.CCI                    |");
        System.out.println("|3.Mall_El_Jardin         |");
        System.out.println("|4. Exit                  |");
        System.out.println("~~~");
    }

    private static void showInfChurchOfElSagrario(String name) {
        System.out.println(name + "Let's go to Church Of El Sagrario");
        System.out.println("The Ubication" + " Of Church Of El Sagrario Is:");
        System.out.println("Direction: Quito's Historic center "
                + "García Moreno y Espejo");
    }

    private static void showInfChurchTheBasilica(String name) {
        System.out.println(name + "Let's go to The Basilica");
        System.out.println("The Ubication" + " Of The Basilica Is:");
        System.out.println("Direction: Quito's Historic center "
                + "between the streets, "
                + "Carchi N122 y Venezuela");
    }

    private static void showInfChurchOfSantoDomingo(String name) {
        System.out.println(name + "Let's go to Church Of Santo Domingo");
        System.out.println("The Ubication" + " Of Church Of Santo Domingo Is:");
        System.out.println("Diretion: Quito's Historic center "
                + "Calle Flores y Pereira");
    }

    private static void showInfCruzLoma() {
        System.out.println("~~~~~~"
                + "\n" + "| The Viewpoints cruz loma:" + "\n"
                + "~~~~~~");
        System.out.println("The Ubication" + " Lloa Parish");
    }

    private static void ShowInfGuapulo() {
        System.out.println("~~~~~~"
                + "\n" + "| The Viewpoints Guapulo" + "\n"
                + "~~~~~~");
        System.out.println("The Ubication" + " Sector Guapulo");
        System.out.println("Direction: the intersection "
                + "of Av. Rafael León and Stubel.");
    }

    private static void showOption(String name) {
        showOptionParks(name);
    }

    private static void showInfPanecillo() {
        System.out.println("~~~~~~"
                + "\n" + "| The Viewpoints Panecillo:" + "\n"
                + "~~~~~~");
        System.out.println("The Ubication" + "sector historical Center");
        System.out.println("Direction: Cumbre del Panecillo, "
                + "Gral Melchor Aymerich");
    }

    private static void showBannerViewpoint(String name) {
        System.out.println("~~~~~~"
                + "\n" + "| The Viewpoints In Quito:" + "\n"
                + "~~~~~~");
        System.out.println("| 1.Panecillo                        |");
        System.out.println("| 2.Viewpoint the Guapulo            |");
        System.out.println("| 3.Viewpoint the Cruz Loma          |");
        System.out.println("| 4. Exit                            |");
        System.out.println("~~~~~~"
                + "\n" + "______");
        System.out.println(name + " Enter yout option  ");
        System.out.print("--> ");
    }

    public static void printGeneralBanner(String name) {
        System.out.println("~~~~~~" + "\n"
                + "|     Touristic Places Of Quito      |" + "\n"
                + "~~~~~~");
        System.out.println("~~~~~~" + "\n"
                + "|  Hello, Where are we going today?  |"
                + "\n"
                + "~~~~~~");
        System.out.println("| 1. Parks                           |");
        System.out.println("| 2. Churches                        |");
        System.out.println("| 3. Square                          |");
        System.out.println("| 4. Viewpoints                      |");
        System.out.println("| 5. Malls                           |");
        System.out.println("| 6. Exit                            |");
        System.out.println("~~~~~~" + "\n"
                + "______");
        System.out.println(name + " Enter your option  ");
        System.out.print("--> ");
    }

    public static void bannerChurches() {
        System.out.println("~~ Churches in Quito ~~");
        System.out.println(" I will give you several options, the most common: ");
        System.out.println("~~~~");
        System.out.println("|1. The Basilica                 |");
        System.out.println("|2. Church Of Santo Domingo      |");
        System.out.println("|3. Church Of El Sagrario        |");
        System.out.println("|4. Exit                         |");
        System.out.println("~~~~");
    }

    public static void bannerparks(String name) {
        System.out.println("~~"
                + "\n" + "| The parks in Quito:" + "\n"
                + "~~");
        System.out.println("| 1.Quito metopolitan park           |");
        System.out.println("| 2.Itchimbia park                   |");
        System.out.println("| 3.Carolina park                    |");
        System.out.println("| 4. Exit                            |");
        System.out.println("~~" + "\n"
                + "__");
        System.out.println(name + " Enter yout option  ");
        System.out.print("--> ");
    }

    public static void showArea(int[][] matrix) {
        int det;
        int area;
        det = (matrix[0][0] * matrix[1][1] * matrix[2][2])
                + (matrix[0][1] * matrix[1][2] * matrix[2][0])
                + (matrix[1][0] * matrix[2][1] * matrix[0][2])
                - (matrix[0][2] * matrix[1][1] * matrix[2][0])
                - (matrix[1][0] * matrix[0][1] * matrix[2][2])
                - (matrix[1][2] * matrix[2][1] * matrix[0][0]);
        area = det / 2;
        System.out.println("this area is -> " + area + " m^2");
    }
}
