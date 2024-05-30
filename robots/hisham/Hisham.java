package hisham;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.awt.Color;

public class Hisham extends Robot{
    public void run(){
       setBodyColor(Color.red);
       setGunColor(Color.green);
       setBulletColor(Color.white);
        while (true){
            ahead(100);
            turnGunLeft(360);
            back(75);
            

        }
    }
    public void onScannedRobot(ScannedRobotEvent e){
            fire(3);
            ahead(50);
            turnRight(180);
            ahead(25);

            
    }
    
}