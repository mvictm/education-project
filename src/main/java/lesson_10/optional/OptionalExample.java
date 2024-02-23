package lesson_10.optional;

public class OptionalExample {

    public static void main(String[] args) {
        String randomObjectName = initialize().getChild().getRandomObject().getName();

        Parent initParent = initialize();

        if (initParent != null) {
            Child child = initParent.getChild();
            if (child != null) {
                RandomObject randomObject = child.getRandomObject();
                if (randomObject != null) {
                    String name = randomObject.getName();
                    if (name != null && !name.isEmpty()) {
                        System.out.println("Значение параметра name=" + name);
                    }
                }
            }
        }
    }

    private static Parent initialize() {
        RandomObject randomObject = new RandomObject("randomName");
        Child child = new Child("childName", randomObject);
        return new Parent("parentName", child);
    }
}
