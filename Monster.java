public class Monster{
    private int arms;
    private int eyes;
    private int buttons;
    private String name;
    public Monster(){

    }
    public Monster(int arms, int eyes, int buttons, String name){
        this.arms=arms;
        this.eyes=eyes;
        this.buttons=buttons;
        this.name=name;
    }
    public void setArms(int a){
        this.arms=a;
    }
    public int getArms(){
        return this.arms;
    }
    public void setEyes(int e){
        this.eyes=e;
    }
    public int getEyes(){
        return this.eyes;
    }
    public void setButtons(int b){
        this.buttons=b;
    }
    public int getButtons(){
        return this.buttons;
    }
    public void setName(String n){
        this.name=n;
    }
    public String getName(){
        return this.name;
    }

    public static void main(String[] args){
        Monster m1 = new Monster();
        Monster m2 = new Monster(4,2,3,"Bob");
        System.out.println(m1);
        System.out.println(m2);
    }
}