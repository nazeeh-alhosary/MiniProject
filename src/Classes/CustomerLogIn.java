/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Connection.Connections;
import Connection.Tools;

/**
 *
 * @author M Nazeeh Alhosary
 */
public class CustomerLogIn {
   private int CardNumber;
   private String UserName;
   private String PassWord;
   private String Question;
   private String Answer;

    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int CardNumber) {
        this.CardNumber = CardNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String Question) {
        this.Question = Question;
    }
    
    public boolean Add(){
    String insert = "Insert into customerlogin VALUES ("
                + CardNumber + ","
                +"'"+ UserName + "',"
                +"'"+ PassWord + "',"
                +"'"+ Question + "',"
                +"'"+ Answer + "' );";
        boolean check = Connections.RunNonQuery(insert);
        if (check) {
           Tools.MsgBoxInfo("New Access for the cardholder with the number ("+CardNumber+") has been added", "Registration succesful");
           return true;
        }
        return false;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }
}