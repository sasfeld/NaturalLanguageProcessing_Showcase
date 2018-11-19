package de.adesso.nlpshowcase.nlp.service;

import de.adesso.nlpshowcase.nlp.external.adapter.StanfordCoreNlpAdapter;
import de.adesso.nlpshowcase.nlp.model.NlpResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Facade to trigger Natural Language Proecssing operations.
 */
@Service
@Slf4j
public class NlpService {

    private final StanfordCoreNlpAdapter nlpAdapter;

    @Autowired
    public NlpService(StanfordCoreNlpAdapter nlpAdapter) {
        this.nlpAdapter = nlpAdapter;
    }
    
    /**
     * Annotates the given raw text - which should be natural language.
     *
     * @param rawText natural language raw text. E. g.: The capital of the United States is Washington.
     * @return the {@link NlpResult} structure with annotations.
     */
    public NlpResult annotate(final String rawText) {
        return nlpAdapter.annotate(rawText);
    }
}
