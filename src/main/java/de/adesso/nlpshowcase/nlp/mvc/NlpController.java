package de.adesso.nlpshowcase.nlp.mvc;

import de.adesso.nlpshowcase.nlp.model.NlpResult;
import de.adesso.nlpshowcase.nlp.service.NlpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Spring MVC controller using Thymeleaf as view rendering engine.
 */
@Controller
public class NlpController {

    private final NlpService nlpService;

    @Autowired
    public NlpController(NlpService nlpService) {
        this.nlpService = nlpService;
    }

    @GetMapping("/nlp")
    public String getNlpForm(Model model) {
        addNlpParams(model);

        return "nlp";
    }

    @PostMapping("/nlp")
    public String processRawText(@ModelAttribute NlpParams nlpParams, Model model) {
        NlpResult nlpResult = nlpService.annotate(nlpParams.getRawText());
        model.addAttribute("nlpResult", nlpResult);
        addNlpParams(model);

        return "nlp";
    }

    private void addNlpParams(Model model) {
        model.addAttribute("nlpParams", NlpParams.builder().build());
    }

}
