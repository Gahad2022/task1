/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.tv;

/**
 *
 * @author NoteBook
 */
class TV {
    int channel=1;
    int volumelevel=1;
    boolean on =false;
    
    public TV()
    {
    }
    public void TurnON()
    {
        on=true;
    }
     public void TurnOff()
    {
        on=false;
    }
     public void Setchannel(int newchannel1)
    {
        if(on&&newchannel1 >=1&& newchannel1<=120)
         channel=newchannel1;   
    }
     public void Setvolumel(int newvolumelevel1)
    {
        if(on&&newvolumelevel1 >=1&& newvolumelevel1<=7)
         volumelevel=newvolumelevel1;   
    }
     public void channel1Up()
     {
         if(on&&channel<120)
             channel++;
     }
     public void channel1Down()
     {
         if(on&&channel>1)
             channel--;
     }
     public void volumeUp()
     {
          if(on&&volumelevel<7)
             volumelevel++;
     }
     public void volumeDown()
     {
         if(on&&volumelevel>1)
             volumelevel--;
     }
}


