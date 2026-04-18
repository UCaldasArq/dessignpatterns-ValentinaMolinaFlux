package edu.ucaldas.behavior;

public class ManagerHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        if ("avanzada".equals(request)) {
            return "Atendido por Gerente";
        }
        if (next != null) {
            return next.handleRequest(request);
        }
        return "No se puede atender la solicitud.";
    }
}
