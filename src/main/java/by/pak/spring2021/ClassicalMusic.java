package by.pak.spring2021;

public class ClassicalMusic implements Music {

    public void initMethod() {
        System.out.println("Doing my initialization");
    }

    public void destroyMethod() {
        System.out.println("Doing my destroy");
    }

    @Override
    public String getSong() {
        return "Bethoven";
    }

}
