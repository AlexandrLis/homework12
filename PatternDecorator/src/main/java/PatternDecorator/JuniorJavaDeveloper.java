package PatternDecorator;

import org.springframework.stereotype.Component;

@Component
public class JuniorJavaDeveloper extends DeveloperDecorator{

    public JuniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Я стараюсь писать код без ошибок и анализировать его";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + makeCodeReview();
    }
}
