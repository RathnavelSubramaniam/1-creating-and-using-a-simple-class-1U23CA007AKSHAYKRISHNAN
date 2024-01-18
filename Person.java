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
    Person a1 = new Person("Michael" ,"Scott",46);
    Person a2 = new Person("Jim" ,"Heinz",28);

    String ABC=a1.getfullname();
    String EFG=a2.getfullname();

    System.out.print(ABC);
    System.out.print(EFG);

    double average = ((a1.age + a2.age) /2.0);
    System.out.println(average);
}
}