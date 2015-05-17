package lesson_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clinic {
    private final List<Client> clients = new ArrayList<>();

    /**
     * Adds clients to clinic
     * @param clients Clinic's clients
     */
    public void addClients(final Client ... clients) {
        this.clients.addAll(new ArrayList<>(Arrays.asList(clients)));
    }

    /**
     * Return all clients of the clinic;
     * @return All clients of the clinic
     */
    public List<Client> getClients() {
        return this.clients;
    }

    /**
     * Returns list of clients with name 'clientName'
     * @param clientName Name of client
     * @return List of found clients
     */
    public List<Client> findClientsByName(final String clientName) {
        final List<Client> foundClients = new ArrayList<>();
        for (Client client : this.clients) {
            if (client.getName().equals(clientName)) {
                foundClients.add(client);
            }
        }        
        return foundClients;
    }

    /**
     * Returns list of pets with name 'petName'
     * @param petName Name of pet
     * @return List of found pets
     */
    public List<Pet> findPetsByName(final String petName) {
        final List<Pet> foundPets = new ArrayList<>();
        for (Client client : this.clients) {
            List<Pet> pets = client.getPets();
            for (Pet pet : pets) {
                if (pet.getName().equals(petName)) {
                    foundPets.add(pet);
                }
            }
        }
        return foundPets;
    }

    /**
     * Removes client by its id
     * @param id Id of removed client
     */
    public void removeClient(final long id) {
        List<Client> clientToRemove = new ArrayList<>();
        for (Client client : this.clients) {
            if (client.getId() == id) {
                clientToRemove.add(client);
            }
        }
        this.clients.removeAll(clientToRemove);
    }
}