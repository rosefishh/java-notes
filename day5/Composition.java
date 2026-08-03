package day5;

public class Composition {
    public static void main(String[] args) {
       book3 b = new book3("AAA", "aman");
       b.displaybook(); 
    }
}

class page{
    String content;

    public page(String content){
        this.content = content;
    }

    public void display(){
        System.out.print(content);
    }
}


class book3{
    String title;
    String author;
    page p1;
    page p2;

    public book3(String title,String author){
        this.title = title;
        this.author = author;
        this.p1 = new page("PREFACE");
        this.p2 = new page("THE END");
    }

    public void displaybook(){
        System.out.print(title + "," + author + ",");
        p1.display();
        System.out.print(",");
        p2.display();
    }
}