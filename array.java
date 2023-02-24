public class array{
    public static void main(String[] args) {
        int[] data = new int[1];
        data[0] = 1;

        human person = new human();
        System.out.println((person.sex));
        human.printhight();

    }

}

class human{ 
    int sex = 5; 
    private int weight = 180;
    static int hight = 170;

    public static void printhight(){ 
                
        System.out.println(hight);
    }

    private void printweight(){ 
                
        System.out.println(weight);

    }
}
