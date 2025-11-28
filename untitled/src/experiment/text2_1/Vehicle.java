package experiment.text2_1;

public class Vehicle {
    double speed;//声明变量speed,刻画速度
    int power;//声明power,刻画功率
    void speedUp(int s) {
       speed += s; //将参数s的值与成员变量speed的和赋值给成员变量speed
    }
    void speedDown(int d) {
       speed -= d; //将成员变量speed与参数d的差赋值给成员变量speed
    }
    void setPower(int p) {
       power = p;     //将参数p的值赋值给成员变量power
    }
    int getPower() {
       return power;  //返回成员变量power的值
    }
    double getSpeed() {
        return speed;
    }
}
