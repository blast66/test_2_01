public class myarray{
    public static void main(String[] args) {
        int[] data = new int[1];
        data[0] = 1;

        human person = new human();
        person.sex = 1;
        person.weight = 50;
        person.hight = 180;
        person.createVariable();
        
        System.out.println((data[0]));
    }

}

class human{
    int sex;
    int weight;
    int hight;

    public void createVariable(){
                
        System.out.println((hight)*(weight)/100);

    }
}
