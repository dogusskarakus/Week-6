import core.Db;
import core.Helper;
import view.LoginView;
import business.UserManager;
import view.AdminView;


import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class App {

    public static void main(String[] args) {


        Helper.setTheme();
        UserManager userManager = new UserManager();
        AdminView adminView = new AdminView(userManager.findByLogin("admin","1234"));
    }
}
