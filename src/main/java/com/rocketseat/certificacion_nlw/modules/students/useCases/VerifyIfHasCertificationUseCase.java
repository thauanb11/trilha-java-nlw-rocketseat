package com.rocketseat.certificacion_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.rocketseat.certificacion_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service
public class VerifyIfHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto) {
        if (dto.getEmail().equals("danisoomin@gmail.com") && dto.getTechnology().equals("TikTok")) {
            return true;
        }
        return false;
    }
}
