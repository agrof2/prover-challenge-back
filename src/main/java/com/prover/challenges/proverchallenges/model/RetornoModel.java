package com.prover.challenges.proverchallenges.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class RetornoModel {
    private String phrase;
    private int uniqueWordQuantity;
    private List<DataRetornoModel> occurrencesPerWord;
}
