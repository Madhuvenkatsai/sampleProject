package innerclassespackage;

public class User {
    private String username;
    private Profile profile;

    public User(String username) {
        this.username = username;
        this.profile = new Profile();
    }

    public void showDetails() {
        System.out.println("Username: " + username);
        profile.showProfile();
    }

    public class Profile {
        private String bio = "This is a default bio";
        private String profilePic = "default.jpg";

        public void updateBio(String bio) {
            this.bio = bio;
        }

        public void updateProfilePic(String profilePic) {
            this.profilePic = profilePic;
        }

        public void showProfile() {
            System.out.println("Bio: " + bio);
            System.out.println("Profile Pic: " + profilePic);
        }
    }

    public static void main(String[] args) {
        User user = new User("john_doe");
        user.showDetails();

        // Updating profile details
        user.profile.updateBio("Software developer and tech enthusiast.");
      //  user.profile.updateProfilePic("john.jpg");
        user.showDetails();
    }
}