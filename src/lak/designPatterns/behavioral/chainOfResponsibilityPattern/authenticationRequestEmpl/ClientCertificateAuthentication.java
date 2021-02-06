package lak.designPatterns.behavioral.chainOfResponsibilityPattern.authenticationRequestEmpl;

public class ClientCertificateAuthentication extends AuthenticationHandler{

    public ClientCertificateAuthentication(AuthenticationHandler nextAuthentication) {
        super(nextAuthentication);
    }

    @Override
    public void authorizedAuthentication(String requestType) {
        if (requestType.equals("client")){
            System.out.println(" Authentication granted! for ClientCertificateAuthentication");

        } else {
            super.authorizedAuthentication(requestType);

        }
    }
}
