package edu.ucaldas.behavior;

public class SupervisorHandler extends Handler {

    @Override
    public String handleRequest(String request) {
        if ("intermedia".equals(request)) {
            return "Atendido por Supervisor";
        }
        if (next != null) {
            return next.handleRequest(request);
        }
        return "No se puede atender la solicitud.";
    }
}
