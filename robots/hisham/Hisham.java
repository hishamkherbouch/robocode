package hisham;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class Hisham extends Robot{
    public void run(){
       
        while (true){
            ahead(100);
            turnLeft(45);
            turnGunRight(90);
            turnGunLeft(45);
            

        }
    }
    public void onScannedRobot(ScannedRobotEvent e){
            fire(1);
    }
    
}
