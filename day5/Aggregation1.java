package day5;

public class Aggregation1{
    public static void main(String[] args) {
        address addr = new address("rose lake", "goa","667" );
        employee e = new employee(6,"rose",addr);

        addr.displayaddress();
        e.displayemp();
    }
}

class address{
    String street;
    String city;
    String zipcode;

    public address( String street,String city,String zipcode){
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }
    public String toString(){
        return street + "," + city + "," + zipcode;
    }

    public void displayaddress(){
        System.out.println(street + "," + city + "," + zipcode);
    }
}

class employee{
    int id;
    String name;
    address add;

    public employee( int id,String name, address add){
        this.id = id;
        this.name = name;
        this.add = add;
    }

    public void displayemp(){
        System.out.println(id + "," + name + "," + add);
    }
}