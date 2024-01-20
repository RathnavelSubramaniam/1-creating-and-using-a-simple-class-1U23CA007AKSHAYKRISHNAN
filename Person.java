class Person
{
    String firstname;
    String lastname;
    int age;

    Person(String firstname,String lastname,int age){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }
    String getfullname(){
        return firstname + " "+lastname+ " ";
    }
    public static void main(String args[]){
    Person a1 = new Person("John" ,"Doe",30);
    Person a2 = new Person("Alice" ,"Smith",25);

    String ABC=a1.getfullname();
    String EFG=a2.getfullname();

    System.out.println("Person 1: "+ABC);
    System.out.println("Person 2: "+EFG);

    double average = ((a1.age + a2.age) /2.0);
    System.out.println("Average Age:"+age);
}
}