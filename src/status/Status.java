/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user status code (0: REJECTED, 1: PENDING, 2: PROCESSING, 3: APPROVED):");
        int code = in.nextInt();
        StausUser statusUser = new StausUser();
        StatusOf status;
        switch(code) {
            case 0:
                status = StatusOf.REJECTED;
                break;
            case 1:
                status = StatusOf.PENDING;
                break;
            case 2:
                status = StatusOf.PROCESSING;
                break;
            case 3:
                status = StatusOf.APPROVED;
                break;
            default:
                System.out.println("NOT VALID CODE");
                return;
        }

        statusUser.statusDetail(status);
    }
}