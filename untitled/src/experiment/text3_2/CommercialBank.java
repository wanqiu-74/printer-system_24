package experiment.text3_2;

public class CommercialBank extends Bank{
    double year;
    public double computerInterest() {
        super.year=(int)year;
        double r = year-(int)year;
        int day=(int)(r*1000);
        double yearInterest = super.computerInterest(); //super调用隐藏的computerInterest()方法
        double dayInterest = day*0.00011*savedMoney;
        interest= yearInterest+dayInterest;
        System.out.printf("%d元存在商业银行%d年零%d天的利息:%f元\n",
                savedMoney,super.year,day,interest);
        return interest;
    }
}
