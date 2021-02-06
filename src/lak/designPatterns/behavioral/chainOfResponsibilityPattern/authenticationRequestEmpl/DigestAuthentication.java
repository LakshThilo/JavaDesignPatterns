package lak.designPatterns.behavioral.chainOfResponsibilityPattern.authenticationRequestEmpl;

public class DigestAuthentication extends AuthenticationHandler{

    public DigestAuthentication(AuthenticationHandler nextAuthentication) {
        super(nextAuthentication);
    }


    @Override
    public void authorizedAuthentication(String requestType) {
        if (requestType.equals("digest")){
            System.out.println(" Authentication granted! for DigestAuthentication");

        } else {
            super.authorizedAuthentication(requestType);

        }
    }
}
