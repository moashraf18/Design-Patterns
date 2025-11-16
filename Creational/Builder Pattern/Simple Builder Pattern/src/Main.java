public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setName("Mohamed Ashraf")
                .setAge(21)
                .setEmail("mohamedashraftahaabdellah@gmail.com")
                .setAddress("Cairo")
                .build();

        user.showDetails();
    }
}
