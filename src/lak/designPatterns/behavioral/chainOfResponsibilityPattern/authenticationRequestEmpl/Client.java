package lak.designPatterns.behavioral.chainOfResponsibilityPattern.authenticationRequestEmpl;

public class Client {

    public static void main(String[] args) {

        AuthenticationHandler authenticationHandler = new BasicAuthentication(new ClientCertificateAuthentication(new DigestAuthentication(null)));

        authenticationHandler.authorizedAuthentication("basic");
      //  authenticationHandler.authorizedAuthentication(null);
        authenticationHandler.authorizedAuthentication("digest");
        authenticationHandler.authorizedAuthentication("client");
       // authenticationHandler.authorizedAuthentication("something else");
    }
}
