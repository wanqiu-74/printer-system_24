package experiment.text5_2;

public class DangerException extends Exception{
    String message;
    public DangerException() {
        this.message = "危险品";  //   输出要求信息
    }
    public void toShow() {
        System.out.print(message+" ");
    }
}
