package de.adesso.nlpshowcase.nlp.mvc;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * NLP params used within the Spring MVC view.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class NlpParams {

    private String rawText;

}
