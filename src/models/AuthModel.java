package models;

public class AuthModel {
	 private String correoValido = "ola@uabcs.com";
	    private String passValido = "123456";

	    public boolean validarLogin(String email, String password) {
	        return email.equals(correoValido) && password.equals(passValido);
	    }

}
