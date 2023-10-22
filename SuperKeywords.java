class SuperKeywords {
    String name;

    SuperKeywords(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
}

class Dog extends SuperKeywords {
    String breed;

    Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println(name + " barks.");
    }
}

