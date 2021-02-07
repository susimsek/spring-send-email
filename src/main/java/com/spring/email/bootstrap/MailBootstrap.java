package com.spring.email.bootstrap;

import com.spring.email.service.EmailService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Service
@RequiredArgsConstructor
public class MailBootstrap implements CommandLineRunner {

    final EmailService emailService;

    @Override
    public void run(String... args) throws Exception {

        emailService.sendEmail();
    }
}
