package Alishev.lesson34.lesson34;

public  class Animal {
    private int id;

    @Override
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }

    public Animal(){
    }
    public void makeSound(){};

    public Animal(int id){
        this.id = id;
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
    public String toString(){
        return String.valueOf(id);
    }

}
