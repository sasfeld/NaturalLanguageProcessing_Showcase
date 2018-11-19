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
public class AnnotatedSentences {
    private List<AnnotatedSentences> annotatedWords;
}
