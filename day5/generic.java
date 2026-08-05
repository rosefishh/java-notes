package day5;

public class generic {
    public static void main(String[] args) {
        box<Integer> b1 =new box<>();
        b1.setvalue(67);
        box<String> b2 =new box<>();
        b2.setvalue("AMON");

        System.out.println(b1.getvalue());
        System.out.println(b2.getvalue());

        st<Integer> s1 = new st<>(003);
        s1.display();

        st<String> s2 = new st<>("chintu");
        s2.display();
    }
}

class box<T>{
    T value;
    public void setvalue(T value){
        this.value = value;
    }
    public T getvalue(){
        return value;
    }
}
    
class st<T>{
    T id;
    st(T id){
        this.id = id;
    }

    public void display(){
        System.out.println(id);
    }
}
