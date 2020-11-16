/**
 * 
 */
package ar.com.fluxit.candidates.controller;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;
import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;
import ar.com.fluxit.candidates.model.dto.CandidateSummaryDTO;
import ar.com.fluxit.candidates.model.dto.UserRequestDTO;
import ar.com.fluxit.candidates.model.dto.UserResponseDTO;

/**
 * @author Magdaly Santos
 *
 */
@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private UserController controller;
	
	@PostMapping("/user")
	@RolesAllowed({"ADMINISTRADOR"})
	public ResponseEntity<?> create(@Valid @RequestBody UserRequestDTO userRequest) {
		return new ResponseEntity<UserResponseDTO>(this.controller.create(userRequest), HttpStatus.CREATED);

	}
	
	@RolesAllowed({"ADMINISTRADOR"})
	@GetMapping("/users")
	@ResponseStatus(HttpStatus.OK)
	public Page<UserResponseDTO> all(
			@RequestParam(value="page",defaultValue="0",required=false)int page,
			@RequestParam(value="size",defaultValue="10", required=false)int size){
		//TODO: SE PUEDE AGREGAR ORDER Y DIRECTION
		return this.controller.all(PageRequest.of(page, size));
	}
}
