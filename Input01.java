import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Type input:") ;
        System.out.println(input);


        //Parse the input as an int.
        //Print its value +1
        int input1 = Integer.parseInt(input) ;
        input1 ++ ;
        System.out.println(input1);


        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int input2 = Integer.parseInt((JOptionPane.showInputDialog(("Type input: "))));
        System.out.println(input2);
    }
}
