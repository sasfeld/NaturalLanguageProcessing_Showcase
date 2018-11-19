package de.adesso.nlpshowcase.nlp.service;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Facade to trigger Natural Language Proecssing operations.
 */
@Component
@Scope("singleton")
@Slf4j
public class NlpService {


}
