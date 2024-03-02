package lesson_10.optional;

import java.util.Objects;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        //String randomObjectName = initialize().getChild().getRandomObject().getName();

        Parent initParent = initialize();

//        if (initParent != null) {
//            Child child = initParent.getChild();
//            if (child != null) {
//                RandomObject randomObject = child.getRandomObject();
//                if (randomObject != null) {
//                    String name = randomObject.getName();
//                    if (name != null && !name.isEmpty()) {
//                        System.out.println("Значение параметра name=" + name);
//                    }
//                }
//            }
//        }

        //Parent initialize = initialize();

        String randomName = Optional.ofNullable(initialize())
                .filter(parent -> Objects.nonNull(parent.getName()))
                .map(Parent::getChild)
                .map(Child::getRandomObject)
                .map(RandomObject::getName)
                .filter(name -> isaBoolean(name))
                .orElseGet(() -> "Default value");

        System.out.println(randomName);
//        if (optRandomName.isPresent()) {
//            String randomName = optRandomName.get();
//            System.out.println("Result = " + randomName);
//        } else {
//            throw new RuntimeException("Not Value");
//        }
    }

    private static boolean isaBoolean(String name) {
        return !name.isEmpty();
    }

    private static Parent initialize() {
//        RandomObject randomObject = new RandomObject("randomName");
//        Child child = new Child("childName", randomObject);
//        return new Parent("parentName", child);
        return null;
    }
}
