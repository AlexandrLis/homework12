package PatternDecorator;

import org.springframework.stereotype.Component;

@Component
public class JavaDeveloper implements Developer{

    @Override
    public String writeCode() {
        return "Я пишу код на Java";
    }
}
