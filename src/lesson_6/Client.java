package lesson_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    private static long currentId = 1;
    private final long id;
    private String name;

    private final List<Pet> pets = new ArrayList<>();

    /**
     * Constructor
     * @param name Client's name
     * @param pets Client's pets
     */
    public Client(final String name, final Pet ... pets) {
        this.id = Client.currentId++;
        this.name = name;
        this.pets.addAll(new ArrayList<>(Arrays.asList(pets)));
    }

    /**
     * Returns client's name
     * @return client's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set client's name
     * @param name client's name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Returns client's id
     * @return client's id
     */
    public long getId() {
        return this.id;
    }

    /**
     * Get all pets of client
     * @return List of all pets
     */
    public List<Pet> getPets() {
        return this.pets;
    }

    /**
     * Remove pet from client by id
     * @param id Id of pet
     */
    public void removePet(final long id) {
        List<Pet> petsToRemove = new ArrayList<>();
        for (Pet pet : this.pets) {
            if (pet.getId() == id) {
                petsToRemove.add(pet);
                //this.pets.remove(pet);
            }
        }
        this.pets.removeAll(petsToRemove);
    }
}
