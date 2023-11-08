package com.eldar.cards.controller;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class HealthController {

    @Data
    @Builder
    public static class EntityData {
        private int status;

        private String message;
    }

    @GetMapping(path = "/health")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<?> health() {

        return ResponseEntity.status(HttpStatus.OK).body(EntityData.builder().status(200).message("OK").build());
    }
}
