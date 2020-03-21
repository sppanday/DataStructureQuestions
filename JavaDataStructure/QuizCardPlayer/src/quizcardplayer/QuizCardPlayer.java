
package quizcardplayer;
import java.util.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class QuizCardPlayer {

   private JTextArea display;
   private JTextArea answer;
   private ArrayList<QuizCard> cardList;
   private QuizCard currentCard;
   private int currentCardIndex;
   private JFrame frame;
   private JButton nextButton;
   private boolean isShowAnswer;
   
   public static void main (String[] args) {
       QuizCardPlayer reader = new QuizCardPlayer();
   }
   public void go();
   //build gui
   frame = new JFrame("Quiz Card Player");
   Jpane1 mainPanel = new Jpanel();
   Font bigFont = new Font("sanserif", Font.BOLD, 24);
   
   display = new JTextArea(10,20);
   display.setFont(bigFont);
  
   display.setEditable(false);
   JScrollPane qScroller = new JScrollPlane(display);
   
   qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL SCROLLBAR ALWAYS);
   
   qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
   nextButton = new JBotton("Show QUestion");
   mainPanel.add(qScroller);
   mainPanel.add(nextButton)
   }