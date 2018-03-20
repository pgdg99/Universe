
package universe;

import java.util.ArrayList;

public class Person {
    private String name;
    private String gender;
    private ArrayList<Person> parents;
    private ArrayList<Person> children;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.parents = new ArrayList();
        this.children = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<Person> getParents() {
        return parents;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setParents(ArrayList<Person> parents) {
        this.parents = parents;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }
           
    public void addParent(Person parent){
        if(parents.size()<2){
            parents.add(parent);
        }
    }
    
    public void addChildren(Person child){
        children.add(child);
    }

    public String info(){
        String info="";
        info+= "Name: " + name + " -- " + "Gender: " + gender + "\n";
        return info;
    }
    
}
