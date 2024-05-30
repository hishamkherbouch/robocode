package hisham;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import java.util.Random;
import java.awt.Color;

public class Hisham extends Robot{
    public void run(){
       setBodyColor(Color.red);
       setGunColor(Color.blue);
       setBulletColor(Color.white);
        while (true){
            Random rand = new Random();
            double amount = rand.nextInt(0,100);
            ahead(amount);
            turnGunLeft(360);
            back(amount);
            

        }
    }
    public void onScannedRobot(ScannedRobotEvent e){
            fire(3);
            ahead(10);
            turnRight(180);

            
    }
    
}