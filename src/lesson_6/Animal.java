package lesson_6;

public class Animal implements Pet {
    private static long currentId = 1;

    private String name;
    private final long id;

    public Animal(final String name) {
        this.name = name;
        this.id = Animal.currentId++;
    }

    /**
     * Returns name of the animal
     * @return name of the animal
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Set new name for pet
     * @param name New name for pet
     */
    @Override
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Returns animal's id
     * @return animal's id
     */
    @Override
    public long getId() {
        return this.id;
    }
}
