package Part_2;

public class Main {
    private UserViewModel userViewModel;
    private UserView userView;

    public Main() {
        userViewModel = new UserViewModel();
        userView = new UserView();
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.run();
    }

    public void run() {
        while (true) {
            int option = userView.showMenuAndGetChoice();
            switch (option) {
                case 1:
                    String name = userView.getUserInput();
                    userViewModel.addUser(name);
                    userView.showMessage("User added!");
                    break;
                case 2:
                    userView.displayUsers(userViewModel.getUserNames());
                    break;
                case 3:
                    userView.showMessage("Exiting...");
                    userView.close();
                    return;
                default:
                    userView.showMessage("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
