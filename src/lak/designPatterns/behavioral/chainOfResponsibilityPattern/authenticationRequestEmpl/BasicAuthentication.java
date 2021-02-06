package lak.designPatterns.behavioral.chainOfResponsibilityPattern.authenticationRequestEmpl;

public class BasicAuthentication extends AuthenticationHandler {

    public BasicAuthentication(AuthenticationHandler handler) {
        super(handler);

    }

    @Override
    public void authorizedAuthentication(String requestType) {
       if (requestType.equals("basic")){
           System.out.println(" Authentication granted! for BasicAuthentication");

       } else {
           super.authorizedAuthentication(requestType);

       }
    }
}
