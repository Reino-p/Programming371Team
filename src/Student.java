public class Student {
    
    //fields
    String name;
    int id;

    //methods
    public void Print(){
        System.out.println(name + " " + id);
    }

    //constructor

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

}
