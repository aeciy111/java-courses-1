package lesson_6;

public interface Pet {
    /**
     * Returns name of the pet
     * @return name of the pet
     */
    public String getName();

    /**
     * Set new name for pet
     * @param name New name for pet
     */
    public void setName(String name);

    /**
     * Return id of the pet
     * @return id of the pet
     */
    public long getId();
}
