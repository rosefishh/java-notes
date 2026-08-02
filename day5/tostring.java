package day5;

public class tostring {
    public static void main(String[] args){
        car2 c1 = new car2("mustang",7);
        System.out.println(c1);

        book1 b1 = new book1("crime and punishment", "rose", "666RW");

        ebook e1 = new ebook("circe", "rose", "6767yy", 30.4);

        System.out.println("BOOK 1:"+ b1.gettitle());
        System.out.println("BOOK 1 AUTHOR:"+ b1.getauthor());

        b1.settitle("no crime and punishment");
        b1.setauthor("aman");
        System.out.println("BOOK 1:"+ b1);

    }
}

class car2{
    String name;
    int number;

    car2(String name,int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString(){
        return "car2{name='"+this.name+ "' , number ="+this.number+ "}";
    }
}

class book1{
    String title;
    String author;
    String isbn;

    book1(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn; 
    }

    public String gettitle(){return title;}
    public String getauthor(){return author;}
    public String getisbn(){return isbn;}

    public void settitle(String title){this.title = title;}
    public void setauthor(String author){this.author = author;}
    public void setisbn(String isbn){this.isbn = isbn;}

    @Override
    public String toString(){
        return "Book: [Title: "+title+ "Author: "+ author+ "ISBN: "+ isbn+"}";
    }


}

class ebook extends book1{
    double filesize;

    ebook(String title,String author,String isbn,double filesize){
        super(title,author,isbn);
        this.filesize = filesize;
    }
    public double getfilesize(){return filesize;}
    public void setfilesize(double filesize){
        this.filesize = filesize;
    }

    @Override
    public String toString(){
        return "Book: [Title: "+title+ "Author: "+ author+ "ISBN: "+ isbn+"filesizeinMB: "+ filesize ;
    }

}