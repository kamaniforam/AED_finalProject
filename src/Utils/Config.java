/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.time.format.DateTimeFormatter;
import javax.swing.JTextField;

/**
 *
 * @author richajain
 */
public class Config {
    public static final String accountSID = "";
    public static final String authenticationToken = "";
    public static String emailId = "richa.aed@gmail.com";
    public static String password = "wvgvuhlenegmpxtv";
    public static final String whatsappPhn = "";
    public static final String healthBuddyPhoneNumber = "";
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");


    public static String getClippedText(JTextField textField) {
            return textField.getText().trim();
    }
}
