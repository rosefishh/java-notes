package day5;

class student{
    String name;
    int roll;
    double marks;

    student(){
        this.name="unknown";
        this.roll=0;
        this.marks=0.0;
    }

    student(String name, int roll, double marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll no.: "+ roll);
        System.out.println("Marks: "+ marks);
    }

    void main(String[] args){
        student student1 = new student();
        student student2 = new student("Aman", 21, 99.9);

        System.out.println("student 1 details: ");
        student1.display();

        System.out.println("student 2 details: ");
        student2.display();
    }
}


class book{
    String title;
    String author;
    double price;


book(){
    this.title = "unknown";
    this.author = "unknown";
    this.price = 0.0;
}

book(String title, String author){
    this.title = title;
    this.author = author;
    this.price = 100.0;
}

book(String title, String author, double price){
    this.title = title;
    this.author = author;
    this.price = price;
}

void display(){
    System.out.println("Title: " + title);
    System.out.println("Author: "+ author);
    System.out.println("Price: "+ price);
}

void main(String[] args){
    book book1 = new book();
    book book2 = new book("The Kite Runner", "Khalid Hosseini");
    book book3 = new book("White Nights", "Fyodor Dostoevsky", 500);

    book1.display();
    book2.display();
    book3.display();
}
}

class employee{
    int id;
    String name;
    double salary;


    employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    employee(employee other){
        this.id = other.id;
        this.name = other.name;
        this.salary= other.salary;
    }

    void display(){
        System.out.println("ID: "+ id);
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
    }

    public static void main(String[] args){
        employee e1 = new employee(66 , "Aman", 9000000);
        employee e2 = new employee(e1);

        e1.display();
        e2.display();
    }
}
