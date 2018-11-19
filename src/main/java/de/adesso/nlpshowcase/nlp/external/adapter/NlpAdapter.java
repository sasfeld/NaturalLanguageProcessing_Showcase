package de.adesso.nlpshowcase.nlp.external.adapter;

import de.adesso.nlpshowcase.nlp.model.NlpResult;

import java.util.List;

public interface NlpAdapter {

    /**
     * Annotates the given raw text - which should be natural language.
     *
     * @param rawText natural language raw text. E. g.: The capital of the United States is Washington.
     * @return the {@link NlpResult} structure with annotations.
     */
    List<NlpResult> annotate(final String rawText);
}
