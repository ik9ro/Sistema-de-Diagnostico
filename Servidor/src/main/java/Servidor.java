
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Servidor {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();
    private static HashMap<String, ArrayList<Paciente>> mapaDiagnostico = new HashMap<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is running.");

            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread t = new Thread(clientHandler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler implements Runnable {

        private final Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        //LISTA TODOS OS PACIENTES
        public void lista_pacientes(ObjectOutputStream oos) throws IOException {
            for (Paciente paciente : pacientes) {
                oos.writeObject("Sintomas: " + paciente.getSintomas() + " | Diagnóstico: " + paciente.getDiagnostico());
            }
            oos.writeObject(null);
            oos.flush();
        }

        //LISTA TODOS OS PACIENTES QUE TEM X DIAGNOSTICO
        public void lista_pacientes_por_diagnostico(ObjectOutputStream oos, String tipoDiagnostico) throws IOException {
            boolean pacientesEncontrados = false;

            for (Paciente paciente : pacientes) {
                if (paciente.getDiagnostico().equals(tipoDiagnostico)) {
                    oos.writeObject("Sintomas: " + paciente.getSintomas() + " | Diagnóstico: " + paciente.getDiagnostico());
                    pacientesEncontrados = true;
                }
            }

            if (!pacientesEncontrados) {
                System.out.println("Nenhum paciente encontrado com o diagnóstico: " + tipoDiagnostico);
                oos.writeObject("Nenhum paciente encontrado com o diagnóstico: " + tipoDiagnostico);
            }

            oos.writeObject(null);
            oos.flush();
        }

        //ALGORITMO APRIORI

        @Override
        public void run() {
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                while (true) {
                    Object inputObject = ois.readObject();
                    if (inputObject instanceof String) {
                        String command = (String) inputObject;
                        if (command.equals("listar")) { //LISTA TODOS
                            lista_pacientes(oos);
                            oos.flush();
                            break;
                        } else if (command.equals("pesquisar")) { //LISTA COM X DIAGNOSTICO
                            String tipoDiagnostico = (String) ois.readObject();
                            lista_pacientes_por_diagnostico(oos, tipoDiagnostico);
                            oos.flush();
                            break;
                        } else if (command.equals("apriori")) {
                            
                        }
                    } else if (inputObject instanceof Paciente) {
                        Paciente patient = (Paciente) inputObject;
                        pacientes.add(patient);

                        if (!mapaDiagnostico.containsKey(patient.getDiagnostico())) {
                            mapaDiagnostico.put(patient.getDiagnostico(), new ArrayList<>());
                        }
                        mapaDiagnostico.get(patient.getDiagnostico()).add(patient);

                        oos.writeObject("Data received and stored successfully.");
                        oos.flush();
                        break;
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }
}
