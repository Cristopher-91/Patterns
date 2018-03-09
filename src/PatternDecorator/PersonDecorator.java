package PatternDecorator;

public abstract class PersonDecorator implements Person {
    protected Person decoratedPerson;

    public PersonDecorator(Person decoratedPerson){
        this.decoratedPerson = decoratedPerson;
    }

    @Override
    public void sayYourGender() {
        decoratedPerson.sayYourGender();
    }
}
