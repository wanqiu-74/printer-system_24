package experiment.text5_2;

public class Machine {
    public void checkBag(Goods goods) throws DangerException {
        if(goods.isDanger()) {
            DangerException danger=new DangerException();
            throw danger;   //抛出
        }
        else {
            System.out.print(goods.getName()+"不是危险品! ");
        }
    }
}
