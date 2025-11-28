package experiment.text5_1;

class library {
    BorrowCard normalCard;
    BorrowCard vipCard;
    private int Booknum;  //手机的数量
    library(int num){
        Booknum = num;
        normalCard = new BorrowCard(3);
        vipCard = new BorrowCard(5);
    }

    int getBooknum() {
        return Booknum;
    }
    class BorrowCard {
        private int booklimit;
        BorrowCard(int limit) {
            this.booklimit = limit;
        }
        public void borrowbooks() {
            if(Booknum>=booklimit) {
                Booknum -= booklimit;
                System.out.println("使用"+(booklimit == 3 ? "普通":"贵宾")+"借阅卡成功借了"+booklimit+"本书");
            }
            else {
                System.out.println("剩余藏书不足，无法借阅"+booklimit+"本书");
            }
        }
    }
}
public class librarytext {
    public static void main(String args[]) {
        library lib = new library(20);
        System.out.println("图书馆原始藏书量为："+lib.getBooknum()+"本");

        lib.normalCard.borrowbooks();
        System.out.println("当前藏书："+lib.getBooknum()+"本");

        lib.vipCard.borrowbooks();
        System.out.println("当前藏书："+lib.getBooknum()+"本");
    }
}
