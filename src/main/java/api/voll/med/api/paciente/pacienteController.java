package api.voll.med.api.paciente;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("paciente")
@RestController
public class pacienteController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPaciente dados){

        System.out.println(dados);

    }
}
