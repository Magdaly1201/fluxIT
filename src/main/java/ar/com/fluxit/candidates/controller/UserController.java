/**
 * 
 */
package ar.com.fluxit.candidates.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;

import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;
import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;
import ar.com.fluxit.candidates.model.dto.CandidateSummaryDTO;
import ar.com.fluxit.candidates.model.dto.UserRequestDTO;
import ar.com.fluxit.candidates.model.dto.UserResponseDTO;
import ar.com.fluxit.candidates.service.ICandidateService;
import ar.com.fluxit.candidates.service.IUserService;

/**
 * @author Magdaly Santos
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private IUserService service;
	
    @Autowired
    private ModelMapper modelMapper;
	
	public UserResponseDTO create(UserRequestDTO userRequestDTO) {
		return this.modelMapper.map(this.service.create(userRequestDTO),
				UserResponseDTO.class);
	}
	
	public Page<UserResponseDTO> all(PageRequest pageRequest){
        return this.service.all(pageRequest)
                .map(d -> this.modelMapper.map(d, UserResponseDTO.class));
	}
	
	
}
