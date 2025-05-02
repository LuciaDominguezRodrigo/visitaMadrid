package com.multimedia.p3.Controllers;

import com.multimedia.p3.entities.Postal;
import com.multimedia.p3.repository.PostalRepository;
import com.multimedia.p3.services.PostalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.time.LocalDate;

@Controller
@RequestMapping("/")
public class PostalWebController {


    @Autowired
    private PostalService postalService;

    // Página inicial
    @GetMapping("/")
    public String index() {
        return "/index";
    }

    @PostMapping("/enviar")
    public String submitForm(
            @RequestParam("nombre") String destinatario,
            @RequestParam("mensaje") String mensaje,
            @RequestParam("email") String remitente,
            @RequestParam("titulo") String titulo,
            @RequestParam("imagen") MultipartFile imagen,
            RedirectAttributes redirectAttributes) throws IOException {

        Postal postal = new Postal();
        postal.setDestinatario(destinatario);
        postal.setMensaje(mensaje);
        postal.setRemitente(remitente);
        postal.setTitulo(titulo);


        if (!imagen.isEmpty()) {
            postal.setImagen(imagen.getBytes());
        }

        postal.setFechaEnvio(LocalDate.now());
        postalService.save(postal);

        return "redirect:/";
    }
}

