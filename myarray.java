public class myarray{
    public static void main(String[] args) {
        int[] data = new int[1];
        data[0] = 1;

        human person = new human(); #實體化物件
        person.sex = 1; #物件.方法
        person.weight = 50; #物件.方法
        person.hight = 180; #物件.方法
        person.printsum();
        
        System.out.println((data[0]));
    }

}

class human{ #物件
    int sex; #方法
    int weight;#方法
    int hight;#方法

    public void printsum(){ #方法
                
        System.out.println((hight)*(weight)/100);

    }
}
