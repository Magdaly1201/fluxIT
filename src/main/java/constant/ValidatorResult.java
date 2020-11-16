package constant;

import ar.com.fluxit.candidates.model.jwt.UserJWT;

public class ValidatorResult {

	public enum ValidatorStatus {
		MISSING_TOKEN, INVALID_TOKEN, OK
	}

	private ValidatorStatus validatorStatus;
	private UserJWT user;

	public ValidatorStatus getValidatorStatus() {
		return validatorStatus;
	}

	public void setValidatorStatus(ValidatorStatus validatorStatus) {
		this.validatorStatus = validatorStatus;
	}

	public UserJWT getUser() {
		return user;
	}

	public void setUser(UserJWT user) {
		this.user = user;
	}

}
