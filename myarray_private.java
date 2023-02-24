public class myarray{
    public static void main(String[] args) {
        int[] data = new int[1];
        data[0] = 1;

        human person = new human(); 
        person.sex = 1; 
        person.weight = 50; 
        person.hight = 180; 
        person.printhight();
        person.printweight();

    }

}

class human{ 
    int sex; 
    private int weight;
    int hight;

    public void printhight(){ 
                
        System.out.println(hight);
    }

    public void printweight(){ 
                
        System.out.println(weight);

    }
}
