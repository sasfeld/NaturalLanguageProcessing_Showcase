package de.adesso.nlpshowcase.nlp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class NlpResult {

    private String rawText;

    private List<AnnotatedSentences> annotatedSentences;
}
