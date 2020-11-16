/**
 * 
 */
package ar.com.fluxit.candidates.controller.rest;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ar.com.fluxit.candidates.controller.UserController;
import ar.com.fluxit.candidates.model.dto.UserRequestDTO;
import ar.com.fluxit.candidates.model.dto.UserResponseDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

/**
 * @author Magdaly Santos
 *
 */
@RestController
@RequestMapping("/api/v1")
public class UserRestController {

	@Autowired
	private UserController controller;
	
	@PostMapping("/user")
	@RolesAllowed("ROLE_ADMIN")
	@ApiOperation(value = "Crear user", notes = "Required roles:ROLE_ADMIN", authorizations = {
			@Authorization(value = "apiKey") })
	public ResponseEntity<?> create(@Valid @RequestBody UserRequestDTO userRequest) {
		return new ResponseEntity<UserResponseDTO>(this.controller.create(userRequest), HttpStatus.CREATED);

	}
	
	@RolesAllowed("ROLE_ADMIN")
	@GetMapping("/users")
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "List all user", notes = "Required roles:ROLE_ADMIN", authorizations = {
			@Authorization(value = "apiKey") })
	public Page<UserResponseDTO> all(
			@RequestParam(value="page",defaultValue="0",required=false)int page,
			@RequestParam(value="size",defaultValue="10", required=false)int size){
		//TODO: SE PUEDE AGREGAR ORDER Y DIRECTION
		return this.controller.all(PageRequest.of(page, size));
	}
}
