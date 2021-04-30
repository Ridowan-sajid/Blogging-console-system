package User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    public static String tab="\t\t\t\t\t\t\t\t";

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String gender;
    private String age;

    public User(){

    }

    public User(String username, String firstName, String lastName, String email, String phoneNumber, String password, String gender, String age) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

//    public void details(){
//        System.out.println("First Name: "+firstName);
//        System.out.println("Last Name: "+lastName);
//        System.out.println("UserName: "+username);
//        System.out.println("First Name: "+firstName);
//        System.out.println("Email: "+email);
//        System.out.println("Phone Number: "+phoneNumber);
//        System.out.println("Gender: "+gender);
//    }




    public static void deleteUser() throws IOException {

        Scanner scan2=new Scanner(System.in);
        List<String> s= new ArrayList<>();
        FileInputStream fi=new FileInputStream("User.txt");
        DataInputStream DI=new DataInputStream(fi);
        Scanner scan=new Scanner(DI);

        while(scan.hasNextLine()){
            while(scan.hasNextLine()){
                s.add(scan.nextLine());
            }
        }
        fi.close();
        DI.close();

        int i=0;
        List<Integer> j=new ArrayList<>();
        List<String> user=new ArrayList<>();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(tab+"===============================================================");
        System.out.println(tab+"**                       DELETE POST                         **");
        System.out.println(tab+"===============================================================");
        for(i=0;i<s.size();i=i+8){
            System.out.println(tab+"\t"+s.get(i));
            j.add(i);
            user.add(s.get(i));
//                System.out.println(tab+"\t"+s.get(i+1));
//                System.out.println(tab+"\t"+s.get(i+2));
            System.out.println(tab+"===============================================================");

        }
        System.out.print(tab+"Which user you want to delete: ");
        int l=user.indexOf(scan2.next())+1;

        int p = 0;
        for(int k : j){
            for(i=0;i<j.size();i++){
                if(l==i+1 && p==i){
                    s.remove(k);
                    s.remove(k);
                    s.remove(k);
                    s.remove(k);
                    s.remove(k);
                    s.remove(k);
                    s.remove(k);
                    s.remove(k);
                }
            }

            p++;
        }
        File post=new File("User.txt");
        FileWriter PostWrite=new FileWriter(post);

        for(String q : s){

            PostWrite.append(q+"\n");

        }
        PostWrite.close();
    }
}
