package experiment.text3_1;

public class Beijingman extends Chinese{
    public void averageHeight(){
        height=172.5;
        System.out.println("北京人的平均身高:"+height+"厘米");
    }//重写public void averageHeight()方法,输出:"北京人的平均身高: 172.5厘米"
    public void averageWeight(){
        weight=70;
        System.out.println("北京人的平均体重:"+weight+"公斤");
    }// 重写public void averageWeight()方法,输出:"北京人的平均体重：70公斤"
    public void beijingOpera() {
        System.out.println("花脸、青衣、花旦和老生");
    }
}
