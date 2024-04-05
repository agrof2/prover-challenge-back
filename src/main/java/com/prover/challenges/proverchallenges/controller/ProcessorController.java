package com.prover.challenges.proverchallenges.controller;

import com.prover.challenges.proverchallenges.service.ProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/processor")
public class ProcessorController {

    @Autowired
    private ProcessorService processorService;

    @GetMapping
    public ResponseEntity get(@RequestParam(required = true) String phrase) {
        return ResponseEntity.ok(processorService.processPhrase(phrase));
    }
}
