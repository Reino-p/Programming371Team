public class Student {
    
    //fields
    String name;
    int id;

    //methods
    public void Print(){
        System.out.println(name + " " + id);
    }

    //constructor

    public Student(String n, int i){
        this.name = n;
        this.id = i;
    }

}
