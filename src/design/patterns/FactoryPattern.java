package design.patterns;


interface Form {
    public String getFields();
}

class BigForm implements Form {
    @Override
    public String getFields() {
        return "Duży formularz";
    }
}

class SmallForm implements Form {
    @Override
    public String getFields() {
        return "Mały formularz";
    }
}

class FormFactory {
    public static Form getForm(String criteria) {
        if (criteria.equals("BIG")) {
            return new BigForm();
        } else if (criteria.equals("SMALL")) {
            return new SmallForm();
        }
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Form form = FormFactory.getForm("SMALL");
        System.out.println(form.getFields());
    }
}
