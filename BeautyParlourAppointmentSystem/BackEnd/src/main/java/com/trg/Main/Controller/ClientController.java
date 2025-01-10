package com.trg.Main.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trg.Main.Model.Client;
import com.trg.Main.exception.ResourceNotFoundException;
import com.trg.Main.repository.ClientRepository;


@RestController
@RequestMapping("/Client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        super();
        this.clientRepository = clientRepository;
    }

    @PostMapping("/CreateClient")
    public ResponseEntity<Client> saveClient(@RequestBody Client client) {
    	System.out.println("client records:"+ client);
       return new ResponseEntity<>(clientRepository.save(client), HttpStatus.CREATED);
    }
    
    @GetMapping("/GetAllClients")
    public List<Client> getAllClients() {
        return clientRepository.findAll(); 
    }
 
    @GetMapping("/GetClientById/{id}")
    public Optional<Client> getClientByID(@PathVariable Integer id){
		return clientRepository.findById(id);
    }
    @PutMapping("/UpdateClient/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable int id, @RequestBody Client clientDetails) {
    	Client client = clientRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Client not exist with id :" + id, null, clientDetails));
		
		client.setClientName(clientDetails.getClientName());
		client.setClientMobileNo(clientDetails.getClientMobileNo());
		client.setClientEmail(clientDetails.getClientEmail());
		Client updatedClient = clientRepository.save(client);
		return ResponseEntity.ok(updatedClient);
    }
    
    
    @DeleteMapping("/DeleteClient/{id}")
    public ResponseEntity<Client> deleteClient( @PathVariable int id){
    	  if (clientRepository.existsById(id)) { 
    	        clientRepository.deleteById(id); 
    	        return ResponseEntity.noContent().build(); 
    	    }
    	    return ResponseEntity.notFound().build();
    }
}
