package abcloanco;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import myLoan.BusinessLoan;
import myLoan.Loan;
import static myLoan.LoanConstants.COMPANY_NAME;
import myLoan.PersonalLoan;

public class CreateLoans {

    public static void main(String[] args) {
        //variables
        ArrayList<Loan> loans = new ArrayList<>();
        Object[] options = {"Add New Loan", "Display Loans", "Quit"};// buttons for JOption
        String[] typeLoans = {"Personal Loan", "Business Loan"};
        String[] titles = {"Enter your Details", " ABC Loan App 👍", "What would you like to do?"};
        int x;

            do {//while loop show below window until user press quit
            x = JOptionPane.showOptionDialog(new JFrame(), titles[2], titles[1],
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options, options[1]);

            switch (x) {
                case 0 -> {
                    System.out.println("User Pressed Add");
                    JPanel panel = new JPanel();
                    JTextField nameField = new JTextField();
                    JTextField amountField = new JTextField();
                    JTextField termField = new JTextField();
                    Object[] loanObj = {// list of textboxes
                        "Your Full Name:", nameField,
                        "Amount Loan:", amountField,
                        "How many Years:", termField};
                    try {//input window for user to put data
                        String input = (String) JOptionPane.showInputDialog(panel, loanObj,
                                titles[0], JOptionPane.QUESTION_MESSAGE, null, typeLoans, // Array of choices
                                typeLoans[0]); // Initial choice

                        if (input.equals(typeLoans[0])) {//if personal loan picked adds to personal loan to the list
                            String name = nameField.getText();
                            int amountLoan = Integer.parseInt(amountField.getText());
                            int term = Integer.parseInt(termField.getText());
                            PersonalLoan personals = new PersonalLoan(name, amountLoan, term);
                            loans.add(personals);
                            personals.displayLoan();
                            System.out.println("Personal Loan added to the list!!!");

                        } else if (input == typeLoans[1]) {//add to business loan to the list
                            String name = nameField.getText();
                            int amountLoan = Integer.parseInt(amountField.getText());
                            int term = Integer.parseInt(termField.getText());
                            BusinessLoan businesses = new BusinessLoan(name, amountLoan, term);
                            loans.add(businesses);
                            businesses.displayLoan();
                            System.out.println("Business Loan added to the list!!!");
                        }
                    } catch (HeadlessException | NumberFormatException e) {
                        // catches any following errors
                        System.out.println("User input invalid Year & Odometer");
                        JOptionPane.showMessageDialog(null, "Please Enter Amount of Loan & the years of the loan Correctly");
                    }
                }
                case 1 -> { // user presses display button
                    System.out.println("User Pressed Display"); // indicates the programmer
                    String listLoan = "";
                    if (loans.isEmpty()) {//if the list is empty informs the user
                        JOptionPane.showMessageDialog(null, "There is no loan at this stage. please enter Loans");
                    } else {//otherwise displays the loans
                        System.out.println("Displaying Loans");
                        for (int i = 0; i < loans.size(); i++) {
                            listLoan += String.format("%-12s|%21s |%13s |%15s |%13s| %13s", loans.get(i).getLoanNo(),
                                    loans.get(i).getCutomerName(), "$" + loans.get(i).getLoanAmount(), loans.get(i).getTerm()
                                    + "Years", "%" + loans.get(i).getIntRate(), loans.get(i).getApproved() + "\n");                           
                        }
                        JOptionPane.showMessageDialog(null, COMPANY_NAME +
                                "\nLoan No |  Acount Name |  Amount  | Loan Term | Loan Rate |Loan Approval"
                                + "\n ________________________________________________________________________ \n"
                                + listLoan, "Loan Result", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                default -> {//if press cancel exits from the app
                    System.out.println("User exit the Program");
                    System.exit(0);
                }
            }
        } while (x == 0 || x == 1); // if pressed cancel or X exits from the app
        {
            System.out.println("User Pressed Close the Program!");
            System.exit(0);// if user wants to get out of the program
        }
    }
}

/**
 *
 * @author 30023737
 */
