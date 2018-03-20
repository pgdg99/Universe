
package universe;

import java.util.ArrayList;

public class Universe {
    
    private ArrayList<Person> humans;
    
    public Universe(){
        humans = new ArrayList();
    }
    
    public ArrayList<Person> getPeople() {
        return humans;
    }

    public void setPeople(ArrayList<Person> people) {
        this.humans = people;
    }    
    
    public void addHuman(String n, String g){
        Person human = new Person(n,g);
        humans.add(human);
    }
    
    public Person searchPerson(String name){
        for(Person wanted: humans){
            if(wanted.getName().equals(name)){
                return wanted;
            }
        }
        return null;
    }
    
    public int getPeopleWithDaughters(){
        int quantity=0;
        for(Person people: humans){
            if (people.getChildren()!=null){
                for (Person peopleWithChildren: people.getChildren()){
                    if(peopleWithChildren.getGender().equals("Female"))
                        quantity++;
                }
            }        
        }
        return quantity;
    }
    
    public String infoHumans(){
        String totalInfo = "Existing Humans are: " + "\n" + "\n";
        for (Person h:humans){
            totalInfo+=h.info();
            if(h.getChildren()!=null){
                for (Person humansWithChildren:h.getChildren()){
                    totalInfo+="Children: " + humansWithChildren.info();
                }
            }
            if(h.getParents()!=null){
                for (Person humansWithParents:h.getParents()){
                    totalInfo+="Parents: " + humansWithParents.info();
                }
            }
            totalInfo+= "\n";
        }
        return totalInfo;      
    }
}
