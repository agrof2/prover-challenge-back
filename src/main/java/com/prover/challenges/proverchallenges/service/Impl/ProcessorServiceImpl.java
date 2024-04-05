package com.prover.challenges.proverchallenges.service.Impl;

import com.prover.challenges.proverchallenges.model.DataRetornoModel;
import com.prover.challenges.proverchallenges.model.RetornoModel;
import com.prover.challenges.proverchallenges.service.ProcessorService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ProcessorServiceImpl implements ProcessorService {
    @Override
    public RetornoModel processPhrase(String phrase) {
        Map<String, Long> returnProcess = countDistinctWords(phrase);
        return RetornoModel.builder().phrase(phrase)
                .uniqueWordQuantity(returnProcess.size())
                .occurrencesPerWord(returnProcess.entrySet().stream().map(obj -> DataRetornoModel.builder().word(obj.getKey()).occurences(obj.getValue()).build()).collect(Collectors.toList()))
                .build();
    }

    private Map<String, Long> countDistinctWords(String text) {
        return Arrays.stream(text.toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
