package com.example.demo.util;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args){
        // USUARIOS
        Usuario user1 = Usuario.builder()
                .nombre("Lucía Garrido")
                .email("ejemplo@ejemplo.com")
                .password("12345678")
                .ubicacion("Torremolinos")
                .telefono("600050004")
                .build();

        Usuario user2 = Usuario.builder()
                .nombre("Carlos")
                .email("carlos@ejemplo.com")
                .password("123412341234")
                .build();

        usuarioRepository.saveAll(List.of(user1, user2));

        // MASCOTAS

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++ DATOS CARGADOS");
    }

}
