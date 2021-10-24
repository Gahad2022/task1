/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app.tv;

/**
 *
 * @author NoteBook
 */
public class AppTv {

    public static void main(String[] args) {
        // TODO code application logic here
          TV tv1=new TV();
       tv1.TurnON();
       tv1.Setchannel(70);
       tv1.Setvolumel(3);
       
       
       TV tv2=new TV();
       tv2.TurnON();;
       tv2.channel1Up();
       tv1.volumeUp();
       
       System.out.println("tv1's channel is"+tv1.channel+"and volume level is "+tv1.volumelevel);
       System.out.println("tv2's channel is"+tv2.channel+"and volume level is "+tv2.volumelevel);
       
       
       
    }
    
}
