/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import Connection.Tools;
import Forms.FrmBooks;
import Forms.FrmLogin;
import Forms.FrmManagement;
import Forms.FrmReturn;

/**
 *
 * @author mohammadzreik
 */
public class LibrarySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        // Tools.OpenForm(new FrmLogin());
         Tools.OpenForm(new FrmManagement());
    }
}
