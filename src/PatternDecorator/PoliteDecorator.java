package PatternDecorator;

public class PoliteDecorator extends PersonDecorator {

    public PoliteDecorator(Person decoratedPerson) {
        super(decoratedPerson);
    }

    @Override
    public void sayYourGender() {
        decoratedPerson.sayYourGender();
        WelcomePerson(decoratedPerson);
    }

    private void WelcomePerson(Person decoratedPerson){
        System.out.println("Nice to meet you");
    }
}
