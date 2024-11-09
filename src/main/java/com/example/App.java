package com.example;

/**
 * Hello world!
 */

import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("session");
        // Criando Fornecedores com dados simulados
        Fornecedor fornecedor1 = new Fornecedor("Pedro",900, 9);
        fornecedor1.setPrazosEntrega(25);
        fornecedor1.setReputacao(4.5);
        fornecedor1.setCapacidadeAtendimento(600);

        Fornecedor fornecedor2 = new Fornecedor("Guilherme",1200, 7);
        fornecedor2.setPrazosEntrega(45);
        fornecedor2.setReputacao(3.8);
        fornecedor2.setCapacidadeAtendimento(300);

        Fornecedor fornecedor3 = new Fornecedor("Nathan",800, 8);
        fornecedor3.setPrazosEntrega(20);
        fornecedor3.setReputacao(4.2);
        fornecedor3.setCapacidadeAtendimento(1000);

        Fornecedor fornecedor4 = new Fornecedor("Ynuan",1100, 6);
        fornecedor4.setPrazosEntrega(35);
        fornecedor4.setReputacao(3.5);
        fornecedor4.setCapacidadeAtendimento(400);

        System.out.println("------------------------------------------ Resultados após as validações do Drools ------------------------------------------");

        kieSession.insert(fornecedor1);
        kieSession.insert(fornecedor2);
        kieSession.insert(fornecedor3);
        kieSession.insert(fornecedor4);

        kieSession.fireAllRules();
        kieSession.dispose();
        System.out.println("------------------------------------------------------------- Dados ---------------------------------------------------------");
        System.out.println(fornecedor1);
        System.out.println(fornecedor2);
        System.out.println(fornecedor3);
        System.out.println(fornecedor4);
    }
}
