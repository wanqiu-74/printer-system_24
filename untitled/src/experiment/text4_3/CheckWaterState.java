package experiment.text4_3;

interface WaterState {
    public void showState();
}
class temperature0State implements WaterState {
    public void showState() {
        System.out.println("冰水，适合夏天喝");
    }
}
class temperature30State implements WaterState {
    public void showState() {
        System.out.println("常温，适合大部分人");       //重写public void showState()
    }
}
class temperature60State implements WaterState {
    public void showState() {
        System.out.println("温水，适合饭后喝"); //重写public void showState()方法
    }
}
class temperature100state implements WaterState {
    public void showState() {
        System.out.println("沸水，不适合直接喝"); //重写public void showState()方法
    }
}
class Water {
    WaterState state;
    public void show() {
        state.showState();
    }
    public void setState(WaterState s) {
        state = s;
    }
}
public class CheckWaterState {
    public static void main(String args[]) {
        experiment.text4_3.Water water =new experiment.text4_3.Water();
        System.out.print("0摄氏度的水:");
        water.setState(new experiment.text4_3.temperature0State());
        water.show();
        System.out.print("30摄氏度的水:");
        water.setState(new experiment.text4_3.temperature30State());
        water.show();
        System.out.print("60摄氏度的水:");
        water.setState(new experiment.text4_3.temperature60State());
        water.show();
        System.out.print("100摄氏度的水:");
        water.setState(new experiment.text4_3.temperature100state());
        water.show();
    }
}
