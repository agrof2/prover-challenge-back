package com.prover.challenges.proverchallenges.service;

import com.prover.challenges.proverchallenges.model.RetornoModel;
import org.springframework.stereotype.Service;

public interface ProcessorService {
    RetornoModel processPhrase(String phrase);
}
