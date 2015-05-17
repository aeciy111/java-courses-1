package lesson_6;

public class Dog implements Pet {
    private final Animal animal;

    public Dog(final Animal animal) {
        this.animal = animal;
    }

    /**
     * Returns name of the dog
     * @return name of the dog
     */
    @Override
    public String getName() {
        return this.animal.getName();
    }

    /**
     * Set new name for dog
     * @param name New name for pet
     */
    @Override
    public void setName(final String name) {
        this.animal.setName(name);
    }

    /**
     * Returns dog's id
     * @return Dog's id
     */
    @Override
    public long getId() {
        return this.animal.getId();
    }
}
