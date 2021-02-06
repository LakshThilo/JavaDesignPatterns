package lak.designPatterns.behavioral.chainOfResponsibilityPattern.authenticationRequestEmpl;

public abstract class AuthenticationHandler {

    AuthenticationHandler nextAuthentication;

    public AuthenticationHandler(AuthenticationHandler nextAuthentication) {

        this.nextAuthentication = nextAuthentication;
    }

    public void authorizedAuthentication(String requestType){

        if(requestType != null){
            nextAuthentication.authorizedAuthentication(requestType);
        } else {

        System.out.println("Authentication denied");
        }

    }
}
