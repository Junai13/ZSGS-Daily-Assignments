package threenovmber;

public class SingletonEx {
        private static SingletonEx singletonEx;
        private SingletonEx() {}
        public static SingletonEx getInstance() {
            if (singletonEx == null) {
                singletonEx = new SingletonEx();
                System.out.println("New Object is created");
            } else {
                System.out.println("Object is already created. There is no need to create object again. " +
                        "Object will be created only once.");
            }
            return singletonEx;
        }
}
