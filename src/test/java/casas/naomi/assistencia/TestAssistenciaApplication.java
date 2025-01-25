package casas.naomi.assistencia;

import org.springframework.boot.SpringApplication;

public class TestAssistenciaApplication {

    public static void main(String[] args) {
        SpringApplication.from(AssistenciaApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
