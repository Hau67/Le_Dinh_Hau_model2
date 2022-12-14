package caseStudy.view.Facility;

import caseStudy.controller.FacitilyController;
import caseStudy.model.Furama.Room;
import caseStudy.model.Furama.Villa;

import java.util.Scanner;

public class DisplayFacilityMenu {
    Scanner sc = new Scanner(System.in);
    FacitilyController facitilyController = new FacitilyController();
    int numBoom = 1;
    int numVilla = 1;

    public void menuFacility() {
        do {
            System.out.println("Menu Facility");
            System.out.println("Add new villa");
            System.out.println("Add new Room");
            System.out.println("Back to Menu");

            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:

                    System.out.println("Enter nameService");
                    String name = sc.nextLine();
                    System.out.println("Enter usableArea");
                    String usableArea = sc.nextLine();
                    System.out.println("Enter taxExpense");
                    double taxExpense = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter maximumNumberOfPeople");
                    int maximumNumberOfPeople = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter rentalType ");
                    String rentalType = sc.nextLine();

                    Villa villa = new Villa(name, usableArea, taxExpense, maximumNumberOfPeople, rentalType);
                    facitilyController.addNewFacility(villa,numVilla);
                    numVilla++;
                    break;
                case 2:
                    System.out.println("Enter nameService");
                    String names = sc.nextLine();
                    System.out.println("Enter usableArea");
                    String usableAreas = sc.nextLine();
                    System.out.println("Enter taxExpense");
                    double taxExpenses = Double.parseDouble(sc.nextLine());
                    System.out.println("Enter maximumNumberOfPeople");
                    int maximumNumberOfPeoples = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter rentalType");
                    String rentalTypes = sc.nextLine();

                    Room room = new Room(names,usableAreas,taxExpenses,maximumNumberOfPeoples,rentalTypes);
                    facitilyController.addNewFacility(room,numBoom);
                    numBoom++;
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Enter wrong re-enter");
            }
        } while (true);
    }
}
