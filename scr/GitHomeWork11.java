
import java.util.concurrent.ThreadLocalRandom;

    class Solution {
    public static void main(String[] args) {
        new Solution().execute();
    }

    private void execute() {
        Team Kyiv = new Team("Київ");
        Team Lviv = new Team("Львів");
        double kyivAverageAge = Kyiv.averageAge();
        double lvivAverageAge = Lviv.averageAge();
        System.out.println(Kyiv);
        System.out.println("Середній вік гравців команди Київ: " + kyivAverageAge + " років");
        System.out.println(Lviv);
        System.out.println("Середній вік гравців команди Львів: " + lvivAverageAge + " років");

    }

    class Team {
        private Person[] people;
        private String name;

        public Team(String name) {
            this.people = new Person[25];
            this.name = name;
            ThreadLocalRandom random = ThreadLocalRandom.current();
            for (int i = 0; i < 25; i++) {
                Person person = new Person(random.nextInt(18, 40));
                people[i] = person;
            }

        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (Person person : people) {
                builder.append(person.getAge());
                builder.append(" ");
            }
            return "Вік гравців команди " + name + ": " + builder.toString();
        }

        public double averageAge() {
            double res = 0;
            for (Person person : people) res += person.getAge();
            return res / 25.0;
        }
    }

    class Person {
        private int age;

        public int getAge() {
            return age;
        }

        public Person(int age) {
            this.age = age;
        }
    }
}