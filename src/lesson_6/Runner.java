package lesson_6;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // Create clinic
        Clinic clinic = new Clinic();

        // Fill clinic with data
        clinic.addClients(
            new Client("Mr. Fred",
                    new Dog(new Animal("Puppy")),
                    new Dog(new Animal("Jody"))
            ),
            new Client("Mr. John",
                    new Dog(new Animal("Billy")),
                    new Dog(new Animal("Bunny"))
            )
        );

        printClients(clinic);

        // Find clients with name "Mr. Fred"
        System.out.println("Find clients with name \"Mr. Fred\"");
        List<Client> foundClients = clinic.findClientsByName("Mr. Fred");
        System.out.println("Found clients:");
        for (Client client : foundClients) {
            System.out.println(client.getName());
        }

        // Change name of client "Mr. Fred" - > "New Mr. Fred"
        System.out.println("Change name of client \"Mr. Fred\" - > \"New Mr. Fred\"");
        Client changingClient = foundClients.get(0);
        changingClient.setName("New Mr. Fred");

        printClients(clinic);

        // Find pets with name "Jody"
        System.out.println("Find pets with name \"Jody\": ");
        List<Pet> foundPets = clinic.findPetsByName("Jody");
        for (Pet foundPet : foundPets) {
            System.out.println(foundPet.getName());
        }

        // Change pet's name "Jody" -> "New Jody"
        System.out.println("Change pet's name: \"Jody\" -> \"New Jody\"");
        Pet changingPet = foundPets.get(0);
        changingPet.setName("New Jody");

        printClients(clinic);

        // Delete pet "New Billy"
        System.out.println("Delete pet \"New Jody\"");
        changingClient.removePet(changingPet.getId());

        printClients(clinic);

        // Delete client "New Mr. Fred"
        System.out.println("Delete client \"New Mr. Fred\"");
        clinic.removeClient(changingClient.getId());

        printClients(clinic);
    }

    public static void printClients(Clinic clinic) {
        System.out.println();
        System.out.println("All clients:");
        for (Client client : clinic.getClients()) {
            System.out.println("Client: " + client.getName());
            for (Pet pet : client.getPets()) {
                System.out.println("\t" + pet.getName());
            }
        }
        System.out.println();
    }
}
