package controller;

import java.util.List;

import model.Library;
import model.MusicPlayer;
import model.Service;
import model.User;
import view.ServiceBookView;
import view.ServiceSearchView;

public class MainController {
    private static MusicPlayer model;

    private static ServiceSearchView searchView;
    private static ServiceBookView serviceBookView;
    private static ServiceSearchController searchController;
    private static ServiceBookController bookingController;


    public static void main(String[] args) {
        
        
        model = new MusicPlayer();
        model.loadServicesFromFile("services.dat");;
        model.loadUsersFromFile("users.dat");
        List<Service> loadedServices = model.getServices();

        
        searchView = new ServiceSearchView();
        

        
        
        
        loginView.setVisible(true);



    }
    public static void setLoggedInUser(User loggedInUser) {
        MainController.loggedInUser = loggedInUser;
        searchView = new ServiceSearchView();
        searchView.setLoggedInUser(loggedInUser);
        searchController = new ServiceSearchController(model, searchView);
        searchView.setVisible(true);

    }
    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setServiceBookingView(User user, Service selectedService){
        serviceBookView = new ServiceBookView();
        serviceBookView.setBorrowingUser(user);
        serviceBookView.setSelectedService(selectedService);
        serviceBookView.setVisible(true);
        bookingController = new ServiceBookController(model, serviceBookView);
    }

    
}
