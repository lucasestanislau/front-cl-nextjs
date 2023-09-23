package com.emailservice.emailservice.application;

import com.emailservice.emailservice.adapters.EmailSenderGateway;
import com.emailservice.emailservice.core.EmailSenderUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EmailSenderService implements EmailSenderUseCase {
    private final EmailSenderGateway emailSenderGateway;

    @Override
    public void sendEmail(String to, String subject, String body) {
    this.emailSenderGateway.sendEmail(to, subject, body);
    }

}
