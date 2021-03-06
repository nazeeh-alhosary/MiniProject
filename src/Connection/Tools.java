/**
 *
 * This class made by M Nazeeh Alhosary.
 *          7/5/2017
 */
package Connection; // Please change package name...

//import com.sun.xml.internal.ws.util.ReadAllStream;
import Forms.FrmAdmin_Login;
import Forms.Loading;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.JSplitPane.RIGHT;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.JTableHeader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Tools {

    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;

    
    public static String hashPassword(String password) {
        try {
           MessageDigest md = MessageDigest.getInstance("MD5");
           byte[] passBytes = password.getBytes();
           md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<digested.length;i++){
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();
           
        } catch (NoSuchAlgorithmException ex) {
            System.err.print(ex);
        }
        return null;
    }
    
    //Normal icon, without any title.
    public static void MsgBox(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    // Normal info icon i , with title

    public static void MsgBoxInfo(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    // Error icon /i\, with title

    public static void MsgBoxErrorI(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
    }
    // Error icon /x\, with title

    public static void MsgBoxErrorX(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }
    // Box without any icon, with title and message

    public static void MsgBoxWithout(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.CLOSED_OPTION);
    }
    // Question mark icon ? , with title

    public static void MsgBoxQuestion(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.QUESTION_MESSAGE);
    }
    // Error icon /i\, with title

    public static void MsgBoxError1(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.WHEN_FOCUSED);
    }

    public static boolean YesNoChooserBox(String message, String title) { //ConfirmBox
        int result = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    public static Object InputBox(String Message, String title) {
        Object result = JOptionPane.showInputDialog(null, Message, title, JOptionPane.INFORMATION_MESSAGE);
        return result;
    }

    public static Object InputBoxErrorI(String Message, String title) {
        Object result = JOptionPane.showInputDialog(null, Message, title, JOptionPane.CANCEL_OPTION);
        return result;
    }

    public static Object InputBoxWithout(String Message, String title) {
        Object result = JOptionPane.showInputDialog(null, Message, title, JOptionPane.CLOSED_OPTION);
        return result;
    }

    public static Object InputBoxErrorX(String Message, String title) {
        Object result = JOptionPane.showInputDialog(null, Message, title, JOptionPane.ERROR_MESSAGE);
        return result;
    }

    public static void NewFolder(String FolderName) {
        File f = new File(FolderName);
        f.mkdir();
    }

    public static void NewFolderWithPath(String FolderName, String path) {
        File f = new File(path + "/" + FolderName);
        f.mkdir();
    }

    public static void OpenForm(JFrame form) {

        try {
            form.setLocationRelativeTo(null);
            Image img = ImageIO.read(Tools.class.getResource("001.png"));
            form.setIconImage(img);
            form.setDefaultCloseOperation(2);
//      form.setDefaultCloseOperation(form.DO_NOTHING_ON_CLOSE); //To disable close button (x) at the top
            form.getContentPane().setBackground(Color.WHITE);
            form.setVisible(true);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public static void OpenFormWithNewICON(JFrame form, String Icon) {
        try {
            form.setLocationRelativeTo(null);
            Image img = ImageIO.read(Tools.class.getResource(Icon));
            form.setIconImage(img);
            form.setDefaultCloseOperation(2);
//      form.setDefaultCloseOperation(form.DO_NOTHING_ON_CLOSE); //To disable close button (x) at the top
            form.getContentPane().setBackground(Color.WHITE);
            form.setVisible(true);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    // Select an image from your computer

    public static void PutImageInLable(String ImageName, JLabel lable, int lableLength, int lableWidth) {
        try {
            Image img = ImageIO.read(Tools.class.getResource(ImageName));
            Image newImg = img.getScaledInstance(lableLength, lableWidth, Image.SCALE_AREA_AVERAGING);
            ImageIcon icon = new ImageIcon(newImg);
            lable.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void SelectImageInLable(JLabel lable, int lableLength, int lableWidth) {
        try {
            JFileChooser file = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "ico");// File title, formulas
            file.setFileFilter(filter);
            file.showDialog(null, "Select Image"); // Button title
            Image img = ImageIO.read(file.getSelectedFile());
            Image newImg = img.getScaledInstance(lableLength, lableWidth, Image.SCALE_AREA_AVERAGING);
            ImageIcon icon = new ImageIcon(newImg);
            lable.setIcon(icon);
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ScreenShot(String ImageName, JFrame form) {
        try {
            form.setState(1);
            Robot r = new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img;
            img = r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(ImageName + ".jpg"));
            form.setState(0);
        } catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void ScreenShotWhitForm(String ImageName) {
        try {
            Robot r = new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(ImageName + ".jpg"));
        } catch (Exception ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void SetTableHeader(JTable Table) {

        Table.getTableHeader().setBackground(new Color(66, 00, 66));
        Table.getTableHeader().setForeground(Color.white);
        Table.getTableHeader().setReorderingAllowed(false); // Change column order
        Table.getTableHeader().setResizingAllowed(false);  // Change column size

        /* 
     JTableHeader t = Table.getTableHeader();
               t.setBackground(Color.GRAY);
               t.setForeground(Color.white);
               t.setFont(new Font ("Tahome", Font.ITALIC,20));
         */
    }

    public static void OpenWebPage(String WebPage) {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(new URL(WebPage).toURI());
        } catch (URISyntaxException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Tools.MsgBox(ex.getMessage());
        }

    }
     public static String currentTime() {
        // Date
        java.util.Date Today = new java.util.Date();
        SimpleDateFormat SMF = new SimpleDateFormat("hh:mm:ss");
        return String.valueOf(SMF.format(Today));
    }
    public static void currentTime(JLabel lable){
    java.util.Date Today = new java.util.Date();
        SimpleDateFormat SMF = new SimpleDateFormat("hh:mm:ss");
       String T = String.valueOf(SMF.format(Today));
        lable.setText(T);
    }

    public static void ToDay(JLabel lable) {
        // Date
        /*
     SimpleDateFormat("yyyy/MM/dd");
     yy or yyyy for Year
     MM for Months
     dd for Days
     hh for Hours
     mm for Minutes
     ss for Seconds
     a to show am or pm
         */
        java.util.Date Today = new java.util.Date();
        SimpleDateFormat SMF = new SimpleDateFormat("yyyy/MM/dd");
        String T = String.valueOf(SMF.format(Today));
        lable.setText(T);
    }
    // This method return a date for today as a String 

    public static String ToDay() {
        // Date
        java.util.Date Today = new java.util.Date();
        SimpleDateFormat SMF = new SimpleDateFormat("yyyy/MM/dd");
        return String.valueOf(SMF.format(Today));
    }

    public static String DateAfterFourteenDays() {
        // Date
        SimpleDateFormat SMF = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = new GregorianCalendar();
        SMF.format(cal.getTime());
        cal.add(Calendar.DAY_OF_MONTH, 14);
        return SMF.format(cal.getTime());
    }
    // To calculate the days number between two dates.

    // Way 1 if we have a String date... NOTE THAT THE DATE FORMULA IS yyyy/MM/dd 
    public static int CalculateDays(String FirstDate, String SecondDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        /*
      If we do not want to cast we can put long istead of int 
      in the return just return Integer.parseInt(Long.toString(days));
         */
        try {
            Date d1 = sdf.parse(FirstDate);
            Date d2 = sdf.parse(SecondDate);
            int diff = (int) (d2.getTime() - d1.getTime());
            int hours = diff / (60 * 60 * 1000);
            int days = hours / 24;
            return days;
        } catch (ParseException ex) {
            Tools.MsgBox(ex.getMessage());
            return 0;
        }
    }
    
    public static long CalculateDaysBetween(String first, String second) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {    
            Date d1 = format.parse(first);
            Date d2 = format.parse(second);
            
            long diff = d1.getTime() - d2.getTime();
            
            return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        } catch (ParseException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    // Way 2 if we have any date chooser... NOTE THAT THE DATE FORMULA IS yyyy/MM/dd 
    /* public void CalculateDays(JLabel label , JDateChooser FirstDate ,JDateChooser SecondDate){
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); 
      // d1 = format.parse(format.format(Date1.getDate()));
        Date date1 = null;
        Date date2 = null;
        date1= sdf.parse( sdf.format( SecondDate.getDate()) );
        date2 = sdf.parse( sdf.format( FirstDate.getDate()) ) ;
        long diff = date2.getTime() - date1.getTime();
        long hours = diff / (60*60*1000);
        long days = hours/24;
        label.setText(Long.toString(days));
          
  }*/
    public class Table {

        public int columns;
        public Object[][] Items;

        public Table(int columns) {
            this.columns = columns;
            Items = new Object[0][columns];
        }

        public void addNewRow(Object row[]) {
            Object TempItems[][] = Items;
            Items = new Object[Items.length + 1][columns];
            for (int x = 0; x < TempItems.length; x++) {
                Items[x] = TempItems[x];
            }
            Items[Items.length - 1] = row;
        }

        public void printItems() {
            for (Object objs[] : Items) {
                for (Object obj : objs) {
                    System.out.print(obj + " ; ");
                }
                System.out.println();
            }
        }

        public void editRow(int rowIndex, int columnIndex, Object newData) {
            Items[rowIndex][columnIndex] = newData;
        }

    }

    public static void ClearTexts(Container form) {
        for (Component c : form.getComponents()) {
            if (c instanceof JTextField) {
                JTextField text = (JTextField) c;
                text.setText("");
            } else if (c instanceof Container) {
                ClearTexts((Container) c);
            }
        }

    }

    public static void CreateEmptyFile(String FileName) {
        try {
            File f = new File(FileName + ".txt");
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void CreateFile(String FileName, Object data[]) {
        try {
            try (PrintWriter p = new PrintWriter(FileName + ".txt")) {
                for (Object o : data) {
                    p.println(o);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void CreatFiles(String FileNames[], Object allData[][]) {
        for (int x = 0; x < FileNames.length; x++) {
            CreateFile(FileNames[x], allData[x]);

        }
    }

    public static String GetNumbers(String text) {
        String val = "";
        for (char c : text.toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                val += c;
            }
        }
        return (val);

    }

    public static int GetNumbers(Object text) {
        String val = "";
        for (char c : text.toString().toCharArray()) {
            if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                val += c;
            }
        }
        return Integer.parseInt(val);

    }

    public static String RemoveNumbers(Object text) {
        String val = "";
        for (char c : text.toString().toCharArray()) {
            if (!(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9')) {
                val += c;
            }
        }
        return (val);

    }

    public static void CreateEmptyFiles(String Names[]) {
        for (String s : Names) {
            CreateEmptyFile(s);
        }
    }

    String text;
    private String inversetext;
    String texts[];
    String textArray;

    public void PrintCharbyChar() {
        for (char c : text.toCharArray()) {
            System.out.println(c);
        }
    }

    public void PrintCharbyCharInverse() {
        StringBuilder sb = new StringBuilder(text);
        inversetext = sb.reverse().toString();
        for (char c : inversetext.toCharArray()) {
            System.out.println(c);
        }
    }

    public void PrintArry() {
        for (String s : texts) {
            System.out.println(s);
        }
    }

    public String SetFromArray() {
        for (String s : texts) {
            textArray += s + " || ";
        }
        return textArray;
    }

    public class MergeArrays {

        public Object array1[];
        public Object array2[];
        private int a1, a2;

        public MergeArrays(Object array1[], Object array2[]) {
            this.array1 = array1;
            this.array2 = array2;
        }

        public Object[] Merge() {
            a1 = array1.length;
            a2 = array2.length;
            Object arrayR[] = new Object[a1 + a2];
            System.arraycopy(array1, 0, arrayR, 0, a1);
            System.arraycopy(array2, 0, arrayR, a1, a2);
            return arrayR;
        }
    }
// gusalhmn@student.gu.se
    public static void SendEmail(String ReceiverEmail,String Email_Title,String YourMessage){
        try {
        mailServerProperties = System.getProperties();
        mailServerProperties.put("mail.smtp.port", "587");
        mailServerProperties.put("mail.smtp.auth", "true");
        mailServerProperties.put("mail.smtp.starttls.enable", "true");
        getMailSession = Session.getDefaultInstance(mailServerProperties, null);
        generateMailMessage = new MimeMessage(getMailSession);
        generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(ReceiverEmail)); 
        generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress(ReceiverEmail)); 
        generateMailMessage.setSubject(Email_Title);
        String emailBody = YourMessage ;
        
        generateMailMessage.setContent(emailBody, "text/html");
        Transport transport = getMailSession.getTransport("smtp");
        transport.connect("smtp.gmail.com", "library0system@gmail.com", "Librarysystem0");
        OpenForm(new Loading());
        transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
        
        
        //Tools.MsgBoxInfo("Email has been sent", "Sending an E-mail");
        transport.close();
        } catch (Exception e) {
            Tools.MsgBox(e.getMessage());
        }  
    }
    
    public static void SendEmailWithAttachment(String toAddress, String msg, String filename) throws AddressException, MessagingException{
      String host = "smtp.gmail.com";
        String Password = "Librarysystem0";
        String user = "library0system@gmail.com";
       
        Properties props = System.getProperties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtps.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(props, null);

        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress(user));

        message.setRecipients(Message.RecipientType.TO, toAddress);

        message.setSubject("Greetings from Library System");

        BodyPart messageBodyPart = new MimeBodyPart();

        messageBodyPart.setText(msg);

        Multipart multipart = new MimeMultipart();

        multipart.addBodyPart(messageBodyPart);

        messageBodyPart = new MimeBodyPart();

        DataSource source = new FileDataSource(filename);

        messageBodyPart.setDataHandler(new DataHandler(source));

        messageBodyPart.setFileName(filename);

        multipart.addBodyPart(messageBodyPart);

        message.setContent(multipart);

        try {
            Transport tr = session.getTransport("smtps");
            tr.connect(host, user, Password);
            tr.sendMessage(message, message.getAllRecipients());
            System.out.println("Mail Sent Successfully");
            tr.close();

        } catch (SendFailedException sfe) {

            System.out.println(sfe);
        }
     
     }

}
